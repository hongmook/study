package day04;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		//1차원 배열
		int score[] = {100, 80, 90};
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		System.out.println("hello for문------------");
		for(int j : score) {
			System.out.println(j);
		}
		
		//1차원 스트링 배열
		String[] strArr = {"짬뽕","김밥","햄버거"};

		for(String i : strArr) {
			System.out.println(i);
		}
		
		//2차원 배열
		int[][] intArr = {{1,2},{3,4},{5,6,7}};
		System.out.println("첫번째[] 길이 : " + intArr.length);
		System.out.println("첫번째[2][2] 길이 : " + intArr[2].length);
		
		for(int[] i : intArr) {
			for(int j : i) {
				System.out.println(j);
			}
		}
		
		for(int[] i : intArr) {
			System.out.println(i[0]);
		}
		
		//배열요소의 모든 값의 합, 평균 출력
		int sum = 0;
		int cnt = 0;
		//int col = 0;
		
		for(int[] i : intArr) {
			//col += i.length;
			for(int j : i) {
				sum += j;
				cnt++; //자릿수확인?
			} 
		}
		
		System.out.println("배열요소의 모든 값의 합 : " + sum);
		System.out.println("배열요소의 모든 값의 평균 : " + sum/cnt);
		//System.out.println("배열요소의 모든 값의 평균 : " + sum/col);
		
		
		//2차원 문자열
		String[][] strArr2 = {{"A","B"},{"C","D","E"},{"F"}};
		for(String[] i : strArr2) {
			for(String j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("------------- 배열복사 --------------");
		
		//배열복사
		char[] charVal = {'a','b','c'};
		char[] newVal = new char[6];

//		newVal[3] = charVal[0]; 
//		newVal[4] = charVal[1]; 
//		newVal[5] = charVal[2]; 
//		
//		for(char c : newVal) {
//			System.out.println(c);
//		}
		
//		for(int i=0; i<charVal.length; i++) {
//			newVal[i] = charVal[i] ;
//			System.out.println(newVal[i]);
//		}

		System.arraycopy(charVal, 0, newVal, 2, charVal.length);
		
		for(char i : newVal) {
			System.out.println(i);
		}
		
		
		
	}

}