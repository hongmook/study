package day07;

public class Tire {
	
	//필드는 힙영억에
	private int maxRotation; //타이어 수명
	private int accRotation; //누적 회전수
	private String location; //타이어 위치
	
	//기본생성자 생략되어있음
	Tire(){
		
	}
	//생성자 구현
	//protected - 자신의 패키지 및 자신을 선택한 클래스에서만 오픈허용
	protected Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public String getLocation() {
		return location;
	}
	
	protected int getmaxRotation() {
		return maxRotation;
	}
	
	//누적 회전수 값을 리턴하는 메소드 구현
	protected int getAccRaotation() {
		return accRotation;
	}
	
	
	//누적 회전수 값을 설정하는 메소드 구현
	protected void setAccRaotation(int acc) {
		this.accRotation = acc;
	}
	
	
	//roll() 호출될때 acc 값을 1씩 증가
	//accRotation값이 maxRotation보다 작으면 타이어 수명(max-acc) 출력 후 true
	//accRotation > maxrotation 면 "펑크" 출력 후 false 리턴
	//
	protected boolean roll() {
		++accRotation;
		if(accRotation <= maxRotation) {
			System.out.println("타이어 수명 : " + (maxRotation - accRotation) + "회");
			return true;
		} else {
			System.out.println("펑크");
			return false;
		}
	}
	
	
}