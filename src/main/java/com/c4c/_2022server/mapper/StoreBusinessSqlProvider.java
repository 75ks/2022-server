package com.c4c._2022server.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.c4c._2022server.entity.StoreBusiness;
import com.c4c._2022server.entity.StoreBusinessExample;
import com.c4c._2022server.entity.StoreBusinessExample.Criteria;
import com.c4c._2022server.entity.StoreBusinessExample.Criterion;

public class StoreBusinessSqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(StoreBusinessExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("STORE_BUSINESS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(StoreBusinessExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("STORE_BUSINESS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(StoreBusiness row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("STORE_BUSINESS");
        
        if (row.getStoreId() != null) {
            sql.VALUES("STORE_ID", "#{storeId,jdbcType=INTEGER}");
        }
        
        if (row.getWeeks() != null) {
            sql.VALUES("WEEKS", "#{weeks,jdbcType=INTEGER}");
        }
        
        if (row.getDayOfWeek() != null) {
            sql.VALUES("DAY_OF_WEEK", "#{dayOfWeek,jdbcType=INTEGER}");
        }
        
        if (row.getBusinessStart() != null) {
            sql.VALUES("BUSINESS_START", "#{businessStart,jdbcType=TIME}");
        }
        
        if (row.getBusinessEnd() != null) {
            sql.VALUES("BUSINESS_END", "#{businessEnd,jdbcType=TIME}");
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
    public String selectByExample(StoreBusinessExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("STORE_ID");
        } else {
            sql.SELECT("STORE_ID");
        }
        sql.SELECT("WEEKS");
        sql.SELECT("DAY_OF_WEEK");
        sql.SELECT("BUSINESS_START");
        sql.SELECT("BUSINESS_END");
        sql.SELECT("DELETE_FLG");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("UPDATE_DATETIME");
        sql.SELECT("UPDATE_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("STORE_BUSINESS");
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
        StoreBusiness row = (StoreBusiness) parameter.get("row");
        StoreBusinessExample example = (StoreBusinessExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("STORE_BUSINESS");
        
        if (row.getStoreId() != null) {
            sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        }
        
        if (row.getWeeks() != null) {
            sql.SET("WEEKS = #{row.weeks,jdbcType=INTEGER}");
        }
        
        if (row.getDayOfWeek() != null) {
            sql.SET("DAY_OF_WEEK = #{row.dayOfWeek,jdbcType=INTEGER}");
        }
        
        if (row.getBusinessStart() != null) {
            sql.SET("BUSINESS_START = #{row.businessStart,jdbcType=TIME}");
        }
        
        if (row.getBusinessEnd() != null) {
            sql.SET("BUSINESS_END = #{row.businessEnd,jdbcType=TIME}");
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
        sql.UPDATE("STORE_BUSINESS");
        
        sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        sql.SET("WEEKS = #{row.weeks,jdbcType=INTEGER}");
        sql.SET("DAY_OF_WEEK = #{row.dayOfWeek,jdbcType=INTEGER}");
        sql.SET("BUSINESS_START = #{row.businessStart,jdbcType=TIME}");
        sql.SET("BUSINESS_END = #{row.businessEnd,jdbcType=TIME}");
        sql.SET("DELETE_FLG = #{row.deleteFlg,jdbcType=INTEGER}");
        sql.SET("CREATED_DATETIME = #{row.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{row.createdUser,jdbcType=INTEGER}");
        sql.SET("UPDATE_DATETIME = #{row.updateDatetime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_USER = #{row.updateUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{row.versionExKey,jdbcType=INTEGER}");
        
        StoreBusinessExample example = (StoreBusinessExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(StoreBusiness row) {
        SQL sql = new SQL();
        sql.UPDATE("STORE_BUSINESS");
        
        if (row.getBusinessStart() != null) {
            sql.SET("BUSINESS_START = #{businessStart,jdbcType=TIME}");
        }
        
        if (row.getBusinessEnd() != null) {
            sql.SET("BUSINESS_END = #{businessEnd,jdbcType=TIME}");
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
        
        sql.WHERE("STORE_ID = #{storeId,jdbcType=INTEGER}");
        sql.WHERE("WEEKS = #{weeks,jdbcType=INTEGER}");
        sql.WHERE("DAY_OF_WEEK = #{dayOfWeek,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, StoreBusinessExample example, boolean includeExamplePhrase) {
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