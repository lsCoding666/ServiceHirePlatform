package com.ls.itemmanagement.module.userreglog;


import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ls.itemmanagement.bean.UserInfo;
import com.ls.itemmanagement.module.main.activity.MainActivity;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseFragment;
import com.ls.itemmanagement.bean.LoginResult;
import com.ls.itemmanagement.common.FinalDatas;
import com.ls.itemmanagement.module.userreglog.presenter.LoginPresenter;
import com.ls.itemmanagement.module.userreglog.view.ILoginView;

public class FragmentLogin extends BaseFragment<LoginPresenter> implements View.OnClickListener, ILoginView {

    private EditText etUserName;
    private TextView tvForgetPwd;
    private EditText etPassWord;
    private Button btLogin;
    private TextView btTryNow;
    private String cookies;

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    protected void initView(View v) {
        etUserName = (EditText) v.findViewById(R.id.username_et);
        etPassWord = (EditText) v.findViewById(R.id.password_et);
        btLogin = (Button) v.findViewById(R.id.login_button);
        btTryNow = (TextView) v.findViewById(R.id.trynow);
        tvForgetPwd = (TextView) v.findViewById(R.id.forgetPassword);

        etPassWord.addTextChangedListener(new MyTextWatcher(etPassWord));
        btTryNow.setOnClickListener(this);
        etUserName.addTextChangedListener(new MyTextWatcher(etUserName));
        btLogin.setOnClickListener(this);
        tvForgetPwd.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    public boolean isUserNameValid() {
        String username = etUserName.getText().toString().trim();
        if (etUserName.length() < FinalDatas.MAX_LENGTH_USER_NAME) {
            etUserName.setError(getString(R.string.prompt_username_length));
            etUserName.requestFocus();
            return false;
        }
        return true;
    }

    public boolean isPasswordValid() {
        String pwd = etPassWord.getText().toString().trim();
        if (etPassWord.length() < FinalDatas.MAX_LENGTH_PASSWORD) {
            //etPassWord.setErrorEnabled(true);
            etPassWord.setError(getResources().getString(R.string.prompt_pwd_length));
            etPassWord.requestFocus();
            return false;
        }
        // mLayoutPwd.setErrorEnabled(false);
        return true;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_button:
                if(isUserNameValid() && isPasswordValid()){
                    presenter.login(etUserName.getText().toString(),etPassWord.getText().toString());
                }
                break;
            case R.id.forgetPassword:
                //exit();
//                Intent intent2 = new Intent();
//                intent2.setClass(this.getActivity(), ForgetPassword.class);
//                startActivity(intent2);
                break;
            case R.id.trynow:
                Intent intent1 = new Intent();
                intent1.setClass(this.getActivity(), MainActivity.class);
                startActivity(intent1);
                break;
        }
    }

    @Override
    public void showLoginSuccess(String successMessage, UserInfo userInfo) {
        Toast.makeText(getActivity(),successMessage,Toast.LENGTH_SHORT).show();
       //cookies = SpUtil.getString(FinalDatas.COOKIE);

        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();

        //saveUserInfo();

    }

    @Override
    public void showLoginFailed(String errorMessage) {
        Toast.makeText(getActivity(),errorMessage,Toast.LENGTH_SHORT).show();
    }


    private class MyTextWatcher implements TextWatcher {
        private View view;

        private MyTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            switch (view.getId()) {
                case R.id.password_et:
                    isPasswordValid();
                    break;
                case R.id.username_et:
                    isUserNameValid();
                    break;
            }
        }
    }
}