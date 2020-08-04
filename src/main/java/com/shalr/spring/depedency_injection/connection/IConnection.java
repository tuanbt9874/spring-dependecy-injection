package com.shalr.spring.depedency_injection.connection;
import java.sql.Connection;
import java.sql.SQLException;

public interface IConnection  {
	Connection getConnection()  throws ClassNotFoundException , SQLException;
}
