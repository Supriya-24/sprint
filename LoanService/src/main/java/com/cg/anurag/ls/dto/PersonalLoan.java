package com.cg.anurag.ls.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class PersonalLoan extends Loan
{
	@Column(name="annual_income")
	double annualIncome;
	public PersonalLoan() { }
	public PersonalLoan(double annualIncome)
	{
		this.annualIncome=annualIncome;
	}
	public double getAnnualIncome()
	{
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome)
	{
		this.annualIncome = annualIncome;
	}
	
}
