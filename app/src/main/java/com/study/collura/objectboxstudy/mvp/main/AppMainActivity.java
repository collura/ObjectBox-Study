package com.study.collura.objectboxstudy.mvp.main;
import android.os.Bundle;

import com.study.collura.objectbox_study.R;
import com.study.collura.objectboxstudy.mvp.base.BaseView;

public class AppMainActivity extends BaseView {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }

    @Override
    protected void showToast (String msg) {

    }

    @Override
    protected void showSnackBar (String msg) {

    }

    @Override
    protected void dismissSnackBar () {

    }

    @Override
    protected void showProgressBar (String msg) {

    }

    @Override
    protected void dismissProgressBar () {

    }
}
