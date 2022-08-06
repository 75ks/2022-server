package com.c4c._2022server.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.c4c._2022server.entity.ReserveHistory;
import com.c4c._2022server.entity.ReserveHistoryExample;
import com.c4c._2022server.entity.ReserveHistoryExample.Criteria;
import com.c4c._2022server.entity.ReserveHistoryExample.Criterion;
import com.c4c._2022server.form.ReserveHistoryReq;

public class ReserveHistorySqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(ReserveHistoryExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("RESERVE_HISTORY");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(ReserveHistoryExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("RESERVE_HISTORY");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(ReserveHistory row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("RESERVE_HISTORY");

        if (row.getReserveHistoryId() != null) {
            sql.VALUES("RESERVE_HISTORY_ID", "#{reserveHistoryId,jdbcType=INTEGER}");
        }

        if (row.getStoreId() != null) {
            sql.VALUES("STORE_ID", "#{storeId,jdbcType=INTEGER}");
        }

        if (row.getCustomerId() != null) {
            sql.VALUES("CUSTOMER_ID", "#{customerId,jdbcType=INTEGER}");
        }

        if (row.getStuffId() != null) {
            sql.VALUES("STUFF_ID", "#{stuffId,jdbcType=INTEGER}");
        }

        if (row.getRank() != null) {
            sql.VALUES("`RANK`", "#{rank,jdbcType=VARCHAR}");
        }

        if (row.getMenu() != null) {
            sql.VALUES("MENU", "#{menu,jdbcType=VARCHAR}");
        }

        if (row.getPrice() != null) {
            sql.VALUES("PRICE", "#{price,jdbcType=INTEGER}");
        }

        if (row.getReserveDatetime() != null) {
            sql.VALUES("RESERVE_DATETIME", "#{reserveDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getReserveState() != null) {
            sql.VALUES("RESERVE_STATE", "#{reserveState,jdbcType=INTEGER}");
        }

        if (row.getDeleteFlg() != null) {
            sql.VALUES("DELETE_FLG", "#{deleteFlg,jdbcType=INTEGER}");
        }

        if (row.getCreatedDatetime() != null) {
            sql.VALUES("CREATED_DATETIME", "#{createdDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getCreatedUser() != null) {
            sql.VALUES("CREATED_USER", "#{createdUser,jdbcType=INTEGER}");
        }

        if (row.getUpdateDatetime() != null) {
            sql.VALUES("UPDATE_DATETIME", "#{updateDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getUpdateUser() != null) {
            sql.VALUES("UPDATE_USER", "#{updateUser,jdbcType=INTEGER}");
        }

        if (row.getVersionExKey() != null) {
            sql.VALUES("VERSION_EX_KEY", "#{versionExKey,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String selectByExample(ReserveHistoryExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("RESERVE_HISTORY_ID");
        } else {
            sql.SELECT("RESERVE_HISTORY_ID");
        }
        sql.SELECT("STORE_ID");
        sql.SELECT("CUSTOMER_ID");
        sql.SELECT("STUFF_ID");
        sql.SELECT("`RANK`");
        sql.SELECT("MENU");
        sql.SELECT("PRICE");
        sql.SELECT("RESERVE_DATETIME");
        sql.SELECT("RESERVE_STATE");
        sql.SELECT("DELETE_FLG");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("UPDATE_DATETIME");
        sql.SELECT("UPDATE_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("RESERVE_HISTORY");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        ReserveHistory row = (ReserveHistory) parameter.get("row");
        ReserveHistoryExample example = (ReserveHistoryExample) parameter.get("example");

        SQL sql = new SQL();
        sql.UPDATE("RESERVE_HISTORY");

        if (row.getReserveHistoryId() != null) {
            sql.SET("RESERVE_HISTORY_ID = #{row.reserveHistoryId,jdbcType=INTEGER}");
        }

        if (row.getStoreId() != null) {
            sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        }

        if (row.getCustomerId() != null) {
            sql.SET("CUSTOMER_ID = #{row.customerId,jdbcType=INTEGER}");
        }

        if (row.getStuffId() != null) {
            sql.SET("STUFF_ID = #{row.stuffId,jdbcType=INTEGER}");
        }

        if (row.getRank() != null) {
            sql.SET("`RANK` = #{row.rank,jdbcType=VARCHAR}");
        }

        if (row.getMenu() != null) {
            sql.SET("MENU = #{row.menu,jdbcType=VARCHAR}");
        }

        if (row.getPrice() != null) {
            sql.SET("PRICE = #{row.price,jdbcType=INTEGER}");
        }

        if (row.getReserveDatetime() != null) {
            sql.SET("RESERVE_DATETIME = #{row.reserveDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getReserveState() != null) {
            sql.SET("RESERVE_STATE = #{row.reserveState,jdbcType=INTEGER}");
        }

        if (row.getDeleteFlg() != null) {
            sql.SET("DELETE_FLG = #{row.deleteFlg,jdbcType=INTEGER}");
        }

        if (row.getCreatedDatetime() != null) {
            sql.SET("CREATED_DATETIME = #{row.createdDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getCreatedUser() != null) {
            sql.SET("CREATED_USER = #{row.createdUser,jdbcType=INTEGER}");
        }

        if (row.getUpdateDatetime() != null) {
            sql.SET("UPDATE_DATETIME = #{row.updateDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getUpdateUser() != null) {
            sql.SET("UPDATE_USER = #{row.updateUser,jdbcType=INTEGER}");
        }

        if (row.getVersionExKey() != null) {
            sql.SET("VERSION_EX_KEY = #{row.versionExKey,jdbcType=INTEGER}");
        }

        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("RESERVE_HISTORY");

        sql.SET("RESERVE_HISTORY_ID = #{row.reserveHistoryId,jdbcType=INTEGER}");
        sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        sql.SET("CUSTOMER_ID = #{row.customerId,jdbcType=INTEGER}");
        sql.SET("STUFF_ID = #{row.stuffId,jdbcType=INTEGER}");
        sql.SET("`RANK` = #{row.rank,jdbcType=VARCHAR}");
        sql.SET("MENU = #{row.menu,jdbcType=VARCHAR}");
        sql.SET("PRICE = #{row.price,jdbcType=INTEGER}");
        sql.SET("RESERVE_DATETIME = #{row.reserveDatetime,jdbcType=TIMESTAMP}");
        sql.SET("RESERVE_STATE = #{row.reserveState,jdbcType=INTEGER}");
        sql.SET("DELETE_FLG = #{row.deleteFlg,jdbcType=INTEGER}");
        sql.SET("CREATED_DATETIME = #{row.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{row.createdUser,jdbcType=INTEGER}");
        sql.SET("UPDATE_DATETIME = #{row.updateDatetime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_USER = #{row.updateUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{row.versionExKey,jdbcType=INTEGER}");

        ReserveHistoryExample example = (ReserveHistoryExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(ReserveHistory row) {
        SQL sql = new SQL();
        sql.UPDATE("RESERVE_HISTORY");

        if (row.getStoreId() != null) {
            sql.SET("STORE_ID = #{storeId,jdbcType=INTEGER}");
        }

        if (row.getCustomerId() != null) {
            sql.SET("CUSTOMER_ID = #{customerId,jdbcType=INTEGER}");
        }

        if (row.getStuffId() != null) {
            sql.SET("STUFF_ID = #{stuffId,jdbcType=INTEGER}");
        }

        if (row.getRank() != null) {
            sql.SET("`RANK` = #{rank,jdbcType=VARCHAR}");
        }

        if (row.getMenu() != null) {
            sql.SET("MENU = #{menu,jdbcType=VARCHAR}");
        }

        if (row.getPrice() != null) {
            sql.SET("PRICE = #{price,jdbcType=INTEGER}");
        }

        if (row.getReserveDatetime() != null) {
            sql.SET("RESERVE_DATETIME = #{reserveDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getReserveState() != null) {
            sql.SET("RESERVE_STATE = #{reserveState,jdbcType=INTEGER}");
        }

        if (row.getDeleteFlg() != null) {
            sql.SET("DELETE_FLG = #{deleteFlg,jdbcType=INTEGER}");
        }

        if (row.getCreatedDatetime() != null) {
            sql.SET("CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getCreatedUser() != null) {
            sql.SET("CREATED_USER = #{createdUser,jdbcType=INTEGER}");
        }

        if (row.getUpdateDatetime() != null) {
            sql.SET("UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP}");
        }

        if (row.getUpdateUser() != null) {
            sql.SET("UPDATE_USER = #{updateUser,jdbcType=INTEGER}");
        }

        if (row.getVersionExKey() != null) {
            sql.SET("VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}");
        }

        sql.WHERE("RESERVE_HISTORY_ID = #{reserveHistoryId,jdbcType=INTEGER}");

        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, ReserveHistoryExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }

        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }

        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }

                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }

                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }

        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }

    public String select0001(ReserveHistoryReq reqForm) {
        SQL sql = new SQL();
        sql.SELECT(
                "RESERVE_HISTORY.RESERVE_HISTORY_ID",
                "RESERVE_HISTORY.RANK",
                "RESERVE_HISTORY.MENU",
                "RESERVE_HISTORY.PRICE",
                "RESERVE_HISTORY.RESERVE_DATETIME",
                "RESERVE_HISTORY.RESERVE_STATE",
                "CUSTOMER.LAST_NAME AS CUSTOMER_LAST_NAME",
                "CUSTOMER.FIRST_NAME AS CUSTOMER_FIRST_NAME",
                "CUSTOMER.LAST_NAME_KANA AS CUSTOMER_LAST_NAME_KANA",
                "CUSTOMER.FIRST_NAME_KANA AS CUSTOMER_FIRST_NAME_KANA",
                "STUFF.LAST_NAME AS STUFF_LAST_NAME",
                "STUFF.FIRST_NAME AS STUFF_FIRST_NAME",
                "STUFF.LAST_NAME_KANA AS STUFF_LAST_NAME_KANA",
                "STUFF.FIRST_NAME_KANA AS STUFF_FIRST_NAME_KANA"
        );
        sql.FROM("RESERVE_HISTORY");
        sql.INNER_JOIN(
                "CUSTOMER ON CUSTOMER.CUSTOMER_ID = RESERVE_HISTORY.CUSTOMER_ID"
                , "STUFF ON STUFF.STUFF_ID = RESERVE_HISTORY.STUFF_ID"
        );
        sql.WHERE("RESERVE_HISTORY.STORE_ID = #{storeId}");
        sql.WHERE("RESERVE_HISTORY.DELETE_FLG = 0");

        // 予約履歴ID
        if (!(reqForm.getReserveHistoryId() == null || reqForm.getReserveHistoryId().isEmpty())) {
            sql.AND();
            sql.WHERE("RESERVE_HISTORY.RESERVE_HISTORY_ID = #{reqForm.reserveHistoryId}");
        }

        // 顧客名(姓 or 名)
        if (!(reqForm.getCustomerName() == null || reqForm.getCustomerName().isEmpty())) {
            sql.AND();
            sql.WHERE("CUSTOMER.LAST_NAME LIKE '%' #{reqForm.customerName} '%' OR " +
                    "CUSTOMER.FIRST_NAME LIKE '%' #{reqForm.customerName} '%'");
        }

        // スタッフ名(姓 or 名)
        if (!(reqForm.getStuffName() == null || reqForm.getStuffName().isEmpty())) {
            sql.AND();
            sql.WHERE("STUFF.LAST_NAME LIKE '%' #{reqForm.stuffName} '%' OR " +
                    "STUFF.FIRST_NAME LIKE '%' #{reqForm.stuffName} '%'");
        }

        // ランク名
        if (!(reqForm.getRankName() == null || reqForm.getRankName().isEmpty() || reqForm.getRankName().equals("指定なし"))) {
            sql.AND();
            sql.WHERE("RESERVE_HISTORY.RANK = #{reqForm.rankName}");
        }

        // メニュー
        if (!(reqForm.getMenu() == null || reqForm.getMenu().isEmpty() || reqForm.getMenu().equals("指定なし"))) {
            sql.AND();
            sql.WHERE("RESERVE_HISTORY.MENU = #{reqForm.menu}");
        }

        // 料金(下限)
        if (reqForm.getPriceMin() != null) {
            sql.AND();
            sql.WHERE("RESERVE_HISTORY.PRICE >= #{reqForm.priceMin}");
        }

        // 料金(上限)
        if (reqForm.getPriceMax() != null) {
            sql.AND();
            sql.WHERE("RESERVE_HISTORY.PRICE <= #{reqForm.priceMax}");
        }

        // 日時(下限)
        if (!(reqForm.getReserveDateTimeMin() == null || reqForm.getReserveDateTimeMin().isEmpty())) {
            sql.AND();
            sql.WHERE("RESERVE_HISTORY.RESERVE_DATETIME >= #{reqForm.reserveDateTimeMin}");
        }

        // 日時(上限)
        if (!(reqForm.getReserveDateTimeMax() == null || reqForm.getReserveDateTimeMax().isEmpty())) {
            sql.AND();
            sql.WHERE("RESERVE_HISTORY.RESERVE_DATETIME <= #{reqForm.reserveDateTimeMax}");
        }

        // 予約状態
        if (reqForm.getReserveState() != null) {
            sql.AND();
            sql.WHERE("RESERVE_HISTORY.RESERVE_STATE = #{reqForm.reserveState}");
        }

        return sql.toString();
    }
}
