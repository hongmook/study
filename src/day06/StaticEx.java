package day06;

public class StaticEx {
	//필드
	String str;
	
	//생성자
	StaticEx(){
		
	}
	//Static  --- > 클래스를 메모리로 로딩될때 자동으로 실행
	//        --- > new 생성자로 호출하지 않아도 된다.
	//사용이유?  --- > 객체마다 공통의 속성값이나 메소드를 정의할때 사용
	
	//instance ==> 객체 ==> 객체가 생성될때마다 호출
	{
		str = "안녕";
	}
	
	//메소드
	
	public static void main(String[] args) {

		StaticEx s = new StaticEx();
		System.out.println(s.str);
	}

}