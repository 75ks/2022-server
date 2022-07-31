package com.c4c._2022server.utils;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.security.sasl.AuthenticationException;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import com.c4c._2022server.entity.LoginUser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JWTUtils {
    @Autowired
    MessageSource messageSource;

    /**
     * 楕円曲線暗号の公開鍵
     */
    private ECPublicKey PUBLIC_KEY;

    /**
     * 楕円曲線暗号の秘密鍵
     */
    private ECPrivateKey PRIVATE_KEY;

    /**
     * 単一のインスタンス
     */
    private static JWTUtils instance = new JWTUtils();

    /**
     * 外部からインスタンスが生成できないようにprivateスコープにする<br>
     * 単一のインスタンス生成時に公開鍵と秘密鍵を取得する
     */
    private JWTUtils() {
        try {
            final KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC"); //楕円曲線暗号の鍵に設定
            keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1")); //鍵を初期化
            final KeyPair keyPair = keyPairGenerator.generateKeyPair(); //公開鍵と秘密鍵を作成
            PUBLIC_KEY = (ECPublicKey) keyPair.getPublic(); //公開鍵を取得
            PRIVATE_KEY = (ECPrivateKey) keyPair.getPrivate(); //秘密鍵を取得
            byte[] publicKeyEncodedBytes = Base64.encodeBase64(PUBLIC_KEY.getEncoded()); //公開鍵をBase64でエンコード
            byte[] privateKeyEncodedBytes = Base64.encodeBase64(PRIVATE_KEY.getEncoded()); //秘密鍵をBase64でエンコード
            System.out.println("ES256 Public Key:" + new String(publicKeyEncodedBytes));
            System.out.println("ES256 Private Key:" + new String(privateKeyEncodedBytes));
        } catch (Exception e) {
            System.out.println("JWTの署名鍵作成中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }        
    }

    /**
     * 単一のインスタンスを取得する
     * @return instance
     */
    public static JWTUtils getInstance() {
        return instance;
    }

    /**
     * JWTの発行日時
     * @return 現在日時
     */
    private long jwtIat() {
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt = ldt.atZone(ZoneOffset.ofHours(+9));
        return zdt.toEpochSecond();
    }

    /**
     * JWTの有効期限
     * @return 現在日時 + 1時間後
     */
    private long jwtExp() {
        LocalDateTime ldt = LocalDateTime.now().plusHours(1);
        ZonedDateTime zdt = ldt.atZone(ZoneOffset.ofHours(+9));
        return zdt.toEpochSecond();
    }

    /**
     * JWTを作成する
     * @param loginUser
     * @return jwt
     */
    public String createJWT(LoginUser loginUser) throws AuthenticationException {
        try {
            // JSONとJavaオブジェクト相互変換用オブジェクトを作成
            final ObjectMapper objectMapper = new ObjectMapper();
            // ヘッダー作成
            String jwtHeaderStr = createHeader(objectMapper);
            // ペイロード作成
            String jwtPayloadStr = createPayload(loginUser, objectMapper);
            // 署名作成
            final String jwtSignatureStr = createSignature(jwtHeaderStr, jwtPayloadStr);
            // JWT(ヘッダー.ペイロード.署名データ)を作成
            String jwt = jwtHeaderStr + "." + jwtPayloadStr + "." + jwtSignatureStr;
            System.out.println("jwt:" + jwt);
            // JWTを検証
            return verifyJWT(jwt) ? jwt : "";
        } catch (Exception e) {
            System.out.println("JWTの作成中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            throw new AuthenticationException(messageSource.getMessage("error.authentication", new String[]{}, Locale.getDefault()));
        }
    }

    /**
     * JWTを検証する
     * @param jwt
     * @return 検証結果
     */
    public boolean verifyJWT(String jwt) {
        try {
            final String[] splitJwt = jwt.split("\\."); //JWTをヘッダー、ペイロード、署名に分割
            final String jwtHeaderStr = splitJwt[0]; //ヘッダーを取得
            final String jwtPayloadStr = splitJwt[1]; //ペイロードを取得
            final String jwtSignatureStr = splitJwt[2]; //署名を取得
            final Signature jwtSignature = Signature.getInstance("SHA256withECDSAinP1363Format"); //署名アルゴリズムをES256で設定
            jwtSignature.initVerify(PUBLIC_KEY); //公開鍵を指定して署名を初期化
            jwtSignature.update((jwtHeaderStr + "." + jwtPayloadStr).getBytes()); //ヘッダーとペイロードの署名を作成
            // 検証(true: 成功、false: 失敗)
            return jwtSignature.verify(Base64.decodeBase64(jwtSignatureStr));
        } catch (Exception e) {
            System.out.println("JWTの検証中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
    }

    /**
     * JWTからIDを取得する
     * @param jwt
     * @return id
     */
    public Integer getId(String jwt) throws AuthenticationException {
        try {
            JsonNode json = decodeJwtPayload(jwt);
            return Integer.parseInt(json.get("sub").asText()); //JSONからID(sub)を取得
        } catch (Exception e) {
            System.out.println("JWTからID取得中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            throw new AuthenticationException(messageSource.getMessage("error.authentication", new String[]{}, Locale.getDefault()));
        }
    }
    
    /**
     * JWTから店舗IDを取得する
     * @param jwt
     * @return storeId
     */
    public Integer getStoreId(String jwt) throws AuthenticationException {
        try {
            JsonNode json = decodeJwtPayload(jwt);
            return Integer.parseInt(json.get("storeId").asText()); //JSONから店舗ID(storeId)を取得
        } catch (Exception e) {
            System.out.println("JWTから店舗ID取得中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            throw new AuthenticationException(messageSource.getMessage("error.authentication", new String[]{}, Locale.getDefault()));
        }
    }
    
    /**
     * JWTから認証タイプを取得する
     * @param jwt
     * @return authenticationType
     */
    public Integer getAuthenticationType(String jwt) throws AuthenticationException {
        try {
            JsonNode json = decodeJwtPayload(jwt);
            return Integer.parseInt(json.get("authenticationType").asText()); //JSONから認証タイプ(authenticationType)を取得
        } catch (Exception e) {
            System.out.println("JWTから認証タイプ取得中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            throw new AuthenticationException(messageSource.getMessage("error.authentication", new String[]{}, Locale.getDefault()));
        }
    }

    /**
     * JWTのペイロードをデコードする
     * @param jwt
     * @return json
     */
    private JsonNode decodeJwtPayload(String jwt) {
        try {
            final String[] splitJwt = jwt.split("\\."); //JWTをヘッダー、ペイロード、署名に分割
            final String jwtPayloadStr = splitJwt[1]; //ペイロードを取得
            byte[] jwtPayloadBytes = Base64.decodeBase64(jwtPayloadStr); //ペイロードをデコード
            return new ObjectMapper().readTree(jwtPayloadBytes); //デコードしたペイロードをJSONに変換
        } catch (Exception e) {
            System.out.println("JWTのペイロードのデコード中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }
    }

    /**
     * JWTのヘッダーを作成する
     * @param objectMapper
     * @return ヘッダー
     */
    private String createHeader(ObjectMapper objectMapper) throws Exception {
        try {
            final Map<String, Object> jwtHeader = new LinkedHashMap<>(); //ヘッダーオブジェクトを作成
            jwtHeader.put("alg", "ES256"); //アルゴリズムをES256で設定
            jwtHeader.put("typ", "JWT"); //タイプをJWTで設定
            return Base64.encodeBase64URLSafeString(objectMapper.writeValueAsBytes(jwtHeader)); //ヘッダーオブジェクトをBase64でエンコード
        } catch (Exception e) {
            System.out.println("JWTのヘッダー作成中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            throw new Exception();
        }
    }

    /**
     * JWTのペイロードを作成する
     * @param loginUser, objectMapper
     * @return ペイロード
     */
    private String createPayload(LoginUser loginUser, ObjectMapper objectMapper) throws Exception {
        try {
            // ペイロード部設定
            final Map<String, Object> jwtPayload = new LinkedHashMap<>(); //ペイロードオブジェクトを作成
            jwtPayload.put("sub", loginUser.getId()); //JWT発行者のユーザ識別子
            jwtPayload.put("iat", instance.jwtIat()); //JWT発行時刻
            jwtPayload.put("exp", instance.jwtExp()); //JWT有効期限
            jwtPayload.put("storeId", loginUser.getStoreId()); //店舗ID
            jwtPayload.put("authenticationType", loginUser.getAuthenticationType()); //認証タイプ
            return Base64.encodeBase64URLSafeString(objectMapper.writeValueAsBytes(jwtPayload)); //ペイロードオブジェクトをBase64でエンコード
        } catch (Exception e) {
            System.out.println("JWTのペイロード作成中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            throw new Exception();
        }
    }

    /**
     * JWTの署名データを作成する
     * @param jwtHeaderStr, jwtPayloadStr
     * @return 署名データ
     */
    private String createSignature(String jwtHeaderStr, String jwtPayloadStr) throws Exception {
        try {
            final Signature jwtSignature = Signature.getInstance("SHA256withECDSAinP1363Format"); //署名アルゴリズムをES256で設定
            jwtSignature.initSign(PRIVATE_KEY); //秘密鍵を指定して署名を初期化
            jwtSignature.update((jwtHeaderStr + "." + jwtPayloadStr).getBytes()); //ヘッダーとペイロードの署名を作成
            byte[] jwtSignatureBytes = jwtSignature.sign(); //署名(ヘッダー、ペイロード)を取得
            return Base64.encodeBase64URLSafeString(jwtSignatureBytes); //署名データ(ヘッダー、ペイロード)をBase64でエンコード
        } catch (Exception e) {
            System.out.println("JWTの署名データ作成中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            throw new Exception();
        }
    }
}
