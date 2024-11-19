package com.nt.Commons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {	
    @Test
    public void testWithPositive() {
    	//creating service class Object
    	ArthimeticOperation ar = new ArthimeticOperation();
    	
    	int expected = 110;
    	
    	int actual = ar.sum(20, 90);
  
   //Performing testing
    	assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNegative() 
    {
    ArthimeticOperation ar = new ArthimeticOperation();
    int expected = -30;
    	
    int actual = ar.sum(-10, -20);
    assertEquals(expected, actual);
    }
    
    @Test
    public void testWithMixedValue() {
    	ArthimeticOperation ar = new ArthimeticOperation();
    	int expected = 10;
    	int actual= ar.sum(10, -20);
    	assertEquals(expected, actual);		
    	
    }
    @Test
    public void testWithZero() {
    	ArthimeticOperation ar = new ArthimeticOperation();
    	int expected = 0;
    	
    	int actual=ar.sum(0, 0);
    	assertEquals(expected , actual);
    }
    
    
}
