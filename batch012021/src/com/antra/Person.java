package com.antra;

public class Person {
	
	int person_id=45;
	static int person_age=1; 
	public void p_m1() {
		int i=10;
		
		System.out.println("in instance method person class:"+person_id);
	}
	
	public static void m2() {
		System.out.println("in static method m2:"+person_age);
	}

}
