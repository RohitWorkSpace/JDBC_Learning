package com.jdbc.sel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("step 1");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		System.out.println("step 2");
		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			String name1 = rs.getString("name");
			System.out.println(name1);

			String email1 = rs.getString("email");
			System.out.println(email1);

			String password1 = rs.getString("password");
			System.out.println(password1);

			String gender1 = rs.getString("gender");
			System.out.println(gender1);

			String city1 = rs.getString("city");
			System.out.println(city1);

		}
		con.close();
	}

}
