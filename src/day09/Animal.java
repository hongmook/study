package day09;

public abstract class Animal extends Nature {
	//추상클래스는 선언만 함
	//abstract는 클래스와 메소드에 붙여줄수 있음
	//추상클래스와 실체클래스의 리턴값은 같아야함
	
	
	//필드
	String kind;
	String eat;
	
	
	
	//메소드
	void sound() {
		System.out.println("꼬끼오");
	}
	
	
	
	
}
