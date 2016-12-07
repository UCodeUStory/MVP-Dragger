package com.example.qiyue.mvp_dragger.entity;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
public class TestUser {

    String name;
    String age;

    TestBook testBook;

    TestWatch testWatch;


    public void setTestBook(TestBook testBook) {
        this.testBook = testBook;
    }

    public void setTestWatch(TestWatch testWatch) {
        this.testWatch = testWatch;
    }

    public TestUser(){

    }

    @Override
    public String toString() {
        return "TestUser{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", testBook=" + testBook +
                ", testWatch=" + testWatch +
                '}';
    }

    public TestUser(String name, String age){
        this.name = name;
        this.age = age;
    }


}
