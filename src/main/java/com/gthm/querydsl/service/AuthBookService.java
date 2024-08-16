package com.gthm.querydsl.service;

import com.gthm.querydsl.dto.AuthorStatistic;
import com.gthm.querydsl.entity.Author;
import com.gthm.querydsl.entity.Book;
import com.gthm.querydsl.repository.AuthorRepository;
import com.gthm.querydsl.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthBookService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    public List<Author> saveAuthorsWithBooks(List<Author> authors){
        return authorRepository.saveAll(authors);
    }

    //  will find N+1 problem in hibernate/jpa
    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Optional<Author> findAuthorByEmail(String email){
        return authorRepository.findAuthorByEmail(email);
    }

    public List<AuthorStatistic> getAuthorStatistic(){
        return authorRepository.getAuthorStatistic();
    }
    //to avoid N+1 problem in hibernate/jpa
    public List<Author> getAuthorsWithFetchJoin(){
        return authorRepository.getAuthors();
    }

}
