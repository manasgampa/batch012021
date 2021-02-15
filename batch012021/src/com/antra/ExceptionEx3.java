package com.antra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExceptionEx3 {
	
	public static void main(String[] args) throws EmployeeNotFound{
		
		throw new EmployeeNotFound("no employee available");
		//throw new StudentNotfoundException("no student available");
		
		/*try {
			String str=null;
			str.charAt(1);
			FileInputStream fis=new FileInputStream("abc.txt");
			System.out.println(1/0);
			
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("in finally");
		}*/
		
		//System.out.println("last line");
	/*	try {
			FileInputStream fis=new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("in claass");
		*/
		
	}

}
