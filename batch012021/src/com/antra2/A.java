package com.antra2;

public class A {
	
	public synchronized void foo(B b) {
		
		System.out.println("in A class foo method");
		b.last();
	} 

	public synchronized void last() {
		System.out.println("in A class last method");
	}
}
