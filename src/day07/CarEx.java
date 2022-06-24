package day07;

public class CarEx {
	
	static String model;

	public static void main(String[] args) {
		//static 안에서 this 사용 불가
		System.out.println("안녕");
		
		CarEx d = new CarEx();
		
		d.model = "bmw";
		
		Car.getCar().setCompany("현대");
		System.out.println(Car.getCar().getCompany());
		
		
		//Tire 생성자 호출
		Tire car = new Tire("FL", 10);
		Tire car2 = new Tire("FL", 10);
		
		System.out.println(new Tire("FR", 8).getLocation());
		
		System.out.println(car.getLocation());
		System.out.println(car.getmaxRotation());
		
		
		car.setAccRaotation(0);
//		car2.setAccRaotation(2);
		
//		System.out.println(car.getAccRaotation());
//		System.out.println(car2.getAccRaotation());
	

		for(int i = 0; i<=car.getmaxRotation(); i++) {
			car.roll();
		}
		
		
		
	}

}