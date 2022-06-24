package day08;

public class CarEx {

	public static void main(String[] args) {
		
		//car 객체를 생성해서 run메소드 호출
		Car2 car2 = new Car2();
		
		
		
		//무한반복 run, 타이어 한짝이 펑크가 나는 순간 종료
		//타이어 펑크 위치값을 받아서 출력("앞 왼쪽")
		while(true) {
			if(car2.run()) {
				car2.stop();
				
			}
			
			boolean wheel = car2.getfunk();
			switch(car2.loc){
			case 0 :
				System.out.println("앞 왼쪽");
				break;
			
			}
			
			break;
		}
		
	}
}