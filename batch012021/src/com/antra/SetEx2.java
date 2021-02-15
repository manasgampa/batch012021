package com.antra;

import java.util.Iterator;
import java.util.TreeSet;

public class SetEx2 {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new SortEx());//it allows only homo genious elements//
		ts.add(65);
		ts.add(89);
		ts.add(45);
		ts.add(164);
		ts.add(12);
		ts.add(98);
		ts.add(18);
		ts.add(55);
		ts.add(88);
		ts.add(100);
		
		
		Iterator it=ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
