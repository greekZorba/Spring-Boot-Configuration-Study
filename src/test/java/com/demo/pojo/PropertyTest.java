package com.demo.pojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * SpringBootTest 애노테이션은 찾기 알고리즘을 사용해 @SpringBootConfiguration을
 * 계속 찾기 때문에 @SpringBootConfiguration이 선언되어야 스프링부트테스트 사용 가능
 * */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyTest {

    @Autowired
    private FruitProperty fruitProperty;

    @Test
    public void test(){
       List<Fruit> fruitData = fruitProperty.getList();

       assertThat(fruitData.get(0).getName(), is("banana"));
       assertThat(fruitData.get(0).getColor(), is("yellow"));

       assertThat(fruitData.get(1).getName(), is("apple"));
       assertThat(fruitData.get(1).getColor(), is("red"));

       assertThat(fruitData.get(2).getName(), is("water melon"));
       assertThat(fruitData.get(2).getColor(), is("green"));
    }

}
