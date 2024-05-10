package com.cetpa;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements FourWheelEngine {
	public void startEngine() {
		  System.out.println("Petrol engine started");
	  }
}   
