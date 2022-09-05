package trycatch;

public class Operation {
	
	boolean b;

//	public AccountDetails(int machineBalance, int accountBalance, int pin, int deposit, int withdraw, String name,
//	int type, int accountNumber)

// deposit and withdraw will be user input
// 1st account
	AccountDetails accountDetails1 = new AccountDetails(10000, 5000, 1234, 0, 0, "Admin", "Saving", 4590);

// 2nd account
// with machine balance is less than account balance
	AccountDetails accountDetails2 = new AccountDetails(10000, 50000, 1234, 0, 0, "User", "Saving", 4690);

	AccountDetails accountDetails3 = new AccountDetails(10000, 5000, 1234, 0, 0, "Admin", "Saving", 4790);

	AccountDetails accountDetails4 = new AccountDetails(10000, 5000, 1234, 0, 0, "Admin", "Saving", 4890);

	AccountDetails accountDetails5 = new AccountDetails(10000, 5000, 1234, 0, 0, "Admin", "Saving", 4990);

	AccountDetails bankData[] = { accountDetails1, accountDetails2, accountDetails3, accountDetails4, accountDetails5 };
	
	
	public boolean verifyAccount(int accountNumber, int pin ) {
		System.out.println(accountNumber+""+ pin);
		boolean b = false;
		for(AccountDetails ac: bankData) {
			System.out.println(""+ac.getAccountNumber()+""+ac.getPin());
			if(ac.getAccountNumber() == accountNumber) {
				if(ac.getPin() == pin) {
					b = true;
					
				}
				
			}
			
		}
		return b;
	}
	
	
	public int checkBalance(int accountNumber, int pin) throws InvalidAccountCredentials {
		int accountBalance = 0;
		b = true;
		for(AccountDetails ac: bankData) {
			if(ac.getAccountNumber() == accountNumber) {
				if(ac.getPin() == pin) {
					
					accountBalance =  ac.getAccountBalance();
				}
				else {
					b = false;
				}
				
			}
			else {
				b = false;
			}
			
		}
		if(b)
			return accountBalance;
		else
			throw new InvalidAccountCredentials("");
	} 
	
	public boolean  generatePin(int accountNumber, int pin) throws FourDigitPin {
		b = false;
		if(pin >= 1000 && pin <= 9999) {
			for(AccountDetails ac: bankData) {
				if(ac.getAccountNumber() == accountNumber) {
					ac.setPin(pin);
				}
			}
		}
		else {
			throw new FourDigitPin("");
		}
		return b;
	}
	
	public boolean depositMoney(int accountNumber, int depositMoney ) {
		b = false;
		for(AccountDetails ac: bankData) {
			if(ac.getAccountNumber() == accountNumber) {
				ac.setAccountBalance(depositMoney + ac.getAccountBalance());
				b = true;
			}
		}
		return b;
	}
	
	public boolean withdrawMoney (int accountNumber, int withdrawMoney) {
		b = false;
		for(AccountDetails ac: bankData) {
			if(ac.getAccountNumber() == accountNumber) {
				ac.setAccountBalance(  ac.getAccountBalance() - withdrawMoney);
				b = true;
			}
		}
		return b;
	}
}
