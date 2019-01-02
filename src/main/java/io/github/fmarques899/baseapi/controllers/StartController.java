package io.github.fmarques899.baseapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.fmarques899.baseapi.entities.response.BaseResponse;
import io.github.fmarques899.baseapi.entities.response.Start;
import io.github.fmarques899.baseapi.services.StartService;

@RestController
public class StartController {
	
	@Autowired
	private StartService startService;
	
	@RequestMapping("/")
	public ResponseEntity<Start> start() {
		ResponseEntity<BaseResponse> response = new ResponseEntity<BaseResponse>(HttpStatus.OK);
		
		return ResponseEntity.ok(startService.testStart());
	}


}
