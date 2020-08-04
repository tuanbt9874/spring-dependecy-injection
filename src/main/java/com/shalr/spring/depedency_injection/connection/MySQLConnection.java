package com.shalr.spring.depedency_injection.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements IConnection{
	private String classPath;
	private String  url;
	private String user;
	private String password;
	
	public MySQLConnection() {
	}
	
	public String getClassPath() {
		return classPath;
	}

	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(classPath);
		Connection connection = DriverManager.getConnection(url,user, password);
		return connection;
	
	}

}
