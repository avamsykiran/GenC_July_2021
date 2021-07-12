package com.cts.genc.j8f.ui;

import java.time.LocalDateTime;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import com.cts.genc.j8f.service.Greet;

public class LambdaDemo {
	public static void main(String a[]) {
		
		Greet g1 = (unm) -> "Hello "+ unm;
		System.out.println(g1.doGreet("Vamsy"));
		
		Greet g2 = (unm) -> {
			String greeting = "";
		
			int h = LocalDateTime.now().getHour();
			
			if(h>=3 && h<12) greeting = "Good Morning ";
			else if(h>=12 && h<=16) greeting = "Good Noon ";
			else greeting = "Good Evening";
			
			return greeting + unm;
		};
		System.out.println(g2.doGreet("Vamsy"));
		
		Consumer<String> c1 = System.out::println;		
		c1.accept("Hello this is a string ");
		
		BinaryOperator<Double> bo1 = Math::pow;
		System.out.println(bo1.apply(12.0, 3.0));
	}
}
