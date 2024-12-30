package com.servlet;

import java.io.IOException;


import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import javax.mail.Session;
import javax.mail.Transport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.mail.Message;


import org.apache.catalina.User;

import com.dao.UserDao;
import com.entity.user;

@WebServlet("/")

public class UserListServlet extends HttpServlet {
	
private UserDao userdao;
	
	public void init() {
		userdao=new UserDao();
	}
	
		protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException
		{
			doGet(request,response);
		}
		protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException
		{
			String action = request.getServletPath();
			System.out.println(action);
			
			try {
				
			switch(action)
			{
			case "/new":
				showNewForm(request,response);
				break;
				
			case "/insert":
				insertUser(request,response);
				break;
				
			case "/update":
				updateUser(request,response);
			break;
			
			case "/edit":
				showEditForm(request,response);
				break;
				
			case "/delete":
				deleteUser(request,response);
				break;
				
			default:
				listUser(request,response);
				break;
			}
			}
			catch(Exception e) {
				System.out.println(e+"error");
			}
						
		}
		private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println("show newForm");
			RequestDispatcher dispatch = request.getRequestDispatcher("form.jsp");
			dispatch.forward(request, response);
			
		}
		
		
		private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, IOException  {
			// TODO Auto-generated method stub
			System.out.println("update profile");
			String name = request.getParameter("username");
			String email = request.getParameter("mail");
			int age = Integer.parseInt(request.getParameter("age"));
			String city=request.getParameter("city");
			int id = Integer.parseInt(request.getParameter("id"));


			user user=new user();

			user.setUserName(name);
			user.setAge(age);
			user.setCity(city);
			user.setMail(email);
			user.setId(id);
			//users.add(u);			

			userdao.updateUser(user);
			
			response.sendRedirect("list");

		}
		private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, IOException, ServletException {
			// TODO Auto-generated method stub
			System.out.println("EDIT Profile");
			
			int id = Integer.parseInt(request.getParameter("id"));
			user u = userdao.getUser(id);
			request.setAttribute("user", u);
			RequestDispatcher dispatch = request.getRequestDispatcher("form.jsp");
			dispatch.forward(request, response);
			
			
		
			
		}
		private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, IOException {
			// TODO Auto-generated method stub
			System.out.println("delete method");
			
			int id = Integer.parseInt(request.getParameter("id"));
			userdao.deleteUser(id);
			response.sendRedirect("list");

			
			
			
		
		}
		private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, IOException {
			// TODO Auto-generated method stub
			System.out.println("insert profile");
				
			
			String name = request.getParameter("username");
			String email = request.getParameter("mail");
			int age = Integer.parseInt(request.getParameter("age"));
			String city=request.getParameter("city");

			user user=new user();

			user.setUserName(name);
			user.setAge(age);
			user.setCity(city);
			user.setMail(email);
			//users.add(u);			

			userdao.createUser(user);
			sendMail(email);

			
			response.sendRedirect("list");

		}
		
		
		public void sendMail(String toMailId) {
			
			  String host="localhost";
			  final String user="aravind14ferdi@gmail.com";//change accordingly  
			  final String password="duqqqujviutnfmdz";//change accordingly  
			    
			  String to=toMailId.trim();//change accordingly  
			  System.out.println("111222");
			   //Get the session object  
			  Properties properties = new Properties();
		        properties.put("mail.smtp.host", "smtp.gmail.com");
		        properties.put("mail.smtp.port", "587");
		        properties.put("mail.smtp.auth", "true");
		        properties.put("mail.smtp.starttls.enable", "true");
		        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
		        properties.setProperty("mail.smtp.ssl.ciphers", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

		        // creates a new session with an authenticator
		        Authenticator auth = new Authenticator() {
		            public PasswordAuthentication getPasswordAuthentication() {
		                return new PasswordAuthentication(user, password);
		            }
		        };
		 
		        Session session = Session.getInstance(properties, auth);
		 
		        // creates a new e-mail message
		      
		        try{
		        	Message msg = new MimeMessage(session);
		        
		 
		        msg.setFrom(new InternetAddress(user));
		        InternetAddress[] toAddresses = { new InternetAddress(to) };
		        msg.setRecipients(Message.RecipientType.TO, toAddresses);
		        msg.setSubject("Welcome to User Management System ");
		        msg.setSentDate(new Date());
		        msg.setText("You have successfully  Registered ");
		        System.setProperty("https.protocols", "TLSv1.2");

		        
		        System.setProperty("https.cipherSuites", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

		        // sends the e-mail
		        Transport.send(msg);
	        	System.out.println("Sent done");

		        }catch(Exception e) {
		        	System.out.println("Exception"+e.getMessage());
		        	System.out.println(e);
		        }
			 } 
		
		
		
		
		
		
		private void listUser(HttpServletRequest request,HttpServletResponse response) throws ClassNotFoundException, ServletException, IOException {
			List<user> userList= userdao.listuser();
			
			request.setAttribute("users", userList);
			RequestDispatcher dispatch=request.getRequestDispatcher("list.jsp");
			dispatch.forward(request, response);
						
		}
	
}

		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
//	try{ 
//		Class.forName("com.mysql.jdbc.Driver");  
//		Connection con=DriverManager.getConnection(  
//		"jdbc:mysql://localhost:3306/usermanagement?characterEncoding=UTF-8","root","Aravind@14IT");
//
//		System.out.println("Connection done");
//		
//		Statement stmt=con.createStatement();  
//		ResultSet rs=stmt.executeQuery("select * from users");  
//		
//		while(rs.next())  
//		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
//		con.close();  
//		}
//		catch(Exception e){ 
//			System.out.println("error");
//			System.out.println(e);
//			
//		}  
//
//		}  
//		}  




	

