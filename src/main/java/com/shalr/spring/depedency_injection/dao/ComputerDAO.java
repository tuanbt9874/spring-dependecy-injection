package com.shalr.spring.depedency_injection.dao;

import java.sql.SQLException;

import com.shalr.spring.depedency_injection.dto.Computer;

public interface ComputerDAO  {
	boolean insertComputer(Computer computer) throws ClassNotFoundException, SQLException;
}
