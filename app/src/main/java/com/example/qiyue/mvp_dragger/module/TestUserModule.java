package com.example.qiyue.mvp_dragger.module;

import com.example.qiyue.mvp_dragger.entity.TestBook;
import com.example.qiyue.mvp_dragger.entity.TestUser;
import com.example.qiyue.mvp_dragger.entity.TestWatch;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/11/16 0016.
 */

@Module
public class TestUserModule {

/*

    @Provides public TestBook provideTestBook(){
        return new TestBook("Android程序思想","2000-11-11");
    }
*/

    @Provides public TestWatch provideTestWatch(){
        return new TestWatch("劳力士","$12000");
    }

    @Provides public TestUser provideTestUser(TestBook book, TestWatch testWatch){
        TestUser testUser = new TestUser("ustory","25");
        testUser.setTestBook(book);
        testUser.setTestWatch(testWatch);
        return testUser;
    }
}
