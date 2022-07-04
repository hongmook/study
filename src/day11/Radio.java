package day11;

public class Radio implements RemoteControl {

	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("라디오를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("라디오를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 볼륨은 : " + this.volume);

	}

}
