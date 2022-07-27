package day14;

import java.util.ArrayList;
import java.util.List;

import day05.Member;

public class ArrayListExam {

	public static void main(String[] args) {
		//길이가 10인 배열 생성
		Member[] member = new Member[10];
		
		member[0] = new Member();
		member[1] = new Member();
		
		for(int i = 0; i<member.length; i++) {
			member[i] = new Member();
			member[i].setGender('F');
		}
		
		//객체 검색
		Member member1 = member[0];

		member1.setGender('M');
		
		//객체 삭제
		member[0] = null;
		
		
		//ArrayList 객체 생성
		ArrayList list = new ArrayList();
		
		//객체 추가
		list.add(member1);
		
		Member m = (Member)list.get(0);
		System.out.println(m.getGender());
//		System.out.println(((Member)list.get(0)).getGender());
		System.out.println("리스트 크기 : " + list.size());
		
		//객체검색
		Object obj = list.get(0);
		Member obj_m = (Member)obj;
		
		obj_m.getGender();
		
		//제네릭 타입을 이용한 ArrayList 객체 생성 - 부모인List도 가능
		List<Member> list2 = new ArrayList<Member>();
		
		//객체 추가
		list2.add(member1);
		list2.add(member1);
		
		//객체 검색
		Member m2 = list2.get(0);

		List<String> listStr = new ArrayList<String>();
		
		listStr.add("홍길동");
		listStr.add("백두산");
		listStr.add("한라산");
		listStr.add("지리산");
	

		System.out.println("listStr 배열이 비어있는지 검사 : " + listStr.isEmpty());
		System.out.println("listStr 배열에 추가된 객체 수 확인 : " + listStr.size());

		listStr.remove(2);
		System.out.println(listStr.get(2));
		
		listStr.add("무등산");
		System.out.println(listStr.get(3));
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(listStr.get(i));
		}
		
	}

}
