package com.edivan.fontes.spring_bible_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class BibleController {
	
	@GetMapping
	public String welcomeRoute() {
		return "Bem-vindo a Sping Bible API";
	}

	@GetMapping(value = "/about")
	public String aboutRoute() {
		return "Aqui você vai encontrar ajuda de como utilizar a API";
	}

	@GetMapping(value = "/bibles")
	public String biblesRoute() {
		return "Aqui serão exibidas as versões da Bíblia disponiveis para consulta nesta API";
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
