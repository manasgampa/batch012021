package com.antra;

public class User {

	int user_id;
	String user_name;
	
	static{
		System.out.println("in static block");
	}
	
	{
		System.out.println("in instance block");
	}
	
	User(int user_id,String user_name){
		System.out.println("in parametarized constructor");
		this.user_id=user_id;
		this.user_name=user_name;
	}
	
	/*User(){
		System.out.println("in user constructor");
	}*/
}
