package assignment308;

public class Customer {

	private int account_number, customer_id;
	private String type;
	private double balance;
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [account_number=" + account_number + ", customer_id=" + customer_id + ", type=" + type
				+ ", balance=" + balance + "]";
	}
	public Customer(int account_number, int customer_id, String type, double balance) {
		super();
		this.account_number = account_number;
		this.customer_id = customer_id;
		this.type = type;
		this.balance = balance;
	}
	
	
}
