package com.c4c._2022server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.c4c._2022server.entity.SalesHistory;
import com.c4c._2022server.entity.SalesHistory0001;
import com.c4c._2022server.entity.SalesHistory0002;
import com.c4c._2022server.entity.SalesHistory0003;
import com.c4c._2022server.entity.SalesHistory0004;
import com.c4c._2022server.entity.SalesHistory0005;
import com.c4c._2022server.entity.SalesHistoryExample;
import com.c4c._2022server.form.SalesTotalChartReq;

@Mapper
public interface SalesHistoryMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=SalesHistorySqlProvider.class, method="countByExample")
    long countByExample(SalesHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=SalesHistorySqlProvider.class, method="deleteByExample")
    int deleteByExample(SalesHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from SALES_HISTORY",
        "where SALES_HISTORY_ID = #{salesHistoryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer salesHistoryId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into SALES_HISTORY (SALES_HISTORY_ID, RESERVE_HISTORY_ID, ",
        "STORE_ID, CUSTOMER_ID, ",
        "STUFF_ID, `RANK`, MENU, ",
        "PRICE, SALES_DATETIME, ",
        "DELETE_FLG, CREATED_DATETIME, ",
        "CREATED_USER, UPDATE_DATETIME, ",
        "UPDATE_USER, VERSION_EX_KEY)",
        "values (#{salesHistoryId,jdbcType=INTEGER}, #{reserveHistoryId,jdbcType=INTEGER}, ",
        "#{storeId,jdbcType=INTEGER}, #{customerId,jdbcType=INTEGER}, ",
        "#{stuffId,jdbcType=INTEGER}, #{rank,jdbcType=VARCHAR}, #{menu,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=INTEGER}, #{salesDatetime,jdbcType=TIMESTAMP}, ",
        "#{deleteFlg,jdbcType=INTEGER}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{updateDatetime,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=INTEGER}, #{versionExKey,jdbcType=INTEGER})"
    })
    int insert(SalesHistory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=SalesHistorySqlProvider.class, method="insertSelective")
    int insertSelective(SalesHistory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=SalesHistorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SALES_HISTORY_ID", property="salesHistoryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RESERVE_HISTORY_ID", property="reserveHistoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="CUSTOMER_ID", property="customerId", jdbcType=JdbcType.INTEGER),
        @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER),
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU", property="menu", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="SALES_DATETIME", property="salesDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<SalesHistory> selectByExample(SalesHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "SALES_HISTORY_ID, RESERVE_HISTORY_ID, STORE_ID, CUSTOMER_ID, STUFF_ID, `RANK`, ",
        "MENU, PRICE, SALES_DATETIME, DELETE_FLG, CREATED_DATETIME, CREATED_USER, UPDATE_DATETIME, ",
        "UPDATE_USER, VERSION_EX_KEY",
        "from SALES_HISTORY",
        "where SALES_HISTORY_ID = #{salesHistoryId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SALES_HISTORY_ID", property="salesHistoryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RESERVE_HISTORY_ID", property="reserveHistoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="CUSTOMER_ID", property="customerId", jdbcType=JdbcType.INTEGER),
        @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER),
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU", property="menu", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="SALES_DATETIME", property="salesDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    SalesHistory selectByPrimaryKey(Integer salesHistoryId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=SalesHistorySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") SalesHistory row, @Param("example") SalesHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=SalesHistorySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") SalesHistory row, @Param("example") SalesHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=SalesHistorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SalesHistory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update SALES_HISTORY",
        "set RESERVE_HISTORY_ID = #{reserveHistoryId,jdbcType=INTEGER},",
          "STORE_ID = #{storeId,jdbcType=INTEGER},",
          "CUSTOMER_ID = #{customerId,jdbcType=INTEGER},",
          "STUFF_ID = #{stuffId,jdbcType=INTEGER},",
          "`RANK` = #{rank,jdbcType=VARCHAR},",
          "MENU = #{menu,jdbcType=VARCHAR},",
          "PRICE = #{price,jdbcType=INTEGER},",
          "SALES_DATETIME = #{salesDatetime,jdbcType=TIMESTAMP},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where SALES_HISTORY_ID = #{salesHistoryId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SalesHistory row);

    /**
     * SQLID: SalesHistory0001
     */
    @Select({
        "SELECT",
        "    DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%m月') AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) as SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y') = #{salesYear}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "GROUP BY",
        "    DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%m月')"
    })
    @Results(value = {
        @Result(column="SALES_MONTH", property="salesMonth", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMBER_OF_VISITORS", property="numberOfVisitors", jdbcType=JdbcType.INTEGER),
        @Result(column="SALES_AMOUNT", property="salesAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="AVERAGE_AMOUNT", property="averageAmount", jdbcType=JdbcType.INTEGER)
    })
    List<SalesHistory0001> select0001(int storeId, String salesYear);

    /**
     * SQLID: SalesHistory0002
     */
    @Select({
        "SELECT",
        "    COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) as SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{salesYearMonth}",
        "    AND SALES_HISTORY.DELETE_FLG = 0"
    })
    @Results(value = {
            @Result(column="NUMBER_OF_VISITORS", property="numberOfVisitors", jdbcType=JdbcType.INTEGER),
            @Result(column="SALES_AMOUNT", property="salesAmount", jdbcType=JdbcType.INTEGER),
            @Result(column="AVERAGE_AMOUNT", property="averageAmount", jdbcType=JdbcType.INTEGER)
    })
    SalesHistory0002 select0002(int storeId, String salesYearMonth);

    /**
     * SQLID: SalesHistory0003
     */
    @Select({
        "SELECT",
        "    SALES_HISTORY.SALES_HISTORY_ID",
        "    , SALES_HISTORY.RESERVE_HISTORY_ID",
        "    , SALES_HISTORY.RANK",
        "    , SALES_HISTORY.MENU",
        "    , SALES_HISTORY.PRICE",
        "    , SALES_HISTORY.SALES_DATETIME",
        "    , CUSTOMER.CUSTOMER_ID",
        "    , CUSTOMER.LAST_NAME AS CUSTOMER_LAST_NAME",
        "    , CUSTOMER.FIRST_NAME AS CUSTOMER_FIRST_NAME",
        "    , CUSTOMER.LAST_NAME_KANA AS CUSTOMER_LAST_NAME_KANA",
        "    , CUSTOMER.FIRST_NAME_KANA AS CUSTOMER_FIRST_NAME_KANA",
        "    , STUFF.STUFF_ID",
        "    , STUFF.LAST_NAME AS STUFF_LAST_NAME",
        "    , STUFF.FIRST_NAME AS STUFF_FIRST_NAME",
        "    , STUFF.LAST_NAME_KANA AS STUFF_LAST_NAME_KANA",
        "    , STUFF.FIRST_NAME_KANA AS STUFF_FIRST_NAME_KANA",
        "    , MENU_HEADER.MENU_ID",
        "FROM",
        "    SALES_HISTORY",
        "INNER JOIN",
        "    CUSTOMER",
        "    ON CUSTOMER.CUSTOMER_ID = SALES_HISTORY.CUSTOMER_ID",
        "INNER JOIN",
        "    STUFF",
        "    ON STUFF.STUFF_ID = SALES_HISTORY.STUFF_ID",
        "INNER JOIN",
        "    MENU_HEADER",
        "    ON MENU_HEADER.STORE_ID = SALES_HISTORY.STORE_ID AND MENU_HEADER.MENU = SALES_HISTORY.MENU",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{salesYearMonth}",
        "    AND SALES_HISTORY.DELETE_FLG = 0"
    })
    @Results(value = {
            @Result(column = "SALES_HISTORY_ID", property = "salesHistoryId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column = "RESERVE_HISTORY_ID", property = "reserveHistoryId", jdbcType=JdbcType.INTEGER),
            @Result(column = "RANK", property = "rank", jdbcType=JdbcType.VARCHAR),
            @Result(column = "MENU", property = "menu", jdbcType=JdbcType.VARCHAR),
            @Result(column = "PRICE", property = "price", jdbcType=JdbcType.INTEGER),
            @Result(column = "SALES_DATETIME", property = "salesDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column = "CUSTOMER_ID", property = "customerId", jdbcType=JdbcType.INTEGER),
            @Result(column = "CUSTOMER_LAST_NAME", property = "customerLastName", jdbcType=JdbcType.VARCHAR),
            @Result(column = "CUSTOMER_FIRST_NAME", property = "customerFirstName", jdbcType=JdbcType.VARCHAR),
            @Result(column = "CUSTOMER_LAST_NAME_KANA", property = "customerLastNameKana", jdbcType=JdbcType.VARCHAR),
            @Result(column = "CUSTOMER_FIRST_NAME_KANA", property = "customerFirstNameKana", jdbcType=JdbcType.VARCHAR),
            @Result(column = "STUFF_ID", property = "stuffId", jdbcType=JdbcType.INTEGER),
            @Result(column = "STUFF_LAST_NAME", property = "stuffLastName", jdbcType=JdbcType.VARCHAR),
            @Result(column = "STUFF_FIRST_NAME", property = "stuffFirstName", jdbcType=JdbcType.VARCHAR),
            @Result(column = "STUFF_LAST_NAME_KANA", property = "stuffLastNameKana", jdbcType=JdbcType.VARCHAR),
            @Result(column = "STUFF_FIRST_NAME_KANA", property = "stuffFirstNameKana", jdbcType=JdbcType.VARCHAR),
            @Result(column = "MENU_ID", property = "menuId", jdbcType=JdbcType.INTEGER),
    })
    List<SalesHistory0003> select0003(int storeId, String salesYearMonth);

    /**
     * SQLID: SalesHistory0004
     */
    @Select({
        "SELECT",
        "    '1月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.january}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '2月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.february}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '3月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.march}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '4月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.april}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '5月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.may}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '6月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.june}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '7月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.july}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '8月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.august}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '9月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.september}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '10月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.october}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '11月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.november}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "UNION ALL",
        "SELECT",
        "    '12月' AS SALES_MONTH",
        "    , COUNT(*) AS NUMBER_OF_VISITORS",
        "    , IFNULL(SUM(SALES_HISTORY.PRICE), 0) AS SALES_AMOUNT",
        "    , IFNULL(AVG(SALES_HISTORY.PRICE), 0) AS AVERAGE_AMOUNT",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{reqForm.december}",
        "    AND SALES_HISTORY.DELETE_FLG = 0"
    })
    @Results(value = {
            @Result(column="SALES_MONTH", property="salesMonth", jdbcType=JdbcType.VARCHAR),
            @Result(column="NUMBER_OF_VISITORS", property="numberOfVisitors", jdbcType=JdbcType.INTEGER),
            @Result(column="SALES_AMOUNT", property="salesAmount", jdbcType=JdbcType.INTEGER),
            @Result(column="AVERAGE_AMOUNT", property="averageAmount", jdbcType=JdbcType.INTEGER)
    })
    List<SalesHistory0004> select0004(int storeId, SalesTotalChartReq reqForm);

    /**
     * SQLID: SalesHistory0005
     */
    @Select({
        "SELECT",
        "    SALES_HISTORY.MENU",
        "    , COUNT(SALES_HISTORY.MENU) AS NUMBER_OF_ORDERS",
        "FROM",
        "    SALES_HISTORY",
        "WHERE",
        "    SALES_HISTORY.STORE_ID = #{storeId}",
        "    AND DATE_FORMAT(SALES_HISTORY.SALES_DATETIME, '%Y%c') = #{salesYearMonth}",
        "    AND SALES_HISTORY.DELETE_FLG = 0",
        "GROUP BY",
        "    SALES_HISTORY.MENU"
    })
    @Results(value = {
            @Result(column = "MENU", property = "menu", jdbcType=JdbcType.VARCHAR),
            @Result(column = "NUMBER_OF_ORDERS", property = "numberOfOrders", jdbcType=JdbcType.INTEGER),
    })
    List<SalesHistory0005> select0005(int storeId, String salesYearMonth);
}
