package com.pecunia.bs.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class LoanRePayment 
{
     @Id
     @Column(name="loanpay_id")
     int loanPayId;
     @OneToOne
     @JoinColumn(name="sanction_load_id")
     SanctionedLoans sanctionedLoan;
	public LoanRePayment(int loanPayId, SanctionedLoans sanctionedLoan) 
	{
		this.loanPayId = loanPayId;
		this.sanctionedLoan = sanctionedLoan;
	}
	public int getLoanPayId() {
		return loanPayId;
	}
	public void setLoanPayId(int loanPayId) {
		this.loanPayId = loanPayId;
	}
	public SanctionedLoans getSanctionedLoan() {
		return sanctionedLoan;
	}
	public void setSanctionedLoan(SanctionedLoans sanctionedLoan) {
		this.sanctionedLoan = sanctionedLoan;
	}
     
}
