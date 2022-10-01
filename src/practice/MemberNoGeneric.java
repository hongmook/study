package practice;

import java.util.ArrayList;
import java.util.List;

public class MemberNoGeneric {

	public static void main(String[] args) {

//		List list = new ArrayList();
		List<Member> list = new ArrayList<Member>();
		
		Member mem1 = new Member();
		mem1.setName("홍길동");
		mem1.setId("hong");
		mem1.setPassword("hong1234");
		mem1.setAge(40);
		
		list.add(mem1);
		
		Member mem2 = new Member();
		mem2.setName("이순신");
		mem2.setId("lee");
		mem2.setPassword("lee1234");
		mem2.setAge(50);
		
		list.add(mem2);

		Member mem3 = new Member();
		mem3.setName("김유신");
		mem3.setId("kim");
		mem3.setPassword("kim1234");
		mem3.setAge(60);
		
		list.add(mem3);
		
		System.out.println("list.size() : " + list.size());
		
/*	
		for(int i=0; i<list.size(); i++) {
			System.out.println("인덱스 : " + i
					+", 이름 : "+ ((Member)list.get(i)).getName()	
					+", 아이디 : "+ ((Member)list.get(i)).getId()	
					+", 비밀번호 : "+ ((Member)list.get(i)).getPassword()	
					+", 나이 : "+ ((Member)list.get(i)).getAge());	
		}
*/
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("인덱스 : " + i
					+", 이름 : "+ list.get(i).getName()	
					+", 아이디 : "+ list.get(i).getId()	
					+", 비밀번호 : "+ list.get(i).getPassword()	
					+", 나이 : "+ list.get(i).getAge());	
		}
		
	}
	
	
	

}
