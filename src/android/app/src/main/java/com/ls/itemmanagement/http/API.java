package com.ls.itemmanagement.http;



import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.bean.UserInfo;
import com.ls.itemmanagement.bean.LoginResult;
import com.ls.itemmanagement.bean.ProjectResult;
import com.ls.itemmanagement.util.XUtil;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * @Author 许朋友爱玩
 * @Date 2020/7/27 17:00
 * @Github https://github.com/LoveLifeEveryday
 * @JueJin https://juejin.im/user/5e429bbc5188254967066d1b/posts
 * @Description TODO
 */

public class API {
    static final String BASE_URL = XUtil.getApplication().getString(R.string.baseUrl);

    public interface ItemManagementAPI {

        //-----------------------【登录注册】----------------------
        //登陆
        @POST("user/userLogin")
        Observable<BaseBean<UserInfo>> login(@Body RequestBody loginInfo);

        //注册
        @POST("user/register")
        Observable<BaseBean> register(@Body RequestBody registerInfo);


        //---------------------项目相关--------------------------
        //管理员获得所有项目
        @POST("project/getAllProjects")
        Observable<BaseBean<List<ProjectResult>>> getAllProjects();

        //根据id获得项目信息
        @POST("project/getProjectInfoById")
        Observable<BaseBean<ProjectResult>> getProjectInfoById(@Body RequestBody projectInfo);


        //------------------------用户管理相关---------------------
        //获得所有用户
        @GET("user/getAllUsers")
        Observable<BaseBean<List<UserInfo>>> getAllUsers();

        //获得所有客户
        @GET("user/getAllCustomers")
        Observable<BaseBean<List<UserInfo>>> getAllCustomers();

        //获得所有服务商
        @GET("user/getAllServers")
        Observable<BaseBean<List<UserInfo>>> getAllServers();

        //获得所有员工
        @GET("user/getAllEmployee")
        Observable<BaseBean<List<UserInfo>>> getAllEmployee();

        //获得所有管理员
        @GET("user/getAllAdmins")
        Observable<BaseBean<List<UserInfo>>> getAllAdmins();

        //根据用户id查询用户信息
        @POST("user/getUserInfoById")
        Observable<BaseBean<UserInfo>> getUserInfoById(@Body RequestBody userInfo);

        //获取当前登录者的个人信息
        @GET("user/show")
        Observable<BaseBean<UserInfo>> show();


    }
}
