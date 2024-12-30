package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import com.entity.user;

public class UserDao {
	

//	public Connection  getConnection()throws SQLException, ClassNotFoundException{
//		Connection con=null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");  
//			con=DriverManager.getConnection(  
//					"jdbc:mysql://localhost:3306/UserManagement?characterEncoding=UTF-8","root","Aravind@14IT");  
//
//		}catch(SQLException e) {
//			System.out.println(e);
//		}
//		return con;
//
//	}

	
	public Connection getConnection()throws SQLException, ClassNotFoundException{

	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/usermanagement?characterEncoding=UTF-8","root","Aravind@14IT");

	System.out.println("Connection done");
//	
//	Statement stmt=con.createStatement();  
//	ResultSet rs=stmt.executeQuery("select * from users");  
//	
//	while(rs.next())  {
//	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)); 		
//	}
	
	return con;

	}


	/*
	 * public static void main(String[] args) throws ClassNotFoundException,
	 * SQLException { UserDao obj = new UserDao(); obj.getConnection(); }
	 */
	
	public List<user> listuser() throws ClassNotFoundException{
		List<user> users = new ArrayList<user>();
		
		try {
			Connection con = getConnection();
			PreparedStatement preparedStatement = con.prepareStatement("select * from users");
			//System.out.println(preparedStatement);

			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("username");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String city=rs.getString("city");

				user u=new user();
				u.setId(id);
				u.setUserName(name);
				u.setAge(age);
				u.setCity(city);
				u.setMail(email);
				users.add(u);

			}
		}catch(SQLException e) {
			printSQLException(e);
		}
		System.out.println(users.get(0).getUserName());
		return users;
	}	
	

	
	
	private void printSQLException(SQLException ex) {
		for (Throwable e: ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
	
public void createUser(user u) throws ClassNotFoundException  {
		
	try {
		Connection con = getConnection();
		PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO users" + "(username,email,age,city) VALUES"+ "(?,?,?,?);");
		
		preparedStatement.setString(1, u.getUserName());
		preparedStatement.setString(2, u.getMail());
		preparedStatement.setInt(3, u.getAge());
		preparedStatement.setString(4, u.getCity());
		
		System.out.println(preparedStatement);
		
		preparedStatement.execute();
		
		}catch(SQLException e) {
			printSQLException(e);
		}
	
}


public void deleteUser(int id) throws ClassNotFoundException {
	try {
		Connection con = getConnection();
		PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM users where id = ?");
		preparedStatement.setInt(1, id);
		preparedStatement.execute();


		
	}catch(SQLException e) {
		printSQLException(e);
	}

}


public user getUser(int id) throws ClassNotFoundException {
	
	user user = null;
	
	try {
		Connection con = getConnection();
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM users where id = ?");
		preparedStatement.setInt(1, id);
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next()) {
			
			int id2 = rs.getInt("id");
			String name = rs.getString("username");
			String email = rs.getString("email");
			int age = rs.getInt("age");
			String city=rs.getString("city");

			user=new user();
			
			user.setId(id2);
			user.setUserName(name);
			user.setAge(age);
			user.setCity(city);
			user.setMail(email);
		}
		
	}catch(SQLException e) {
		printSQLException(e);
	}
	return user;

}


public user updateUser(user user) throws ClassNotFoundException {
	
	
	user updateUser = null;
	try {
		Connection con = getConnection();
		PreparedStatement preparedStatement = con.prepareStatement("UPDATE users SET username=?, email=?, age=?, city=? WHERE id=?");
		preparedStatement.setString(1, user.getUserName());
		preparedStatement.setString(2, user.getMail());
		preparedStatement.setInt(3, user.getAge());
		preparedStatement.setString(4, user.getCity());
		preparedStatement.setInt(5, user.getId());

		
		preparedStatement.executeUpdate();		

	}catch(SQLException e) {
		printSQLException(e);
	}
	
	return updateUser;
	}

}

//		public Connection  getConnection()throws SQLException, ClassNotFoundException{
//			
//			Class.forName("com.mysql.jdbc.Driver");  
//			Connection con=DriverManager.getConnection(  
//			"jdbc:mysql://localhost:3306/UserManagement","root","arshadmysqlpassword");  
//			//here sonoo is database name, root is username and password  
//			Statement stmt=con.createStatement();  
//			ResultSet rs=stmt.executeQuery("select * from Users");  
//			while(rs.next()){ 
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)); 
//
//		}
//			return con;
//			
//		}

