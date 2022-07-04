package day11;

public class RemoconImp implements Remocon {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("리모콘이 켜집니다");

	}

	@Override
	public void turnOff() {
		System.out.println("리모콘이 꺼집니다");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("소리크기 : " + this.volume);

	}

	@Override
	public void setMute(boolean mute) {
		System.out.println("음소거 : " + mute);

	}

	/*
	 * @Override public void search(String url) {
	 * 
	 * System.out.println(url + "리모콘 검색기 입니다."); }
	 */

}
