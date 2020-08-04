package com.shalr.spring.depedency_injection.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection implements IConnection {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=computerDB;user=sa;password=Jason199874");
		return connection;
	
	}

}
