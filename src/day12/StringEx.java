package day12;

public class StringEx {

	public static void main(String[] args) {

		int score=90;
		boolean bool = true;
		//String으로 형변환
		String s =String.valueOf(bool);
		//형변환 돼서 문자열로 취급
		System.out.println(s+10);
		
		String str = "Hello My Name is Hong Gil Dong";
		System.out.println("0번째 인덱스 : "+str.charAt(0));
		//문자열값 비교
		System.out.println(str.equals("Hello My Name is Hong Gil Dong"));
		//"Hong"문자열 위치
		System.out.println(str.indexOf("Hong"));
		//'H'문자의 위치 -- 0부터 시작
		System.out.println(str.indexOf('H'));
		//n번째의 글자를 아스키코드 숫자로 변환
		System.out.println(str.codePointAt(0));
		//17번 인덱스부터 끝까지 표시
		System.out.println(str.substring(17));
		//6번~13번 문자열
		System.out.println(str.substring(6, 13));
		//소문자 변경
		System.out.println(str.toLowerCase());
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//문자열 길이
		System.out.println(str.length());
		//"Hello"으롤 시작하는지 여부
		System.out.println(str.startsWith("Hello"));
		//"Dong"으로 끝나는지 여부
		System.out.println(str.endsWith("Dong"));
		//"Hong"을"kim"으로 변경
		System.out.println(str.replace("Hong", "kim"));
		//"Name"을 "NickName"으로 치환 --https://djusti.tistory.com/8
		System.out.println(str.replaceAll("Name", "NickName"));
		//문자열 리턴
		System.out.println(str.toString());
		
		str = "    안녕하세요,     반갑습니다";
		//앞뒤 공백 제거
		System.out.println(str.trim());
		//모든공백 제거
		System.out.println(str.replace(" ", ""));
		
		str=String.valueOf(10);
		str=String.valueOf(10.5);
		
		str = "홍길동,이순신,유관순,안중근";
		String[] arr = str.split(","); //,를 구분자로나눠서 배열로 리턴
		
		
		
		
		
		
		
	}

}
