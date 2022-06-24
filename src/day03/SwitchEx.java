package day03;

public class SwitchEx {

	public static void main(String[] args) {
		/*
		 * switch(변수) { 
		 * case 값1: 
		 * 		실행문; 
		 * 		break; 
		 * case 값2: 
		 * 		실행문; 
		 * 		break; --> 안주면 모든 값에서 실행됨
		 * default :
		 * 		실행문;
		 * }
		 */
		
		//A : "관리자" 출력, G : "게스트", U : "회원" 입니다.
		char grade = 'G';
		
		switch(grade) {
		case 'A':
			System.out.println("관리자 입니다.");
			break;
		case 'G':
			System.out.println("게스트 입니다.");
			break;
		case 'U':
			System.out.println("회원 입니다.");
			break;
		default :
			System.out.println("유령입니다.");
		}

	}

}