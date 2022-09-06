package assignment308;

import java.util.Random;
import java.util.Scanner;

import assignment168.InvalidAccountCredential;

public class Main {

	public static void main(String[] args) throws InvalidAccountCredential {
		Random random = new Random();
		CRUDDemo crud = new CRUDDemo();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch, accountNumber;
		String type;
		boolean b;
		do {
			System.out.println("1.Deposit money\n2.Withdraw Money\n3.Money Transfer\n");
			ch = sc.nextInt();
			switch (ch) {

			case 1:

				// Get the Account Number
				try {
					System.out.println("Enter your Account Number.");
					accountNumber = sc.nextInt();

					

					
					
					
						boolean depositMoney1 = crud.depositMoney(accountNumber);

						System.out.println("Account balance is: " + depositMoney1);
					
					

				} catch (Exception e) {
					// TODO: handle exception
				}

			case 2:
				// Generate PIN
				try {
					System.out.println("Enter your Account Number.");
					accountNumber = sc.nextInt();

					
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;

			case 3:
				// Deposit Money
				try {

					System.out.println("Enter your Account Number.");
					accountNumber = sc.nextInt();

				}
					 catch (Exception e) {
						// TODO: handle exception
					}

				
				break;

			case 4:
				// Withdraw Money
				try {

					System.out.println("Enter your Account Number.");
					accountNumber = sc.nextInt();

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
