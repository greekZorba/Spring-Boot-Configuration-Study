package com.demo.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityApplicationTests {

    @Autowired
    private CommunityApplication communityApplication;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testHelloWorld(){
        System.out.println(communityApplication.helloWorld());
    }

}

