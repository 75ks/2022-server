package com.c4c._2022server.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.entity.StuffExample;
import com.c4c._2022server.entity.StuffExample.Criteria;
import com.c4c._2022server.entity.StuffExample.Criterion;
import com.c4c._2022server.form.StuffListFormReq;

public class StuffSqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(StuffExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("STUFF");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(StuffExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("STUFF");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(Stuff row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("STUFF");

        if (row.getStuffId() != null) {
            sql.VALUES("STUFF_ID", "#{stuffId,jdbcType=INTEGER}");
        }

        if (row.getStoreId() != null) {
            sql.VALUES("STORE_ID", "#{storeId,jdbcType=INTEGER}");
        }

        if (row.getLastName() != null) {
            sql.VALUES("LAST_NAME", "#{lastName,jdbcType=VARCHAR}");
        }

        if (row.getFirstName() != null) {
            sql.VALUES("FIRST_NAME", "#{firstName,jdbcType=VARCHAR}");
        }

        if (row.getLastNameKana() != null) {
            sql.VALUES("LAST_NAME_KANA", "#{lastNameKana,jdbcType=VARCHAR}");
        }

        if (row.getFirstNameKana() != null) {
            sql.VALUES("FIRST_NAME_KANA", "#{firstNameKana,jdbcType=VARCHAR}");
        }

        if (row.getRankId() != null) {
            sql.VALUES("RANK_ID", "#{rankId,jdbcType=INTEGER}");
        }

        if (row.getBirthday() != null) {
            sql.VALUES("BIRTHDAY", "#{birthday,jdbcType=DATE}");
        }

        if (row.getAge() != null) {
            sql.VALUES("AGE", "#{age,jdbcType=INTEGER}");
        }

        if (row.getGender() != null) {
            sql.VALUES("GENDER", "#{gender,jdbcType=INTEGER}");
        }

        if (row.getPostalCode() != null) {
            sql.VALUES("POSTAL_CODE", "#{postalCode,jdbcType=VARCHAR}");
        }

        if (row.getPrefectureId() != null) {
            sql.VALUES("PREFECTURE_ID", "#{prefectureId,jdbcType=INTEGER}");
        }

        if (row.getAddress1() != null) {
            sql.VALUES("ADDRESS1", "#{address1,jdbcType=VARCHAR}");
        }

        if (row.getAddress2() != null) {
            sql.VALUES("ADDRESS2", "#{address2,jdbcType=VARCHAR}");
        }

        if (row.getAddress3() != null) {
            sql.VALUES("ADDRESS3", "#{address3,jdbcType=VARCHAR}");
        }

        if (row.getPhoneNumber() != null) {
            sql.VALUES("PHONE_NUMBER", "#{phoneNumber,jdbcType=VARCHAR}");
        }

        if (row.getEmail() != null) {
            sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }

        if (row.getPassword() != null) {
            sql.VALUES("`PASSWORD`", "#{password,jdbcType=VARCHAR}");
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
    public String selectByExample(StuffExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("STUFF_ID");
        } else {
            sql.SELECT("STUFF_ID");
        }
        sql.SELECT("STORE_ID");
        sql.SELECT("LAST_NAME");
        sql.SELECT("FIRST_NAME");
        sql.SELECT("LAST_NAME_KANA");
        sql.SELECT("FIRST_NAME_KANA");
        sql.SELECT("RANK_ID");
        sql.SELECT("BIRTHDAY");
        sql.SELECT("AGE");
        sql.SELECT("GENDER");
        sql.SELECT("POSTAL_CODE");
        sql.SELECT("PREFECTURE_ID");
        sql.SELECT("ADDRESS1");
        sql.SELECT("ADDRESS2");
        sql.SELECT("ADDRESS3");
        sql.SELECT("PHONE_NUMBER");
        sql.SELECT("EMAIL");
        sql.SELECT("`PASSWORD`");
        sql.SELECT("DELETE_FLG");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("UPDATE_DATETIME");
        sql.SELECT("UPDATE_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("STUFF");
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
        Stuff row = (Stuff) parameter.get("row");
        StuffExample example = (StuffExample) parameter.get("example");

        SQL sql = new SQL();
        sql.UPDATE("STUFF");

        if (row.getStuffId() != null) {
            sql.SET("STUFF_ID = #{row.stuffId,jdbcType=INTEGER}");
        }

        if (row.getStoreId() != null) {
            sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        }

        if (row.getLastName() != null) {
            sql.SET("LAST_NAME = #{row.lastName,jdbcType=VARCHAR}");
        }

        if (row.getFirstName() != null) {
            sql.SET("FIRST_NAME = #{row.firstName,jdbcType=VARCHAR}");
        }

        if (row.getLastNameKana() != null) {
            sql.SET("LAST_NAME_KANA = #{row.lastNameKana,jdbcType=VARCHAR}");
        }

        if (row.getFirstNameKana() != null) {
            sql.SET("FIRST_NAME_KANA = #{row.firstNameKana,jdbcType=VARCHAR}");
        }

        if (row.getRankId() != null) {
            sql.SET("RANK_ID = #{row.rankId,jdbcType=INTEGER}");
        }

        if (row.getBirthday() != null) {
            sql.SET("BIRTHDAY = #{row.birthday,jdbcType=DATE}");
        }

        if (row.getAge() != null) {
            sql.SET("AGE = #{row.age,jdbcType=INTEGER}");
        }

        if (row.getGender() != null) {
            sql.SET("GENDER = #{row.gender,jdbcType=INTEGER}");
        }

        if (row.getPostalCode() != null) {
            sql.SET("POSTAL_CODE = #{row.postalCode,jdbcType=VARCHAR}");
        }

        if (row.getPrefectureId() != null) {
            sql.SET("PREFECTURE_ID = #{row.prefectureId,jdbcType=INTEGER}");
        }

        if (row.getAddress1() != null) {
            sql.SET("ADDRESS1 = #{row.address1,jdbcType=VARCHAR}");
        }

        if (row.getAddress2() != null) {
            sql.SET("ADDRESS2 = #{row.address2,jdbcType=VARCHAR}");
        }

        if (row.getAddress3() != null) {
            sql.SET("ADDRESS3 = #{row.address3,jdbcType=VARCHAR}");
        }

        if (row.getPhoneNumber() != null) {
            sql.SET("PHONE_NUMBER = #{row.phoneNumber,jdbcType=VARCHAR}");
        }

        if (row.getEmail() != null) {
            sql.SET("EMAIL = #{row.email,jdbcType=VARCHAR}");
        }

        if (row.getPassword() != null) {
            sql.SET("`PASSWORD` = #{row.password,jdbcType=VARCHAR}");
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
        sql.UPDATE("STUFF");

        sql.SET("STUFF_ID = #{row.stuffId,jdbcType=INTEGER}");
        sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        sql.SET("LAST_NAME = #{row.lastName,jdbcType=VARCHAR}");
        sql.SET("FIRST_NAME = #{row.firstName,jdbcType=VARCHAR}");
        sql.SET("LAST_NAME_KANA = #{row.lastNameKana,jdbcType=VARCHAR}");
        sql.SET("FIRST_NAME_KANA = #{row.firstNameKana,jdbcType=VARCHAR}");
        sql.SET("RANK_ID = #{row.rankId,jdbcType=INTEGER}");
        sql.SET("BIRTHDAY = #{row.birthday,jdbcType=DATE}");
        sql.SET("AGE = #{row.age,jdbcType=INTEGER}");
        sql.SET("GENDER = #{row.gender,jdbcType=INTEGER}");
        sql.SET("POSTAL_CODE = #{row.postalCode,jdbcType=VARCHAR}");
        sql.SET("PREFECTURE_ID = #{row.prefectureId,jdbcType=INTEGER}");
        sql.SET("ADDRESS1 = #{row.address1,jdbcType=VARCHAR}");
        sql.SET("ADDRESS2 = #{row.address2,jdbcType=VARCHAR}");
        sql.SET("ADDRESS3 = #{row.address3,jdbcType=VARCHAR}");
        sql.SET("PHONE_NUMBER = #{row.phoneNumber,jdbcType=VARCHAR}");
        sql.SET("EMAIL = #{row.email,jdbcType=VARCHAR}");
        sql.SET("`PASSWORD` = #{row.password,jdbcType=VARCHAR}");
        sql.SET("DELETE_FLG = #{row.deleteFlg,jdbcType=INTEGER}");
        sql.SET("CREATED_DATETIME = #{row.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{row.createdUser,jdbcType=INTEGER}");
        sql.SET("UPDATE_DATETIME = #{row.updateDatetime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_USER = #{row.updateUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{row.versionExKey,jdbcType=INTEGER}");

        StuffExample example = (StuffExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(Stuff row) {
        SQL sql = new SQL();
        sql.UPDATE("STUFF");

        if (row.getStoreId() != null) {
            sql.SET("STORE_ID = #{storeId,jdbcType=INTEGER}");
        }

        if (row.getLastName() != null) {
            sql.SET("LAST_NAME = #{lastName,jdbcType=VARCHAR}");
        }

        if (row.getFirstName() != null) {
            sql.SET("FIRST_NAME = #{firstName,jdbcType=VARCHAR}");
        }

        if (row.getLastNameKana() != null) {
            sql.SET("LAST_NAME_KANA = #{lastNameKana,jdbcType=VARCHAR}");
        }

        if (row.getFirstNameKana() != null) {
            sql.SET("FIRST_NAME_KANA = #{firstNameKana,jdbcType=VARCHAR}");
        }

        if (row.getRankId() != null) {
            sql.SET("RANK_ID = #{rankId,jdbcType=INTEGER}");
        }

        if (row.getBirthday() != null) {
            sql.SET("BIRTHDAY = #{birthday,jdbcType=DATE}");
        }

        if (row.getAge() != null) {
            sql.SET("AGE = #{age,jdbcType=INTEGER}");
        }

        if (row.getGender() != null) {
            sql.SET("GENDER = #{gender,jdbcType=INTEGER}");
        }

        if (row.getPostalCode() != null) {
            sql.SET("POSTAL_CODE = #{postalCode,jdbcType=VARCHAR}");
        }

        if (row.getPrefectureId() != null) {
            sql.SET("PREFECTURE_ID = #{prefectureId,jdbcType=INTEGER}");
        }

        if (row.getAddress1() != null) {
            sql.SET("ADDRESS1 = #{address1,jdbcType=VARCHAR}");
        }

        if (row.getAddress2() != null) {
            sql.SET("ADDRESS2 = #{address2,jdbcType=VARCHAR}");
        }

        if (row.getAddress3() != null) {
            sql.SET("ADDRESS3 = #{address3,jdbcType=VARCHAR}");
        }

        if (row.getPhoneNumber() != null) {
            sql.SET("PHONE_NUMBER = #{phoneNumber,jdbcType=VARCHAR}");
        }

        if (row.getEmail() != null) {
            sql.SET("EMAIL = #{email,jdbcType=VARCHAR}");
        }

        if (row.getPassword() != null) {
            sql.SET("`PASSWORD` = #{password,jdbcType=VARCHAR}");
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

        sql.WHERE("STUFF_ID = #{stuffId,jdbcType=INTEGER}");

        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, StuffExample example, boolean includeExamplePhrase) {
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
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
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

    public String select0002(StuffListFormReq reqForm) {
        SQL sql = new SQL();
        sql.SELECT(
                "STUFF.STUFF_ID",
                "STUFF.STORE_ID",
                "STUFF.LAST_NAME",
                "STUFF.FIRST_NAME",
                "STUFF.LAST_NAME_KANA",
                "STUFF.FIRST_NAME_KANA",
                "STUFF.RANK_ID",
                "STUFF.AGE",
                "STUFF.GENDER",
                "RANK_BY_STORE.RANK"
        );
        sql.FROM("STUFF");
        sql.INNER_JOIN(
                "RANK_BY_STORE ON RANK_BY_STORE.STORE_ID = STUFF.STORE_ID AND RANK_BY_STORE.RANK_ID = STUFF.RANK_ID"
        );
        sql.WHERE("STUFF.STORE_ID = #{storeId}");
        sql.WHERE("STUFF.DELETE_FLG = 0");

        // スタッフID
        if (!(reqForm.getStuffId() == null)) {
            sql.AND();
            sql.WHERE("STUFF.STUFF_ID = #{reqForm.stuffId}");
        }

        // 店舗ID
        if (!(reqForm.getStoreId() == null)) {
            sql.AND();
            sql.WHERE("STUFF.STORE_ID = #{reqForm.storeId}");
        }

        // スタッフ名(姓 or 名)
        if (!(reqForm.getStuffName() == null || reqForm.getStuffName().isEmpty())) {
            sql.AND();
            sql.WHERE("STUFF.LAST_NAME LIKE '%' #{reqForm.stuffName} '%' OR " +
                    "STUFF.FIRST_NAME LIKE '%' #{reqForm.stuffName} '%'");
        }

        // スタッフ仮名(セイ or メイ)
        if (!(reqForm.getStuffNameKana() == null || reqForm.getStuffNameKana().isEmpty())) {
            sql.AND();
            sql.WHERE("STUFF.LAST_NAME_KANA LIKE '%' #{reqForm.stuffNameKana} '%' OR " +
                    "STUFF.FIRST_NAME_KANA LIKE '%' #{reqForm.stuffNameKana} '%'");
        }

        // ランク名
        if (!(reqForm.getRankName() == null || reqForm.getRankName().isEmpty() || reqForm.getRankName().equals("指定なし"))) {
            sql.AND();
            sql.WHERE("STUFF.RANK_ID = #{reqForm.rankName}");
        }

        // 年齢
        if (!(reqForm.getAge() == null)) {
            sql.AND();
            sql.WHERE("STUFF.AGE = #{reqForm.age}");
        }

        // 性別
        if (!(reqForm.getGender() == null)) {
            sql.AND();
            sql.WHERE("STUFF.GENDER = #{reqForm.gender}");
        }

        return sql.toString();
    }
}
