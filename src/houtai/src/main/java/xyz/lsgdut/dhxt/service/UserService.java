package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.TbUser;

import java.util.List;

public interface UserService {

    public List<TbUser> userLogin(String userName, String password);

    TbUser queryByUserId(int userId);

    String userRegister(TbUser user);

    List<TbUser> getAllUsers();

    List<TbUser> getAllServers();

    List<TbUser> getAllCustomers();

    List<TbUser> getAllAdmins();

    List<TbUser> getAllEmployee();
}
