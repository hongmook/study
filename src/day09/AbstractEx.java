package day09;

public abstract class AbstractEx {

	public static void main(String[] args) {
		//추상클래스
		//	추상은 객체간에 공통되는 특성을 추출한 것
		//	추상클래스가 부모, 실체클래스를 구현클래스
		//	실체클래스는 추상 클래스의 모든 특성을 물려받고, 추가적인 특성을 가질 수 있다.
		//	why? 1) 실체클래스들의 "공통된 필드와 메소드"의 이름을 통일할 목적
		//		 2) 공통적인 필드와 메소드는 추상 클래스에 선언해 두고, 실체 클래스마다 다른 점만 구현
		//	
		//	추상클래스 선언 : abstract class 클래스명
		
		//실체클래스에서 추상클래스를 사용하려면 class 클래스명 extends 추상클래스명
		//추상클래스와 실체클래스의 리턴값은 같아야함
		
		//추상클래스는 객체화 할수 없다
		//Animal a = new Animal();
		
		Nature dog = new Dog();
		Dog dog2 = (Dog)dog;
		
		dog2.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		Nature cat2 = new Cat();
		
		
		dog.weather();		
		
		
		
		
		
		
	}

}
