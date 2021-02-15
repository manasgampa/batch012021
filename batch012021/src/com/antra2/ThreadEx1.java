package com.antra2;

public class ThreadEx1 extends Thread{

	Calculator c1;
	public ThreadEx1(Calculator c1) {
		this.c1=c1;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("in thread ex1:"+i);
		}
		/*System.out.println(Thread.currentThread());
		Thread.yield();
		c1.mul(5);*/
		
	}
}
