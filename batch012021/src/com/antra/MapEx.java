package com.antra;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx {
	
	public static void main(String[] args) {
		//HashMap hm=new HashMap<>();//it is unorderd//keys cannot be duplicated and values can be duplicated//HashTable Data structure
		//LinkedHashMap hm=new LinkedHashMap();//it is orderd//keys cannot be duplicated and values can be duplicated//Hashtable and LinkedList DS
		//Hashtable hm=new Hashtable();
		ConcurrentHashMap hm=new ConcurrentHashMap<>();
		hm.put(89, "Manas");
		hm.put(98, "Kumar");
		hm.put(12, "Renqing");
		hm.put(8, "Tom");
		hm.put(56, "Ying");
		hm.put(34, "David");
		hm.put(55, "Bob");
		hm.put(98, "Helen");
		hm.put(99, "Manas");
		
		System.out.println(hm.size());
		Set set=hm.keySet();
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(hm.get(it.next()));
			hm.put(5, "Naveen");
		}
	
	}
}
