package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.TbUserMapper;
import xyz.lsgdut.dhxt.pojo.TbRole;
import xyz.lsgdut.dhxt.pojo.TbUser;
import xyz.lsgdut.dhxt.pojo.TbUserExample;
import xyz.lsgdut.dhxt.pojo.VO.UserVO;
import xyz.lsgdut.dhxt.service.RoleService;
import xyz.lsgdut.dhxt.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TbUserMapper userMapper;

    @Autowired
    RoleService roleService;

    @Override
    public List<UserVO> userLogin(String userName, String password) {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameLike(userName);
        // criteria.andCustomerPasswordEqualTo(password);
        criteria.andUserPasswordLike(password);
        List<TbUser> users = userMapper.selectByExample(userExample);
        List<UserVO> userVOS = new ArrayList<>();
        for (TbUser user : users) {
            TbRole role = roleService.getRolesById(user.getRoleId());
            UserVO uservo = new UserVO(user, role);
            userVOS.add(uservo);
        }
        return userVOS;
    }

    @Override
    public UserVO queryByUserId(int userId) {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<TbUser> users = userMapper.selectByExample(userExample);

        TbRole role = roleService.getRolesById(users.get(0).getRoleId());
        UserVO uservo = new UserVO(users.get(0), role);

        return uservo;
    }

    @Override
    public String userRegister(TbUser user) {
        int i = userMapper.insert(user);
        if (i == 0) {
            return "用户名重复";
        } else {
            return "注册成功";
        }
    }

    @Override
    public List<UserVO> getAllUsers() {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdIsNotNull();
        List<TbUser> users = userMapper.selectByExample(userExample);
        List<UserVO> userVOS = new ArrayList<>();
        for (TbUser user : users) {
            TbRole role = roleService.getRolesById(user.getRoleId());
            UserVO uservo = new UserVO(user, role);
            userVOS.add(uservo);
        }
        return userVOS;
    }

    @Override
    public List<UserVO> getAllServers() {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andRoleIdEqualTo(3);
        List<TbUser> users = userMapper.selectByExample(userExample);
        List<UserVO> userVOS = new ArrayList<>();
        for (TbUser user : users) {
            TbRole role = roleService.getRolesById(user.getRoleId());
            UserVO uservo = new UserVO(user, role);
            userVOS.add(uservo);
        }
        return userVOS;
    }

    @Override
    public List<UserVO> getAllCustomers() {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andRoleIdEqualTo(2);
        List<TbUser> users = userMapper.selectByExample(userExample);
        List<UserVO> userVOS = new ArrayList<>();
        for (TbUser user : users) {
            TbRole role = roleService.getRolesById(user.getRoleId());
            UserVO uservo = new UserVO(user, role);
            userVOS.add(uservo);
        }
        return userVOS;
    }

    @Override
    public List<UserVO> getAllEmployee() {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andRoleIdEqualTo(1);
        List<TbUser> users = userMapper.selectByExample(userExample);
        List<UserVO> userVOS = new ArrayList<>();
        for (TbUser user : users) {
            TbRole role = roleService.getRolesById(user.getRoleId());
            UserVO uservo = new UserVO(user, role);
            userVOS.add(uservo);
        }
        return userVOS;
    }

    @Override
    public List<UserVO> getAllAdmins() {
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andRoleIdEqualTo(4);
        List<TbUser> users = userMapper.selectByExample(userExample);
        List<UserVO> userVOS = new ArrayList<>();
        for (TbUser user : users) {
            TbRole role = roleService.getRolesById(user.getRoleId());
            UserVO uservo = new UserVO(user, role);
            userVOS.add(uservo);
        }
        return userVOS;
    }


}
