package com.dyj.myspringboot.pojo;

import lombok.Data;

@Data
public class Book {
    private int bookId;
    private String bookName;
    private String bookUser;
    private String description;
    private String content;
}
