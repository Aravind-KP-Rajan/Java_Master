package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multi")
public class MultiServlet extends HttpServlet{
	
	public void init() {
		System.out.println("init called");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//default is get method. if there is post method in HTML file here also post method should be used	
		System.out.println("multi called");
		
		
		  int a = Integer.parseInt(request.getParameter("num1"));
	      int b = Integer.parseInt(request.getParameter("num2"));
	      int c=a+b;
	      System.out.println(c);
	      
	      ServletContext d=getServletContext();
	      String s=d.getInitParameter("aravind");
	      PrintWriter out=response.getWriter();
	      out.print("stored value is :"+s);
		}
	}
