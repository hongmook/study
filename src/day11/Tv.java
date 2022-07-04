package day11;

public class Tv implements RemoteControl, Searcher {
	//인터페이스를 구현하는 클래슨는 상속 관계가 된다
	//하나의 구현클래스에서 여러개의 인터페이스를 구현가능 : 다중상속
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	//static은 바로 .으로 접근가능
	@Override
	public void setVolume(int volume) {
		//인터페이스 상수값으로 volume을 제한
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 tv 볼륨 : " + this.volume);

	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

}
