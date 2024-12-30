package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SquareNum
 */
@WebServlet("/SquareNum")
public class SquareNumServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
//		String num1 = request.getParameter("num1"); //name is given here in parameter from html file
//		String num2 = request.getParameter("num2");
//		int a = Integer.parseInt(num1);
//		int b = Integer.parseInt(num2);
//		int c = a+b;
		

		
//		HttpSession session = request.getSession();
//		int d=(int) session.getAttribute("value"); "value" is the key
		//above we're doing narrow type casting because value comes in object data type
//					//(day1)int d=(int) request.getAttribute("value"); // this method is for request instead we use session mentioned above
//		PrintWriter out = response.getWriter(); // used to print in browser or client
//		out.print("Square of the given number "+ d + " is : " + d*d);
		
//		Cookie[] d = request.getCookies();
//		int num =0;
//		for(Cookie i:d) {
//			if(i.getName().equalsIgnoreCase("c")) //c-key
//			{
//				num=Integer.parseInt(i.getValue());
//			}
//		}
		
		
		int num = Integer.parseInt(request.getParameter("value"));
		PrintWriter out = response.getWriter();
		out.print("Square of the given number "+ num + " is : " + num*num);
		
	}
}
