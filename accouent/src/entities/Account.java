package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double accountValue;
	

	public Account(int accountNumber, String accountHolder) {

		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	
	public double depositValue(double value) {
		
		return this.accountValue += value;
	}
	
	public double whithdrawValue(double value) {
		
		 	this.accountValue -= 5;
		 	
		return this.accountValue -= value;
	}
	
	public String toString() {
		
		return "Account "+ accountNumber+", "+"Holder: "+accountHolder+", "+"Balance: "+String.format("%.2f",accountValue);
	}

}
