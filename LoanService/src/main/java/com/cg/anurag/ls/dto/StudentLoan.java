package com.cg.anurag.ls.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="loan_request")
public class StudentLoan extends Loan
{
	@Column(name="percentage")
	double percentage;
	@Column(name="course")
	String course;
	public StudentLoan() { }
	public StudentLoan(double percentage, String course) 
	{
		this.percentage = percentage;
		this.course = course;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}	
}
