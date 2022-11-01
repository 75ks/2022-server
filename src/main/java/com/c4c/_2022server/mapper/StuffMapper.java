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

import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.entity.StuffExample;
import com.c4c._2022server.entity.StuffList0001;
import com.c4c._2022server.entity.StuffList0002;
import com.c4c._2022server.form.StuffListFormReq;

@Mapper
public interface StuffMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=StuffSqlProvider.class, method="countByExample")
    long countByExample(StuffExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=StuffSqlProvider.class, method="deleteByExample")
    int deleteByExample(StuffExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from STUFF",
        "where STUFF_ID = #{stuffId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer stuffId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into STUFF (STUFF_ID, STORE_ID, ",
        "LAST_NAME, FIRST_NAME, ",
        "LAST_NAME_KANA, FIRST_NAME_KANA, ",
        "RANK_ID, BIRTHDAY, AGE, ",
        "GENDER, POSTAL_CODE, ",
        "PREFECTURE_ID, ADDRESS1, ",
        "ADDRESS2, ADDRESS3, ",
        "PHONE_NUMBER, EMAIL, ",
        "`PASSWORD`, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, ",
        "VERSION_EX_KEY)",
        "values (#{stuffId,jdbcType=INTEGER}, #{storeId,jdbcType=INTEGER}, ",
        "#{lastName,jdbcType=VARCHAR}, #{firstName,jdbcType=VARCHAR}, ",
        "#{lastNameKana,jdbcType=VARCHAR}, #{firstNameKana,jdbcType=VARCHAR}, ",
        "#{rankId,jdbcType=INTEGER}, #{birthday,jdbcType=DATE}, #{age,jdbcType=INTEGER}, ",
        "#{gender,jdbcType=INTEGER}, #{postalCode,jdbcType=VARCHAR}, ",
        "#{prefectureId,jdbcType=INTEGER}, #{address1,jdbcType=VARCHAR}, ",
        "#{address2,jdbcType=VARCHAR}, #{address3,jdbcType=VARCHAR}, ",
        "#{phoneNumber,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{updateDatetime,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Stuff row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=StuffSqlProvider.class, method="insertSelective")
    int insertSelective(Stuff row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=StuffSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_NAME_KANA", property="lastNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME_KANA", property="firstNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="GENDER", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="POSTAL_CODE", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREFECTURE_ID", property="prefectureId", jdbcType=JdbcType.INTEGER),
        @Result(column="ADDRESS1", property="address1", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS2", property="address2", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS3", property="address3", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Stuff> selectByExample(StuffExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "STUFF_ID, STORE_ID, LAST_NAME, FIRST_NAME, LAST_NAME_KANA, FIRST_NAME_KANA, ",
        "RANK_ID, BIRTHDAY, AGE, GENDER, POSTAL_CODE, PREFECTURE_ID, ADDRESS1, ADDRESS2, ",
        "ADDRESS3, PHONE_NUMBER, EMAIL, `PASSWORD`, DELETE_FLG, CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, VERSION_EX_KEY",
        "from STUFF",
        "where STUFF_ID = #{stuffId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_NAME_KANA", property="lastNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME_KANA", property="firstNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="GENDER", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="POSTAL_CODE", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREFECTURE_ID", property="prefectureId", jdbcType=JdbcType.INTEGER),
        @Result(column="ADDRESS1", property="address1", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS2", property="address2", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS3", property="address3", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Stuff selectByPrimaryKey(Integer stuffId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StuffSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") Stuff row, @Param("example") StuffExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StuffSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") Stuff row, @Param("example") StuffExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=StuffSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Stuff row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update STUFF",
        "set STORE_ID = #{storeId,jdbcType=INTEGER},",
          "LAST_NAME = #{lastName,jdbcType=VARCHAR},",
          "FIRST_NAME = #{firstName,jdbcType=VARCHAR},",
          "LAST_NAME_KANA = #{lastNameKana,jdbcType=VARCHAR},",
          "FIRST_NAME_KANA = #{firstNameKana,jdbcType=VARCHAR},",
          "RANK_ID = #{rankId,jdbcType=INTEGER},",
          "BIRTHDAY = #{birthday,jdbcType=DATE},",
          "AGE = #{age,jdbcType=INTEGER},",
          "GENDER = #{gender,jdbcType=INTEGER},",
          "POSTAL_CODE = #{postalCode,jdbcType=VARCHAR},",
          "PREFECTURE_ID = #{prefectureId,jdbcType=INTEGER},",
          "ADDRESS1 = #{address1,jdbcType=VARCHAR},",
          "ADDRESS2 = #{address2,jdbcType=VARCHAR},",
          "ADDRESS3 = #{address3,jdbcType=VARCHAR},",
          "PHONE_NUMBER = #{phoneNumber,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "`PASSWORD` = #{password,jdbcType=VARCHAR},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where STUFF_ID = #{stuffId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Stuff row);

    /**
     * SQLID: Stuff0001
     */
    @Select({
        "SELECT",
        "    STUFF.STUFF_ID",
        "    , STUFF.STORE_ID",
        "    , STUFF.LAST_NAME",
        "    , STUFF.FIRST_NAME",
        "    , STUFF.LAST_NAME_KANA",
        "    , STUFF.FIRST_NAME_KANA",
        "    , STUFF.RANK_ID",
        "    , STUFF.BIRTHDAY",
        "    , STUFF.AGE",
        "    , STUFF.GENDER",
        "    , STUFF.POSTAL_CODE",
        "    , STUFF.PREFECTURE_ID",
        "    , STUFF.ADDRESS1",
        "    , STUFF.ADDRESS2",
        "    , STUFF.ADDRESS3",
        "    , STUFF.PHONE_NUMBER",
        "    , STUFF.EMAIL",
        "    , STUFF.PASSWORD",
        "    , STUFF.DELETE_FLG",
        "    , STUFF.CREATED_DATETIME",
        "    , STUFF.CREATED_USER",
        "    , STUFF.UPDATE_DATETIME",
        "    , STUFF.UPDATE_USER",
        "    , STUFF.VERSION_EX_KEY",
        "FROM",
        "    STUFF",
        "WHERE",
        "    STUFF.EMAIL = #{email}",
        "    AND STUFF.DELETE_FLG = 0"
    })
    @Results({
        @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_NAME_KANA", property="lastNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME_KANA", property="firstNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="GENDER", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="POSTAL_CODE", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREFECTURE_ID", property="prefectureId", jdbcType=JdbcType.INTEGER),
        @Result(column="ADDRESS1", property="address1", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS2", property="address2", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS3", property="address3", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Stuff select0001(String email);

    /**
     * SQLID: Stuff0002
     */
    @SelectProvider(type = StuffSqlProvider.class, method = "select0002")
    @Results({
        @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_NAME_KANA", property="lastNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME_KANA", property="firstNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="GENDER", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
    })
    List<StuffList0001> select0002(@Param("storeId") int storeId, @Param("reqForm") StuffListFormReq reqForm);

	/**
	 * SQLID: Stuff0003
	 */
	@Select({
	    "SELECT",
	    "    STUFF.STUFF_ID",
	    "    , STUFF.STORE_ID",
	    "    , STUFF.LAST_NAME",
	    "    , STUFF.FIRST_NAME",
	    "    , STUFF.LAST_NAME_KANA",
	    "    , STUFF.FIRST_NAME_KANA",
	    "    , STUFF.RANK_ID",
	    "    , RANK_BY_STORE.RANK",
	    "    , STUFF.BIRTHDAY",
	    "    , STUFF.AGE",
	    "    , STUFF.GENDER",
	    "    , STUFF.POSTAL_CODE",
	    "    , STUFF.PREFECTURE_ID",
	    "    , STUFF.ADDRESS1",
	    "    , STUFF.ADDRESS2",
	    "    , STUFF.ADDRESS3",
	    "    , STUFF.PHONE_NUMBER",
	    "    , STUFF.EMAIL",
	    "    , STUFF.PASSWORD",
	    "    , STUFF.DELETE_FLG",
	    "    , STUFF.CREATED_DATETIME",
	    "    , STUFF.CREATED_USER",
	    "    , STUFF.UPDATE_DATETIME",
	    "    , STUFF.UPDATE_USER",
	    "    , STUFF.VERSION_EX_KEY",
	    "FROM",
	    "    STUFF",
	    "INNER JOIN",
        "    RANK_BY_STORE",
        "    ON RANK_BY_STORE.STORE_ID = STUFF.STORE_ID AND RANK_BY_STORE.RANK_ID = STUFF.RANK_ID",
	    "WHERE",
	    "    STUFF.STORE_ID = #{storeId}",
	    "    AND STUFF.DELETE_FLG = 0"
	})
	@Results(value = {
	    @Result(column="STUFF_ID", property="stuffId", jdbcType=JdbcType.INTEGER, id=true),
	    @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
	    @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
	    @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
	    @Result(column="LAST_NAME_KANA", property="lastNameKana", jdbcType=JdbcType.VARCHAR),
	    @Result(column="FIRST_NAME_KANA", property="firstNameKana", jdbcType=JdbcType.VARCHAR),
	    @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER),
	    @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
	    @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.DATE),
	    @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
	    @Result(column="GENDER", property="gender", jdbcType=JdbcType.INTEGER),
	    @Result(column="POSTAL_CODE", property="postalCode", jdbcType=JdbcType.VARCHAR),
	    @Result(column="PREFECTURE_ID", property="prefectureId", jdbcType=JdbcType.INTEGER),
	    @Result(column="ADDRESS1", property="address1", jdbcType=JdbcType.VARCHAR),
	    @Result(column="ADDRESS2", property="address2", jdbcType=JdbcType.VARCHAR),
	    @Result(column="ADDRESS3", property="address3", jdbcType=JdbcType.VARCHAR),
	    @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
	    @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
	    @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR)
	})
	List<StuffList0002> select0003(int storeId, int stuffId);
}
