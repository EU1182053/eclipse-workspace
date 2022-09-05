package throwdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
public static void main(String[] args) {
	Scanner sc=null;
	
	try {
			if(sc==null) {
				throw new NullPointerException("Scanner is null");// explicit throw of built in exceptions, not needed
			}

			System.out.println("Enter Number to make square");
			int num=sc.nextInt();
			System.out.println("number is:"+num);
			System.out.println("Square is:"+Math.pow(num, 2));
			
	}
	catch (NullPointerException | InputMismatchException e) {
		System.out.println(e);
	}
	
	
}
}