package com.cts.genc.j8f.ui;

import com.cts.genc.j8f.model.Circle;
import com.cts.genc.j8f.model.Rectangle;
import com.cts.genc.j8f.model.Shape;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10, 10);
		Shape s2 = new Circle(10);
		
		System.out.println(Shape.greaterOf(s1, s2));
		System.out.println(s1.estimatePainitngCost(12.0));
		System.out.println(s2.estimatePainitngCost(12.0));

	}

}
