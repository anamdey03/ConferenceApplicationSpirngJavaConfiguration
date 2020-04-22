package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
		System.out.println(speakerService.findAll().get(0).getFirstName() + " " + speakerService.findAll().get(0).getLastName());
	}
}
