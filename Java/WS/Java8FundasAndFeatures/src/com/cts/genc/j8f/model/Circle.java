package com.cts.genc.j8f.model;

public class Circle implements Shape{

	private int radius;
			
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Cirlce [radius=" + radius + "]";
	}

	
}
