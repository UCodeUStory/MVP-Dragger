package com.example.qiyue.mvp_dragger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.qiyue.mvp_dragger.compent.DaggerAppComponent;
import com.example.qiyue.mvp_dragger.entity.Title;
import com.example.qiyue.mvp_dragger.iview.ITitleView;
import com.example.qiyue.mvp_dragger.iview.IView;
import com.example.qiyue.mvp_dragger.module.TitleModule;
import com.example.qiyue.mvp_dragger.module.UserModule;
import com.example.qiyue.mvp_dragger.presenter.TitlePresenter;
import com.example.qiyue.mvp_dragger.presenter.UserPresenter;

import java.util.List;

import javax.inject.Inject;

/**
 *
 *
 *
 *
 *
 */

public class MainActivity extends AppCompatActivity implements IView,ITitleView, View.OnClickListener {

    TextView tv_result;
    Button btn_update;

    @Inject
    UserPresenter myPresenter; //获取依赖的对象

    @Inject
    TitlePresenter titlePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = (TextView)findViewById(R.id.tv_result);
        btn_update = (Button)findViewById(R.id.btn_update);
        btn_update.setOnClickListener(this);
        /**
         *
         * Dragger2是编译时期的注入，这里面创建对象不是的过程也是我们自己编写的，只不过这个对象和依赖他的对象解耦，
         * 依赖他的地方不需要修改代码，最重要的是他可以管理负责对象的创建，{
         * 比如  A a = new A();
         *      B b = new B(a);
         *      C c = new C(b);
         *
         *      只要提供好对应的providers,他自己去管理
         * }
         *
         * 注解什么作用？？？？
         * 在我们写好Component的时候我们执行rebuid预编译,
         * 这个时候Dragger插件通过这个注解来识别要生成那些类和方法
         * 比如这里不标识在DaggerAppComponent就不会创建Presenter
         * 在调用inject方法也不会注入
         *
         * 也就是说DraggerAppComponent里面的方法的具体生成什么样子都是
         * 通过我们要求生成的，
         *
         * 因此rebuild 以后注解就没有用了，yesyesyes
         *
         * 最后这里调用inject 的时候也就是给自己的对象具有标识presenter赋值
         *
         * 以后的操作也都是真实的代码操作，也注解无关
         */
        DaggerAppComponent.builder()
                .userModule(new UserModule(this))
                .titleModule(new TitleModule(this))
                .build()
                .inject(this);



    }

    @Override
    public void updateUi(String data) {
        tv_result.setText(data);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_update:
                myPresenter.loadData();
                break;
        }
    }

    @Override
    public List<Title> getTitleList() {
        return null;
    }
}