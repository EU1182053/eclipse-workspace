import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import staticdemo.NeoEmployee;

public class StaticDemoDemo{
	static {
		System.err.println("in main static block");
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(NeoEmployee.companyName);
		String cname=NeoEmployee.getCompanyName();
		System.out.println(cname);
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter companyName");
		String comp=br.readLine();
		NeoEmployee.changeCompanyName(comp);
		System.out.println(NeoEmployee.getCompanyName());
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter Name:");
		String name=br.readLine();
		System.out.println("Enter Salary:");
		double salary=sc.nextDouble();
		NeoEmployee nemp=new NeoEmployee(id, name, salary);
		System.out.println(nemp);
		System.out.println(NeoEmployee.getCompanyName());
	}
}