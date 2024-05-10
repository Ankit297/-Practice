package com.cetpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


public class HondaCar 
{
	
	private FourWheelEngine engine;
	public HondaCar()
	{
		System.out.println("Car is created using default constructor...");
	}
	
	
	public HondaCar(FourWheelEngine engine)
	{
		System.out.println("Car is created using parameterized constructor...");
		System.out.println("Engine is injected by invoking parameterized constructor...");
		this.engine=engine;
	}
	@Autowired
	@Qualifier("CNGEngine")
	public void setEngine(FourWheelEngine engine)
	{
		System.out.println("Engine is injected by invoking setter method...");
		this.engine=engine;
	}
	public void turnEngineOn()
	{
		engine.startEngine();
	}
	
}
