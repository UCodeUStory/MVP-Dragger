package com.example.qiyue.mvp_dragger.core.retrofit2;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
public class WeatherBean {


    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"6","wind_direction":"东南风","wind_strength":"2级","humidity":"56%","time":"10:39"},"today":{"temperature":"4℃~7℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"微风","week":"星期四","city":"北京","date_y":"2016年11月17日","dressing_index":"较冷","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","uv_index":"最弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""},"future":[{"temperature":"4℃~7℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"微风","week":"星期四","date":"20161117"},{"temperature":"6℃~10℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"微风","week":"星期五","date":"20161118"},{"temperature":"3℃~14℃","weather":"霾转阴","weather_id":{"fa":"53","fb":"02"},"wind":"北风3-4 级","week":"星期六","date":"20161119"},{"temperature":"0℃~6℃","weather":"小雨转雨夹雪","weather_id":{"fa":"07","fb":"06"},"wind":"微风","week":"星期日","date":"20161120"},{"temperature":"-4℃~1℃","weather":"小雪转阴","weather_id":{"fa":"14","fb":"02"},"wind":"北风3-4 级","week":"星期一","date":"20161121"},{"temperature":"0℃~6℃","weather":"小雨转雨夹雪","weather_id":{"fa":"07","fb":"06"},"wind":"微风","week":"星期二","date":"20161122"},{"temperature":"6℃~10℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"微风","week":"星期三","date":"20161123"}]}
     * error_code : 0
     */

    public String resultcode;
    public String reason;

    @Override
    public String toString() {
        return "WeatherBean{" +
                "resultcode='" + resultcode + '\'' +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    /**
     * sk : {"temp":"6","wind_direction":"东南风","wind_strength":"2级","humidity":"56%","time":"10:39"}
     * today : {"temperature":"4℃~7℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"微风","week":"星期四","city":"北京","date_y":"2016年11月17日","dressing_index":"较冷","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","uv_index":"最弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""}
     * future : [{"temperature":"4℃~7℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"微风","week":"星期四","date":"20161117"},{"temperature":"6℃~10℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"微风","week":"星期五","date":"20161118"},{"temperature":"3℃~14℃","weather":"霾转阴","weather_id":{"fa":"53","fb":"02"},"wind":"北风3-4 级","week":"星期六","date":"20161119"},{"temperature":"0℃~6℃","weather":"小雨转雨夹雪","weather_id":{"fa":"07","fb":"06"},"wind":"微风","week":"星期日","date":"20161120"},{"temperature":"-4℃~1℃","weather":"小雪转阴","weather_id":{"fa":"14","fb":"02"},"wind":"北风3-4 级","week":"星期一","date":"20161121"},{"temperature":"0℃~6℃","weather":"小雨转雨夹雪","weather_id":{"fa":"07","fb":"06"},"wind":"微风","week":"星期二","date":"20161122"},{"temperature":"6℃~10℃","weather":"霾","weather_id":{"fa":"53","fb":"53"},"wind":"微风","week":"星期三","date":"20161123"}]
     */

    public ResultBean result;
    public int error_code;

    public static class ResultBean {
        /**
         * temp : 6
         * wind_direction : 东南风
         * wind_strength : 2级
         * humidity : 56%
         * time : 10:39
         */

        public SkBean sk;
        /**
         * temperature : 4℃~7℃
         * weather : 霾
         * weather_id : {"fa":"53","fb":"53"}
         * wind : 微风
         * week : 星期四
         * city : 北京
         * date_y : 2016年11月17日
         * dressing_index : 较冷
         * dressing_advice : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
         * uv_index : 最弱
         * comfort_index :
         * wash_index : 不宜
         * travel_index : 较不宜
         * exercise_index : 较不宜
         * drying_index :
         */

        public TodayBean today;
        /**
         * temperature : 4℃~7℃
         * weather : 霾
         * weather_id : {"fa":"53","fb":"53"}
         * wind : 微风
         * week : 星期四
         * date : 20161117
         */

        public List<FutureBean> future;

        public static class SkBean {
            public String temp;
            public String wind_direction;
            public String wind_strength;
            public String humidity;
            public String time;
        }

        public static class TodayBean {
            public String temperature;
            public String weather;

            @Override
            public String toString() {
                return "TodayBean{" +
                        "temperature='" + temperature + '\'' +
                        ", weather='" + weather + '\'' +
                        ", weather_id=" + weather_id +
                        ", wind='" + wind + '\'' +
                        ", week='" + week + '\'' +
                        ", city='" + city + '\'' +
                        ", date_y='" + date_y + '\'' +
                        ", dressing_index='" + dressing_index + '\'' +
                        ", dressing_advice='" + dressing_advice + '\'' +
                        ", uv_index='" + uv_index + '\'' +
                        ", comfort_index='" + comfort_index + '\'' +
                        ", wash_index='" + wash_index + '\'' +
                        ", travel_index='" + travel_index + '\'' +
                        ", exercise_index='" + exercise_index + '\'' +
                        ", drying_index='" + drying_index + '\'' +
                        '}';
            }

            /**
             * fa : 53
             * fb : 53
             */

            public WeatherIdBean weather_id;
            public String wind;
            public String week;
            public String city;
            public String date_y;
            public String dressing_index;
            public String dressing_advice;
            public String uv_index;
            public String comfort_index;
            public String wash_index;
            public String travel_index;
            public String exercise_index;
            public String drying_index;

            public static class WeatherIdBean {
                public String fa;
                public String fb;
            }
        }

        public static class FutureBean {
            public String temperature;
            public String weather;
            /**
             * fa : 53
             * fb : 53
             */

            public WeatherIdBean weather_id;
            public String wind;
            public String week;
            public String date;

            public static class WeatherIdBean {
                public String fa;
                public String fb;
            }
        }
    }
}
