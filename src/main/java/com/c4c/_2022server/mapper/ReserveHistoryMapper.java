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

import com.c4c._2022server.entity.ReserveHistory;
import com.c4c._2022server.entity.ReserveHistory0001;
import com.c4c._2022server.entity.ReserveHistory0002;
import com.c4c._2022server.entity.ReserveHistoryExample;
import com.c4c._2022server.form.ReserveHistoryReq;

@Mapper
public interface ReserveHistoryMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=ReserveHistorySqlProvider.class, method="countByExample")
    long countByExample(ReserveHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=ReserveHistorySqlProvider.class, method="deleteByExample")
    int deleteByExample(ReserveHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from RESERVE_HISTORY",
        "where RESERVE_HISTORY_ID = #{reserveHistoryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer reserveHistoryId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into RESERVE_HISTORY (RESERVE_HISTORY_ID, STORE_ID, ",
        "CUSTOMER_ID, STUFF_ID, ",
        "`RANK`, MENU, PRICE, ",
        "RESERVE_DATETIME, RESERVE_STATE, ",
        "DELETE_FLG, CREATED_DATETIME, ",
        "CREATED_USER, UPDATE_DATETIME, ",
        "UPDATE_USER, VERSION_EX_KEY)",
        "values (#{reserveHistoryId,jdbcType=INTEGER}, #{storeId,jdbcType=INTEGER}, ",
        "#{customerId,jdbcType=INTEGER}, #{stuffId,jdbcType=INTEGER}, ",
        "#{rank,jdbcType=VARCHAR}, #{menu,jdbcType=VARCHAR}, #{price,jdbcType=INTEGER}, ",
        "#{reserveDatetime,jdbcType=TIMESTAMP}, #{reserveState,jdbcType=INTEGER}, ",
        "#{deleteFlg,jdbcType=INTEGER}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{updateDatetime,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=INTEGER}, #{versionExKey,jdbcType=INTEGER})"
    })
    int insert(ReserveHistory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=ReserveHistorySqlProvider.class, method="insertSelective")
    int insertSelective(ReserveHistory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=ReserveHistorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="RESERVE_HISTORY_ID", property="reserveHistoryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="CUSTOMER_ID", property="customerId", jdbcType=JdbcType.INTEGER),
        @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER),
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU", property="menu", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="RESERVE_DATETIME", property="reserveDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVE_STATE", property="reserveState", jdbcType=JdbcType.INTEGER),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<ReserveHistory> selectByExample(ReserveHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "RESERVE_HISTORY_ID, STORE_ID, CUSTOMER_ID, STUFF_ID, `RANK`, MENU, PRICE, RESERVE_DATETIME, ",
        "RESERVE_STATE, DELETE_FLG, CREATED_DATETIME, CREATED_USER, UPDATE_DATETIME, ",
        "UPDATE_USER, VERSION_EX_KEY",
        "from RESERVE_HISTORY",
        "where RESERVE_HISTORY_ID = #{reserveHistoryId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="RESERVE_HISTORY_ID", property="reserveHistoryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="CUSTOMER_ID", property="customerId", jdbcType=JdbcType.INTEGER),
        @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER),
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU", property="menu", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="RESERVE_DATETIME", property="reserveDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVE_STATE", property="reserveState", jdbcType=JdbcType.INTEGER),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    ReserveHistory selectByPrimaryKey(Integer reserveHistoryId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=ReserveHistorySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") ReserveHistory row, @Param("example") ReserveHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=ReserveHistorySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") ReserveHistory row, @Param("example") ReserveHistoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=ReserveHistorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ReserveHistory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update RESERVE_HISTORY",
        "set STORE_ID = #{storeId,jdbcType=INTEGER},",
          "CUSTOMER_ID = #{customerId,jdbcType=INTEGER},",
          "STUFF_ID = #{stuffId,jdbcType=INTEGER},",
          "`RANK` = #{rank,jdbcType=VARCHAR},",
          "MENU = #{menu,jdbcType=VARCHAR},",
          "PRICE = #{price,jdbcType=INTEGER},",
          "RESERVE_DATETIME = #{reserveDatetime,jdbcType=TIMESTAMP},",
          "RESERVE_STATE = #{reserveState,jdbcType=INTEGER},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where RESERVE_HISTORY_ID = #{reserveHistoryId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ReserveHistory row);

    /**
     * SQLID: ReserveHistory0001
     */
    @SelectProvider(type = ReserveHistorySqlProvider.class, method = "select0001")
    @Results(value = {
            @Result(column = "RESERVE_HISTORY_ID", property = "reserveHistoryId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column = "RANK", property = "rank", jdbcType=JdbcType.VARCHAR),
            @Result(column = "MENU", property = "menu", jdbcType=JdbcType.VARCHAR),
            @Result(column = "PRICE", property = "price", jdbcType=JdbcType.INTEGER),
            @Result(column = "RESERVE_DATETIME", property = "reserveDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column = "RESERVE_STATE", property = "reserveState", jdbcType=JdbcType.INTEGER),
            @Result(column = "CUSTOMER_ID", property = "customerId", jdbcType=JdbcType.INTEGER),
            @Result(column = "CUSTOMER_LAST_NAME", property = "customerLastName", jdbcType=JdbcType.VARCHAR),
            @Result(column = "CUSTOMER_FIRST_NAME", property = "customerFirstName", jdbcType=JdbcType.VARCHAR),
            @Result(column = "CUSTOMER_LAST_NAME_KANA", property = "customerLastNameKana", jdbcType=JdbcType.VARCHAR),
            @Result(column = "CUSTOMER_FIRST_NAME_KANA", property = "customerFirstNameKana", jdbcType=JdbcType.VARCHAR),
            @Result(column = "STUFF_ID", property = "stuffId", jdbcType=JdbcType.INTEGER),
            @Result(column = "STUFF_LAST_NAME", property = "stuffLastName", jdbcType=JdbcType.VARCHAR),
            @Result(column = "STUFF_FIRST_NAME", property = "stuffFirstName", jdbcType=JdbcType.VARCHAR),
            @Result(column = "STUFF_LAST_NAME_KANA", property = "stuffLastNameKana", jdbcType=JdbcType.VARCHAR),
            @Result(column = "STUFF_FIRST_NAME_KANA", property = "stuffFirstNameKana", jdbcType=JdbcType.VARCHAR)
    })
    List<ReserveHistory0001> select0001(@Param("storeId") int storeId, @Param("reqForm") ReserveHistoryReq reqForm);

    /**
     * SQLID: ReserveHistory0002
     */
    @Select({
        "SELECT",
        "    RANK_BY_STORE.RANK",
        "    , MENU_HEADER.MENU",
        "    , MENU_DETAIL.PRICE",
        "FROM",
        "    STUFF",
        "INNER JOIN",
        "    RANK_BY_STORE",
        "    ON STUFF.STORE_ID = RANK_BY_STORE.STORE_ID",
        "    AND STUFF.RANK_ID = RANK_BY_STORE.RANK_ID",
        "INNER JOIN",
        "    MENU_HEADER",
        "    ON STUFF.STORE_ID = MENU_HEADER.STORE_ID",
        "    AND MENU_HEADER.MENU_ID = #{menuId}",
        "INNER JOIN",
        "    MENU_DETAIL",
        "    ON STUFF.STORE_ID = MENU_DETAIL.STORE_ID",
        "    AND MENU_HEADER.MENU_ID = MENU_DETAIL.MENU_ID",
        "    AND STUFF.RANK_ID = MENU_DETAIL.RANK_ID",
        "WHERE",
        "    STUFF.STUFF_ID = #{stuffId}"
    })
    @Results({
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU", property="menu", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.INTEGER)
    })
    ReserveHistory0002 select0002(int stuffId, int menuId);
}
