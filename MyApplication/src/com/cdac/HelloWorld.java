package com.cdac;

import java.time.LocalTime;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Date d = new Date();
		System.out.println(d);
		LocalTime t = LocalTime.now();
		System.out.println(t);
	}
}
