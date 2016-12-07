/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.qiyue.mvp_dragger.core.app;

import android.app.Application;

import com.example.qiyue.mvp_dragger.BuildConfig;
import com.example.qiyue.mvp_dragger.compent.ApplicationComponent;
import com.example.qiyue.mvp_dragger.compent.DaggerApplicationComponent;
import com.example.qiyue.mvp_dragger.module.ApplicationModule;


/**
 * Android Main Application
 *
 * 这里先把公用组件创建为全局的，但具体注入需要在具体Activity
 */
public class AndroidApplication extends Application {

  private ApplicationComponent applicationComponent;

  @Override public void onCreate() {
    super.onCreate();
    this.initializeInjector();
    this.initializeLeakDetection();
  }

  private void initializeInjector() {
    this.applicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))
        .build();

  }

  public ApplicationComponent getApplicationComponent() {
    return this.applicationComponent;
  }

  private void initializeLeakDetection() {
    if (BuildConfig.DEBUG) {
      //LeakCanary.install(this);
    }
  }
}
