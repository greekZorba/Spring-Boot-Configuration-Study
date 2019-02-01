package com.havi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @RunWith 어노테이션을 사용하면 Junit에 내장된 러너를 사용하는 대신 어노테이션에 정의된
 * 러너 클래스를 사용
 * @SpringBootTest를 사용하려면 JUnit 실행에 필요한 SpringJUnit4ClassRunner 클래스를 상속받은
 * @RunWith(SpringRunner.class)를 붙여야 사용 가능
 *
 * springBootTest에 환경설정에 대해 직접 인자를 주입해서 테스트 가능하다.
 * 하지만 properties와 value를 동시에 사용할 수 없다.
 * */
@RunWith(SpringRunner.class)
@SpringBootTest(value = "value=test",
//        properties = {"property.value=" + "propertyTest"},
        classes = {SpringBootTestApplication.class},
         webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootTestApplicationTests {

    @Value("${value}")
    private String value;

//    @Value("${property.value}")
//    private String propertyValue;

    @Test
    public void contextLoads(){
        assertThat(value, is("test"));
//        assertThat(propertyValue, is("propertyTest"));

    }
}
