package com.cg.anurag.ls.dto;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="loan_repayment")
public class LoanRepayment
{
	@Column(name="customer_id")
	int custId;
	long emiNo;
	Date paymentDate;
	public LoanRepayment() {}
	public LoanRepayment(int custId, long emiNo, Date paymentDate) {
		super();
		this.custId = custId;
		this.emiNo = emiNo;
		this.paymentDate = paymentDate;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public long getEmiNo() {
		return emiNo;
	}
	public void setEmiNo(long emiNo) {
		this.emiNo = emiNo;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	

}
