package day02;

public class Operater {

		public static void main(String[] args) {
			int a, b, c=5;
			
			a = b = c;
			System.out.println("a:" + a + ", b:" + b);
			
			a += 1; // a = a+1
			System.out.println("a:" + a);
			
			a %= 2; // a = a%2
			System.out.println("a:" + a);
			
			//a++, ++a ==> a = a+1, a+=1 
			System.out.println("a++:" + a++); //a를 찍고 다음 실행할때 1증가
			System.out.println("a++:" + a);
			
			/*
			 * System.out.println("a++:" + ++a); //증가 시키고 a를 1증가 System.out.println("a++:" +a); //증가 시키고 a를 1증가
			 */			
			
			// a++ + --b * 2; 연산자 우선순위 : (p77)
			System.out.println(a++ + --b * 2);
			
			//(a++ + --b)*2
			System.out.println((a++ + --b)*2);
			System.out.println(a);
		
			//나누기
			int num = 3 % 1;
			System.out.println(num);
			
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Long.MAX_VALUE);
			
			//문자열 결합 +
			//"코로나" + 10 + 9; --> 우선순위 동일 -> 왼쪽부터 시작 -> 코로나10(문자가됨)+9 ->코로나109
			System.out.println("코로나" + 10 + 9);
			//10 + 9 + "코로나"; --> 우선순위 동일 -> 왼쪽부터 시작 -> 19+코로나 -> 19코로나
			System.out.println(10 + 9 + "코로나");
			//10 + 9 + "코로나" + 8 * 8 =19코로나64 //==> *주의* 문자열 우선순위
			System.out.println(10 + 9 + "코로나" + 8 * 8);
			
			//비교연산자 ! ==> not, && : and, || : or
			if(1 != 2 && 3 > 4) {
				System.out.println("같지않음");
			}
			
			//비트연산		
			byte bitNum = 3;
			bitNum <<= 2; // bitNum = bitNum << 2;
			System.out.println("3 <<= 2 결과: " + bitNum);
			
			
			//문자열 비교
			String str1 = "홍길동";
			String str4 = "홍길동";
			
			String str2 = new String("홍길동");
			String str3 = new String("홍길동");
			
			if(str1 == str2) {
				System.out.println("str1과 str2는 일치함");
			} else {
				System.out.println("str1과 str2는 불일치");
			}
			
			if(str1.equals(str2)) {
				System.out.println("문자열 내용이 일치함");
			} else {
				System.out.println("문자열 내용이 불일치");
			}
			
			if("홍길동".equals(str2)) {
				System.out.println("문자열 내용이 일치함");
			} else {
				System.out.println("문자열 내용이 불일치");
			}
			
			if(str2 == str3) {
				System.out.println("str2와 str3은 일치함");
			} else {
				System.out.println("str2와 str3은 불일치");
			}
			
			//삼항연산자 : 조건식 ? 참 : 거짓
			int score = 95;
			
			String rs = (score > 90) ? "A학점" : (score > 80) ? "B학점" : "C학점"; 
				System.out.println("삼항연산자 결과 : " + rs);
			
		}
}