package com.c4c._2022server.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.c4c._2022server.entity.SalesHistory;
import com.c4c._2022server.entity.SalesHistoryExample;
import com.c4c._2022server.entity.SalesHistoryExample.Criteria;
import com.c4c._2022server.entity.SalesHistoryExample.Criterion;

public class SalesHistorySqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(SalesHistoryExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("SALES_HISTORY");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(SalesHistoryExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("SALES_HISTORY");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(SalesHistory row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("SALES_HISTORY");
        
        if (row.getSalesHistoryId() != null) {
            sql.VALUES("SALES_HISTORY_ID", "#{salesHistoryId,jdbcType=INTEGER}");
        }
        
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
        
        if (row.getSalesDatetime() != null) {
            sql.VALUES("SALES_DATETIME", "#{salesDatetime,jdbcType=TIMESTAMP}");
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
    public String selectByExample(SalesHistoryExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SALES_HISTORY_ID");
        } else {
            sql.SELECT("SALES_HISTORY_ID");
        }
        sql.SELECT("RESERVE_HISTORY_ID");
        sql.SELECT("STORE_ID");
        sql.SELECT("CUSTOMER_ID");
        sql.SELECT("STUFF_ID");
        sql.SELECT("`RANK`");
        sql.SELECT("MENU");
        sql.SELECT("PRICE");
        sql.SELECT("SALES_DATETIME");
        sql.SELECT("DELETE_FLG");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("UPDATE_DATETIME");
        sql.SELECT("UPDATE_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("SALES_HISTORY");
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
        SalesHistory row = (SalesHistory) parameter.get("row");
        SalesHistoryExample example = (SalesHistoryExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("SALES_HISTORY");
        
        if (row.getSalesHistoryId() != null) {
            sql.SET("SALES_HISTORY_ID = #{row.salesHistoryId,jdbcType=INTEGER}");
        }
        
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
        
        if (row.getSalesDatetime() != null) {
            sql.SET("SALES_DATETIME = #{row.salesDatetime,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("SALES_HISTORY");
        
        sql.SET("SALES_HISTORY_ID = #{row.salesHistoryId,jdbcType=INTEGER}");
        sql.SET("RESERVE_HISTORY_ID = #{row.reserveHistoryId,jdbcType=INTEGER}");
        sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        sql.SET("CUSTOMER_ID = #{row.customerId,jdbcType=INTEGER}");
        sql.SET("STUFF_ID = #{row.stuffId,jdbcType=INTEGER}");
        sql.SET("`RANK` = #{row.rank,jdbcType=VARCHAR}");
        sql.SET("MENU = #{row.menu,jdbcType=VARCHAR}");
        sql.SET("PRICE = #{row.price,jdbcType=INTEGER}");
        sql.SET("SALES_DATETIME = #{row.salesDatetime,jdbcType=TIMESTAMP}");
        sql.SET("DELETE_FLG = #{row.deleteFlg,jdbcType=INTEGER}");
        sql.SET("CREATED_DATETIME = #{row.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{row.createdUser,jdbcType=INTEGER}");
        sql.SET("UPDATE_DATETIME = #{row.updateDatetime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_USER = #{row.updateUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{row.versionExKey,jdbcType=INTEGER}");
        
        SalesHistoryExample example = (SalesHistoryExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(SalesHistory row) {
        SQL sql = new SQL();
        sql.UPDATE("SALES_HISTORY");
        
        if (row.getReserveHistoryId() != null) {
            sql.SET("RESERVE_HISTORY_ID = #{reserveHistoryId,jdbcType=INTEGER}");
        }
        
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
        
        if (row.getSalesDatetime() != null) {
            sql.SET("SALES_DATETIME = #{salesDatetime,jdbcType=TIMESTAMP}");
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
        
        sql.WHERE("SALES_HISTORY_ID = #{salesHistoryId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, SalesHistoryExample example, boolean includeExamplePhrase) {
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
}