package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nt.Banking;

@DisplayName("Banking Class Testing With Possible Credentials :")

public class BankingTest
{

	public static Banking bank;
	
	@BeforeAll
	public static void before() {
		bank =new Banking();
		
	}
	@Test
	public void TestWithBigNumber() {
		double expected=90000;
		
		double actual = bank.CalculateSimpleIntrest(900000, 20, 0.5);
		assertEquals(expected, actual);
		
	}
	@DisplayName("sanuPelandu")
	
	@Test
	public void TestWithSmallNumber() {
		double expected=600;
		
		double actual = bank.CalculateSimpleIntrest(12000, 10, 0.5);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void TestWithZeroValue() {
		
		
		assertThrows( IllegalArgumentException.class, ()-> {bank.CalculateSimpleIntrest(0, 0, 0); } );
		
	}
	
	@Test
	public void Timeout() {
		assertTimeout(Duration.ofMillis(3), ()->{bank.CalculateSimpleIntrest(302022333.0098877767899, 90, 0.290);});
	}
	
	
	
	@Test
	public void isPalendromeCheckWithValidCredential() 
	{
		assertTrue(bank.isPalendrome("madam"));
		
	}
	
	@Test
	public void isPalendromeTestWrongCredintials() {
	
		assertFalse(bank.isPalendrome("madam1"));
		
	}
	
	public void isPalendromeTestWithInvalidCrenditials() {
		assertThrows(IllegalArgumentException.class, ()->{bank.isPalendrome("");});
	}
	
	@Test
	public void testshowsysdateonweekdays() {
		
		LocalDate ldt = LocalDate.now();
	LocalDate ldt1	=bank.isWeekDay(ldt);
		assertNotNull(ldt1);
		
	}
	@Test
	public void testshowsysdateonweekend() {
		LocalDate ll = LocalDate.now();
		ll=ll.plusDays(3);
		        LocalDate ll1=bank.isWeekDay(ll);
		assertNull(ll1);
	}
	
	public void teardown() {
		bank=null;
	}
	
}
