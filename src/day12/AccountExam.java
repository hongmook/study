package day12;

public class AccountExam {

	public static void main(String[] args) {

		Account account = new Account();
		
		//예금
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
		//출금
		try {
			account.withdraw(20000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage()); //예외객체 내부에 저장된 문자열을 가져옴
			e.printStackTrace();//예외발생코드를 추적해서 모두 콘솔에 출력
		}
		
	}

}
