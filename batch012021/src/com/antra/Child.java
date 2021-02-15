package com.antra;

public class Child extends Parent{

	int c_id=90;
	int p_id=55;
	
	public void c_m1() {
		
		System.out.println("in child class m1 method:"+c_id);
		System.out.println("in child class m1 method super variable:"+this.p_id);
	}
	
	public void commonMethod() {
		System.out.println("in common method of child");
	}
}
