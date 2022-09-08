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

				// deposit
				try {
					
					
						boolean depositMoney = crud.depositMoney();

						System.out.println("Query executed: " + depositMoney);
					
					

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			case 2:
				// Withdraw
				try {
					
					boolean withdrawMoney = crud.withdrawMoney();
					System.out.println("Query executed: "+ withdrawMoney);

					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;

			case 3:
				// Transfer Money
				try {

					boolean transferMoney = crud.transferMoney();
					
					System.out.println("Query executed: "+ transferMoney);
				}
					 catch (Exception e) {
						// TODO: handle exception
					}

				
				break;

			case 4:
				// account details
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
