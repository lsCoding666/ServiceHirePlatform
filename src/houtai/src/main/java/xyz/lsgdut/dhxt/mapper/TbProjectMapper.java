package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.TbProject;
import xyz.lsgdut.dhxt.pojo.TbProjectExample;

public interface TbProjectMapper {
    long countByExample(TbProjectExample example);

    int deleteByExample(TbProjectExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(TbProject record);

    int insertSelective(TbProject record);

    List<TbProject> selectByExample(TbProjectExample example);

    TbProject selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") TbProject record, @Param("example") TbProjectExample example);

    int updateByExample(@Param("record") TbProject record, @Param("example") TbProjectExample example);

    int updateByPrimaryKeySelective(TbProject record);

    int updateByPrimaryKey(TbProject record);
}