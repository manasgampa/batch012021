package com.antra2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Ex2 {

	public static void main(String[] args) {
		
		Laptop laptop1=new Laptop();
		laptop1.setLaptop_id(1);
		laptop1.setChargeCapacity(34);
		
		Laptop laptop2=new Laptop();
		laptop2.setLaptop_id(2);
		laptop2.setChargeCapacity(67);
		
		Laptop laptop3=new Laptop();
		laptop3.setLaptop_id(3);
		laptop3.setChargeCapacity(53);
		
		Laptop laptop4=new Laptop();
		laptop4.setLaptop_id(4);
		laptop4.setChargeCapacity(89);
		
		Laptop laptop5=new Laptop();
		laptop5.setLaptop_id(5);
		laptop5.setChargeCapacity(23);
		
		User user1=new User();
		user1.setUser_id(1);
		user1.getLaptopList().add(laptop1);
		user1.getLaptopList().add(laptop2);
		
		User user2=new User();
		user2.setUser_id(2);
		user2.getLaptopList().add(laptop3);
		user2.getLaptopList().add(laptop4);
		user2.getLaptopList().add(laptop5);
		
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		
		
		
		List<Integer> li=userList.stream().
				map(user->{return user.getLaptopList();}).	
				map(s->s.stream().map(m->m.getChargeCapacity()).reduce(0,(a,b)->a+b)).collect(Collectors.toList());
		
	
		
		
		
		
		
		
		
		
		
	}
}
