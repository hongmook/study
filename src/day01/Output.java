package day01;

public class Output {

	public static void main(String[] args) {
		
		//상수 : 고정된 값 
		System.out.println("안녕 자바");
		System.out.println( 5*4 );
		System.out.println( 5==4 );
		System.out.println( 'a' );
		System.out.println( 127 );  
		
		//변수
		//정수 타입: byte, char, short, int, long -> 바이트 수가 다름
		
		//byte --> 1byte = 8bit ==> -128 ~ +127
		/* byte score = 127 + 9; 안됨*/
		byte score = -128;
		score = 32;					//하나만 출력가능 byte 두개 입력시 오류발생
		System.out.println(score); 
		
		//char : 하나의 문자를 저장할때 사용, 2byte
		char charval = 65+1;  // 아스키코드적용해서 A나옴
		System.out.println(charval); 
		
		//short : 2byte , -32768 ~ 32767 
		short shorval = 129; 
		System.out.println(shorval);
		
		//int : 4byte, long : 8byte
		
		//실수형 : double(8byte), float(4byte)
		double charVal = 'A';
		System.out.println("double타입 : " + charVal);
		
		//논리형 : boolean : true, false
		boolean status = true;
		System.out.println(status);
		
		//final을 붙이면 값 고정 
		final double pi = 3.14;
				
		//기본데이터 타입 : 정수, 실수, 논리형
		
		//클래스 타입 : String	
		String str = "대한민국";
		System.out.println(str + "짝짝짝");
		System.out.println(str.length());
		System.out.println(str.substring(2, 4)); //문자열 사이에 위치(index) 시작은0 -> (시작하는 위치, 끝나는위치)  ex.) 0대1한2민3국4
		
		//제어문
		//조건문 : if, if(){true} else {false}, if(조건식){true} else if(조건식2) {} else {}
		int num = 90;
		
		/*if(num > 90) {
			System.out.println("등급 A");
		} 
		
		if(num > 80) {
			System.out.println("등급 B");
		}
		
		if(num > 70) {
			System.out.println("등급 C");
		}*/
		
		if(num >= 90) {
			System.out.println("등급 A");
		} else if(num > 80) {
			System.out.println("등급 B");
		} else if(num > 70) {
			System.out.println("등급 C");
		} else {
			System.out.println("등급 F");
		}
	}

}