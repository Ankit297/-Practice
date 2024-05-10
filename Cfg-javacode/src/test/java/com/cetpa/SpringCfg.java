package com.cetpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class SpringCfg {
	
	@Bean(name="a1")
    public AA getAA() {
    	
    	return  new AA();
    }

	
	@Bean(name="b1")
    public BB getBB() {
    	
    	return  new BB();
    }
}
