package com.ls.itemmanagement.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ls.itemmanagement.R;
import com.ls.itemmanagement.util.XUtil;

import butterknife.ButterKnife;

/**
 * Description : BaseActivity
 *
 * @author XuCanyou666
 * @date 2020/2/7
 */

@SuppressWarnings("rawtypes")
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {

    protected P presenter;

    /**
     * 创建 presenter
     *
     * @return presenter
     */
    protected abstract P createPresenter();

    /**
     * 得到布局文件 id
     *
     * @return layout id
     */
    protected abstract int getLayoutId();

    /**
     * 初始化布局
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(LayoutInflater.from(this).inflate(getLayoutId(), null));
        ButterKnife.bind(this);
        presenter = createPresenter();
        initView();
        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        initListener();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //销毁时，解除绑定
        if (presenter != null) {
            presenter.detachView();
        }
    }

    protected void initListener() {
    }

    @Override
    public void showLoading() {
        XUtil.showLoading(this, XUtil.getString(R.string.loading));
    }

    @Override
    public void hideLoading() {
        XUtil.dismissLoading();
    }

    @Override
    public boolean isShowLoading() {
        return XUtil.isShowLoading();
    }

    /**
     * 可以处理异常
     */
    @Override
    public void onErrorCode(BaseBean bean) {
    }
    public abstract void  initStatusBar();

}
