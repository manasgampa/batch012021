package com.antra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx {
	
	private static final int i=10;

	public static void main(String[] args) {
		//ArrayList al=new ArrayList(4);//duplicate are allows//inserts the data in a orderd way//Object array Data structure
		//LinkedList al=new LinkedList();//Double Linked List DS
		Vector al=new Vector();//Resizeable array
		al.add(new Integer(4));
		al.add(new String("manas"));
		al.add(new Student(1,"Manas"));
		al.add(false);
		al.add(8);
		al.add(2, 45.56f);
		al.add(4);
		System.out.println("get:"+al.get(4));
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		List li=Collections.unmodifiableList(al);
		li.add(56);
		System.out.println(al);
	}
}
