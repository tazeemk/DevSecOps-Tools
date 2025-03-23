package nit.JUnitProj01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static Palendrome palen;
	
	@BeforeAll
	public static void beforeAll() 
    {
		palen = new Palendrome();
	}
	
    @Test
    public void palendromeTestWithValidInput() {
        assertTrue(palen.isPalendrome("madam"));
    }
    
    @Test
    public void palendromeTestWithInValidInput() {
    	assertFalse(palen.isPalendrome("madam1"));
    }
    @Test
    public void palendromeTestWithNoInput() {
    	assertThrows(IllegalArgumentException.class ,()->palen.isPalendrome(""));
    }
    
    
    @Test
    public void testsumwithValidInput() 
    {
     int actual = palen.sum(22, 88);
     int expected = 110;
     assertEquals(actual, expected);
    	
    }
    
    
    
    @AfterAll
    public static void afterAll() {
    	palen=null;
    }
    
    
}
