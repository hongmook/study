package day12;

public class Account {

	private long balance;
	
	public Account() {
	}
	
	long getBalance() {
		return balance;
	}
	
	//입금
	void deposit(int money) {
		balance += money;
	}
	
	//출금
	void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족 : " + (money-balance));
		}
		
		balance -= money;
	}
	
}
