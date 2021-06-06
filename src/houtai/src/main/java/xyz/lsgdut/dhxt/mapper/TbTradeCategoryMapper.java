package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.TbTradeCategory;
import xyz.lsgdut.dhxt.pojo.TbTradeCategoryExample;

public interface TbTradeCategoryMapper {
    long countByExample(TbTradeCategoryExample example);

    int deleteByExample(TbTradeCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(TbTradeCategory record);

    int insertSelective(TbTradeCategory record);

    List<TbTradeCategory> selectByExample(TbTradeCategoryExample example);

    TbTradeCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") TbTradeCategory record, @Param("example") TbTradeCategoryExample example);

    int updateByExample(@Param("record") TbTradeCategory record, @Param("example") TbTradeCategoryExample example);

    int updateByPrimaryKeySelective(TbTradeCategory record);

    int updateByPrimaryKey(TbTradeCategory record);
}