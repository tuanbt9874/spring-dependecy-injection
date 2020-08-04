package com.shalr.spring.depedency_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shalr.spring.depedency_injection.dao.ComputerDAO;
import com.shalr.spring.depedency_injection.dao.ComputerDAOImpl;
import com.shalr.spring.depedency_injection.dao.Dao;
import com.shalr.spring.depedency_injection.dao.GennericComputerDAOImpl;
import com.shalr.spring.depedency_injection.dto.Computer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
    	try {
    		ComputerDAOImpl computerDAO = (ComputerDAOImpl) context.getBean("computerDAO");
    		boolean result = computerDAO.insertComputer(new Computer("Apple-spring2022", "Apple", "Gray", 13, false));
    		System.out.println(result ? "Insert successful !!!" : "Fail to insert !!!");
    	} catch (Exception e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext) context).close();
			((AbstractApplicationContext) context).registerShutdownHook(); 
		}
    		
    }
}
