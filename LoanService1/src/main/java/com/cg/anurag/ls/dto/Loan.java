package com.cg.anurag.ls.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Loan 
{
	@Id
	@Column(name="loan_id")
	int loanId;
	String type;
	double roi;
	@Column(name="max_tenure")
	int maxTenure;
	public Loan() {}
	public Loan(int loanId, String type, double roi, int maxTenure) 
	{
		this.loanId = loanId;
		this.type = type;
		this.roi = roi;
		this.maxTenure = maxTenure;
	}
	public int getLoanId()
	{
		return loanId;
	}
	public void setLoanId(int loanId) 
	{
		this.loanId = loanId;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public double getRoi() 
	{
		return roi;
	}
	public void setRoi(double roi) 
	{
		this.roi = roi;
	}
	public int getMaxTenure() 
	{
		return maxTenure;
	}
	public void setMaxTenure(int maxTenure) 
	{
		this.maxTenure = maxTenure;
	}	
}
