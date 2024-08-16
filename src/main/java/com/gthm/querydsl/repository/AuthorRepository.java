package com.gthm.querydsl.repository;

import com.gthm.querydsl.dto.AuthorStatistic;
import com.gthm.querydsl.entity.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends BaseRepository<Author,Integer> {


    public Optional<Author> findAuthorByEmail(String email);

    public List<AuthorStatistic> getAuthorStatistic();

    public List<Author> getAuthors();
}
