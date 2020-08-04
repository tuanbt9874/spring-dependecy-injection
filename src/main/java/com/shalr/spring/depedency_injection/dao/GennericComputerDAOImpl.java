package com.shalr.spring.depedency_injection.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shalr.spring.depedency_injection.connection.IConnection;
import com.shalr.spring.depedency_injection.dto.Computer;

public class GennericComputerDAOImpl implements Dao<Computer>{
	
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private IConnection connectionDB = null;
	
	public GennericComputerDAOImpl() {
	}
	
	public GennericComputerDAOImpl(IConnection connectionDB) {
		super();
		this.connectionDB = connectionDB;
	}

	@Override
	public boolean insert(Computer computer) throws ClassNotFoundException, SQLException {
		boolean result = false;
		String query = "INSERT INTO computer (name, brandName, color, weight, isManufacture) VALUES (?,?,?,?,?)";
		
		try {
		connection = connectionDB.getConnection();
		
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, computer.getName());
		preparedStatement.setString(2, computer.getBrandName());
		preparedStatement.setString(3, computer.getColor());
		preparedStatement.setDouble(4, computer.getWeight());
		preparedStatement.setBoolean(5, computer.isManufacture());
		
		result = preparedStatement.executeUpdate() > 0;	
		
		}finally{
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
				}
			}
			return result;
		}
	}
