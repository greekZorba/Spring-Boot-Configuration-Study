package com.demo.pojo;

import lombok.Data;

/**
 * @Data는 컴파일 시점에서 getter와 setter를 클래스 내부 필드에 자동 생성한다.
 * */
@Data
public class Fruit {
    private String name;
    private String color;

}
