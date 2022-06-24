package day08;



public class InheritanceEx{

	public static void main(String[] args) {
		//상속의 특징
		//자식이 부모를 선택, 자식이 여러부모를 선택 불가(단일상속)
		//부모선택방법 : class 자식클래스 extends 부모클래스
		//자식 객체를 생성하면, 부모객체가 먼저 생성되고 그다음에 자식객체가 생성된다.
		
		
		Kumhotire t1 = new Kumhotire("앞왼쪽",10);
		Kumhotire t2 = new Kumhotire("앞오른쪽",8);
//		t1.getMsg();

//		System.out.println(t1.getMsg());
		
		for(int i=0; i<=t2.getmaxRotation() ; i++) {
			t2.roll();			
		}
		
		
	}

}