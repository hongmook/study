package day12;

public class ExceptionExam {

	public static void main(String[] args) {
		//에러 : OutOfMemoryError, StackOverFlowError
		//예외 : Exception 
		//예외 : 1) 일반예외 : 컴파일 체크 예외, 예외처리코드가 없을 경우 오류발생
		//예외 : 2) 실행예외(RuntimeException) : 컴파일하는 과정에서는 예외처리코드를 검사하지 않음, 실행시 발생
		//JVM은 프로그램 실행 도중에 예외가 발생하면 해당 예외 클래스로 객체를 생성하고, 예외처리코드에서 예외 객체를 이용할수 있도록 해준다
		
		//예외처리코드
		//순서대로 진행 상위클래스를 밑으로 배치
		try {
			//실행문;
			//if, for, while문 사용시 한줄 실행문도 중괄호 생략 불가능
			if(true) { int a = 10; }
			//System.out.println(3/0);
			
			int[] arr = {1,2,3};
			//System.out.println(arr[3]);
			

		} catch(ArithmeticException e) {
			//catch 순서 : 하위 Exception -> 상위 Exception
			//e.getStackTrace();
			System.out.println("0으로 나눌 수 없습니다");
			
		} catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("인덱스 범위 추가");
			
		} catch(Exception ex) {
			//예외발생시 실행문
			ex.printStackTrace();
			
		} finally {
			//무조건 실행
		}


		String[] strarr = {"10","2a"};
		int value = 0;
		for(int i=0; i<=strarr.length; i++) {
			try {
				value = Integer.parseInt(strarr[i]);
				
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
				
			} catch(NumberFormatException e2) {
				System.out.println("숫자로 변환불가");
				
			} catch(Exception ex) {
				ex.printStackTrace();
				
			} finally {
				System.out.println(value);
				System.out.println("-------------------");
			}
			
		}
		
		
	}

}
