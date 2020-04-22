package com.cg.anurag.ls.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class HomeLoan extends Loan
{
	@Column(name="property_value")
	double propertyValue;
    public HomeLoan() { }
	public HomeLoan(double propertyValue) 
	{
		this.propertyValue = propertyValue;
	}
	public double getPropertyValue() 
	{
		return propertyValue;
	}
	public void setPropertyValue(double propertyValue)
	{
		this.propertyValue = propertyValue;
	}
}
