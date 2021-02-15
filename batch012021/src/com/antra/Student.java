package com.antra;

public class Student {

	private int student_id;
	private String student_name;
	
	public Student(int student_id,String student_name) {
			
		this.student_id=student_id;
		this.student_name=student_name;
	}
	
	public void setStudent_id(int student_id) {
		this.student_id=student_id;
	}
	
	public int getStudent_id() {
		return this.student_id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student st=(Student)obj;
		if(this.student_id==st.student_id && this.student_name.equals(st.student_name)) {
			
			return true;
		}
		return false;
	}
	
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
	
	public int hashCode() {
		
		return 34;
	}*/
	
}
