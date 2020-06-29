package com.example.mvpwithmoxy.presenter;

import android.util.Log;

import com.example.mvpwithmoxy.model.Model;
import com.example.mvpwithmoxy.view.MainView;

import moxy.MvpPresenter;

public class Presenter extends MvpPresenter<MainView> {
    private static final String TAG = "SecondPresenter";
    private Model model;

    public Presenter() {
        Log.d(TAG, "Presenter: ");
        this.model = new Model();
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        Log.d(TAG, "onFirstViewAttach: ");
    }
    private String appendStr(String text, String str) {
        return text + str;
    }

    public void onButtonClick(String str) {
        String text = model.getText();
        String newText = appendStr(text, str);
        model.setText(newText);
        getViewState().setAddedText(newText);
    }
}
