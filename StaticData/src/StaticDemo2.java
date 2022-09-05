
import staticdemo2.NeoEmployee;

public class StaticDemo2 {

	public static void main(String[] args) {

		// Count number of NeoEmployees and display that count
		System.out.println(NeoEmployee.count);
		NeoEmployee emp1=new NeoEmployee(1, "Pooja", 40000);
		System.out.println(NeoEmployee.count);
		NeoEmployee emp2=new NeoEmployee(2, "Pooja", 40000);
		System.out.println(NeoEmployee.count);
		NeoEmployee emp3=new NeoEmployee(3, "Pooja", 40000);
		System.out.println(NeoEmployee.count);
		NeoEmployee emp4=new NeoEmployee(4, "Pooja", 40000);
		System.out.println(NeoEmployee.count);
		NeoEmployee emp5=new NeoEmployee(5, "Pooja", 40000);
		System.out.println(NeoEmployee.count);
	}

}