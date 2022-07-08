package day12;

public class ThrowsExam {

	public static void main(String[] args) {
		//예외 떠넘기기 : 메소드를 호출한 곳으로 예외를 넘김
		// 리턴타입 메소드명(매개변수..) throws 예외클래스1, 예외클래스2,... { }
		// 생성자와 메소드 선언부에 throws 키워드를 붙일 수 있으며, 이런 경우 반드시 
		// 호출한 곳에서 try-catch 블록으로 예외처리를 해줘야 함
		
		// main() 메소드에서 throws를 사용한 경우 JVM이 최종적으로 예외처리하며 콘솔에 예외내용을 출력
		// ==> 권장하지 않음 ==> try-catch문을 사용
		
		//예외 강제발생 : throw new Exception 생성자 호출;
		
		try {
			method1();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
			System.out.println(e.getMessage());
		}
		
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	public static void method1() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
	
	public static void method2() throws Exception {
		System.out.println("메소드2 실행");
		throw new Exception("예외발생");
	}
}
