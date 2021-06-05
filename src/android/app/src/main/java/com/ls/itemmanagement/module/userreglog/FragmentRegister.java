package com.ls.itemmanagement.module.userreglog;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ls.itemmanagement.module.main.activity.MainActivity;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseFragment;
import com.ls.itemmanagement.bean.LoginResult;
import com.ls.itemmanagement.common.FinalDatas;
import com.ls.itemmanagement.module.userreglog.presenter.RegisterPresenter;
import com.ls.itemmanagement.module.userreglog.view.IRegisterView;
import com.ls.itemmanagement.util.SpUtil;
import com.ls.itemmanagement.util.ToastUtil;


public class FragmentRegister extends BaseFragment<RegisterPresenter> implements View.OnClickListener, IRegisterView {
    private final String TAG = "FragmentRegister";
    private EditText etUserName, etPassWord, etPwdConfirm, etUserPhone, etCode;
    private Button btRegister;
    private ProgressDialog progressDialog;
    private String userID;
    private String cookies;

    @Override
    protected RegisterPresenter createPresenter() {
        return new RegisterPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_register;
    }

    @Override
    protected void initView(View v) {
        etUserName = (EditText) v.findViewById(R.id.reg_username);
        etPassWord = (EditText) v.findViewById(R.id.reg_password);
        btRegister = (Button) v.findViewById(R.id.reg_sumbit_btn);
        etPwdConfirm = (EditText) v.findViewById(R.id.reg_passwordConfirm);
        etUserPhone = (EditText) v.findViewById(R.id.reg_userphone);
        etCode = (EditText) v.findViewById(R.id.reg_code);

        etPwdConfirm.addTextChangedListener(new MyTextWatcher(etPwdConfirm));
        etUserName.addTextChangedListener(new MyTextWatcher(etUserName));
        etPassWord.addTextChangedListener(new MyTextWatcher(etPassWord));
        etUserPhone.addTextChangedListener(new MyTextWatcher(etUserPhone));
        etCode.addTextChangedListener(new MyTextWatcher(etCode));
        btRegister.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }


    public boolean isUserNameVaild() {
        String username = etUserName.getText().toString().trim();
        if (etUserName.length() < FinalDatas.MAX_LENGTH_USER_NAME) {
            etUserName.setError(getString(R.string.prompt_username_length));
            etUserName.requestFocus();
            return false;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.reg_sumbit_btn:
                if (isUserNameVaild() && isPasswordVaild() && isPasswordConfirm()) {
                    progressDialog = ProgressDialog.show(getActivity(), "请稍候", "请求中...");
                    presenter.register(etUserName.getText().toString(), etPassWord.getText().toString(), etUserPhone.getText().toString());
                }
                break;
        }
    }


    public boolean isPasswordConfirm() {
        if (etPwdConfirm.getText().toString().equals(etPassWord.getText().toString())) {
            return true;
        } else {
            etPwdConfirm.setError(getString(R.string.prompt_err_pwd_confirm_failure));
            etPwdConfirm.requestFocus();
            return false;
        }
    }

    public boolean isPhoneVaild() {
        if (etUserPhone.length() == 11) {
            return true;
        } else {
            etUserPhone.setError(getString(R.string.prompt_err_phone));
            etUserPhone.requestFocus();
            return false;
        }
    }

    @Override
    public void showRegisterSuccess(String successMessage) {
        ToastUtil.showToast(successMessage);
    }

    @Override
    public void showRegisterFailed(String errorMessage) {
        ToastUtil.showToast(errorMessage);
        progressDialog.dismiss();
    }

    @Override
    public void showLoginAfterRegisterSuccess(String successMessage, LoginResult result) {
        ToastUtil.showToast(successMessage);

        cookies = SpUtil.getString(FinalDatas.COOKIE);
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();
    }

    @Override
    public void showLoginAfterRegisterFailed(String errorMessage) {
        ToastUtil.showToast(errorMessage);
        progressDialog.dismiss();
    }

    private class MyTextWatcher implements TextWatcher {
        private View view;

        private MyTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.reg_username:
                    isUserNameVaild();
                    break;
                case R.id.reg_password:
                    isPasswordVaild();
                    break;
                case R.id.reg_passwordConfirm:
                    isPasswordConfirm();
                    break;
                case R.id.reg_userphone:
                    isPhoneVaild();
                    break;
                default:
            }
        }
    }

    private Boolean isPasswordVaild() {
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

    private void showMessage(String message) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
