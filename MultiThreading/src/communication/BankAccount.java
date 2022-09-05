package communication;

public class BankAccount {
	
	private long accountNum;
	private int custId;
	private double balance;
	private String type;
	
	

	@Override
	public String toString() {
		return "BankAccount [accountNum=" + accountNum + ", custId=" + custId + ", balance=" + balance + ", type="
				+ type + "]";
	}



	public long getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}



	public int getCustId() {
		return custId;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	public BankAccount() {
		accountNum=1111;
		custId=2222;
		type="Saving";
		balance=0;
}


	public BankAccount(long accountNum, int custId, String type, double balance) {
		super();
		this.accountNum = accountNum;
		this.custId = custId;
		this.balance = balance;
		this.type = type;
	}



	public double deposit(double amount)
	{
		System.out.println(Thread.currentThread().getName()+" entered in deposit");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(amount + " to deposit");
		balance=balance+amount;
		System.out.println(Thread.currentThread().getName()+" exited from deposit");
		return balance;
	}
	
	public double withdraw(double amount)
	{
		System.out.println(Thread.currentThread().getName()+" entered in withdraw");
		System.out.println(amount + " to withdraw");
		balance=balance-amount;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" exited from withdraw");
		return balance;
	}

}
