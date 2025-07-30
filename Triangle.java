package com.java.Abstraction;

public class Triangle extends Shape{
	private double breadth;
	private double height;
	public Triangle(double breadth,double height) {
	
		this.breadth=breadth;
		this.height=height;
		
	}

	@Override
	public double area() {
		return 0.5*breadth*height;
	}

}
