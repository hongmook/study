package day08;

import java.sql.Connection;

import day07.Mysqlconn;

public class FinalEx {
	//필드
	final static double PI=3.14;
	
	FinalEx(){
	}
	

	public static void main(String[] args) {
		//final 클래스, 필드, 메소드 앞에 붙일 수 있음
		//final은 초기값이 설정되면 변경불가능
		//초기값 설정방법? 필드선언과 함께 값을 할당 or 생성자 호출시
		//final 데이터타입 필드명 ==> 힙영역에 적재 ==> 객체마다 저장
		
		Connection conn = Mysqlconn.getInstance().mysql();
		System.out.println(conn);
		
		//생성자 호출
		FinalEx f =new FinalEx();
		
		String str = null;
		
		System.out.println(FinalEx.PI);
		
		
		//static final ==> 상수 ==> 메소드 영역 메모리에 적재
		//불변의 값, 관례적으로 대문자로 작성
		//초기값 설정 : static { 초기값 설정 }
		
		
		
	}

}