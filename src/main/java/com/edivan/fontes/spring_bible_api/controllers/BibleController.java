package com.edivan.fontes.spring_bible_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edivan.fontes.spring_bible_api.entities.Book;
import com.edivan.fontes.spring_bible_api.entities.Testament;
import com.edivan.fontes.spring_bible_api.entities.Verse;
import com.edivan.fontes.spring_bible_api.entities.Version;
import com.edivan.fontes.spring_bible_api.services.BibleService;

@RestController
@RequestMapping(value = "/")
public class BibleController {
	
	@Autowired
	private BibleService bibleService;
	
	@GetMapping
	public String welcomeRoute() {
		return "Bem-vindo a Sping Bible API";
	}

	@GetMapping(value = "/about")
	public String aboutRoute() {
		return "Aqui você vai encontrar ajuda de como utilizar a API";
	}

	@GetMapping(value = "/bibles")
	public ResponseEntity<List<Version>> biblesRoute() {
		List<Version> bibles = bibleService.bibles();
		return ResponseEntity.ok().body(bibles);
	}

	@GetMapping(value = "/testaments")
	public ResponseEntity<List<Testament>> testamentsRoute() {
		List<Testament> testaments = bibleService.testaments();
		return ResponseEntity.ok().body(testaments);
	}

	@GetMapping(value = "/books")
	public ResponseEntity<List<Book>> booksRoute() {
		List<Book> books = bibleService.books();
		return ResponseEntity.ok().body(books);
	}
	
	@GetMapping(value = "/verses")
	public ResponseEntity<List<Verse>> versesRoute() {
		List<Verse> verses = bibleService.verses();
		return ResponseEntity.ok().body(verses);
	}

	@GetMapping(value = "/{version}/books")
	public String booksRoute(@PathVariable("version") String version) {
		return "Lista de todos os livros da Bíblia, na versão protestante";
	}

	@GetMapping(value = "/{version}/{book}/chapters")
	public String chaptersRoute(@PathVariable("version") String version, @PathVariable("book") String book) {
		return "Aqui a lista dos capitulos do livro selecionado";
	}

	@GetMapping(value = "/{version}/{book}/{chapter}")
	public String bibleRoute(@PathVariable("version") String version, 
			@PathVariable("book") String book,
			@PathVariable("chapter") String chapter) {
		
		return "Selecionada a versão: "+
				version +
				"\nLivro: "+ 
				book +
				"\nCapitulo: "+ chapter +
				"\nApós selecionados a versão, o livro e o capitulo, os versiculos estão prontos para serem exibidos.";
	}


}
