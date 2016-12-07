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
package com.example.qiyue.mvp_dragger.compent;

import android.content.Context;

import com.example.qiyue.mvp_dragger.core.BaseActivity;
import com.example.qiyue.mvp_dragger.core.ThreadExecutor;
import com.example.qiyue.mvp_dragger.module.ApplicationModule;
import com.example.qiyue.mvp_dragger.views.TitleListActivity;

import dagger.Component;
import javax.inject.Singleton;

/**
 *
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
  void inject(BaseActivity baseActivity);

  void inject(TitleListActivity titleListActivity);

  /**
   * 这样就可以通过component.context()方法访问
   * @return
     */
  //Exposed to sub-graphs.
  Context context();
  ThreadExecutor threadExecutor();

}
