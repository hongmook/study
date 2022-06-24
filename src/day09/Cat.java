package day09;

public class Cat extends Animal {

	Cat(){
		super();
	}
	
	//추상클래스와 실체클래스의 리턴값은 같아야함
	@Override
	void sound() {
		System.out.println("야옹");
	}

}
