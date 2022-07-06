package opss_concepts;

public class Bank_Account_Example {

	/** * ***Exercise**** 1. 
	 * 1. Create a Bank Account class 
	 * 2. Create private member variables for Account Number, Account Name and Account Balance 
	 * 3. Create methods to deposit and withdraw the amount and to display the current Balance 
	 * 4. Create an constructor with arguments for Account Number, Name and Balance *
	 * 5. Create a class BankAccount Main with a main method 
	 * 6. Create an object of Bank Account 
	 * 7. Call the methods to deposit and withdraw the money from Bank Account and Display the current Balance */
	
	private long accNo;
	private String accName;
	private double accBalence;
	
	public void deposit(double amount) {
		if(accBalence > 0) {
			accBalence = accBalence + amount;
			System.out.println("Successfully deposited $ " + amount);
		} else {
			System.out.println("Cannot deposit "+ amount);
		}
	}
	public void withdraw(double amount) {
		if(accBalence > 0) {
			accBalence = accBalence - amount;
			System.out.println("Successfully deposited $ " + amount);
		} else {
			System.out.println("Cannot deposit "+ amount);
		}
	}
	public void displayBalence() {
		System.out.println("Your current balence is $ " + accBalence);
	}
	
	public Bank_Account_Example(long accNo,String accName,double accBalence) {
		this.accBalence = accBalence;
		this.accName = accName;
		this.accNo = accNo;
	}
}
