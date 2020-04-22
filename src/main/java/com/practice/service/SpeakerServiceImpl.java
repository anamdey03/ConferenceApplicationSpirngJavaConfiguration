package com.practice.service;

import java.util.List;

import com.practice.model.Speaker;
import com.practice.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository;
	
	//Construction which is used for Constructor Injection
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}

	//Setter method which is used for Setter Injection
	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}

	public List<Speaker> findAll() {
		return speakerRepository.finalAll();
	}
}
