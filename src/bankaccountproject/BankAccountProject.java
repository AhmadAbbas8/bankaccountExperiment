
package bankaccountproject;

public class BankAccountProject {

	public static void main(String[] args) {

		BankAccount bankAccount1 = new BankAccount("123");
		bankAccount1.deposit(1000);
		bankAccount1.deposit(2000);
		System.out.println("your current balance : " + bankAccount1.getBalance());
		bankAccount1.withdrow(500);
		System.out.println("your current balance : " + bankAccount1.getBalance());

	}

}
