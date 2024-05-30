package com.mmt.generic.DBUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class DataBaseUtils {
	
	Connection con;
	
	public void getDbConnection() {
		
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
public ResultSet createQuery(String query) {
		ResultSet set =null;
		try {
			
		con=	DriverManager.getConnection(null, null, null);
			
		Statement stat=	con.createStatement();
		set =stat.executeQuery(query);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return set;
	}

public int UpadetQuery(String query) {
	int i =0;
	try {
		
	con=	DriverManager.getConnection(null, null, null);
		
	Statement stat=	con.createStatement();
	i =stat.executeUpdate(query);
	} catch (Exception e) {
		// TODO: handle exception
	}
	return i;
}

public void closeConnection()
{
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
