package com.cg.anurag.ls.dto;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="sanctioned_loans")
public class SanctionedLoans
{
	@Column(name="customer_id")
	int custId;
	@Column(name="loan_id")
	int loanId;
	@Column(name="amount_sanctioned")
	double amountSanctioned;
	double emi;
	int tenure;
	@Column(name="issued_date")
	Date issuedDate;
	String status;
	public SanctionedLoans() {}
	public SanctionedLoans(int custId, int loanId, double amountSanctioned, double emi, int tenure,
			               Date issuedDate,String status)
	{
		this.custId = custId;
		this.loanId = loanId;
		this.amountSanctioned = amountSanctioned;
		this.emi = emi;
		this.tenure = tenure;
		this.issuedDate = issuedDate;
		this.status = status;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getAmountSanctioned() {
		return amountSanctioned;
	}
	public void setAmountSanctioned(double amountSanctioned) {
		this.amountSanctioned = amountSanctioned;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
