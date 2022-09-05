package maths;

public class MathOperation {

	public double add(int a, int  b) {
		return a+b;
	}
	
	public double subtract(int a, int b) {
		return a-b;
	}
	
	public double multiply(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		double div=0;
		try {
		div= a/b;     // ArithmeticException object
		double result=div+7; // extra coding that gets skipped if exp occurs above
		System.out.println("this stmt gets skipped if exception occurs above");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Exception occured");
			System.out.println(ae);  // toString
		 }
		catch(Exception e) {
			System.out.println("Exception handled in Last catch");
			System.out.println(e); // toString of subclass
		} /*super class catch should be below subclass catch*/
		finally {
			/* release the resources in finally block*/
			/*file closing, scanner closing, db connection closing*/
			System.out.println("this is stmt is very much important");
			System.out.println("finally always gets excuted thought excpetion is there or not");
		}
		System.out.println("normal execution contiues from here");
		return div;
	}
	/*try with resources : try(open the resources here)*/
}