package throwandthrows;

import customexceptions.InvalidAgeException;
import customexceptions.NegativeAgeException;

public class Voter {
    
	public void checkAge(int age)throws NegativeAgeException, InvalidAgeException  {
		
			if(age<0) {
					throw new NegativeAgeException("negative age entered : "+age); // explicit throw, need a catch to handle
			}
			else if (age<18 && age >=0) {
			      	throw new InvalidAgeException();
			}
			else {
				System.out.println(age + " is valid.. u can go with further steps");
			}
	}
	// ArithmeticException, ArrayIndexOutOfException
	//NegativeAgeException, InvalidAgeException : Custom Exception classes
}