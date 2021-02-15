package com.antra2;

public class B {
	
	public synchronized void bar(A a) {
		
		System.out.println("in B class bar method");
		a.last();
	}

	public synchronized void last() {
		System.out.println("in B class last method");
	}
}
