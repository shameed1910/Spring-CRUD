package com.springboot;

import java.sql.*;

 class MysqlCon{
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootdb", "root", "admin");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			System.out.println("Made database connection");
			/*
			 * ResultSet rs=stmt.executeQuery("select * from user");
			 * while(rs.next()) System.out.println(rs.getInt(1)+"  "
			 * +rs.getString(2)+"  "+rs.getString(3));
			 */
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}