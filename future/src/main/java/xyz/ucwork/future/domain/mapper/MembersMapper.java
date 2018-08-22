package xyz.ucwork.future.domain.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import xyz.ucwork.future.domain.model.Members;

public interface MembersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table members
     *
     * @mbg.generated
     */
    @Delete({
        "delete from members",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table members
     *
     * @mbg.generated
     */
    @Insert({
        "insert into members (id, name)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR})"
    })
    int insert(Members record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table members
     *
     * @mbg.generated
     */
    int insertSelective(Members record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table members
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, name",
        "from members",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("xyz.ucwork.future.domain.mapper.MembersMapper.BaseResultMap")
    Members selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table members
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Members record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table members
     *
     * @mbg.generated
     */
    @Update({
        "update members",
        "set name = #{name,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Members record);
}