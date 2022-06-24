package day01;

public class If {

	public static void main(String[] args) {
		/* System.out.println("조건문연습""); */
		
		//버스요금 나이가 65세 이상은 공짜, 7세 이하 공짜, 8~19세 이하는 10%할인  || ==> or // && ==> and
		byte age = 10;
		float fee = 1300;
		
		//조건식
		if(age >= 65 || age <= 7) {
			System.out.println("��¥");
		} else if(age >= 8 && age <= 19) {
			fee = fee * 0.9f;
			System.out.println(fee + "��");
		} else {
			System.out.println(fee + "��");
		}
		
		//BMI = 몸무게 / 키*키
		double height = 160, bmi=0;
		int weight = 60;
		height = Math.pow(height/100, 2);
		
		bmi = weight / height;
		
		System.out.println(Math.round(bmi));
		
		System.out.println("BMI값 : " + bmi);
		
		
		
	}

}
