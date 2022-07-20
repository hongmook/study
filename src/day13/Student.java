package day13;

public class Student extends Person {

	private String school;

	Student() {

	}
	
	Student(String school, String name){
		super(name);
		this.school = school;
	}
	
	Student(String name){
		super(name);
	}
	
	Student(String name, int age) {
		super(name, age);
	}
	
	Student(String school,String name, int age){
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
