package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.nt.DAO.ILoginDao;
import com.nt.Service.ILoginSerive;
import com.nt.Service.LoginService;
public class AppTest {

	private static ILoginDao login;
	private static ILoginSerive service;
	
    @BeforeAll
	public static void inti() 
    {
    	//Creating Mock Object/Dummy Object
		login=Mockito.mock(ILoginDao.class);
		System.out.println("Mocking :"+login.getClass()+"......."+Arrays.toString(login.getClass().getInterfaces()));
	
		service =new LoginService(login);
    }
	
	@Test
    public void CheckingCredentialswithValidInput() {
        Mockito.when(login.authinticate("devang", "Badhshah")).thenReturn(1);
        String actual = service.login("devang", "Badhshah");
    	assertEquals("Valid Credentials", actual);
    }
    @Test
    @DisplayName("Devang")
    public void CheckingCredentialswithinValidInput() {
        Mockito.when(login.authinticate("devang1", "Badhshad")).thenReturn(0);
        String actual = service.login("devang", "Badhshah");
    	assertEquals("Invalid Credentials :", actual);
    }
    
    @Test
    public void CheckingCredentialswithNoInput() {
       
    	assertThrows(IllegalArgumentException.class, ()->{service.login(" ", " ");});
    }

           @Test
             public void TestUserRegister() 
           {
          
        	   service.RegisterUser("raja", "rani");
        	   service.RegisterUser("devang", "sunnyleone");
        	   service.RegisterUser("sahid", "");
        	   
        	    Mockito.verify(login, Mockito.times(1)).AddUser("raja", "rani");
        	    Mockito.verify(login, Mockito.times(1)).AddUser("devang", "sunnyleone");
        	    Mockito.verify(login, Mockito.times(1)).AddUser("sahid", "ss");
                
            }


        }


