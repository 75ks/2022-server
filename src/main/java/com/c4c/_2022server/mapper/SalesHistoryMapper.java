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
import com.c4c._2022server.entity.SalesHistoryExample;

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
}