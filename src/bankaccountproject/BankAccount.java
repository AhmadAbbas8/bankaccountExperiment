
package bankaccountproject;

public class BankAccount {

	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;

	}

	public void deposit(double amount) {

		this.balance += amount;

	}

	public boolean withdrow(double amount) {
		if (amount < balance) {
			this.balance -= amount;
			return true;
		}
		return false;

	}

	public double getBalance() {
		return this.balance;

	}

}
