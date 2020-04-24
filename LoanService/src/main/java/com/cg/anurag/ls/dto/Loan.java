package com.cg.anurag.ls.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
//@DiscrimantorColumn(name="type")
@Entity
abstract public class Loan
{
	@Id
	/*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOANSEQ")
    @SequenceGenerator(sequenceName = "LOANSEQ", allocationSize = 1, name = "loan_seq")*/
	int loanId;
	@Column(name="acc_id")
	long accId;
	@Column(name="amount")
	double amount;
	@Column(name="type")
	String type;
	@Column(name="tenure")
	int tenure;
	@Column(name="roi")
	double roi;
	@Column(name="emi")
	double emi;
	@Column(name="status")
	String status;
	public Loan() {}
	public Loan(int loanId, long accId, double amount, String type, int tenure, double roi,
			double emi, String status) 
	{
		this.loanId = loanId;
		this.accId = accId;
		this.amount = amount;
		this.type = type;
		this.tenure = tenure;
		this.roi = roi;
		this.emi = emi;
		this.status = status;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public long getAccId() {
		return accId;
	}
	public void setAccId(long accId) {
		this.accId = accId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double ammount) {
		this.amount = ammount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double calculateEmi()
	{
		double interest=(amount*tenure*roi)/(12*100);
		System.out.println("the total interest on this loan: "+interest);
		emi=(amount+interest)/tenure;
		return emi;
	}
}

