package com.ls.itemmanagement.base;

/**
 * Description : BaseView
 *
 * @author XuCanyou666
 * @date 2020/2/7
 */


public interface BaseView {

    /**
     * 显示加载中
     */
    void showLoading();


    /**
     * 隐藏加载中
     */
    void hideLoading();

    /**
     * 是否显示进度
     */
    boolean isShowLoading();


    /**
     * 错误
     *
     * @param bean 错误信息
     */
    @SuppressWarnings("rawtypes")
    void onErrorCode(BaseBean bean);

}
