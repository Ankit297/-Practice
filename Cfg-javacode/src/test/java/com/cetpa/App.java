package com.cetpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args)
    {
                ApplicationContext context = new AnnotationConfigApplicationContext(SpringCfg.class);
           BB aa= (BB)context.getBean("b1");
           aa.Show();
    	
//        Resource resource = new ClassPathResource("beans.xml");
//    	BeanFactory factory = new XmlBeanFactory(resource);
//    	HondaCar car = (HondaCar)factory.getBean("c1");
//    	
    
    
    }
}
