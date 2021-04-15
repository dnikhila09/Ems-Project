package com.valuemomentum.team2.quickrecords;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	public static Connection conn=null;
	
	public static Connection getConnection(){

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quickrecords", "root", "Dpinky@09");

			if (conn != null) {
				System.out.println("  ");
			}
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
		}


}
