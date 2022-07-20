package day13;

import day08.Car;
import day11.Tv;

public class GenericExam<T> {

	public static void main(String[] args) {
		//제네릭 타입 : class<T>, interface<T>
		//제네릭 타입은 타입을 파라미터(매개변수)로 가지는 클래스와 인터페이스를 말함

		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		System.out.println(name);
		
		Box<String> box2 = new Box<String>();
		box2.set("백두산");
		String name2 = box2.get();
		System.out.println(name2);
		
		Box<Integer> box3 = new Box<Integer>();
		box3.set(3);
		Integer num = box3.get();
		System.out.println(num);
		
		Box<Apple> box4 = new Box<Apple>();
		box4.set(new Apple());
		Apple apple = box4.get();
		
		
		//자바6버전 이하에서는 new Product<Tv, String>() 호출
		//자바7버전 부터는 new Product() 가능
		Product<Tv, String> product = new Product<Tv, String>();
		product.setKind(new Tv());
		product.setModel("삼성tv");
		
		Tv tv = product.getKind();
		String model = product.getModel();
		
		System.out.println(tv.MAX_VOLUME);
		System.out.println(model);
		
		
		Product<Car, String> product2 = new Product();
		product2.setKind(new Car());
		product2.setModel("현대자동차");
		
		Car car = product2.getKind();
		String model2 = product2.getModel();
		
		car.stop();
		System.out.println(model2);
		
		Util util = new Util();
		
		Box<Apple> applebox = util.boxing(new Apple());
		
		applebox.set(apple);
		
		Box<Car> carbox = Util.boxing(new Car());

		Car car2 = carbox.get();
		
		
		Pair<Integer, String> p1 = new Pair(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		
		boolean com = Util.compare(p1, p2);
		
		System.out.println("두 객체의 비교결과 : "+com);
		
		//제한된 타입 파라미터 : <T extends 최상위 타입>
		//Util.compare("a", "b");
		//compare 정적메소드는 두 숫자를 빼서 같으면 0 앞에 숫자가 크면 1 뒤에 숫자가 크면 -1
		int rs = Util.compare(10, 20);
		System.out.println(rs);
		
		int rs2 = Util.compare(4.5, 3);
		System.out.println(rs2);
		
		
	}

}
