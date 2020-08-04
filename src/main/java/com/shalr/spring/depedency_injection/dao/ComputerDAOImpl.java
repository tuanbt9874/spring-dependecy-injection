package com.shalr.spring.depedency_injection.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shalr.spring.depedency_injection.connection.IConnection;
import com.shalr.spring.depedency_injection.dto.Computer;


public class ComputerDAOImpl implements ComputerDAO {
	
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
//	private ResultSet resultSet = null;
	private IConnection connectionDB = null;
	
	
	
	public ComputerDAOImpl() {
	}

	public ComputerDAOImpl(IConnection connectionDB) {
		this.connectionDB = connectionDB;
	}

	@Override
	public boolean insertComputer(Computer computer) throws ClassNotFoundException, SQLException {
		try {
		String query = "INSERT INTO computer (name, brandName, color, weight, isManufacture) VALUES (?,?,?,?,?)";
		connection = connectionDB.getConnection();
		
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, computer.getName());
		preparedStatement.setString(2, computer.getBrandName());
		preparedStatement.setString(3, computer.getColor());
		preparedStatement.setDouble(4, computer.getWeight());
		preparedStatement.setBoolean(5, computer.isManufacture());
		
		return preparedStatement.execute();	
		
		}finally{
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

}
