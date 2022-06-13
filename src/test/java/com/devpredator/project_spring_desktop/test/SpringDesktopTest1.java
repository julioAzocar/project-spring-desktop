package com.devpredator.project_spring_desktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devpredator.project_spring_desktop.dao.DisqueraDAO;

class SpringDesktopTest1 {

//	clase que permite realizar pruebas con framework spring
	
	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		DisqueraDAO disqueraDAO2 = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO2);
		
		System.out.println("Contexto spring cargado correctamente.");
		System.out.println(disqueraDAO);
		System.out.println(disqueraDAO2);
		
		//bean de properties de la aplicacion
		Properties properties =(Properties) context.getBean("properties"); // java.util.Properties;
		System.out.println(properties.getProperty("spring-username"));
		
	}

}
