package com.shalr.spring.depedency_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
    		Dao<Computer> computerDAO = (GennericComputerDAOImpl) context.getBean("computerDAO");
    		boolean result = computerDAO.insert(new Computer("DELL-spring2021s", "Assus", "Gray", 12.5, true));
    		System.out.println(result ? "Insert successful !!!" : "Fail to insert !!!");
    	} catch (Exception e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext) context).close();
			((AbstractApplicationContext) context).registerShutdownHook(); 
		}
    		
    }
}
