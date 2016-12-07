package com.example.qiyue.mvp_dragger.module;

import com.example.qiyue.mvp_dragger.iview.IView;
import com.example.qiyue.mvp_dragger.presenter.UserPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qiyue on 2016/11/14 0014.
 *
 * 用来提供依赖的，Presenter 创建时在这里完成的，但Presenter 参数变化我们只需要修改这个类即可
 *
 * 这里只提供presenter
 */
@Module
public class UserModule {

    private IView mainView;

    public UserModule(IView mainView){
        this.mainView = mainView;
    }

    @Provides
    public UserPresenter provideMyPresenter(){
        return new UserPresenter(mainView);
    }
}