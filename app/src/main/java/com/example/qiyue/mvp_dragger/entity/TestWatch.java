package com.example.qiyue.mvp_dragger.entity;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
public class TestWatch {

    public String name;
    public String price;

    public TestWatch(String name,String price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TestWatch{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
