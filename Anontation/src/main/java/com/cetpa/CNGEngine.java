package com.cetpa;

import org.springframework.stereotype.Component;

@Component
public class CNGEngine implements FourWheelEngine {
	public void startEngine() {
		  System.out.println("CNG engine started");
	  }
}
