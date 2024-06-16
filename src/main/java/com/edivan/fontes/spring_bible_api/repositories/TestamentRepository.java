package com.edivan.fontes.spring_bible_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edivan.fontes.spring_bible_api.entities.Testament;

public interface TestamentRepository extends JpaRepository<Testament, Long> {

}
