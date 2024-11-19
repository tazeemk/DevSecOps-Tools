package com.nt;
import java.time.LocalDate;

public class Banking 
{

	public double isCalculate(double pAmount,double intrestRate ,double time) {
	
			return pAmount<0||intrestRate<=0||time<=0? 00.00 :(pAmount*intrestRate*time)/100;
				
	}
	
	public boolean isPalendrome(String input) {
		
		if(input==null||input.equalsIgnoreCase("")) {
			throw new IllegalArgumentException("Invalid Input");
			}
		
		String rev =  new StringBuffer(input).reverse().toString();
		
			return input.equalsIgnoreCase(rev);
		
	}
	
	public LocalDate isWeekDay(LocalDate idt) {
	
		int day = idt.getDayOfWeek().getValue();
			return (day==5|| day==6)?null: idt;
	}
	
}
