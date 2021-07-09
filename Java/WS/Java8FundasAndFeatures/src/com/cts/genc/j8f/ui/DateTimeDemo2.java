package com.cts.genc.j8f.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter frm = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		System.out.print("DOB(yyyy-MM-dd)> ");
		String dobStr = scan.next();
		
		LocalDate dob = LocalDate.parse(dobStr, frm);
		
		final int retrimentAge = 60;
		
		LocalDate dor = dob.plusYears(retrimentAge);
		System.out.println(dor.format(frm));
		
		scan.close();
	}

}
