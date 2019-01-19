package com.havi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @NoArgsConstructor 인자가 없는 기본 생성자를 만듦
 * @Getter getMethod를 만듦
 * */
@NoArgsConstructor
@Getter
public class Book {

    private Integer idx;
    private String title;
    private LocalDateTime publishedAt;

    @Builder
    public Book(String title, LocalDateTime publishedAt){
        this.title = title;
        this.publishedAt = publishedAt;
    }
}
