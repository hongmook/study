package day13;

import java.io.Serializable;

public class Student extends Person implements Serializable {

	private String school;

	public Student() {

	}
	
	public Student(String school, String name){
		super(name);
		this.school = school;
	}
	
	public Student(String name){
		super(name);
	}
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String school,String name, int age){
		super(name, age);
		this.school = school;
	}

	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
}
