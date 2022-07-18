package practice;

import java.util.Vector;

public class ListEx2 {

	public static void main(String[] args) {
		
		Vector list = new Vector();
		list.add(1.2);
		list.add(Math.PI);
		list.addElement(3.4);
		
		for(Object o : list) {
			System.out.println(o);
		}
		double num = 3.4;
		
		int index = list.indexOf(num);
		if (index>0) {
			System.out.println(num + " 의 위치 :"+ index);
		} else {
			System.out.println(num + "는 list에 없습니다");
		}
		
		num = 1.2;
		if (list.contains(num)) {
			list.removeElement(num);
			System.out.println(num+"삭제됨");
		}
		
		System.out.println(list.indexOf(num));
		System.out.println(list);
	}

}
