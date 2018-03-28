package com.study.collura.objectboxstudy.mvp.base;

import com.study.collura.objectboxstudy.mvp.data.AppDataManager;

public abstract class BaseHelper {
    private AppDataManager dataManager;

    public BaseHelper (AppDataManager dataManager) {
        this.dataManager = dataManager;
    }
}