package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.TbProjectMapper;
import xyz.lsgdut.dhxt.mapper.TbTradeCategoryMapper;
import xyz.lsgdut.dhxt.mapper.TbUserMapper;
import xyz.lsgdut.dhxt.pojo.*;
import xyz.lsgdut.dhxt.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    TbTradeCategoryMapper categoryMapper;

    @Autowired
    TbUserMapper userMapper;

    @Autowired
    TbProjectMapper projectMapper;

    @Override
    public List<TbUser> getFreeUserByCategoryId(int categoryId) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserCategoryIdEqualTo(categoryId);
        criteria.andRoleIdEqualTo(3);
        List<TbUser> users = userMapper.selectByExample(example);
        return users;
    }

    @Override
    public List<TbProject> getProjectByCategoryId(int categoryId) {
        TbProjectExample example = new TbProjectExample();
        TbProjectExample.Criteria criteria = example.createCriteria();
        criteria.andProjectCategoryIdEqualTo(categoryId);
        List<TbProject> projects = projectMapper.selectByExample(example);
        return projects;
    }

    @Override
    public List<TbUser> getCustomerByCategoryId(int categoryId) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserCategoryIdEqualTo(categoryId);
        criteria.andRoleIdEqualTo(2);
        List<TbUser> users = userMapper.selectByExample(example);
        return users;
    }

    @Override
    public TbTradeCategory addCategory(TbTradeCategory tbTradeCategory) {
        int i = categoryMapper.insert(tbTradeCategory);
        if (i == 0) {
            return null;
        }
        return tbTradeCategory;
    }

    @Override
    public TbTradeCategory delegateCategory(TbTradeCategory tbTradeCategory) {
        int i = categoryMapper.deleteByPrimaryKey(tbTradeCategory.getCategoryId());
        if (i == 0) {
            return null;
        }
        return tbTradeCategory;
    }

    @Override
    public TbTradeCategory updateCategory(TbTradeCategory tbTradeCategory) {
        int i = categoryMapper.updateByPrimaryKey(tbTradeCategory);
        if (i == 0) {
            return null;
        }
        return null;
    }

    @Override
    public List<TbTradeCategory> getAllCategories() {
        TbTradeCategoryExample example = new TbTradeCategoryExample();
        TbTradeCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdIsNotNull();
        List<TbTradeCategory> tbTradeCategories = categoryMapper.selectByExample(example);
        return tbTradeCategories;
    }

    @Override
    public TbTradeCategory getCategoryById(int categoryId) {
        TbTradeCategoryExample example = new TbTradeCategoryExample();
        TbTradeCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(categoryId);
        List<TbTradeCategory> tradeCategories = categoryMapper.selectByExample(example);
        if (tradeCategories.size()==0){
            return null;
        }else{
            return tradeCategories.get(0);
        }
    }
}
