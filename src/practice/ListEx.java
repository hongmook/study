package practice;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		//list 인터페이스는 legnth가 안됨
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i));
		}

		int[] list2 = new int[6];
		
		list2[0]=1;
		list2[1]=2;
		list2[2]=3;
		list2[3]=4;
		list2[4]=5;
		list2[5]=6;
		
		for(int i=0; i<list2.length; i++) {
			System.out.print(list2[i]);
		}
		
		
		
		

	}

}
