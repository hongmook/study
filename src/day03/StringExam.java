package day03;

public class StringExam {

	public static void main(String[] args) {
		String str1 ="대한민국";
		String str2 ="대한민국";
		
		String str3 = new String("대한민국");
		String str4 = new String("대한민국");
		System.out.println(System.identityHashCode(str1)); //identiyHashCode = 메모리 번지값 출력
		System.out.format("%x%n", System.identityHashCode(str1)); //format : 출력할 문자열을 지정 // %x : 16진수 %n : 줄바꿈
		System.out.format("%x%n", System.identityHashCode(str2));
		System.out.format("%x%n", System.identityHashCode(str3));
		System.out.format("%x%n", System.identityHashCode(str4));
		
		if(str1 == str2) {
			System.out.println("동일한 번지값");
		} else {
			System.out.println("불일치한 번지값");
		}
		
		if("대한민국" .equals(str3)) {  //.equals??
			System.out.println("동일한 문자열");
		} else { 
			System.out.println("불일치한 문자열");
		}
		
	}

}