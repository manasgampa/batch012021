package com.antra2;

public class Calculator {

	public synchronized void mul(int i) {
		
		for(int j=0;j<=5;j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		}
	}
}
