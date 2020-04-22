package com.practice.repository;

import java.util.ArrayList;
import java.util.List;

import com.practice.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

	public List<Speaker> finalAll() {
		List<Speaker> speakers = new ArrayList<Speaker>(10);

		Speaker speaker = new Speaker();
		speaker.setFirstName("Anamitra");
		speaker.setLastName("Dey");

		speakers.add(speaker);

		return speakers;
	}
}
