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

import com.c4c._2022server.entity.MenuHeader;
import com.c4c._2022server.entity.MenuHeader0001;
import com.c4c._2022server.entity.MenuHeaderExample;

@Mapper
public interface MenuHeaderMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=MenuHeaderSqlProvider.class, method="countByExample")
    long countByExample(MenuHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=MenuHeaderSqlProvider.class, method="deleteByExample")
    int deleteByExample(MenuHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from MENU_HEADER",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("storeId") Integer storeId, @Param("menuId") Integer menuId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into MENU_HEADER (STORE_ID, MENU_ID, ",
        "MENU, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, ",
        "VERSION_EX_KEY)",
        "values (#{storeId,jdbcType=INTEGER}, #{menuId,jdbcType=INTEGER}, ",
        "#{menu,jdbcType=VARCHAR}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{updateDatetime,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(MenuHeader row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=MenuHeaderSqlProvider.class, method="insertSelective")
    int insertSelective(MenuHeader row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=MenuHeaderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU", property="menu", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<MenuHeader> selectByExample(MenuHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "STORE_ID, MENU_ID, MENU, DELETE_FLG, CREATED_DATETIME, CREATED_USER, UPDATE_DATETIME, ",
        "UPDATE_USER, VERSION_EX_KEY",
        "from MENU_HEADER",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU", property="menu", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    MenuHeader selectByPrimaryKey(@Param("storeId") Integer storeId, @Param("menuId") Integer menuId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=MenuHeaderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") MenuHeader row, @Param("example") MenuHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=MenuHeaderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") MenuHeader row, @Param("example") MenuHeaderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=MenuHeaderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MenuHeader row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update MENU_HEADER",
        "set MENU = #{menu,jdbcType=VARCHAR},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MenuHeader row);

    /**
     * SQLID: MenuHeader0001
     */
    @Select({
        "SELECT",
        "    MENU_HEADER.MENU_ID",
        "    , MENU_HEADER.MENU",
        "    , MENU_DETAIL.PRICE",
        "FROM",
        "    MENU_HEADER",
        "INNER JOIN",
        "    MENU_DETAIL",
        "    ON MENU_DETAIL.MENU_ID = MENU_HEADER.MENU_ID",
        "WHERE",
        "    MENU_HEADER.STORE_ID = #{storeId}",
        "    AND MENU_DETAIL.STORE_ID = #{storeId}",
        "    AND MENU_DETAIL.RANK_ID = #{rankId}",
        "    AND MENU_HEADER.DELETE_FLG = 0"
    })
    @Results(value = {
            @Result(column = "MENU_ID", property = "menuId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column = "MENU", property = "menu", jdbcType=JdbcType.VARCHAR),
            @Result(column = "PRICE", property = "price", jdbcType=JdbcType.INTEGER),
    })
    List<MenuHeader0001> select0001(int storeId, Integer rankId);
}
