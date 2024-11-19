package com.nt.main;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectEmp {
	private static Properties props ;
	
	static {
		
		try(FileInputStream fis = new FileInputStream("src/main/java/log4j.properties");){
			//loading properties file
			props = new Properties();
			props.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	private static  Logger logger = LoggerFactory.getLogger(SelectEmp.class);
	
	private static  String INSTANCEEMP="SELECT EID,LOC,DEPT,S_NAME FROM EMPLOYEE";
		
	private static String url="jdbc:oracle:thin:@localhost:1521:orcl";
	

	
	public static void main(String[] args)throws Exception 
	{    
            
		logger.debug("Main Method Starts :");
		
		try(Connection con = DriverManager.getConnection(url,props.getProperty("db.username"),props.getProperty("db.password"));
				PreparedStatement ps = con.prepareStatement(INSTANCEEMP)
			){
			      logger.info("Jdbc Connections Happens Here :");
			      logger.debug("Perform Select Operations :");
			      logger.info("PreparedStatement Object is Created :");
			      logger.info("Result Object Is not Closed :");
	             ResultSet rs = ps.executeQuery();
	             while(rs.next()) {
	            	System.out.print( rs.getInt(1)+" ");
	            	 System.out.print(rs.getString(2)+" ");
	            	 System.out.print(rs.getString(3)+" ");
	            	 System.out.print(rs.getString(4)+" ");
	            	  System.out.println();
	            	 }
		
			
			
		}catch(SQLException se) {	
			logger.warn("Known Exception:{}",se.getMessage());
			se.printStackTrace();
		}catch(Exception e) {
			logger.error("UnKnown Exception ::{}",e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	
	
}
