package day08;

import day07.Tire;

//상속은 단일상속
public class HankookTire extends Tire{
	//필드
	String msg;

	
	//생성자
	protected HankookTire(String location, int maxRotation){
		//부모생성자 호출은 반드시 첫줄에서 super을 통해 적어야한다.
		super(location,maxRotation);
		
	}

	//메소드
	String getMsg(){
		
		System.out.println(super.getmaxRotation());
		msg="최대 회전수";
		return msg;
	}

	//부모 메소드 재정의 가능 = 메소드 오버라이딩
	//부모 메소드와 동일한 리턴타입, 메소드 이름, 매개변수 이어야 함
	//접근제한을 더 강하게 할 수 없다. : private > default > protected > public
	//부모메소드에 final이 붙어 있으면 메소드 재정의 불가
	
	@Override
	protected boolean roll() {
//		++accRotation;
		setAccRaotation(getAccRaotation()+1);
		System.out.print("["+super.getLocation()+"]");
		
		if(getAccRaotation() <= getmaxRotation()) {
			System.out.println("한국 타이어 수명 : " + (getmaxRotation() - getAccRaotation()) + "회");
			return true;
		} else {
			System.out.println("펑크");
			return false;
		}
		
	}

	@Override
	protected int getmaxRotation() {
		return super.getmaxRotation();
	}
	

}