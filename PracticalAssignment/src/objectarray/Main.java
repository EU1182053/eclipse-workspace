//Implement Following Problem Statement using Object Array
//
//1. Create LocalTrain class with id, source, destination, type (harbour, central, western), String array of stops
//2. Declare constructors, getter setters, toString and other approproate methods for displaying info of train
//3. Create LocalTrain Array having multiple LocalTrain objects and display
//4. Perform following operations on Student Array
//	a. Search any train by id given by user
//	b. Search trains starting from same source given by user
//	c. Search trains reaching to same destination given by user
//	d. Search trains starting from and reaching to same destination given by user
//	e. Search trains by type
//	f. Search trains which stop at station given by user


package objectarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);

		
		int ch;
		do {
			System.out.println(
					"1.Search by id\n2.Search by Source\n3.Search by destination\n4.Search by Type\n5.Search by any Custom station\n6.Search by Sorce and Destination\n7.Display all Trains\n8.Back");
			ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("Enter id of the train...");
				int id = sc.nextInt();
				
				Operation op = new Operation();
				op.searchById(id);
				
				break;

			case 2:
				System.out.println("Search train by source...");
				String src = sc.next();
				
				op = new Operation();
				op.searchBySource(src);
				
				break;

			case 3:
				System.out.println("Search train by destination ...");
				String destn = sc.next();
				op = new Operation();
				op.searchByDestination(destn);
				
				break;

			case 4:
				System.out.println("Search train by Train Type....");
				String trainType = sc.next();
				op = new Operation();
				op.searchByLine(trainType);
				break;

			case 5:
				System.out.println("Search train which halts at station given by user...");
				String station = sc.next();
				
				op = new Operation();
				op.searchByStation(station);
				break;
				
			case 6:
				System.out.println("Search trains by source and destination...");
				src = sc.next();
				destn = sc.next();
				
				op = new Operation();
				op.searchBySourceAndDestination(src, destn);
				break;
				
			case 7:
				
				op = new Operation();
				op.displayTrains();
				break;
			default:
				break;

			}

		} while (ch != 7);

	}

}
