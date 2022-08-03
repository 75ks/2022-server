package com.c4c._2022server.mapper;

import com.c4c._2022server.entity.MenuHeader;
import com.c4c._2022server.entity.MenuHeaderExample.Criteria;
import com.c4c._2022server.entity.MenuHeaderExample.Criterion;
import com.c4c._2022server.entity.MenuHeaderExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MenuHeaderSqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(MenuHeaderExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("MENU_HEADER");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(MenuHeaderExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("MENU_HEADER");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(MenuHeader row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("MENU_HEADER");
        
        if (row.getStoreId() != null) {
            sql.VALUES("STORE_ID", "#{storeId,jdbcType=INTEGER}");
        }
        
        if (row.getMenuId() != null) {
            sql.VALUES("MENU_ID", "#{menuId,jdbcType=INTEGER}");
        }
        
        if (row.getMenu() != null) {
            sql.VALUES("MENU", "#{menu,jdbcType=VARCHAR}");
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
    public String selectByExample(MenuHeaderExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("STORE_ID");
        } else {
            sql.SELECT("STORE_ID");
        }
        sql.SELECT("MENU_ID");
        sql.SELECT("MENU");
        sql.SELECT("DELETE_FLG");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("UPDATE_DATETIME");
        sql.SELECT("UPDATE_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("MENU_HEADER");
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
        MenuHeader row = (MenuHeader) parameter.get("row");
        MenuHeaderExample example = (MenuHeaderExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("MENU_HEADER");
        
        if (row.getStoreId() != null) {
            sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        }
        
        if (row.getMenuId() != null) {
            sql.SET("MENU_ID = #{row.menuId,jdbcType=INTEGER}");
        }
        
        if (row.getMenu() != null) {
            sql.SET("MENU = #{row.menu,jdbcType=VARCHAR}");
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
        sql.UPDATE("MENU_HEADER");
        
        sql.SET("STORE_ID = #{row.storeId,jdbcType=INTEGER}");
        sql.SET("MENU_ID = #{row.menuId,jdbcType=INTEGER}");
        sql.SET("MENU = #{row.menu,jdbcType=VARCHAR}");
        sql.SET("DELETE_FLG = #{row.deleteFlg,jdbcType=INTEGER}");
        sql.SET("CREATED_DATETIME = #{row.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{row.createdUser,jdbcType=INTEGER}");
        sql.SET("UPDATE_DATETIME = #{row.updateDatetime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_USER = #{row.updateUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{row.versionExKey,jdbcType=INTEGER}");
        
        MenuHeaderExample example = (MenuHeaderExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(MenuHeader row) {
        SQL sql = new SQL();
        sql.UPDATE("MENU_HEADER");
        
        if (row.getMenu() != null) {
            sql.SET("MENU = #{menu,jdbcType=VARCHAR}");
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
        sql.WHERE("MENU_ID = #{menuId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, MenuHeaderExample example, boolean includeExamplePhrase) {
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