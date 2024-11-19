package com.nt;

import java.sql.Date;
import java.time.LocalDate;

public class Banking 
{

	public double CalculateSimpleIntrest(double pAmount,double intrestRate ,double time) {
		if(pAmount<0||intrestRate<=0||time<=0) {
			throw new IllegalArgumentException("Invalid Input :");
		}
		else
			return (pAmount*intrestRate*time)/100;
				
	}
	
	public boolean isPalendrome(String input) {
		
		if(input==null||input.equalsIgnoreCase("")) {
			throw new IllegalArgumentException("Invalid Input");
			}
		
		String rev =  new StringBuffer(input).reverse().toString();
		if(input.equalsIgnoreCase(rev)) {
		return true;
		}else
		{
			return false;
		}
		}
	
	
	public LocalDate isWeekDay(LocalDate idt) {
	
		int day = idt.getDayOfWeek().getValue();
		if(day==5||day==6)
		return null;
		else
			return idt;
	}
	
}
