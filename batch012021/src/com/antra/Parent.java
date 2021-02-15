package com.antra;

public class Parent {

	int p_id=45;
	
	public void p_m1() {
		System.out.println("in parent m1 method:"+p_id);
	}
	
	public void p_m1(int i) {
		System.out.println("in parent m1 of int parameter");
	}
	
	public void commonMethod() {
		System.out.println("in common method of parent");
	}
	
}
