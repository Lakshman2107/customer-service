package com.project.springboot.dto;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class CoustomerDetailsDto 
{
	@Id
	private int id;
	
	private String profession;
	
	@Column(name="monthly_income")
	private double monthlyIncome;
	
	@Column(name = "annual_turnover")
	private double annualTurnover;
	
	private String nationality;
	
	private Date dob;
	
	@Column(name = "purpose_of_account_opening ")
	private String purposeOfAccountOpening;
	
	@Column(name = "source_of_income")
	private String sourceOfIncome;
	
	@Column(name = "account_open_date")
	private LocalDate accountOpenDate;
	
	@Column(name = "ageing_with_bank")
	private int ageingWithBank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public double getAnnualTurnover() {
		return annualTurnover;
	}

	public void setAnnualTurnover(double annualTurnover) {
		this.annualTurnover = annualTurnover;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPurposeOfAccountOpening() {
		return purposeOfAccountOpening;
	}

	public void setPurposeOfAccountOpening(String purposeOfAccountOpening) {
		this.purposeOfAccountOpening = purposeOfAccountOpening;
	}

	public String getSourceOfIncome() {
		return sourceOfIncome;
	}

	public void setSourceOfIncome(String sourceOfIncome) {
		this.sourceOfIncome = sourceOfIncome;
	}

	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public int getAgeingWithBank() {
		return ageingWithBank;
	}

	public void setAgeingWithBank(int ageingWithBank) {
		this.ageingWithBank = ageingWithBank;
	}
	
}
