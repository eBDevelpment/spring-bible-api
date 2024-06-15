package com.edivan.fontes.spring_bible_api.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig implements CommandLineRunner {

	@Value("${spring.profiles.active}")
	private String activeProfile;		
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Profile ativo: " + activeProfile);
	}

}
