package com.ls.itemmanagement.http;



import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.bean.LoginResult;
import com.ls.itemmanagement.bean.ProjectResult;
import com.ls.itemmanagement.util.XUtil;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import ren.yale.android.retrofitcachelibrx2.anno.Cache;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

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
        Observable<BaseBean<LoginResult>> login(@Body RequestBody loginInfo);

        //注册
        @POST("user/register")
        Observable<BaseBean> register(@Body RequestBody registerInfo);


        //---------------------项目相关--------------------------
        //管理员获得所有项目
        @POST("project/getAllProjects")
        Observable<BaseBean<List<ProjectResult>>> getAllProjects();

    }
}
