package com.ls.itemmanagement.app;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.util.Log;

import com.ls.itemmanagement.util.ActivityUtil;
import com.ls.itemmanagement.util.LogUtil;
import com.ls.itemmanagement.util.XUtil;


public class MyApplication extends Application {
    private static String userId = "";
    private static final String TAG = "MyApplication";
    private static Context mContext;
    public static int screenHeight;
    private static int screenWidth;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化
        XUtil.initialize(this);
        //设置打印开关
        LogUtil.setIsLog(true);
        //注册Activity生命周期
        registerActivityLifecycleCallbacks(ActivityUtil.getActivityLifecycleCallbacks());
//        RetrofitCache.getInstance().init(this);

        mContext = getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return
     */
    public static Context getContext() {
        return mContext;
    }

    public static int getScreenHeight() {
        return screenHeight;
    }

    public static String getUserId() {
        return userId;
    }


    public static int getScreenWidth() {
        return screenWidth;
    }
}
