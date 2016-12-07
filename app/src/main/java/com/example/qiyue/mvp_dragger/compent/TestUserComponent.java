package com.example.qiyue.mvp_dragger.compent;

import com.example.qiyue.mvp_dragger.module.PerActivity;
import com.example.qiyue.mvp_dragger.module.TestUserModule;
import com.example.qiyue.mvp_dragger.views.TestModuleOneActivity;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by qiyue on 2016/11/16 0016.
 */
//
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = TestUserModule.class)
public interface TestUserComponent {

    public void inject(TestModuleOneActivity activity);
}
