package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.TbSchedule;
import xyz.lsgdut.dhxt.pojo.TbScheduleExample;

public interface TbScheduleMapper {
    long countByExample(TbScheduleExample example);

    int deleteByExample(TbScheduleExample example);

    int deleteByPrimaryKey(Integer scheduleId);

    int insert(TbSchedule record);

    int insertSelective(TbSchedule record);

    List<TbSchedule> selectByExample(TbScheduleExample example);

    TbSchedule selectByPrimaryKey(Integer scheduleId);

    int updateByExampleSelective(@Param("record") TbSchedule record, @Param("example") TbScheduleExample example);

    int updateByExample(@Param("record") TbSchedule record, @Param("example") TbScheduleExample example);

    int updateByPrimaryKeySelective(TbSchedule record);

    int updateByPrimaryKey(TbSchedule record);
}