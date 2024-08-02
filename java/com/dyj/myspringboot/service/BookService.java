package com.dyj.myspringboot.service;

import com.dyj.myspringboot.pojo.Book;

import java.util.List;

public interface BookService {
    //根据ID查询一条书的信息
    Book queryBookById(Integer bookId);
    //增加书
    int addBook(Book book);
    //删除书
    int deleteBook(Integer bookId);
    //修改书
    int updateBook(Book book);
    //查看书所有信息
    List<Book> queryAllBook();
}
