package day11;

public interface RemoteControl {
	//상수필드
	//인터페이스 상수는 static{ } 사용불가 -- 그래서 초기값 설정을 해줘야함
	//public static final이 생략 되어있음
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//생성자 없음
	
	//추상메소드
	//public abstract가 생략됨 -- 없어도 인터페이스에서는 추상메소드로 인식
	//구현클래스에서 반드시 구현해줘야함
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default 메소드 : jdk8버전 이후 사용가능
	//public 생략되어있음
	default void setMute(boolean mute) {
		//뮤트가 트루이면 무음처리 완료 false이면 무음 해제
		//구현클래스가 공통으로쓰는 것을 디폴트메소드를 설정
		if (mute) {
			System.out.println("무음처리 완료");
		} else {
			System.out.println("무음 해제");
		}
	
	}
	
	//static 정적 메소드 : jdk8버전 이후 사용가능
	//public 생략되어있음
	static void changeBattery() {
		System.out.println("건전기 교체");
	}
	
}
