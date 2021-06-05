package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.TbUser;
import xyz.lsgdut.dhxt.pojo.TbUserExample;
import xyz.lsgdut.dhxt.pojo.TbUserKey;

public interface TbUserMapper {
    long countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(TbUserKey key);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(TbUserKey key);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}