package com.shalr.spring.depedency_injection.dao;

import java.sql.SQLException;

public interface Dao <T>{
	boolean insert (T t) throws ClassNotFoundException, SQLException;
}
