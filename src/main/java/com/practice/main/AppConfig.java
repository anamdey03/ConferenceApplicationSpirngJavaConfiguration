package com.practice.main;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.practice.repository.HibernateSpeakerRepositoryImpl;
import com.practice.repository.SpeakerRepository;
import com.practice.service.SpeakerService;
import com.practice.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

	//Bean using Setter Injection
//	@Bean(name = "speakerService")
//	public SpeakerService getSpeakerService() {
//		SpeakerServiceImpl speakerServiceImpl = new SpeakerServiceImpl();
//		speakerServiceImpl.setSpeakerRepository(getSpeakerRepository());   // Setter Injection
//		return speakerServiceImpl;
//	}
	
	//Bean using Constructor Injection
	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl speakerServiceImpl = new SpeakerServiceImpl(getSpeakerRepository());
		return speakerServiceImpl;
	}
	
	@Bean(name = "speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
}
