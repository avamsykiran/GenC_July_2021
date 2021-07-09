package com.cts.genc.j8f.ui;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime indDay = LocalDateTime.of(1947,Month.AUGUST,15,0,0);
		System.out.println(indDay);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		ZonedDateTime floridaNow = ZonedDateTime.now(ZoneId.of("GMT-4"));
		System.out.println(floridaNow);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm a");
		System.out.println(indDay.format(formatter));
		System.out.println(now.format(formatter));
		System.out.println(floridaNow.format(formatter));
		
		Period p = Period.between(indDay.toLocalDate(), now.toLocalDate());
		System.out.println(p);
		
		Duration d = Duration.between(indDay, now);
		System.out.println(d);
	}

}
