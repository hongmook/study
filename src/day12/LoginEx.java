package day12;

import java.util.Scanner;

public class LoginEx {

	static String user_id = "joy";
	static String user_pw = "1234";
	
	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String input_id = scan.nextLine();
	
		System.out.print("비밀번호 : ");
		String input_pw = scan.nextLine();
		
		try {
			login(input_id, input_pw);
		} catch (LoginException e) {
			e.printStackTrace();
		}
		
	}
	
	
	static void login(String input_id, String input_pw) throws LoginException{
		
		if(!user_id.equals(input_id)) {
//			throw new LoginException("아이디가 올바르지 않습니다");
			System.out.println("아이디가 올바르지 않습니다");
		} else if (!user_pw.equals(input_pw)) {
//			throw new LoginException("비밀번호가 올바르지 않습니다");
			System.out.println("비밀번호가 올바르지 않습니다");
		} else {
			System.out.println("로그인 성공");
		}
	}

}
