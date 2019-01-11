package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  여기서 @SpringBootApplication은 @SpringBootConfiguration + @EnableAutoConfiguration
 *  + @ComponentScan 어노테이션의 조합이다.
 * */
@SpringBootApplication
public class AutoconfigurationApplication {

    public static void main(String[] args){
        SpringApplication.run(AutoconfigurationApplication.class);
    }
}
