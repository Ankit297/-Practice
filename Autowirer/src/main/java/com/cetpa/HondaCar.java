package com.cetpa;
public class HondaCar 
{
	//object of FourWheelerEngine is dependency of object of HondaCar
	private FourWheelEngine engine;
	public HondaCar()
	{
		System.out.println("Car is created using default constructor...");
	}
	public HondaCar(FourWheelEngine Ankit)
	{
		System.out.println("Car is created using parameterized constructor...");
		System.out.println("Engine is injected by invoking parameterized constructor...");
		this.engine=Ankit;
	}
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
