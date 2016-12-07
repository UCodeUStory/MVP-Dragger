package com.example.qiyue.mvp_dragger.entity;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
public class GetIpInfoResponse {

    public String code;

    public IpInfo ipInfo;


    class IpInfo{
        public String country;
        public String country_id;
        public String area;
        public String area_id;
        public String ip;
    }
}
