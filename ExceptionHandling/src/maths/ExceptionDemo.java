package maths;

import java.util.Scanner;

public class ExceptionDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	MathOperation op=new MathOperation();
	System.out.println("Enter 2 numbers for operations");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	double addr=op.add(num1, num2);
	System.out.println("Addition is "+addr);
	double divr=op.divide(num1, num2);
	System.out.println("Division is "+divr);
	double multr=op.multiply(num1, num2);
	System.out.println("Multiplication is "+multr);
	double subr=op.subtract(num1, num2);
	System.out.println("Subtraction is "+subr);
	System.out.println("Application flow ended here");
}
}