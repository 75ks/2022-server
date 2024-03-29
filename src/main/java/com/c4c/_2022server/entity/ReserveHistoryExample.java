package com.c4c._2022server.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReserveHistoryExample {
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
    public ReserveHistoryExample() {
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

        public Criteria andReserveHistoryIdIsNull() {
            addCriterion("RESERVE_HISTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdIsNotNull() {
            addCriterion("RESERVE_HISTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdEqualTo(Integer value) {
            addCriterion("RESERVE_HISTORY_ID =", value, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdNotEqualTo(Integer value) {
            addCriterion("RESERVE_HISTORY_ID <>", value, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdGreaterThan(Integer value) {
            addCriterion("RESERVE_HISTORY_ID >", value, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESERVE_HISTORY_ID >=", value, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdLessThan(Integer value) {
            addCriterion("RESERVE_HISTORY_ID <", value, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESERVE_HISTORY_ID <=", value, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdIn(List<Integer> values) {
            addCriterion("RESERVE_HISTORY_ID in", values, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdNotIn(List<Integer> values) {
            addCriterion("RESERVE_HISTORY_ID not in", values, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdBetween(Integer value1, Integer value2) {
            addCriterion("RESERVE_HISTORY_ID between", value1, value2, "reserveHistoryId");
            return (Criteria) this;
        }

        public Criteria andReserveHistoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESERVE_HISTORY_ID not between", value1, value2, "reserveHistoryId");
            return (Criteria) this;
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andStuffIdIsNull() {
            addCriterion("STUFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStuffIdIsNotNull() {
            addCriterion("STUFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStuffIdEqualTo(Integer value) {
            addCriterion("STUFF_ID =", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotEqualTo(Integer value) {
            addCriterion("STUFF_ID <>", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdGreaterThan(Integer value) {
            addCriterion("STUFF_ID >", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUFF_ID >=", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdLessThan(Integer value) {
            addCriterion("STUFF_ID <", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdLessThanOrEqualTo(Integer value) {
            addCriterion("STUFF_ID <=", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdIn(List<Integer> values) {
            addCriterion("STUFF_ID in", values, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotIn(List<Integer> values) {
            addCriterion("STUFF_ID not in", values, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdBetween(Integer value1, Integer value2) {
            addCriterion("STUFF_ID between", value1, value2, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STUFF_ID not between", value1, value2, "stuffId");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("`RANK` is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("`RANK` is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("`RANK` =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("`RANK` <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("`RANK` >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("`RANK` >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("`RANK` <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("`RANK` <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("`RANK` like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("`RANK` not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("`RANK` in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("`RANK` not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("`RANK` between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("`RANK` not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andMenuIsNull() {
            addCriterion("MENU is null");
            return (Criteria) this;
        }

        public Criteria andMenuIsNotNull() {
            addCriterion("MENU is not null");
            return (Criteria) this;
        }

        public Criteria andMenuEqualTo(String value) {
            addCriterion("MENU =", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotEqualTo(String value) {
            addCriterion("MENU <>", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuGreaterThan(String value) {
            addCriterion("MENU >", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuGreaterThanOrEqualTo(String value) {
            addCriterion("MENU >=", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuLessThan(String value) {
            addCriterion("MENU <", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuLessThanOrEqualTo(String value) {
            addCriterion("MENU <=", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuLike(String value) {
            addCriterion("MENU like", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotLike(String value) {
            addCriterion("MENU not like", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuIn(List<String> values) {
            addCriterion("MENU in", values, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotIn(List<String> values) {
            addCriterion("MENU not in", values, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuBetween(String value1, String value2) {
            addCriterion("MENU between", value1, value2, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotBetween(String value1, String value2) {
            addCriterion("MENU not between", value1, value2, "menu");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeIsNull() {
            addCriterion("RESERVE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeIsNotNull() {
            addCriterion("RESERVE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeEqualTo(LocalDateTime value) {
            addCriterion("RESERVE_DATETIME =", value, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("RESERVE_DATETIME <>", value, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("RESERVE_DATETIME >", value, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("RESERVE_DATETIME >=", value, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeLessThan(LocalDateTime value) {
            addCriterion("RESERVE_DATETIME <", value, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("RESERVE_DATETIME <=", value, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeIn(List<LocalDateTime> values) {
            addCriterion("RESERVE_DATETIME in", values, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("RESERVE_DATETIME not in", values, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("RESERVE_DATETIME between", value1, value2, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("RESERVE_DATETIME not between", value1, value2, "reserveDatetime");
            return (Criteria) this;
        }

        public Criteria andReserveStateIsNull() {
            addCriterion("RESERVE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andReserveStateIsNotNull() {
            addCriterion("RESERVE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andReserveStateEqualTo(Integer value) {
            addCriterion("RESERVE_STATE =", value, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateNotEqualTo(Integer value) {
            addCriterion("RESERVE_STATE <>", value, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateGreaterThan(Integer value) {
            addCriterion("RESERVE_STATE >", value, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESERVE_STATE >=", value, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateLessThan(Integer value) {
            addCriterion("RESERVE_STATE <", value, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateLessThanOrEqualTo(Integer value) {
            addCriterion("RESERVE_STATE <=", value, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateIn(List<Integer> values) {
            addCriterion("RESERVE_STATE in", values, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateNotIn(List<Integer> values) {
            addCriterion("RESERVE_STATE not in", values, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateBetween(Integer value1, Integer value2) {
            addCriterion("RESERVE_STATE between", value1, value2, "reserveState");
            return (Criteria) this;
        }

        public Criteria andReserveStateNotBetween(Integer value1, Integer value2) {
            addCriterion("RESERVE_STATE not between", value1, value2, "reserveState");
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