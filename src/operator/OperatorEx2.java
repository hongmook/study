package operator;

public class OperatorEx2 {

	public static void main(String[] args) {

		int a = 10, b=4;
		
		System.out.printf("%d + %d = %d%n", a,b, a+b);
		System.out.println(a-b);
		System.out.println(a * b);
		System.out.println(a / b); //소수점 이하는 버려진다
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
		System.out.println(3/0.0); //infinity 발
		System.out.println(3/0); //에러발생
		
	}

}
