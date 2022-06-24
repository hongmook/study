package day05;

public class Car {
	String[] tier;
	String model;
	String color;
	int maxSpeed;
	int price;
	boolean auto;
	
	//생성장 오버 로딩 --> 매개변수 개수, 타입, 순서가 다르면 됨
	Car(){
		super();
	}
	
	Car(String model, boolean auto){
		this(model, auto, 5000); //생성자 안에서 생성자 생성할때 무조건 첫번째
		this.model = model;
		this.auto = auto;
	}
	
	Car(String model, boolean auto, int price){
		this.model = model;
		this.auto = auto;
		this.price = price;
	}
	
	
	Car(String model, int maxSpeed){
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	
	//자동차가 달리기
	//maxspeed가 0이되면 stop출력, 달릴때는 현재속도 출력
	
	//방법 1.
//	void run() {
//		while(true) {
//			if(maxSpeed != 0) {
//				System.out.println(maxSpeed);
//				maxSpeed--;
//			} else {
//				System.out.println("STOP");
//				break;
//			}
//		}
//	}
	
	
	//방법 2.
	void run() {
		while(true) {
			if(maxSpeed != 0) {
				System.out.println(maxSpeed);
				maxSpeed--;
			} else {
				stop();
				break;
			}
		}
	}
	
	void stop() {
		maxSpeed = 0;
		System.out.println("자동차 멈춤");
	}

}