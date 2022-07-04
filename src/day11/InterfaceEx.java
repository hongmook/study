package day11;

public class InterfaceEx {
	
	public static void main(String[] args) {
		
//		Tv tv = new Tv();
//		RemoteControl tv = new Tv();
		Remocon tv = new RemoconImp();
//		Tv tv2 = (Tv)tv;
		
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(30);
		tv.setMute(true);
		//changebattery는 static 이기때문에 remote클래스로 들어가야함
//		RemoteControl.changeBattery();
		tv.search("naver.com");
		
		
//		System.out.println("--------------------------------------------");
		
		
//		Radio radio = new Radio();
//		RemoteControl radio = new Radio();
		
//		radio.turnOn();
//		radio.turnOff();
//		radio.setVolume(11);
//		radio.setMute(true);
//		RemoteControl.changeBattery();
		
		
		
	}
	
}
