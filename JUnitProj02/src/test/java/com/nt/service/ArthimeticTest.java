package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.nt.Arithmetic;

public class ArthimeticTest 
{
private static Arithmetic ar ;
	 
	@BeforeAll
	public static void intiy() {
		
		ar = new Arithmetic();
	}
	
	
	@DisplayName("Devang Badhshah")
	@Test
	public void TestWithPostiveValue() 
	{
	   int expexted = 100;
	  int actual = ar.sum(10, 10);
	  assertEquals(expexted, actual);
	} 
	
	public void after() {
		System.out.println("TestWithPositiveValue");
	}
	@DisplayName("Sakib")
	@Test
	public void TestWithNegativeValue() 
	{
	   int expexted = 100;
	  int actual = ar.sum(-10, -10);
	  assertEquals(expexted, actual);
	} 
	
	@Test
	public void TestWithMixedValue() 
	{
	   int expexted = -200;
	  int actual = ar.sum(20, -10);
	  assertEquals(expexted, actual);
	} 
	
	@Test
	public void TestWithZero() 
	{
	   int expexted = 0;
	  int actual = ar.sum(0, 0);
	  assertEquals(expexted, actual);
	} 
	@BeforeAll
	public static void before() {
		ar=null;
	}
}
