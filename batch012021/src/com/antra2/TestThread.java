package com.antra2;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		Calculator cl=new Calculator();
		
	
		ThreadEx1 th1=new ThreadEx1(cl);
		ThreadEx2 th2=new ThreadEx2(cl);
		th1.start();
		th1.join();
		th2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("in main thread:"+i);
		}
		
		/*th1.setName("Manas");
		th2.setName("Kumar");
		System.out.println(th1.getName());
		System.out.println(th2.getName());*/
		
		
		
		/*ThreadEx1 th1=new ThreadEx1();
		ThreadEx2 th2=new ThreadEx2();
		th1.start();
		th2.start();
		th1.join();
		for(int i=0;i<5;i++) {
			//Thread.yield();
			System.out.println("in the TestThread main:"+i);
		}*/
		
	}
}
