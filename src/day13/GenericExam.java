package day13;

public class GenericExam<T> {

	public static void main(String[] args) {
		//제네릭 타입 : class<T>, interface<T>
		//제네릭 타입은 타입을 파라미터(매개변수)로 가지는 클래스와 인터페이스를 말함

		Box box = new Box();
		box.set("홍길동");
		System.out.println(box.get());
	}

}
