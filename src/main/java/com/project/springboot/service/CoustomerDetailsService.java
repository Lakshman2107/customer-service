package com.project.springboot.service;

import com.project.springboot.dto.CoustomerDetailsDto;

public interface CoustomerDetailsService 
{
	public String insertCoustomerDetails(CoustomerDetailsDto coustomerDetailsDto);
	
	public CoustomerDetailsDto getByid();
	
}
