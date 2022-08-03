package com.c4c._2022server.mapper;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.CustomerExample;
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

import java.util.List;

@Mapper
public interface CustomerMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=CustomerSqlProvider.class, method="countByExample")
    long countByExample(CustomerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=CustomerSqlProvider.class, method="deleteByExample")
    int deleteByExample(CustomerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from CUSTOMER",
        "where CUSTOMER_ID = #{customerId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer customerId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into CUSTOMER (CUSTOMER_ID, STORE_ID, ",
        "LAST_NAME, FIRST_NAME, ",
        "LAST_NAME_KANA, FIRST_NAME_KANA, ",
        "BIRTHDAY, AGE, GENDER, ",
        "POSTAL_CODE, PREFECTURE_ID, ",
        "ADDRESS1, ADDRESS2, ",
        "ADDRESS3, PHONE_NUMBER, ",
        "EMAIL, `PASSWORD`, ",
        "DELETE_FLG, CREATED_DATETIME, ",
        "CREATED_USER, UPDATE_DATETIME, ",
        "UPDATE_USER, VERSION_EX_KEY)",
        "values (#{customerId,jdbcType=INTEGER}, #{storeId,jdbcType=INTEGER}, ",
        "#{lastName,jdbcType=VARCHAR}, #{firstName,jdbcType=VARCHAR}, ",
        "#{lastNameKana,jdbcType=VARCHAR}, #{firstNameKana,jdbcType=VARCHAR}, ",
        "#{birthday,jdbcType=DATE}, #{age,jdbcType=INTEGER}, #{gender,jdbcType=INTEGER}, ",
        "#{postalCode,jdbcType=VARCHAR}, #{prefectureId,jdbcType=INTEGER}, ",
        "#{address1,jdbcType=VARCHAR}, #{address2,jdbcType=VARCHAR}, ",
        "#{address3,jdbcType=VARCHAR}, #{phoneNumber,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{deleteFlg,jdbcType=INTEGER}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{updateDatetime,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=INTEGER}, #{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Customer row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=CustomerSqlProvider.class, method="insertSelective")
    int insertSelective(Customer row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=CustomerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CUSTOMER_ID", property="customerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_NAME_KANA", property="lastNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME_KANA", property="firstNameKana", jdbcType=JdbcType.VARCHAR),
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
    List<Customer> selectByExample(CustomerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "CUSTOMER_ID, STORE_ID, LAST_NAME, FIRST_NAME, LAST_NAME_KANA, FIRST_NAME_KANA, ",
        "BIRTHDAY, AGE, GENDER, POSTAL_CODE, PREFECTURE_ID, ADDRESS1, ADDRESS2, ADDRESS3, ",
        "PHONE_NUMBER, EMAIL, `PASSWORD`, DELETE_FLG, CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, VERSION_EX_KEY",
        "from CUSTOMER",
        "where CUSTOMER_ID = #{customerId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="CUSTOMER_ID", property="customerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_NAME_KANA", property="lastNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME_KANA", property="firstNameKana", jdbcType=JdbcType.VARCHAR),
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
    Customer selectByPrimaryKey(Integer customerId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=CustomerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") Customer row, @Param("example") CustomerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=CustomerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") Customer row, @Param("example") CustomerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=CustomerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Customer row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update CUSTOMER",
        "set STORE_ID = #{storeId,jdbcType=INTEGER},",
          "LAST_NAME = #{lastName,jdbcType=VARCHAR},",
          "FIRST_NAME = #{firstName,jdbcType=VARCHAR},",
          "LAST_NAME_KANA = #{lastNameKana,jdbcType=VARCHAR},",
          "FIRST_NAME_KANA = #{firstNameKana,jdbcType=VARCHAR},",
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
        "where CUSTOMER_ID = #{customerId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Customer row);

    /**
     * SQLID: Customer0001
     */
    @Select({
        "SELECT",
        "    CUSTOMER.CUSTOMER_ID",
        "    , CUSTOMER.STORE_ID",
        "    , CUSTOMER.LAST_NAME",
        "    , CUSTOMER.FIRST_NAME",
        "    , CUSTOMER.LAST_NAME_KANA",
        "    , CUSTOMER.FIRST_NAME_KANA",
        "    , CUSTOMER.BIRTHDAY",
        "    , CUSTOMER.AGE",
        "    , CUSTOMER.GENDER",
        "    , CUSTOMER.POSTAL_CODE",
        "    , CUSTOMER.PREFECTURE_ID",
        "    , CUSTOMER.ADDRESS1",
        "    , CUSTOMER.ADDRESS2",
        "    , CUSTOMER.ADDRESS3",
        "    , CUSTOMER.PHONE_NUMBER",
        "    , CUSTOMER.EMAIL",
        "    , CUSTOMER.PASSWORD",
        "    , CUSTOMER.DELETE_FLG",
        "    , CUSTOMER.CREATED_DATETIME",
        "    , CUSTOMER.CREATED_USER",
        "    , CUSTOMER.UPDATE_DATETIME",
        "    , CUSTOMER.UPDATE_USER",
        "    , CUSTOMER.VERSION_EX_KEY",
        "FROM",
        "    CUSTOMER",
        "WHERE",
        "    CUSTOMER.EMAIL = #{email}",
        "    AND CUSTOMER.DELETE_FLG = 0"
    })
    @Results({
        @Result(column="CUSTOMER_ID", property="customerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_NAME", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_NAME_KANA", property="lastNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME_KANA", property="firstNameKana", jdbcType=JdbcType.VARCHAR),
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
    Customer select0001(String email);
}
