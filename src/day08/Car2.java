package day08;

public class Car2 {
	boolean funk = false;
	int loc;
	
	//필드
	Tire2[] tire= {
		new Kumhotire2("앞왼쪽", 3),
		new Kumhotire2("앞오른쪽", 2),
		new HankookTire2("뒤왼쪽", 3),
		new HankookTire2("뒤오른쪽", 4)
	};
	

	
	
	//타이어 수명

		boolean run(){
			System.out.println("*****자동차가 달립니다!*****");
			
			for(int i=0; i < tire.length; i++) {

				if(tire[i].roll() == false) {
					funk = true;
					loc = i;
					//break;
				}
			}
			
			
			return funk;
		}

		void stop(){
			System.out.println("******자동차가 멈춥니다!*****");
		}
	
		public boolean getfunk() {
			return funk;
		}
		
		public int loc() {
			return loc;
		}
		
}