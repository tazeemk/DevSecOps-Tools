package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/date")
public class DevangServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter pw =resp.getWriter();
		//pw.format("text/html");
		pw.print("Welcome TO DevangHub :");
		pw.print(new Date());
		pw.print("<br>" + " hello Gautam ");
		
		pw.print("<a href ='index.jsp'>click here to return home page" );
		
	}
}
