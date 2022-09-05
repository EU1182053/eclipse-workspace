package trycatch;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidAccountCredentials {
		Random random = new Random();
		Operation op = new Operation();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch, accountNumber, pin, mobileNumber, matchOTP, userEnteredOTP, newPin, depositMoney, withdrawMoney;
		String type;
		boolean b;
		do {
			System.out.println("1.Check Balace\n2.Generate Pin\n3.Deposit money\n4.Withdraw Money");
			ch = sc.nextInt();
			switch (ch) {

			case 1:

				// Get the Account Number
				try {
					System.out.println("Enter your Account Number.");
					accountNumber = sc.nextInt();

					// get the PIN
					System.out.println("Enter your PIN.");
					pin = sc.nextInt();

					// call the function who will verify the account .
					boolean verifyAccount = op.verifyAccount(accountNumber, pin);
					System.out.println("verifyAccount " + verifyAccount);
					if (verifyAccount) {
						int checkBalance = op.checkBalance(accountNumber, pin);

						System.out.println("Account balance is: " + checkBalance);
					} else {
						throw new InvalidAccountCredentials("Account Number or Pin is Invalid.Please try again!");
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

			case 2:
				// Generate PIN
				try {
					System.out.println("Enter your Account Number.");
					accountNumber = sc.nextInt();

					try {
						System.out.println("Sending the OTP on registered Mobile Number 73XXXXXX90.");

						matchOTP = random.nextInt(1000);
						System.out.println("Your OTP is, " + matchOTP);

						System.out.println("Enter the OTP.");

						userEnteredOTP = sc.nextInt();
						if (userEnteredOTP == matchOTP) {
							try {
								System.out.println("Enter new pin.");
								newPin = sc.nextInt();
								b = op.generatePin(accountNumber, newPin);
								if (b) {
									System.out.println("Pin changed Successfully.");
								} else {
									System.out.println("Error");
								}

							} catch (Exception e) {
								// TODO: handle exception
							}
							// store/replace the new pin in user's account details.
						} else {
							System.out.println("OTP does not match.");
							break;
						}

					} catch (Exception e) {
						// TODO: handle exception
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;

			case 3:
				// Deposit Money
				try {

					System.out.println("Enter your Account Number.");
					accountNumber = sc.nextInt();

					try {
						// get the PIN
						System.out.println("Enter your PIN.");
						pin = sc.nextInt();

						// call the function who will verify the account .
						boolean verifyAccount = op.verifyAccount(accountNumber, pin);

						if (verifyAccount) {
							// call the function who will process the withdraw function.
							System.out.println("Enter amount to proceed the deposit.");
							depositMoney = sc.nextInt();
							b = op.depositMoney(accountNumber, depositMoney);
							if (b) {
								System.out.println("Money deposited successfully.");
								System.out.println("Your account balance is: " + op.checkBalance(accountNumber, pin));
							} else {
								System.out.println("Error");
							}
						}

					} catch (Exception e) {
						// TODO: handle exception
					}

				} catch (Exception e) {
					// TODO: handle exception
				}
				break;

			case 4:
				// Withdraw Money
				try {

					System.out.println("Enter your Account Number.");
					accountNumber = sc.nextInt();

					try {
						// get the PIN
						System.out.println("Enter your PIN.");
						pin = sc.nextInt();

						// call the function who will verify the account .
						boolean verifyAccount = op.verifyAccount(accountNumber, pin);

						if (verifyAccount) {
							// call the function who will process the withdraw function.
							System.out.println("Enter amount to proceed the Withdrawl.");
							withdrawMoney = sc.nextInt();

							int checkBalance = op.checkBalance(accountNumber, pin);

							if (checkBalance > withdrawMoney) {
								b = op.withdrawMoney(accountNumber, withdrawMoney);

								if (b) {
									System.out.println("Money Withdrawl success.");
									System.out.println("Your account balance is: " + op.checkBalance(accountNumber, pin));
								}

							}

						}

					} catch (Exception e) {
						// TODO: handle exception
					}

				} catch (Exception e) {
					// TODO: handle exception
				}
				break;

			case 5:
				break;
			default:
				break;
			}
		} while (ch < 6);
	}

}
