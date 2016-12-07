package com.example.qiyue.mvp_dragger.module;

import com.example.qiyue.mvp_dragger.iview.ITitleView;
import com.example.qiyue.mvp_dragger.iview.IView;
import com.example.qiyue.mvp_dragger.presenter.TitlePresenter;
import com.example.qiyue.mvp_dragger.presenter.UserPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qiyue on 2016/11/15 0015.
 *
 * 这里只提供titlePresenter
 */
@Module
public class TitleModule {

    private ITitleView iTitleView;

    public TitleModule(ITitleView iTitleView){
        this.iTitleView = iTitleView;
    }

    @Provides
    public TitlePresenter provideTitlePresenter(){
        return new TitlePresenter(iTitleView);
    }
}
