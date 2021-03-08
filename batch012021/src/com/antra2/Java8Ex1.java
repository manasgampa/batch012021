package com.antra2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.antra2.Person;

public class Java8Ex1 {
	//manas3
	public static void main(String[] args) {
		
		/*List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
		
		Integer i=intList.stream().reduce(0,(a,b)->a+b);
		System.out.println(i);*/
		
		List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		
		Person p=list.stream().reduce(new Person("","",0), (a,b)->{a.setAge(a.getAge()+b.getAge()); return a; });
		System.out.println(p.getAge());


		/*				//source      //intermediate operation
		List<Person> li=list.stream().filter(s->s.getGender().
				equals("F")).
				map(p->{int age=p.getAge()+1;
					p.setAge(age);
					return p;
				}).
				collect(Collectors.toList());//terminal operation
		li.stream().forEach(s->System.out.println(s.getAge()));
		*/
		//List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
		
		
		
	/*List<Integer> evenList=	intList.stream().filter(i->i%2==0).map(s->s+1).collect(Collectors.toList());
		evenList.stream().forEach(s->System.out.println(s));*/
		/*for(Integer i:intList) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}*/
		
		//intList.stream().forEach(t->System.out.println(t));
		
			
		
		
		
		
		
		/*
		Numeric add=(i,j)->{return i+j;};
		System.out.println(add.calculate(1, 2));
		
		Numeric sub=(i,j)->{return i-j;};
		System.out.println(sub.calculate(1, 2));*/
		
		
		/*I2 i2=(i,j)->{System.out.println("in m1 method of interface"+i);};
		i2.m1(8,9);*/
		
		/*I1Impl i1=new I1Impl();
		i1.m1();
		i1.m2();
		I1.m4();*/
	}

}
