package com.mail;
import java.util.Date;

import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
@WebServlet("/send")
public class MailApplication extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) {  
		    
//		  String host="localhost";  
		  final String user="aravind14ferdi@gmail.com";//change accordingly  
		  final String password="duqqqujviutnfmdz";//change accordingly  
		    
		  String to="sayee1999@gmail.com";//change accordingly  
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
	        msg.setSubject("JavaMail API Calling");
	        msg.setSentDate(new Date());
	        msg.setText("Hello sir ");
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
}
