package com.antra2;

import java.util.ArrayList;
import java.util.List;

public class User {

	int user_id;
	List<Laptop> laptopList=new ArrayList<Laptop>();
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public List<Laptop> getLaptopList() {
		return laptopList;
	}
	public void setLaptopList(List<Laptop> laptopList) {
		this.laptopList = laptopList;
	}
	
	
	
}
