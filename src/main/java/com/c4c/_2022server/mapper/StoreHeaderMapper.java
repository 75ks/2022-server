package com.c4c._2022server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.c4c._2022server.entity.StoreHeader;
import com.c4c._2022server.entity.StoreHeaderExample;

public interface StoreHeaderMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=StoreHeaderSqlProvider.class, method="countByExample")
    long countByExample(StoreHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=StoreHeaderSqlProvider.class, method="deleteByExample")
    int deleteByExample(StoreHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from STORE_HEADER",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer storeId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into STORE_HEADER (STORE_ID, STORE_NAME, ",
        "POSTAL_CODE, PREFECTURE_ID, ",
        "ADDRESS1, ADDRESS2, ",
        "ADDRESS3, PHONE_NUMBER, ",
        "EMAIL, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, ",
        "VERSION_EX_KEY)",
        "values (#{storeId,jdbcType=INTEGER}, #{storeName,jdbcType=VARCHAR}, ",
        "#{postalCode,jdbcType=VARCHAR}, #{prefectureId,jdbcType=INTEGER}, ",
        "#{address1,jdbcType=VARCHAR}, #{address2,jdbcType=VARCHAR}, ",
        "#{address3,jdbcType=VARCHAR}, #{phoneNumber,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{updateDatetime,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(StoreHeader row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=StoreHeaderSqlProvider.class, method="insertSelective")
    int insertSelective(StoreHeader row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=StoreHeaderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_NAME", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="POSTAL_CODE", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREFECTURE_ID", property="prefectureId", jdbcType=JdbcType.INTEGER),
        @Result(column="ADDRESS1", property="address1", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS2", property="address2", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS3", property="address3", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<StoreHeader> selectByExample(StoreHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "STORE_ID, STORE_NAME, POSTAL_CODE, PREFECTURE_ID, ADDRESS1, ADDRESS2, ADDRESS3, ",
        "PHONE_NUMBER, EMAIL, DELETE_FLG, CREATED_DATETIME, CREATED_USER, UPDATE_DATETIME, ",
        "UPDATE_USER, VERSION_EX_KEY",
        "from STORE_HEADER",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_NAME", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="POSTAL_CODE", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREFECTURE_ID", property="prefectureId", jdbcType=JdbcType.INTEGER),
        @Result(column="ADDRESS1", property="address1", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS2", property="address2", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS3", property="address3", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    StoreHeader selectByPrimaryKey(Integer storeId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StoreHeaderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") StoreHeader row, @Param("example") StoreHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StoreHeaderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") StoreHeader row, @Param("example") StoreHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StoreHeaderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StoreHeader row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update STORE_HEADER",
        "set STORE_NAME = #{storeName,jdbcType=VARCHAR},",
          "POSTAL_CODE = #{postalCode,jdbcType=VARCHAR},",
          "PREFECTURE_ID = #{prefectureId,jdbcType=INTEGER},",
          "ADDRESS1 = #{address1,jdbcType=VARCHAR},",
          "ADDRESS2 = #{address2,jdbcType=VARCHAR},",
          "ADDRESS3 = #{address3,jdbcType=VARCHAR},",
          "PHONE_NUMBER = #{phoneNumber,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StoreHeader row);
}