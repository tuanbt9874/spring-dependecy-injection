package com.shalr.spring.depedency_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shalr.spring.depedency_injection.dao.ComputerDAOImpl;
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
    	ComputerDAOImpl computerDAO = (ComputerDAOImpl) context.getBean("computerDAO");
    	try {
    		computerDAO.insertComputer(new Computer("DELL-spring2020", "DELL", "Black", 12.5, true));
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    
    	
    	
    }
}
