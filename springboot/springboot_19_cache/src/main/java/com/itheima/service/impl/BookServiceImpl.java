package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    //private HashMap<Integer,Book> cache=new HashMap<Integer,Book>();

    /*@Override
    public Book getById(Integer id) {
        Book book = cache.get(id);
        if(book == null){
            Book queryBook = bookDao.selectById(id);
            cache.put(id,queryBook);
            return queryBook;
        }
        return cache.get(id);
    }*/

    @Override
    @Cacheable(value = "cacheSpace",key = "#id")
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }


    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }
}
