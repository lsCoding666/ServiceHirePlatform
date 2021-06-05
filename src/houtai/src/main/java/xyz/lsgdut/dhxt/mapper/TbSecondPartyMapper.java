package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.TbSecondPartyExample;
import xyz.lsgdut.dhxt.pojo.TbSecondPartyKey;

public interface TbSecondPartyMapper {
    long countByExample(TbSecondPartyExample example);

    int deleteByExample(TbSecondPartyExample example);

    int deleteByPrimaryKey(TbSecondPartyKey key);

    int insert(TbSecondPartyKey record);

    int insertSelective(TbSecondPartyKey record);

    List<TbSecondPartyKey> selectByExample(TbSecondPartyExample example);

    int updateByExampleSelective(@Param("record") TbSecondPartyKey record, @Param("example") TbSecondPartyExample example);

    int updateByExample(@Param("record") TbSecondPartyKey record, @Param("example") TbSecondPartyExample example);
}