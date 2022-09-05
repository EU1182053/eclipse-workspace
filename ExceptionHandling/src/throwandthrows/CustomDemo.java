package throwandthrows;

import java.util.Scanner;

import customexceptions.InvalidAgeException;
import customexceptions.NegativeAgeException;

public class CustomDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter voter age:");
		int age=sc.nextInt();
		Voter voter=new Voter();
			voter.checkAge(age);
		} catch (InvalidAgeException | NegativeAgeException e) {
			System.out.println("Exception passed from callee to caller");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		// put any other method calls
		System.out.println("Application ended here");
	}

}