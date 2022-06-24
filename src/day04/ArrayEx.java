package day04;

public class ArrayEx {

	public static void main(String[] args) { //실행할때 매개변수로 받음
		
		/*
		System.out.println(args[0]);
		
		
		for(int i =0; i<args.length; i++) {
			System.out.print(args[i]);
			if (i != 3) System.out.print(",");
		}
		*/
		
		int score[];
		int sum =0;
		String name[] = null;
		
		score = new int[5]; // new : score에 int 5개를 만들어라
		score[0] = 10; // [1]의 값을 지정을 안하더라도 초기값은 0으로 지정
		score[1] = 20;
		score[2] = 30;
		
		//System.out.println(score[0]);
		
		name = new String[3];
		name[0] = "홍길동"; //상수풀에 저장된 홍길동을 name의 배열에 번지값이 지정됨
		
		System.out.println(name[0]);
		System.out.format("%x%n", System.identityHashCode(score[0])); //score 0번째의 번지수 출력 -- %x:16진수 
		System.out.format("%x%n", System.identityHashCode(score[1]));
		System.out.format("%x%n", System.identityHashCode(score[2]));
		System.out.format("%x%n", System.identityHashCode(score[3]));
		System.out.format("%x%n", System.identityHashCode(score[4]));
		
		int arrt1[] = {1,2,3};
		int arrt2[] = new int[3];
		
		//2차원 배열
		//int[][] arry3 = new int[2][3];
		/* int arry3[][] = {{1,2,3},{4,5,6}}; */
		int arry3[][] = new int[2][3]; 
		
		int num = 0;
		for (int i=0; i<arry3.length; i++) {
			for (int j=0; j<arry3[i].length; j++) {
				arry3[i][j] = num++;
			} 
		}
		
		for (int i=0; i<arry3.length; i++) {
			for (int j=0; j<arry3[i].length; j++) {
				System.out.print(arry3[i][j]);
			} System.out.println();
		}
		
		
		String[][] th = { {"페트병","1회용컵"}, 
						  {"병"},
						  {"캔","고철","알루미늄"}};
		
		for(int i=0; i<th.length; i++) {
			for(int j=0; j<th[i].length; j++) {
				//System.out.print(th[i][j]+",");
				System.out.format("th[%d][%d] = %s %n", i, j, th[i][j]);
			} 
		}
		
		//for문
		for(int i=0; i < score.length; i++) {
			System.out.print(score[i]);
		}
		
		//향상된 for문
		System.out.println("향상된 for문");
		for(int s : score) {
			System.out.println(s);
		}
		
		for(String[] t : th) {
			for(String h: t) {
				System.out.println(h);				
			}
		}
		
		for(int[] t : arry3) {
			for(int h: t) {
				System.out.println(h);				
			}
		}
		
	}

}