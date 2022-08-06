package com.itheima.service.impl;

import com.alicp.jetcache.anno.CacheInvalidate;
import com.alicp.jetcache.anno.CacheRefresh;
import com.alicp.jetcache.anno.CacheUpdate;
import com.alicp.jetcache.anno.Cached;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Cached(name = "book_",key = "#id",expire = 3600)
    //@CacheRefresh(refresh = 10)
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }


    @Override
    @CacheUpdate(name = "book_",key = "#book.id",value = "#book")
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    @CacheInvalidate(name = "book_",key = "#id")
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }
}
