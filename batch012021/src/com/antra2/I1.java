package com.antra2;

public interface I1 {
	
	public void m1();
	public void m5();
	
	public default void m2() {
		System.out.println("in m2 method");
	} 
	
	public default void m3() {
		System.out.println("in m3 method");
	}
	
	public static void m4() {
		System.out.println("in static m4 methods");
	}

}
