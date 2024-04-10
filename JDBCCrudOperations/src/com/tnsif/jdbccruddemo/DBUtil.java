package com.tnsif.jdbccruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Load and register the driver
 • Establish a connection to the database server
 */
public class DBUtil {

	private static Connection cn;
	private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	private static final String DB_Url = "jdbc:mysql://localhost:3306/test";
	private static final String DB_User = "root";
	private static final String DB_Password = "Sanavi@05";

	public static Connection getConnection() {

		try {
			// step 1-forName
			Class.forName(DB_Driver);
			System.out.println("Driver is loaded successfully...");
			// step 2-getConnection

			cn = DriverManager.getConnection(DB_Url, DB_User, DB_Password);

			System.out.println("Connection is established...");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB not found" + e.getMessage());
		}
		return cn;
	}

}
