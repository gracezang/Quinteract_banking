package cisc327;
/**
 * Class to store account info
 * 
 *
 */

public class accounts {
	private int accountNumber;
	private double accountBalance;
	private String accountName;
	
	public accounts(int number,String name, double balance) {
		this.accountNumber = number;
		this.accountBalance = balance;
		this.accountName = name;
	}
	
	public void setBalance(double number) {
		this.accountBalance = number;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public String toString() {
		String a = this.accountNumber + " " + this.accountBalance + " " + this.accountName + "!";
		return a;
	}
}
