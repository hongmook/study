package day08;

import day07.Tire;

public class Car {
	//필드
	//다형성? 하나의 타입에 여러 객체를 대입, 즉 부모타입에 모든 자식 객체가 대입 가능
	Kumhotire t1 = new Kumhotire("앞왼쪽",6);
	
	//자동타입변환 : 자식타입은 부모타입으로 자동 타입 변환된다.
	//부모타입으로 자동타입변환된 이후에는 부모 클래에서 선언된 필드와 메소드만 접근 가능
	//단, 자식클래스가 메소드 오버라이딩 한 경우에는 자식클래스 메소드가 호출 됨.
	Tire t2 = new HankookTire("앞오른쪽", 2);
	Tire t3 = new Kumhotire("뒤왼쪽", 3);
	Tire t4 = new HankookTire("뒤오른쪽", 4);

	//강제타입변환 : 자식클래스 변수 = (자식클래스)부모객체
	//자식타입이 부모타입으로 자동 변환하면, "부모타입에 선언된 필드와 메소드만 사용 가능"
	//자식타입에 선언된 필드와 메소드를 꼭 사용해야 한다면 강제타입변환을 해서 다시
	//자식타입으로 변환한 다음 자식 필드와 메소드를 사용 할 수 있다.
	HankookTire tire2 = (HankookTire)t2;
	Kumhotire tire3 = (Kumhotire)t3;
	HankookTire tire4 = (HankookTire)t4;
	
	
	
	//타이어 수명

	boolean run(){
		boolean funk1, funk2, funk3, funk4, funk=false;
		System.out.println("*****자동차가 달립니다!*****");
		
		funk1 = t1.roll();
		funk2 = tire2.roll();
		funk3 = tire3.roll();
		funk4 = tire4.roll();
		
		if(!funk1 || !funk2 || !funk3 || !funk4) funk = true;
		return funk;
	}

	
	
	
	void stop(){
		System.out.println("******자동차가 멈춥니다!*****");
	}

	int d() {
		return t1.getmaxRotation();
	}

	



}