package com.example.mvponly.presenter;

import android.util.Log;

import com.example.mvponly.model.Model;
import com.example.mvponly.view.MainView;

public class MainPresenter {
    private static final String TAG = "MainPresenter";
    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        Log.d(TAG, "MainPresenter: ");
        this.mainView = mainView;
        model = new Model();
    }


}
