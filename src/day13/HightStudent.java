package day13;

public class HightStudent extends Student {
	private int grade;
	
	HightStudent() {

	}

	HightStudent(String name) {
		super(name);
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
