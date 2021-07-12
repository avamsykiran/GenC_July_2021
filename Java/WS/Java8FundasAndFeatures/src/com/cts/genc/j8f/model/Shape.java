package com.cts.genc.j8f.model;

public interface Shape {
	public abstract double area();

	public abstract double perimeter();

	public static Shape greaterOf(Shape s1, Shape s2) {
		return s1.area() > s2.area() ? s1 : s2;
	}

	public default double estimatePainitngCost(double paintingRate) {
		return area() * paintingRate;
	}

}