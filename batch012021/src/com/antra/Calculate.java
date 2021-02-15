package com.antra;

import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		
		try {
		System.out.println("div:"+(a/b));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("add:"+(a+b));
	}

}
