package day05;

public class CarEX {

	public static void main(String[] args) {
		

		Car c = new Car();
		Car mo = new Car("���", false);
		Car mini = new Car("�̴�����", 10);
		
		mini.run();
		mini.stop();
		
		System.out.println(mo.model);
		System.out.println(mo.auto);
		System.out.println(mo.price);
			
	}

}
