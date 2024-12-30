package com.uniquedevelepor.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		String reupwd = request.getParameter("re_pass");
		String umobile = request.getParameter("contact");
		RequestDispatcher dispatcher = null;
		Connection con = null;
		
		if(uname==null || uname.equals("")) { 
			request.setAttribute("status", "invalidName");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response); // to direct to the index.jsp page
		}
		
		if(uemail==null || uemail.equals("")) { 
			request.setAttribute("status", "invalidEmail");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response); // to direct to the index.jsp page
		}
		
		if(upwd==null || upwd.equals("")) { 
			request.setAttribute("status", "invalidUpwd");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response); // to direct to the index.jsp page
		}else if(!upwd.equals(reupwd)) {
			request.setAttribute("status", "invalidConfirmPassword");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response); // to direct to the index.jsp page
		}
		
		if(umobile==null || umobile.equals("")) { 
			request.setAttribute("status", "invalidNumber");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response); // to direct to the index.jsp page
		}
		
		else if (umobile.length()>10) {
			request.setAttribute("status", "invalidNumberLength");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		
		
//		PrintWriter out = response.getWriter();
//		out.print(uname);
//		out.print(email);
//		out.print(upwd);
//		out.print(umobile);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aravinddb?useSSL=false", "root", "Aravind@14IT"); //connecting to sql database//two roots is uname and pwd
			PreparedStatement pst = con.prepareStatement("insert into userss(uname,upwd,uemail,umobile)values(?,?,?,?)");
			pst.setString(1, uname);
			pst.setString(2, upwd);
			pst.setString(3, uemail);
			pst.setString(4, umobile);
			
			int rowCount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("registration.jsp");

			
			if(rowCount>0) {
				request.setAttribute("status", "success");
			}
			else {
				request.setAttribute("status", "failed");

			}
			dispatcher.forward(request, response);

		}catch (Exception e){
			e.printStackTrace();
			
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
