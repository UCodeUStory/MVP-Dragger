package com.example.qiyue.mvp_dragger.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.qiyue.mvp_dragger.R;
import com.example.qiyue.mvp_dragger.adapter.TitleListAdapter;
import com.example.qiyue.mvp_dragger.core.BaseActivity;
import com.example.qiyue.mvp_dragger.core.ThreadExecutor;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TitleListActivity extends BaseActivity {

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;
    @Inject
    Context mContext;
    @Inject
    ThreadExecutor executor;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_title_list;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
    }


    @Override
    protected void initData() {
        this.getApplicationComponent().inject(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String>datas = new ArrayList<>();

        initListData(datas);
       /* for (int i=0;i<30;i++) {
            datas.add("test "+i);
        }*/
        TitleListAdapter adapter = new TitleListAdapter(datas);
        adapter.setOnTitleItemClick(new TitleListAdapter.OnTitleItemClick() {
            @Override
            public void onItemClick(View view, int position) {
                initClick(position);
            }
        });
        recyclerView.setAdapter(adapter);


        // assert mContext!=null; 如果是false 程序将不再进行


        if (mContext!=null){
            Log.i("ustory","Context inject Success");
            Toast.makeText(mContext,"Context inject Success",Toast.LENGTH_SHORT).show();
        }

        if (executor!=null){
            Log.i("ustory","executor inject Success");
            Toast.makeText(mContext,"Context inject Success",Toast.LENGTH_SHORT).show();
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Log.i("ustory","start thread is run");
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.i("ustory","end thread is run");
                }
            });
        }
    }

    private void initListData(List<String> datas) {
        datas.add("测试Module提供对象");
        datas.add("测试Component依赖Component情况");
        datas.add("测试Retrofit");
    }

    private void initClick(int position) {
        switch (position){
            case 0:
                startActivity(new Intent(this,TestModuleOneActivity.class));
                break;
            case 1:
                break;
            case 2:
                startActivity(new Intent(this,TestRetrofitActivity.class));
                break;
            default:
                break;
        }
    }
}
