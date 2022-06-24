package day03;

public class ForEX {

	public static void main(String[] args) {
		
		/*
		 * for(초기화식; 조건식; 증감식) { 
		 * 		실행문; 
		 * }
		 */
		
		//1~5 까지의 합을 구하시오
		//1+1 = 2+2 =4+3 =7+4 =11 +5 =16
		
		int num = 0;
		for(int i=0; i<=5; i++) {
			num += i; // ==> num = sum + i
		}
		
		//System.out.println("i" + i); --> 이미 블럭이 빠져나갔기때문에 불가능한 식
		System.out.println("1~5까지 합: " + num);
		
		//1~10 까지 짝수의 합
		int sum = 0;
		for(int i=0; i<=10; i++) { //for문을 활용하여 조건식 만들기
			if(i%2 == 0){ //if를 활용하여 짝수 조건식 성립
				sum += i;
			}
		} 
		System.out.println("1~10까지 짝수의 합 : " + sum);
		
		//
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
					 System.out.print("*");
			} 
			System.out.println();
		}
		
		//
		for(int i=1; i <= 4; i++) {
			for(int j=4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//
		int n = 4;
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>0; j--) {
				
				if(i<j) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");
				}
				
			}
		 System.out.println();
		}
	
	}

}