package day05;

public class ClassEx {

	public static void main(String[] args) {

		//Member.java 불러오기
		//객체생성 : new 생성자 호출();
		Member member = new Member("joy", "1234");
		Member member2 = new Member(); //힙영역에 또다른 객체가 생김
		
		member.setId("joy"); // 상수풀에 joy가 생기며 id의 번지가 joy를 가르킴
		member2.setId("admin");
		
		member.setGender('M');
		System.out.println(member.getGender());
		
		System.out.format("%x%n", System.identityHashCode(member));
		System.out.format("%x%n", System.identityHashCode(member2));
		
		System.out.println(member.getId());
		System.out.println(member2.getId());
		
		System.out.println(member.login("joy", "1234"));
		System.out.println(member2.login("joy", "1234"));
		
		
	}

}