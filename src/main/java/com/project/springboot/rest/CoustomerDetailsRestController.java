package com.project.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.dto.CoustomerDetailsDto;
import com.project.springboot.service.CoustomerDetailsService;

@RestController
public class CoustomerDetailsRestController 
{
	@Autowired
	private CoustomerDetailsService coustomerDetailsService;
	
	@PostMapping("/insert")
	private ResponseEntity<String> insert(@RequestBody CoustomerDetailsDto coustomerDetailsDto)
	{
		String insertCoustomerDetails = coustomerDetailsService.insertCoustomerDetails(coustomerDetailsDto);
		return new ResponseEntity<String>(insertCoustomerDetails, HttpStatus.CREATED);
		
	}
}
