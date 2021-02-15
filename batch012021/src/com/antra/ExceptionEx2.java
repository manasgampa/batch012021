package com.antra;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		doStuff();
	}
	
	public static void doStuff() {
		doMoreStuff();
	}
	
	public static void doMoreStuff() {
		System.out.println(1/0);
	}
}
