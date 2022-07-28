package day14;

import java.util.Arrays;
import java.util.List;

public class ArrayListExam2 {

	public static void main(String[] args) {
		//고정된 객체들로 구성된 List생성
		List<String> list = Arrays.asList("관리자","운영자","사용자");
		for(String auth : list) {
			System.out.println(auth);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
		
	}

}
