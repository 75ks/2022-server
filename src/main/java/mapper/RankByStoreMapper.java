package mapper;

import entity.RankByStore;
import entity.RankByStoreExample;
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
        "where RANK_BY_STORE_ID = #{rankByStoreId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer rankByStoreId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into RANK_BY_STORE (RANK_BY_STORE_ID, STORE_ID, ",
        "RANK_ID, `RANK`, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, ",
        "VERSION_EX_KEY)",
        "values (#{rankByStoreId,jdbcType=INTEGER}, #{storeId,jdbcType=INTEGER}, ",
        "#{rankId,jdbcType=INTEGER}, #{rank,jdbcType=VARCHAR}, #{deleteFlg,jdbcType=INTEGER}, ",
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
        @Result(column="RANK_BY_STORE_ID", property="rankByStoreId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER),
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
        "RANK_BY_STORE_ID, STORE_ID, RANK_ID, `RANK`, DELETE_FLG, CREATED_DATETIME, CREATED_USER, ",
        "UPDATE_DATETIME, UPDATE_USER, VERSION_EX_KEY",
        "from RANK_BY_STORE",
        "where RANK_BY_STORE_ID = #{rankByStoreId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="RANK_BY_STORE_ID", property="rankByStoreId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STORE_ID", property="storeId", jdbcType=JdbcType.INTEGER),
        @Result(column="RANK_ID", property="rankId", jdbcType=JdbcType.INTEGER),
        @Result(column="RANK", property="rank", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="UPDATE_DATETIME", property="updateDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_USER", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    RankByStore selectByPrimaryKey(Integer rankByStoreId);

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
        "set STORE_ID = #{storeId,jdbcType=INTEGER},",
          "RANK_ID = #{rankId,jdbcType=INTEGER},",
          "`RANK` = #{rank,jdbcType=VARCHAR},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "UPDATE_DATETIME = #{updateDatetime,jdbcType=TIMESTAMP},",
          "UPDATE_USER = #{updateUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where RANK_BY_STORE_ID = #{rankByStoreId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RankByStore row);
}