package trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		File file= new File("india.txt");
		Scanner sc=null;
		try {
			sc=new Scanner(file);
			// logic of reading a file 
			// closing  a file // it may get skipped
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // file opened in read mode
		finally {
			sc.close(); // solution u have to close the resources
		}
		/*now resources are auto closable. API implementing AutoCloseable Interface*/
		/*use try with resources : try (open the resources here then they will be auto closed)*/
		
		
		try(Scanner sc1=new Scanner(file)){
			// logic of reading a file
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		// no need finally to close resource
	}
}