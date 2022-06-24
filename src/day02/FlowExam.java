package day02;

import java.io.IOException;
import java.util.Scanner;

public class FlowExam {

	public static void main(String[] args) {

		//학점구하기
		//90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이하는 F
				
		/*
		 * try { System.out.println("문자를 입력하세요"); int KeyCode = System.in.read();
		 * System.out.println(KeyCode); } catch (IOException e) { e.printStackTrace(); }
		 */
		
 		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println('A');
		} else if (score >= 80) {
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else if (score >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
		
	}

}
