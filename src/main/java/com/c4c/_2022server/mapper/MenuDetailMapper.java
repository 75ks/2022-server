package com.c4c._2022server.mapper;

import com.c4c._2022server.entity.MenuDetail;
import com.c4c._2022server.entity.MenuDetailExample;
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

@Mapper
public interface MenuDetailMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=MenuDetailSqlProvider.class, method="countByExample")
    long countByExample(MenuDetailExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=MenuDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(MenuDetailExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from MENU_DETAIL",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and MENU_ID = #{menuId,jdbcType=INTEGER}",
          "and RANK_ID = #{rankId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("storeId") Integer storeId, @Param("menuId") Integer menuId, @Param("rankId") Integer rankId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into MENU_DETAIL (STORE_ID, MENU_ID, ",
        "RANK_ID, PRICE, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, ",
        "VERSION_EX_KEY)",
        "values (#{storeId,jdbcType=INTEGER}, #{menuId,jdbcType=INTEGER}, ",
        "#{rankId,jdbcType=INTEGER}, #{price,jdbcType=INTEGER}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{updateDatetime,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(MenuDetail row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=MenuDetailSqlProvider.class, method="insertSelective")
    int insertSelective(MenuDetail row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=MenuDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<MenuDetail> selectByExample(MenuDetailExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "STORE_ID, MENU_ID, RANK_ID, PRICE, DELETE_FLG, CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, VERSION_EX_KEY",
        "from MENU_DETAIL",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and MENU_ID = #{menuId,jdbcType=INTEGER}",
          "and RANK_ID = #{rankId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    MenuDetail selectByPrimaryKey(@Param("storeId") Integer storeId, @Param("menuId") Integer menuId, @Param("rankId") Integer rankId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=MenuDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") MenuDetail row, @Param("example") MenuDetailExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=MenuDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") MenuDetail row, @Param("example") MenuDetailExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=MenuDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MenuDetail row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update MENU_DETAIL",
        "set PRICE = #{price,jdbcType=INTEGER},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and MENU_ID = #{menuId,jdbcType=INTEGER}",
          "and RANK_ID = #{rankId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MenuDetail row);
}
