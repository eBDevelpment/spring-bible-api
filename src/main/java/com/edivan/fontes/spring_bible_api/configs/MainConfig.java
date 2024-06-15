package com.edivan.fontes.spring_bible_api.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(MainConfig.class); 

	@Value("${spring.profiles.active}")
	private String activeProfile;		
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Profile ativo: " + activeProfile);
	}

}
