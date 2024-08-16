package com.gthm.querydsl.repository.impl;

import com.gthm.querydsl.entity.Book;
import com.gthm.querydsl.repository.BookRepository;

import javax.persistence.EntityManager;

public class BookRepositoryImpl extends BaseRepositoryImpl<Book,Integer> implements BookRepository {


    public BookRepositoryImpl( EntityManager em) {
        super(Book.class, em);
    }
}
