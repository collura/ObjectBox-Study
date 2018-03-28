package com.study.collura.objectboxstudy.mvp.main;

import com.study.collura.objectboxstudy.mvp.base.BaseModel;

class AppMainActivityModel
        extends BaseModel< AppMainActivityPresenter >
        implements MainActivityModel {


    public AppMainActivityModel (AppMainActivityPresenter presenter) {
        super (presenter);
    }
}
