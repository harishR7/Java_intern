package com.example.Connection;

import java.sql.*;
import java.util.ResourceBundle;
public class ConnectFactory {
	
	public static Connection  connetSqlDatabase() {
		
		
		Connection con=null;
		try {
			ResourceBundle labels=ResourceBundle.getBundle("application");
			 con=DriverManager.getConnection(
					labels.getString("datasource.oracle.url"),
					labels.getString("datasource.oracle.username"),
					labels.getString("datasource.oracle.password"));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
}
