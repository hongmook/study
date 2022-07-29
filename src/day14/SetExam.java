package day14;

import java.util.HashSet;

import day05.Member;

import java.util.*;

public class SetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("소리");
		set.add("창목");
		set.add("정후");
		set.add("정후");
		System.out.println(set.add("정후"));
		
		System.out.println("개수: " + set.size());
		
		//삭제
		set.remove("정후");

		Iterator<String> it = set.iterator(); //반복자 얻기
		while(it.hasNext()) {
			String name = it.next(); //한개의 객체를 가져옴
			System.out.print(name + "\t");
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("내용이 없습니다");
		}
		
		
		Set<Member> set2 = new HashSet<Member>();
		set2.add(new Member("joy","1234"));
		set2.add(new Member("joy", "1234"));
		
		System.out.println(set2.size());
		
	}
}