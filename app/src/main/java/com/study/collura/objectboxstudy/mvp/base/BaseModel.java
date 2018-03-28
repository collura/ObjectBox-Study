package com.study.collura.objectboxstudy.mvp.base;

public abstract class BaseModel < T > {
    protected T presenter;

    public BaseModel (T presenter) {
        this.presenter = presenter;
    }
}