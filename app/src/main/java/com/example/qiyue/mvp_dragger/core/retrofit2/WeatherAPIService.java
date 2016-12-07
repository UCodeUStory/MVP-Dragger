package com.example.qiyue.mvp_dragger.core.retrofit2;

/**
 * Created by qiyue on 2016/11/17 0017.
 */
import com.example.qiyue.mvp_dragger.entity.GetIpInfoResponse;
import com.example.qiyue.mvp_dragger.entity.WeatherParam;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* Retrofit 2.1.0 */

/**
 * 聚合数据网提供的500次访问
 * https://www.juhe.cn/myData
 *
 * http://v.juhe.cn/weather/index?format=2&cityname=北京&key=817a46fd35061aee9512d7826dc19080
 * http://ip.taobao.com/service/getIpInfo.php?ip=101.200.218.184
 */

public interface WeatherAPIService {

    @FormUrlEncoded
    @POST("index")//读参数进行urlEncoded
    Call<WeatherBean> findWeatherByCityName(@Field("format") String format,@Field("cityname") String cityname,
                                            @Field("key") String key);
    @POST("index")
    Call<WeatherBean> findWeatherByCity2(@Body WeatherParam param);

    @POST("service/getIpInfo.php")
    Call<GetIpInfoResponse>getIpInfo(@Query("ip")String ip);
}