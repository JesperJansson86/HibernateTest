package com.example.hibernatetest.repositories;


import com.example.hibernatetest.models.Book;
import com.example.hibernatetest.models.Kompis;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    List<Book> findByAuthorAndTitle(String author,String title);
}
