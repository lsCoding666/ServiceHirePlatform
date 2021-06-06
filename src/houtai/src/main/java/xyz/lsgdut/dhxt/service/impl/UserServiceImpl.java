package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.TbUserMapper;
import xyz.lsgdut.dhxt.pojo.TbUser;
import xyz.lsgdut.dhxt.pojo.TbUserExample;
import xyz.lsgdut.dhxt.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    TbUserMapper userMapper;

    @Override
    public List<TbUser> userLogin(String userName, String password) {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameLike(userName);
        // criteria.andCustomerPasswordEqualTo(password);
        criteria.andUserPasswordLike(password);
        List<TbUser> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public TbUser queryByUserId(int userId) {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<TbUser> users = userMapper.selectByExample(userExample);
        return users.get(0);
    }

    @Override
    public String userRegister(TbUser user) {
        int i = userMapper.insert(user);
        if (i == 0){
            return "用户名重复";
        }else{
            return "注册成功";
        }
    }



}
