package com.java.Abstraction;

public class MainShape {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(90.0d,80.0d);
		System.out.println("The Area of Rectangle is "+r.area());
		
		Square s=new Square(5.0d);
		System.out.println("Area of Square:"+ s.area());
		
		Triangle t=new Triangle(3.0d,4.0d);
		System.out.println("Area of Triangle:"+ t.area());
		
		Pentagon p=new Pentagon(3.0d);
		System.out.println("Area of Pentagon:"+p.area());
	}

}
