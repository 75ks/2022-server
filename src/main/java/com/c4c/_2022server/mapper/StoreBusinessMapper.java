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

import com.c4c._2022server.entity.StoreBusiness;
import com.c4c._2022server.entity.StoreBusinessExample;

@Mapper
public interface StoreBusinessMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=StoreBusinessSqlProvider.class, method="countByExample")
    long countByExample(StoreBusinessExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=StoreBusinessSqlProvider.class, method="deleteByExample")
    int deleteByExample(StoreBusinessExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from STORE_BUSINESS",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and WEEKS = #{weeks,jdbcType=INTEGER}",
          "and DAY_OF_WEEK = #{dayOfWeek,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("storeId") Integer storeId, @Param("weeks") Integer weeks, @Param("dayOfWeek") Integer dayOfWeek);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into STORE_BUSINESS (STORE_ID, WEEKS, ",
        "DAY_OF_WEEK, BUSINESS_START, ",
        "BUSINESS_END, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, ",
        "VERSION_EX_KEY)",
        "values (#{storeId,jdbcType=INTEGER}, #{weeks,jdbcType=INTEGER}, ",
        "#{dayOfWeek,jdbcType=INTEGER}, #{businessStart,jdbcType=TIME}, ",
        "#{businessEnd,jdbcType=TIME}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{updateDatetime,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(StoreBusiness row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=StoreBusinessSqlProvider.class, method="insertSelective")
    int insertSelective(StoreBusiness row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=StoreBusinessSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="WEEKS", property="weeks", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DAY_OF_WEEK", property="dayOfWeek", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BUSINESS_START", property="businessStart", jdbcType=JdbcType.TIME),
        @Result(column="BUSINESS_END", property="businessEnd", jdbcType=JdbcType.TIME),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<StoreBusiness> selectByExample(StoreBusinessExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "STORE_ID, WEEKS, DAY_OF_WEEK, BUSINESS_START, BUSINESS_END, DELETE_FLG, CREATED_DATETIME, ",
        "CREATED_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_EX_KEY",
        "from STORE_BUSINESS",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and WEEKS = #{weeks,jdbcType=INTEGER}",
          "and DAY_OF_WEEK = #{dayOfWeek,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="WEEKS", property="weeks", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DAY_OF_WEEK", property="dayOfWeek", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BUSINESS_START", property="businessStart", jdbcType=JdbcType.TIME),
        @Result(column="BUSINESS_END", property="businessEnd", jdbcType=JdbcType.TIME),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    StoreBusiness selectByPrimaryKey(@Param("storeId") Integer storeId, @Param("weeks") Integer weeks, @Param("dayOfWeek") Integer dayOfWeek);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StoreBusinessSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") StoreBusiness row, @Param("example") StoreBusinessExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StoreBusinessSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") StoreBusiness row, @Param("example") StoreBusinessExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StoreBusinessSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StoreBusiness row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update STORE_BUSINESS",
        "set BUSINESS_START = #{businessStart,jdbcType=TIME},",
          "BUSINESS_END = #{businessEnd,jdbcType=TIME},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and WEEKS = #{weeks,jdbcType=INTEGER}",
          "and DAY_OF_WEEK = #{dayOfWeek,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StoreBusiness row);
}