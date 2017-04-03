package com.pmurmor.eurovision.domain;

import java.sql.*;
import java.util.*;

public class Database {
	public static void main(String[] args)
	{
		try{	
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		    Connection conn = null;
		    Properties connectionProps = new Properties();
		    connectionProps.put("user", "pmurcia");
		    connectionProps.put("password", "asdf");
		    
			conn = DriverManager.getConnection(
			        "jdbc:derby:testdb;create=true",
			        connectionProps);
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
