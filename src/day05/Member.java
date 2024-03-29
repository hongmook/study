package day05;

import java.io.Serializable;

public class Member implements Serializable {
	//부모클래스 직렬화, 자식클래스 직렬화 X ==> 자동 직렬화
	//부모클래스 직렬화X, 자식클래스 직렬화 ==> 부모는 직렬화 X
	static final long serialVersionUID = 1;
	//필드 : 데이터 --- class 안에서 선언하는것은 필드가 됨 /id --> 힙영역
	private String id;
	private String pw;
	private String name;
	private char gender;
	private int age;
	private transient String[] hobby; //transient는 직렬화 제외
	private static String wdate; //static는 직렬화 제외
	
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

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}