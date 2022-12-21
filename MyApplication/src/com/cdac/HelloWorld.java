package com.cdac;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Runtime r = Runtime.getRuntime();
		System.out.println(r.freeMemory());
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalTime t = LocalTime.now();
		System.out.println(t);
	}
}
