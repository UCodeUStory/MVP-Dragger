package com.example.qiyue.mvp_dragger.compent;

import com.example.qiyue.mvp_dragger.MainActivity;
import com.example.qiyue.mvp_dragger.module.TitleModule;
import com.example.qiyue.mvp_dragger.module.UserModule;

import dagger.Component;

/**
 * Created by qiyue on 2016/11/14 0014.
 *
 * 1.用来将moudle和inject注解在一起,这是一个桥梁，也是核心部分
 *
 * 2.rebuild项目后自动生成一个实现类DaggerAppComponent，因此这也是预编译生成代码，而不是反射，所以提高了效率
 *
 * 3.我们在那个类里面使用就要写一个方法注入，例如名字为inject方法传入的是MainActivity
 *   当然我们还可在其他类里面就写多个方法
 */
@Component( modules = {UserModule.class, TitleModule.class})
public interface AppComponent {
    /**
     * 表明这个组件的在哪个类里面用，不指明就不抛出nullPointer,注入也不会成功
     * @param activity
     */
    void inject(MainActivity activity);

    //void inject(OtherActivity object);
}