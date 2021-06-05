package com.ls.itemmanagement.util.PermissionTool;

/**
 * 动态权限回调接口
 * Update by haoxue on 2019/2/8.
 * author:liangshuang
 */
public interface PermissionInterface {
    /**
     * 请求权限成功回调
     */
    void requestPermissionsSuccess(int callBackCode);

    /**
     * 请求权限失败回调
     */
    void requestPermissionsFail(int callBackCode);

}

