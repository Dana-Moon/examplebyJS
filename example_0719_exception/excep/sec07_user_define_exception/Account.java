package example_0719_exception.excep.sec07_user_define_exception;

public class Account {
	//long 8byte(자바만 유일하게 8byte인 것으로 알고 있다.)
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고 부족:"+(money-balance)+"모자람");
		}
		balance -= money;
	}
}

