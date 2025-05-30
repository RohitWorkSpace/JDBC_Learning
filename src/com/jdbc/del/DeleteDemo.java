package com.jdbc.del;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String email1="rohitdummy@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("step 1");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("step 2");
		PreparedStatement ps = con.prepareStatement("delete from register where email=?");
		ps.setString(1, email1);
		
		int count = ps.executeUpdate();
		if(count>0) {
			System.out.println("deleted successfully");
		}else {
			System.out.println("deletion fail");
		}
		ps.close();
	}

}
