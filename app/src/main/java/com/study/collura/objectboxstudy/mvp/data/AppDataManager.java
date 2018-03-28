package com.study.collura.objectboxstudy.mvp.data;

public class AppDataManager implements DataManager {

    private static final AppDataManager instance = new AppDataManager ();
    private static AppNetworkHelper networkHelper;
    private static AppDbHelper dbHelper;
    private static AppPreferencesHelper preferencesHelper;

    public static AppDataManager getInstance () {
        if ( networkHelper == null ) networkHelper = new AppNetworkHelper (instance);
        if ( dbHelper == null ) dbHelper = new AppDbHelper (instance);
        if ( preferencesHelper == null ) preferencesHelper = new AppPreferencesHelper (instance);
        return instance;
    }
}