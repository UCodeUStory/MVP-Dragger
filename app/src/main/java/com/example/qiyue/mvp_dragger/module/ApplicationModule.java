/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.qiyue.mvp_dragger.module;

import android.content.Context;

import com.example.qiyue.mvp_dragger.core.JobExecutor;
import com.example.qiyue.mvp_dragger.core.ThreadExecutor;
import com.example.qiyue.mvp_dragger.core.app.AndroidApplication;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 *
 * 这里提供 application 和 jobExecutor
 */
@Module
public class ApplicationModule {
  private final AndroidApplication application;

  public ApplicationModule(AndroidApplication application) {
    this.application = application;
  }

  @Provides @Singleton Context provideApplicationContext() {
    return this.application;
  }

  /**
   * 这里我们会疑惑这个JobExecutor 参数这么提供的，我们也没有new JobExecutor
   *
   * 通过查看生成的代码发现，Dragger自动帮我们创建一个JobExecutor,这个功能果然牛
   * 复杂对象创建，我们只需要把类写好就可以了
   * @param jobExecutor
   * @return
     */
  @Provides @Singleton
  ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
    return jobExecutor;
  }


}
