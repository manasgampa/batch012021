package com.antra;

public final class ImmutableEx {
	
	private final int Id;
	private final String name;

	public ImmutableEx(int Id, String name) {
		
		this.Id=Id;
		this.name=name;
	}
	
	public int getId() {
		return this.Id;
	}
	public String getName() {
		return this.name;
	}
	
	public Student modify(int Id, String name) {
		
		return new Student(Id, name);
	}
}
