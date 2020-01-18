package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet
{
	private PrintWriter out=null;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		
		out=resp.getWriter();
		int a=Integer.parseInt(req.getParameter("numb"));
		if(a>=0)
			out.println("<h1>number is positive </h1>");
		else
		out.println("<h1>number is Negative</h1>");	
	}

}
