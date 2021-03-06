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
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.mapper.StuffMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JWTUtils {
    @Autowired
    StuffMapper stuffMapper;
    /**
     * 楕円曲線暗号の公開鍵
     */
    private static ECPublicKey PUBLIC_KEY;

    /**
     * 楕円曲線暗号の秘密鍵
     */
    private static ECPrivateKey PRIVATE_KEY;

    /**
     * JWTの発行日時
     * @return 現在日時
     */
    private static long jwtIat() {
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt = ldt.atZone(ZoneOffset.ofHours(+9));
        return zdt.toEpochSecond();
    }

    /**
     * JWTの有効期限
     * @return 現在日時 + 1時間後
     */
    private static long jwtExp() {
        LocalDateTime ldt = LocalDateTime.now().plusHours(1);
        ZonedDateTime zdt = ldt.atZone(ZoneOffset.ofHours(+9));
        return zdt.toEpochSecond();
    }

    /**
     * JWTを作成する
     * @param stuffId
     * @return jwt
     */
    public static String createJWT(Stuff stuff) {
        try {
            // JSONとJavaオブジェクト相互変換用オブジェクトを作成
            final ObjectMapper objectMapper = new ObjectMapper();
            // 署名鍵作成
            createKeyPair();
            // ヘッダー作成
            String jwtHeaderStr = createHeader(objectMapper);
            // ペイロード作成
            String jwtPayloadStr = createPayload(stuff, objectMapper);
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
            return "";
        }
    }

    /**
     * JWTを検証する
     * @param jwt
     * @return 検証結果
     */
    public static boolean verifyJWT(String jwt) {
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
     * JWTからスタッフIDを取得する
     * @param jwt
     * @return stuffId
     */
    public static Integer getStuffId(String jwt) {
        try {
            JsonNode json = decodeJwtPayload(jwt);
            return Integer.parseInt(json.get("sub").asText()); //JSONからスタッフID(sub)を取得
        } catch (Exception e) {
            System.out.println("JWTからスタッフID取得中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }
    }
    
    /**
     * JWTから店舗IDを取得する
     * @param jwt
     * @return storeId
     */
    public static Integer getStoreId(String jwt) {
        try {
            JsonNode json = decodeJwtPayload(jwt);
            return Integer.parseInt(json.get("storeId").asText()); //JSONから店舗ID(storeId)を取得
        } catch (Exception e) {
            System.out.println("JWTから店舗ID取得中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }
    }

    /**
     * JWTのペイロードをデコードする
     * @param jwt
     * @return json
     */
    private static JsonNode decodeJwtPayload(String jwt) {
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
     * JWTの署名鍵を作成する
     */
    private static void createKeyPair() {
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
     * JWTのヘッダーを作成する
     * @param objectMapper
     * @return ヘッダー
     */
    private static String createHeader(ObjectMapper objectMapper) {
        try {
            final Map<String, Object> jwtHeader = new LinkedHashMap<>(); //ヘッダーオブジェクトを作成
            jwtHeader.put("alg", "ES256"); //アルゴリズムをES256で設定
            jwtHeader.put("typ", "JWT"); //タイプをJWTで設定
            return Base64.encodeBase64URLSafeString(objectMapper.writeValueAsBytes(jwtHeader)); //ヘッダーオブジェクトをBase64でエンコード
        } catch (Exception e) {
            System.out.println("JWTのヘッダー作成中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return "";
        }
    }

    /**
     * JWTのペイロードを作成する
     * @param stuffId, objectMapper
     * @return ペイロード
     */
    private static String createPayload(Stuff stuff, ObjectMapper objectMapper) {
        try {
            // ペイロード部設定
            final Map<String, Object> jwtPayload = new LinkedHashMap<>(); //ペイロードオブジェクトを作成
            jwtPayload.put("sub", stuff.getStuffId()); //JWT発行者のユーザ識別子
            jwtPayload.put("iat", jwtIat()); //JWT発行時刻
            jwtPayload.put("exp", jwtExp()); //JWT有効期限
            jwtPayload.put("storeId", stuff.getStoreId()); //店舗ID
            return Base64.encodeBase64URLSafeString(objectMapper.writeValueAsBytes(jwtPayload)); //ペイロードオブジェクトをBase64でエンコード
        } catch (Exception e) {
            System.out.println("JWTのペイロード作成中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return "";
        }
    }

    /**
     * JWTの署名データを作成する
     * @param jwtHeaderStr, jwtPayloadStr
     * @return 署名データ
     */
    private static String createSignature(String jwtHeaderStr, String jwtPayloadStr) {
        try {
            final Signature jwtSignature = Signature.getInstance("SHA256withECDSAinP1363Format"); //署名アルゴリズムをES256で設定
            jwtSignature.initSign(PRIVATE_KEY); //秘密鍵を指定して署名を初期化
            jwtSignature.update((jwtHeaderStr + "." + jwtPayloadStr).getBytes()); //ヘッダーとペイロードの署名を作成
            byte[] jwtSignatureBytes = jwtSignature.sign(); //署名(ヘッダー、ペイロード)を取得
            return Base64.encodeBase64URLSafeString(jwtSignatureBytes); //署名データ(ヘッダー、ペイロード)をBase64でエンコード
        } catch (Exception e) {
            System.out.println("JWTの署名データ作成中にエラーが発生しました");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return "";
        }
    }
}
