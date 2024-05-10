package com.cetpa;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        HondaCar car=(HondaCar)context.getBean("c1");
//        car.turnEngineOn();
    	
        Resource resource = new ClassPathResource("beans.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	HondaCar car = (HondaCar)factory.getBean("c1");
    	
    
    
    }
}
