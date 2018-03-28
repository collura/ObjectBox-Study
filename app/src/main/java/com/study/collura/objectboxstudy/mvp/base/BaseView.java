package com.study.collura.objectboxstudy.mvp.base;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseView extends AppCompatActivity {

    protected abstract void showToast (String msg);

    protected abstract void showSnackBar (String msg);

    protected abstract void dismissSnackBar ();

    protected abstract void showProgressBar (String msg);

    protected abstract void dismissProgressBar ();
}
