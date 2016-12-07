package com.example.qiyue.mvp_dragger.entity;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
public class TestBook {

    public String name;
    public String date;

    @Inject
    public TestBook(){
        this.name = "Android编程思想";
        this.date = "2012-12-12";
    }
    public TestBook(String name,String date){
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "TestBook{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
