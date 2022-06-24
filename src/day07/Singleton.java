package day07;

public class Singleton {

		//싱글톤은 단 하나의 객체만 생성
		//2.자신의 객체를 생성해서 필드에 저장 
		//static필요이유 : 생성자 호출 안해도 객체 생성이 가능하게 해줌
		private static Singleton s = new Singleton();
		
		
		//1.생성자 호출을 막는다
		private Singleton() {
			
		}
		
		//3.메소드를 통해서 자신의 객체 주소를 넘김
		static Singleton getInstance(){
			return s;
		}
	
}