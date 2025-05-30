package como.jdbc.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		
		String name1="rohitdummy";
		String email1="rohitdummy@gmail.com";
		String password="rohitdummy@13";
		String gender="dummy3";
		String city1="mumbai3";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("step 1");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("step 2");
//		PreparedStatement ps= con.prepareStatement("insert into register values('"+name1+"','"+email1+"','"+password+"','"+gender+"','"+city1+"')");  this is confusing then we've anothe one
		PreparedStatement ps= con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, city1);
		
		int i= ps.executeUpdate();
		if(i>0) {
			System.out.println("data inserted successfully");
		}else {
			System.out.println("fail");
		}
	}

}
