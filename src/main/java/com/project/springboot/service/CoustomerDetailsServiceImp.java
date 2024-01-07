package com.project.springboot.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot.dto.CoustomerDetailsDto;
import com.project.springboot.model.CoustomerDetailsEntity;
import com.project.springboot.repo.CoustomerDetailsRepository;

@Service
public class CoustomerDetailsServiceImp implements CoustomerDetailsService 
{
	@Autowired
	private CoustomerDetailsRepository coustomerDetailsRepository;
	
	@Override
	public String insertCoustomerDetails(CoustomerDetailsDto coustomerDetailsDto) 
	{	
		// TODO Auto-generated method stub
		CoustomerDetailsEntity coustomerDetailsEntity=new CoustomerDetailsEntity();
		
		   LocalDate accountOpenDate = coustomerDetailsDto.getAccountOpenDate();
		
		  LocalDate currentDate=LocalDate.now();
		
		  Period period=Period.between(accountOpenDate, currentDate);
		  
		 // int days = period.getDays();
		  
		  coustomerDetailsEntity.setId(coustomerDetailsDto.getId());
		  coustomerDetailsEntity.setProfession(coustomerDetailsDto.getProfession());
		  coustomerDetailsEntity.setMonthlyIncome(coustomerDetailsDto.getMonthlyIncome());
		  coustomerDetailsEntity.setAnnualTurnover(coustomerDetailsDto.getAnnualTurnover());
		  coustomerDetailsEntity.setNationality(coustomerDetailsDto.getNationality());
		  coustomerDetailsEntity.setDob(coustomerDetailsDto.getDob());
		  coustomerDetailsEntity.setPurposeOfAccountOpening(coustomerDetailsDto.getPurposeOfAccountOpening());
		  coustomerDetailsEntity.setSourceOfIncome(coustomerDetailsDto.getSourceOfIncome());
		  coustomerDetailsEntity.setAccountOpenDate(coustomerDetailsDto.getAccountOpenDate());
		  //coustomerDetailsEntity.setAgeingWithBank(days);
		  coustomerDetailsRepository.save(coustomerDetailsEntity);
		return "sucessfully inserted";
	}
	
	
	@Override
	public CoustomerDetailsDto getByid() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
