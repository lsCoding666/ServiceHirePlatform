package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.TbProject;
import xyz.lsgdut.dhxt.pojo.TbTradeCategory;
import xyz.lsgdut.dhxt.pojo.TbUser;

import java.util.List;

public interface CategoryService {
    //根据类型获得自由职业者
    List<TbUser> getFreeUserByCategoryId(int categoryId);

    //根据类型获得项目
    List<TbProject> getProjectByCategoryId(int categoryId);

    //根据类型获得客户
    List<TbUser> getCustomerByCategoryId(int categoryId);

    //添加分类
    TbTradeCategory addCategory(TbTradeCategory tbTradeCategory);

    //删除分类
    TbTradeCategory delegateCategory(TbTradeCategory tbTradeCategory);

    //修改分类
    TbTradeCategory updateCategory(TbTradeCategory tbTradeCategory);

    //查询分类
    List<TbTradeCategory> getAllCategories();

    //根据项目id查询分类信息
    TbTradeCategory getCategoryById(int categoryId);
}
