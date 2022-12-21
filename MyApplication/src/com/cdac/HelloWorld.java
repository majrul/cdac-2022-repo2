package com.cdac;

import java.time.LocalTime;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Runtime r = Runtime.getRuntime();
		System.out.println(r.freeMemory());
		LocalTime t = LocalTime.now();
		System.out.println(t);
	}
}
