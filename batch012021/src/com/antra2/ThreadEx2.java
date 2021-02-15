package com.antra2;

public class ThreadEx2 extends Thread{

	Calculator c2;
	public ThreadEx2(Calculator c2) {
		this.c2=c2;
	}
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("in thread ex2:"+i);
		}
		/*System.out.println(Thread.currentThread());
		c2.mul(2);*/
	}
}
