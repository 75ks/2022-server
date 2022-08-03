package com.c4c._2022server.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class StoreBusinessExample {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected String orderByClause;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected boolean distinct;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public StoreBusinessExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("STORE_ID =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("STORE_ID <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("STORE_ID >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STORE_ID >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("STORE_ID <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("STORE_ID <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("STORE_ID in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("STORE_ID not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("STORE_ID between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STORE_ID not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andWeeksIsNull() {
            addCriterion("WEEKS is null");
            return (Criteria) this;
        }

        public Criteria andWeeksIsNotNull() {
            addCriterion("WEEKS is not null");
            return (Criteria) this;
        }

        public Criteria andWeeksEqualTo(Integer value) {
            addCriterion("WEEKS =", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksNotEqualTo(Integer value) {
            addCriterion("WEEKS <>", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksGreaterThan(Integer value) {
            addCriterion("WEEKS >", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksGreaterThanOrEqualTo(Integer value) {
            addCriterion("WEEKS >=", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksLessThan(Integer value) {
            addCriterion("WEEKS <", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksLessThanOrEqualTo(Integer value) {
            addCriterion("WEEKS <=", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksIn(List<Integer> values) {
            addCriterion("WEEKS in", values, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksNotIn(List<Integer> values) {
            addCriterion("WEEKS not in", values, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksBetween(Integer value1, Integer value2) {
            addCriterion("WEEKS between", value1, value2, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksNotBetween(Integer value1, Integer value2) {
            addCriterion("WEEKS not between", value1, value2, "weeks");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekIsNull() {
            addCriterion("DAY_OF_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekIsNotNull() {
            addCriterion("DAY_OF_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekEqualTo(Integer value) {
            addCriterion("DAY_OF_WEEK =", value, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekNotEqualTo(Integer value) {
            addCriterion("DAY_OF_WEEK <>", value, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekGreaterThan(Integer value) {
            addCriterion("DAY_OF_WEEK >", value, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAY_OF_WEEK >=", value, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekLessThan(Integer value) {
            addCriterion("DAY_OF_WEEK <", value, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekLessThanOrEqualTo(Integer value) {
            addCriterion("DAY_OF_WEEK <=", value, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekIn(List<Integer> values) {
            addCriterion("DAY_OF_WEEK in", values, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekNotIn(List<Integer> values) {
            addCriterion("DAY_OF_WEEK not in", values, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekBetween(Integer value1, Integer value2) {
            addCriterion("DAY_OF_WEEK between", value1, value2, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDayOfWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("DAY_OF_WEEK not between", value1, value2, "dayOfWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIsNull() {
            addCriterion("BUSINESS_START is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIsNotNull() {
            addCriterion("BUSINESS_START is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartEqualTo(LocalTime value) {
            addCriterion("BUSINESS_START =", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotEqualTo(LocalTime value) {
            addCriterion("BUSINESS_START <>", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartGreaterThan(LocalTime value) {
            addCriterion("BUSINESS_START >", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartGreaterThanOrEqualTo(LocalTime value) {
            addCriterion("BUSINESS_START >=", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartLessThan(LocalTime value) {
            addCriterion("BUSINESS_START <", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartLessThanOrEqualTo(LocalTime value) {
            addCriterion("BUSINESS_START <=", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIn(List<LocalTime> values) {
            addCriterion("BUSINESS_START in", values, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotIn(List<LocalTime> values) {
            addCriterion("BUSINESS_START not in", values, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartBetween(LocalTime value1, LocalTime value2) {
            addCriterion("BUSINESS_START between", value1, value2, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotBetween(LocalTime value1, LocalTime value2) {
            addCriterion("BUSINESS_START not between", value1, value2, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessEndIsNull() {
            addCriterion("BUSINESS_END is null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndIsNotNull() {
            addCriterion("BUSINESS_END is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndEqualTo(LocalTime value) {
            addCriterion("BUSINESS_END =", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndNotEqualTo(LocalTime value) {
            addCriterion("BUSINESS_END <>", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndGreaterThan(LocalTime value) {
            addCriterion("BUSINESS_END >", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndGreaterThanOrEqualTo(LocalTime value) {
            addCriterion("BUSINESS_END >=", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndLessThan(LocalTime value) {
            addCriterion("BUSINESS_END <", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndLessThanOrEqualTo(LocalTime value) {
            addCriterion("BUSINESS_END <=", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndIn(List<LocalTime> values) {
            addCriterion("BUSINESS_END in", values, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndNotIn(List<LocalTime> values) {
            addCriterion("BUSINESS_END not in", values, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndBetween(LocalTime value1, LocalTime value2) {
            addCriterion("BUSINESS_END between", value1, value2, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndNotBetween(LocalTime value1, LocalTime value2) {
            addCriterion("BUSINESS_END not between", value1, value2, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNull() {
            addCriterion("DELETE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNotNull() {
            addCriterion("DELETE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgEqualTo(Integer value) {
            addCriterion("DELETE_FLG =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(Integer value) {
            addCriterion("DELETE_FLG <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(Integer value) {
            addCriterion("DELETE_FLG >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETE_FLG >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(Integer value) {
            addCriterion("DELETE_FLG <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(Integer value) {
            addCriterion("DELETE_FLG <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<Integer> values) {
            addCriterion("DELETE_FLG in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<Integer> values) {
            addCriterion("DELETE_FLG not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_FLG between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_FLG not between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIsNull() {
            addCriterion("CREATED_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIsNotNull() {
            addCriterion("CREATED_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeEqualTo(LocalDateTime value) {
            addCriterion("CREATED_DATETIME =", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("CREATED_DATETIME <>", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("CREATED_DATETIME >", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("CREATED_DATETIME >=", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeLessThan(LocalDateTime value) {
            addCriterion("CREATED_DATETIME <", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("CREATED_DATETIME <=", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIn(List<LocalDateTime> values) {
            addCriterion("CREATED_DATETIME in", values, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("CREATED_DATETIME not in", values, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("CREATED_DATETIME between", value1, value2, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("CREATED_DATETIME not between", value1, value2, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(Integer value) {
            addCriterion("CREATED_USER =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(Integer value) {
            addCriterion("CREATED_USER <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(Integer value) {
            addCriterion("CREATED_USER >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_USER >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(Integer value) {
            addCriterion("CREATED_USER <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_USER <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<Integer> values) {
            addCriterion("CREATED_USER in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<Integer> values) {
            addCriterion("CREATED_USER not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_USER between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_USER not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<LocalDateTime> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Integer value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Integer value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Integer value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Integer value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Integer> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Integer> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyIsNull() {
            addCriterion("VERSION_EX_KEY is null");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyIsNotNull() {
            addCriterion("VERSION_EX_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyEqualTo(Integer value) {
            addCriterion("VERSION_EX_KEY =", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyNotEqualTo(Integer value) {
            addCriterion("VERSION_EX_KEY <>", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyGreaterThan(Integer value) {
            addCriterion("VERSION_EX_KEY >", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION_EX_KEY >=", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyLessThan(Integer value) {
            addCriterion("VERSION_EX_KEY <", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION_EX_KEY <=", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyIn(List<Integer> values) {
            addCriterion("VERSION_EX_KEY in", values, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyNotIn(List<Integer> values) {
            addCriterion("VERSION_EX_KEY not in", values, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_EX_KEY between", value1, value2, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_EX_KEY not between", value1, value2, "versionExKey");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}