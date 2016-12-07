package com.example.qiyue.mvp_dragger.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.qiyue.mvp_dragger.R;
import com.example.qiyue.mvp_dragger.constants.Constants;
import com.example.qiyue.mvp_dragger.core.BaseActivity;
import com.example.qiyue.mvp_dragger.core.retrofit2.WeatherAPIService;
import com.example.qiyue.mvp_dragger.core.retrofit2.WeatherBean;
import com.example.qiyue.mvp_dragger.entity.GetIpInfoResponse;
import com.example.qiyue.mvp_dragger.entity.WeatherParam;

import java.io.IOException;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestRetrofitActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_test_retrofit;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {

        /**
         * 可以写成公共的组件，传递给presenter
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/weather/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        WeatherAPIService service = retrofit.create(WeatherAPIService.class);
        Call<GetIpInfoResponse> call = service.getIpInfo("101.200.218.184");
        call.enqueue(new Callback<GetIpInfoResponse>() {
            @Override
            public void onResponse(Call<GetIpInfoResponse> call, Response<GetIpInfoResponse> response) {
                Log.i("qiyue","response="+response.body());
            }

            @Override
            public void onFailure(Call<GetIpInfoResponse> call, Throwable t) {
                toast("请求失败");
            }
        });
      /*  Call<WeatherBean> call = service.findWeatherByCityName("2","北京", Constants.WEATHER_API_KEY);
        call.enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                 Log.i("qiyue","response="+response.body());
                 toast(response.body()+"");
            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {
                 toast("请求失败");
            }
        });*/

   /*     WeatherParam param = new WeatherParam();
        param.format = "2";
        param.cityname = "上海";
        param.key = "817a46fd35061aee9512d7826dc19080";

        */
        /*
        Call<WeatherBean> call = service.findWeatherByCity2(param);
        call.enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                Log.i("qiyue","response="+response.body());
                toast(response.body()+"");
            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {
                toast("请求失败");
            }
        });*/

        /*http://v.juhe.cn/weather/index?format=2&cityname=北京&key=817a46fd35061aee9512d7826dc19080
         */
    }
}
