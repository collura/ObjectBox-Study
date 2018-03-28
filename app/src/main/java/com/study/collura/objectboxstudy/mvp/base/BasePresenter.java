package com.study.collura.objectboxstudy.mvp.base;

public abstract class BasePresenter < T > {
    protected T view;

    public BasePresenter (T view) {
        this.view = view;
    }
}