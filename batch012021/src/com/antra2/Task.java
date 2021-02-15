package com.antra2;

import java.util.concurrent.Callable;

public class Task implements Callable<String>{
	
	int i;
	public Task(int i) {
		this.i=i;
	}
	@Override
	public String call() throws Exception {
		
		return "In thread Task Callable:"+i;
	}

}
