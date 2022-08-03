package com.c4c._2022server.mapper;

import com.c4c._2022server.entity.RankByStore;
import com.c4c._2022server.entity.RankByStore0001;
import com.c4c._2022server.entity.RankByStoreExample;
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
public interface RankByStoreMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=RankByStoreSqlProvider.class, method="countByExample")
    long countByExample(RankByStoreExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=RankByStoreSqlProvider.class, method="deleteByExample")
    int deleteByExample(RankByStoreExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from RANK_BY_STORE",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and RANK_ID = #{rankId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("storeId") Integer storeId, @Param("rankId") Integer rankId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into RANK_BY_STORE (STORE_ID, RANK_ID, ",
        "`RANK`, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, ",
        "VERSION_EX_KEY)",
        "values (#{storeId,jdbcType=INTEGER}, #{rankId,jdbcType=INTEGER}, ",
        "#{rank,jdbcType=VARCHAR}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{updateDatetime,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(RankByStore row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=RankByStoreSqlProvider.class, method="insertSelective")
    int insertSelective(RankByStore row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=RankByStoreSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<RankByStore> selectByExample(RankByStoreExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "STORE_ID, RANK_ID, `RANK`, DELETE_FLG, CREATED_DATETIME, CREATED_USER, UPDATE_DATETIME, ",
        "UPDATE_USER, VERSION_EX_KEY",
        "from RANK_BY_STORE",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and RANK_ID = #{rankId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    RankByStore selectByPrimaryKey(@Param("storeId") Integer storeId, @Param("rankId") Integer rankId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=RankByStoreSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") RankByStore row, @Param("example") RankByStoreExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=RankByStoreSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") RankByStore row, @Param("example") RankByStoreExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=RankByStoreSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RankByStore row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update RANK_BY_STORE",
        "set `RANK` = #{rank,jdbcType=VARCHAR},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where STORE_ID = #{storeId,jdbcType=INTEGER}",
          "and RANK_ID = #{rankId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RankByStore row);

    /**
     * SQLID: RankByStore0001
     */
    @Select({
        "SELECT DISTINCT",
        "    RANK_BY_STORE.RANK",
        "FROM",
        "    RANK_BY_STORE",
        "WHERE",
        "    RANK_BY_STORE.DELETE_FLG = 0"
    })
    @Results(value = {
            @Result(column = "RANK", property = "rank", jdbcType=JdbcType.VARCHAR, id=true),
    })
    List<RankByStore0001> select0001();
}
