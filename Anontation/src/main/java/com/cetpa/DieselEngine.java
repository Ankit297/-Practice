package com.cetpa;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements FourWheelEngine {
	public void startEngine() {
		  System.out.println("diesel engine started");
	  }
}
