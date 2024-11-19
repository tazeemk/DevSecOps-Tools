package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class DateAndTime extends HttpServlet
{

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		pw.print("<h1>Date And Time is ::"+new DateAndTime()+"</h1>");

		pw.print("<br><a href='index.html'>home</a>");
		
		pw.close();
		
		
	}
	
	
}
