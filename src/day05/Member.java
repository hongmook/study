package day05;

public class Member {
	//필드 : 데이터 --- class 안에서 선언하는것은 필드가 됨 /id --> 힙영역
	String id;
	String pw;
	String name;
	char gender;
	int age;
	String[] hobby;
	String wdate;
	
	//default 생성자 : 메모리 적재 --- class 이름과 같음, 생략되어있음
	public Member(){
		super(); //부모생성자(Object)를 호출
	}
	
	public Member(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	//메소드 : 기능정의
//	  return타입 메소드이름(매개변수) {
//		  실행문;
//		  return 값;
// 	  }

	public void setId(String id){ //void : 리턴타입이 없다 /id --> 스택영역
		this.id = id; //this : 자기자신의 클래스에 있는 필드를 선언할때
	}
	
	public String getId(){ // id를 불러오는 선언문?
		return this.id;
	}
	
	//로그인 기능 정의 // == , = 차이 주의 ??
	public boolean login(String id, String pw){
		if(this.id == id && this.pw == pw) {
			return true;
		} else {
			return false;
		}
	}
		
	//gender
	public void setGender(char c) {
		this.gender = c;
	}

	public char getGender() {
		return this.gender;
	}
}