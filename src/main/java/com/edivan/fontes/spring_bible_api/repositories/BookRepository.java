package com.edivan.fontes.spring_bible_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edivan.fontes.spring_bible_api.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
