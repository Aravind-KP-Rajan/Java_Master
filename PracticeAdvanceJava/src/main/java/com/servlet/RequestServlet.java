package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RequestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		/*
		 * String firstname = request.getParameter("fname"); 
		 * String lastname = request.getParameter("lname");
		 * int a = Integer.parseInt(firstname); 
		 * int b = Integer.parseInt(lastname);
		 * 
		 * System.out.println(firstname + lastname); //prints on server console
		 * System.out.println(a + b); //prints on server console
		 * 
		 * 
		 * PrintWriter out = response.getWriter(); 
		 * out.print(a + b);
		 */
		
		
		
//		String num1 = request.getParameter("fname"); //name is given here in parameter from html file
//		String num2 = request.getParameter("lname");
//		int a = Integer.parseInt(num1);
//		int b = Integer.parseInt(num2);
//		int c = a+b;
		
//		request.setAttribute("value", c);) 
//		RequestDispatcher dispatch = request.getRequestDispatcher("squareNum");
//		dispatch.forward(request, response);
		
		//storing in request is not secure and can't handle many data
		//so we are using HttpSession to handle multiple responses in multiple servlets
		
		String num1 = request.getParameter("num1"); //name is given here in parameter from html file
		String num2 = request.getParameter("num2");
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = a+b;
		
		//we are using HttpSession to handle multiple responses in multiple servlet
		
//
//		HttpSession session = request.getSession();
//		session.setAttribute("value", c);
//		RequestDispatcher dispatch = request.getRequestDispatcher("squareNum");
//		dispatch.forward(request, response);
		
//		String s = String.valueOf(c); 		//we can store only STRINGS in cookies 
//		Cookie n = new Cookie ("c", s); // c - key, s-value
//		response.addCookie(n);
//		response.sendRedirect("squareNum");
		
		//url rewruting below
		

		
		response.sendRedirect("squareNum?value=" + c);
		
		//servlet-config 
		
//		ServletConfig config = getServletConfig();
//		String names= config.getInitParameter("AR");
//		System.out.println(names);
		
	      ServletContext d=getServletContext();
	      String s=d.getInitParameter("aravind");
	      PrintWriter out=response.getWriter();
	      out.print("stored value is :"+s);

		
		
//		String ab = request.getParameter("num1");
//		String bc = request.getParameter("num2");
//		int one = Integer.parseInt(ab);
//		int two = Integer.parseInt(bc);
//		int three = one +two;
//		
//		
//		request.setAttribute("output",three);
//		RequestDispatcher dispatch = request.getRequestDispatcher("squareNum");
//		dispatch.forward(request, response);
		
	}
		
}



