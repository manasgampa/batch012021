package com.antra2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreadEx1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
		
		ArrayList<Callable<String>> al=new ArrayList<>();
		al.add(new Task(1));
		al.add(new Task(2));
		al.add(new Task(3));
		al.add(new Task(4));
		al.add(new Task(5));
		al.add(new Task(6));
		al.add(new Task(7));
		al.add(new Task(8));
		al.add(new Task(9));
		al.add(new Task(10));
		
		List<Future<String>> invokeAll = newFixedThreadPool.invokeAll(al);
		for(Future f:invokeAll) {
			System.out.println(f.get());
		}
		newFixedThreadPool.shutdown();
	}

}
