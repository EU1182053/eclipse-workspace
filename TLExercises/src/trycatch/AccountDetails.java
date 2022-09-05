package trycatch;

public class AccountDetails {
	private static  int machineBalance;
	private static  int accountBalance;
	private static  int pin;
	private static  int deposit;
	private static  int withdraw;
	private static  String name;
	private static  String type;
	private static  int accountNumber;
	public int getMachineBalance() {
		return machineBalance;
	}
	public void setMachineBalance(int machineBalance) {
		this.machineBalance = machineBalance;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "AccountDetails [machineBalance=" + machineBalance + ", accountBalance=" + accountBalance + ", pin="
				+ pin + ", deposit=" + deposit + ", withdraw=" + withdraw + ", name=" + name + ", type=" + type
				+ ", accountNumber=" + accountNumber + "]";
	}
	public AccountDetails(int machineBalance, int accountBalance, int pin, int deposit, int withdraw, String name,
			String type, int accountNumber) {
		super();
		this.machineBalance = machineBalance;
		this.accountBalance = accountBalance;
		this.pin = pin;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.name = name;
		this.type = type;
		this.accountNumber = accountNumber;
	}
	
	
	  
	
}
