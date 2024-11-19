package com.nt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectEmp01 {

	private static  Logger logger = LoggerFactory.getLogger(SelectEmp01.class);
	
	private static String INSTANCE_EMP="SELECT EID,LOC,DEPT,S_NAME FROM EMPLOYEE";
	
	//private static String Driver="oracle.jdbc.driver.OracleDriver";
	
	private static String url="jdbc:oracle:thin:@localhost:1521:orcl";
	
	private static String username="system";
	
	private static String password="tiger";
	
	public static void main(String[] args)throws Exception 
	{    
            
		logger.debug("Main Method Starts :");
		
		try(Connection con = DriverManager.getConnection(url,username,password);
				PreparedStatement ps = con.prepareStatement(INSTANCE_EMP)
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
			logger.warn("Known Exception :"+se.getMessage());
			se.printStackTrace();
		}catch(Exception e) {
			logger.error("UnKnown Exception :"+e.getMessage());
			e.printStackTrace();
		}
	}

}
