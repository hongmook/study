package home01;

public class VarEx1 {
	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000; //변수 age의 값에 2000을 더해서 변수 year에 저장
		age = age + 1; //변수 age에 지정된 값을 1증가
		
		//예상 값 year = 2014 / age = 15
		System.out.println(year);
		System.out.println(age);
		
		//결과 year = 2014 / age = 15
	}
}
