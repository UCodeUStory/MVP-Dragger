package com.example.qiyue.mvp_dragger.views;

import android.os.Bundle;
import android.widget.TextView;

import com.example.qiyue.mvp_dragger.R;
import com.example.qiyue.mvp_dragger.compent.DaggerTestUserComponent;
import com.example.qiyue.mvp_dragger.core.BaseActivity;
import com.example.qiyue.mvp_dragger.core.ThreadExecutor;
import com.example.qiyue.mvp_dragger.entity.TestUser;
import com.example.qiyue.mvp_dragger.module.TestUserModule;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TestModuleOneActivity extends BaseActivity {


    @Inject
    TestUser testUser;
    @Bind(R.id.tv_useinfo)
    TextView tvUseinfo;
    @Bind(R.id.tv_one)
    TextView tvOne;
    @Bind(R.id.tv_two)
    TextView tvTwo;

    /**
     *  应为有依赖所以可以注入.applicationComponent(getApplicationComponent())
     */
    @Inject
    ThreadExecutor executor;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_test_module_one;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        DaggerTestUserComponent.builder()
                .applicationComponent(getApplicationComponent())
                .testUserModule(new TestUserModule())
                .build()
                .inject(this);
    }

    @Override
    protected void initData() {
        tvOne.setText("这是一个测试Moudle如何提供依赖的一个测试，在Moudle中，我们需要创建一个TestUser对象，TestUser的创建需要两个参数，" +
                "我们来分析这两个参数该怎么传递");
        tvTwo.setText("第①种通过在一个Moudle中同样提供他的参数对象" +
                "第②种就是通过在参数对象中添加无参构造方法并在上面加上注解@Inject,然后rebuild的时候就会自动调用" +
                "这个无参构造方法");
        tvUseinfo.setText(testUser.toString());

        if (executor!=null){
            toast("executor注入成功");
        }else{
            toast("注入失败");
        }
    }


}
