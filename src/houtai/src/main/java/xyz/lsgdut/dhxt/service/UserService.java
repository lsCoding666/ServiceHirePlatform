package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.TbUser;
import xyz.lsgdut.dhxt.pojo.VO.UserVO;

import java.util.List;

public interface UserService {

    public List<UserVO> userLogin(String userName, String password);

    UserVO queryByUserId(int userId);

    String userRegister(TbUser user);

    List<UserVO> getAllUsers();

    List<UserVO> getAllServers();

    List<UserVO> getAllCustomers();

    List<UserVO> getAllAdmins();

    List<UserVO> getAllEmployee();
}
