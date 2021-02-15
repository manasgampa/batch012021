package com.antra;

import java.util.Comparator;

public class SortEx implements Comparator<Integer>{
	
	@Override
	public int compare(Integer i1, Integer i2) {
		
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return 1;
		}
		return 0;
	}

}
