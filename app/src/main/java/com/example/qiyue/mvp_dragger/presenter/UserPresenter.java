package com.example.qiyue.mvp_dragger.presenter;

import android.util.Log;

import com.example.qiyue.mvp_dragger.iview.IView;

/**
 * Created by Administrator on 2016/11/14 0014.
*/
public class UserPresenter implements IPresenter{
    private IView mainView;

    public UserPresenter(IView view){
        mainView = view;
    }


    @Override
    public void loadData() {
        mainView.updateUi("Mvp Update UI "+System.currentTimeMillis());
        Log.i("qiyue","Mvp Update UI "+System.currentTimeMillis());
    }
}