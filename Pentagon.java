package com.java.Abstraction;

public class Pentagon extends Shape {
	private double side;
	public Pentagon(double side) {
		this.side=side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (5*side*side);
	}

	
}
