package io.github.fmarques899.baseapi.services;

import org.springframework.stereotype.Service;

import io.github.fmarques899.baseapi.entities.response.Start;

@Service
public class StartService {

	public Start testStart() {
		Start start = new Start();
		
		start.setMessage("Project is working!");
		
		return start;
	}
}
