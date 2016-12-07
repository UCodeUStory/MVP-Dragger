package com.example.qiyue.mvp_dragger.core;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.qiyue.mvp_dragger.compent.ApplicationComponent;
import com.example.qiyue.mvp_dragger.core.app.AndroidApplication;
import com.example.qiyue.mvp_dragger.module.ActivityModule;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Base {@link Activity} class for every Activity in this application.
 */
public abstract class BaseActivity extends AppCompatActivity {

  //@Inject Navigator navigator;
/*
  @Inject
  protected ThreadExecutor threadExecutor;*/

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    /**
     * 这里直接注入也可以，只不过每个集成这个Activity的类都会生成对应的代码
     *
     * 个人觉得，最好在需要的地方注入
     */
  //  this.getApplicationComponent().inject(this);
    setContentView(this.getLayoutId());
    ButterKnife.bind(this);
    this.initViews(savedInstanceState);
    this.initData();
  }

  protected abstract int getLayoutId();

  protected abstract void initViews(Bundle savedInstanceState);

  protected abstract void initData();


  protected void addFragment(int containerViewId, Fragment fragment) {
      FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
      fragmentTransaction.add(containerViewId, fragment);
      fragmentTransaction.commit();
  }

  /**
   * 通过Application对象获取公用组件
   * @return
     */
  protected ApplicationComponent getApplicationComponent() {
    return ((AndroidApplication) getApplication()).getApplicationComponent();
  }


  protected ActivityModule getActivityModule() {
    return new ActivityModule(this);
  }


  public void toast(String msg) {
    this.toast(msg, Toast.LENGTH_SHORT);
  }

  public void toast(String msg, int duration) {
    if (msg == null) return;
    if (duration == Toast.LENGTH_SHORT || duration == Toast.LENGTH_LONG) {
      Toast.makeText(this, msg, duration).show();
    } else {
      Toast.makeText(this, msg, duration).show();
    }
  }

  public void toast(int resId) {
    this.toast(resId, Toast.LENGTH_SHORT);
  }


  public void toast(int resId, int duration) {
    if (duration == Toast.LENGTH_SHORT || duration == Toast.LENGTH_LONG) {
      Toast.makeText(this, getResources().getString(resId), duration).show();
    } else {
      Toast.makeText(this, getResources().getString(resId), duration).show();
    }
  }
}
