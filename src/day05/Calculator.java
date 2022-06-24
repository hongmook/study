package day05;

public class Calculator {
	int num1;
	int num2;
	
	Calculator(){ //오버로딩일경우 필수입력
		
	}
	
	Calculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//더하기 - 리턴 num1 + num2
	int add() {
		return num1 + num2;
	}
	
	int add(int[] num) {
		int sum =0;
				
		for(int i=0; i <num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}
	
	int add(int[][] arr) {
		int sum = 0;
		
		for(int i=0; i <arr.length; i++)
			for(int j=0; j<arr[i].length; j++) {
				 sum += arr[i][j];				
			}
		return sum;
	}

	//빼기 - 리턴 num1 - num2
	int sub() {
		return num1 - num2;
	}
	//곱하기 
	int mul() {
		return num1*num2;
	}
	//나누기
	double div() {
		return num1/num2;
	}
	
	
	
}