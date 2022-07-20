package day13;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int cnt) {
		super();
		this.name = name;
		this.students = (T[])new Object[cnt];
	}
	
	//생성자 호출할때 설정을 해주기때문에 set메소드 필요 없음
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
}
