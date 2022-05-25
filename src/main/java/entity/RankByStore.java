package entity;

import java.util.Date;
import lombok.Data;

/**
 * Table: RANK_BY_STORE
 */
@Data
public class RankByStore {
    /**
     * Column: RANK_BY_STORE_ID
     * Type: INT
     * Remark: 店舗別ランクID
     */
    private Integer rankByStoreId;

    /**
     * Column: STORE_ID
     * Type: INT
     * Remark: 店舗ID
     */
    private Integer storeId;

    /**
     * Column: RANK_ID
     * Type: INT
     * Remark: ランクID
     */
    private Integer rankId;

    /**
     * Column: RANK
     * Type: VARCHAR(255)
     * Remark: ランク
     */
    private String rank;

    /**
     * Column: DELETE_FLG
     * Type: INT
     * Default value: 0
     * Remark: 削除フラグ
     */
    private Integer deleteFlg;

    /**
     * Column: CREATED_DATETIME
     * Type: TIMESTAMP
     * Remark: 作成日時
     */
    private Date createdDatetime;

    /**
     * Column: CREATED_USER
     * Type: INT
     * Remark: 作成者ID
     */
    private Integer createdUser;

    /**
     * Column: UPDATE_DATETIME
     * Type: TIMESTAMP
     * Remark: 更新日時
     */
    private Date updateDatetime;

    /**
     * Column: UPDATE_USER
     * Type: INT
     * Remark: 更新者ID
     */
    private Integer updateUser;

    /**
     * Column: VERSION_EX_KEY
     * Type: INT
     * Default value: 0
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}