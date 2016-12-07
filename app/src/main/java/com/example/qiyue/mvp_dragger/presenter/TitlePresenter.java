package com.example.qiyue.mvp_dragger.presenter;

import com.example.qiyue.mvp_dragger.iview.ITitleView;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
public class TitlePresenter {

    ITitleView iTitleView;

    public TitlePresenter(ITitleView iTitleView){
        this.iTitleView = iTitleView;
    }

    public void getTitleList(){
        iTitleView.getTitleList();
    }
}
