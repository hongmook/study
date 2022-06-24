package day02;

public class Var_scope {
	//전역변수선언 ==> 필드 ==> heap영역 저장
	int no = 50;
	char grade= 'A';
	
	//기본생성자(생략,디폴드값으로 지정되어있음) --> 클래스 바이트 코드를 메모리에 적재
	Var_scope(){
		super(); //부모생성자 호출
	}
	
	//메소드
	public static void main(String[] args) {
		
		Var_scope varScope = new Var_scope(); //new 기본생성자이름(); //지역변수?
		Var_scope varScope2 = new Var_scope(); 
		
		varScope2.no = 100;
		varScope.grade = 'C';
		
		System.out.println(varScope.no);
		System.out.println(varScope.grade);
		
		System.out.println(varScope2.no);
		System.out.println(varScope2.grade);
		
		if(varScope.grade > 'A') {
			Var_scope var3 = new Var_scope();
			System.out.println("등급이 낮습니다.");
			var3.grade = 'D';
			varScope.no = 200;
		}
		System.out.println(varScope.no);
	}

}