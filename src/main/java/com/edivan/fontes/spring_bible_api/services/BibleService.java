package com.edivan.fontes.spring_bible_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edivan.fontes.spring_bible_api.entities.Book;
import com.edivan.fontes.spring_bible_api.entities.Testament;
import com.edivan.fontes.spring_bible_api.entities.Verse;
import com.edivan.fontes.spring_bible_api.entities.Version;
import com.edivan.fontes.spring_bible_api.repositories.BookRepository;
import com.edivan.fontes.spring_bible_api.repositories.TestamentRepository;
import com.edivan.fontes.spring_bible_api.repositories.VerseRepository;
import com.edivan.fontes.spring_bible_api.repositories.VersionRepository;

@Service
public class BibleService {

	@Autowired
	VersionRepository versionRepository;

	@Autowired
	TestamentRepository testamentRepository;

	@Autowired
	BookRepository bookRepository;

	@Autowired
	VerseRepository verseRepository;
	
	public List<Version> bibles(){
		
		return versionRepository.findAll();
		
	}

	public List<Testament> testaments(){
		
		return testamentRepository.findAll();
		
	}

	public List<Book> books(){
		
		return bookRepository.findAll();
		
	}
	
	public List<Verse> verses(){
		
		return verseRepository.findAll();
		
	}

}
