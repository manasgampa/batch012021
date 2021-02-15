package com.antra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetEx {
	
	public static void main(String[] args) {
		
		//HashSet hs=new HashSet();//it is unorderd//no duplicates are allowed//Hashtable Data structure
		LinkedHashSet hs=new LinkedHashSet();//it is orderd//no duplicates are allowed//HashTable and  linkedlist Data structure
		hs.add(98);
		hs.add(65);
		hs.add(1);
		hs.add(876);
		hs.add(98);
		hs.add(56);
		
		System.out.println(hs);
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	} 

}
