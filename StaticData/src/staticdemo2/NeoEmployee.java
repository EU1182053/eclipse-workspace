package staticdemo2;

public class NeoEmployee {
	private int empId;
	private String empName;
	private double basicSalary;
	public  static String companyName;
	public static int count;
	
	static {
		System.out.println("static block executed");
		companyName="Neosoft";
	}
	
	public NeoEmployee(int empId, String empName, double basicSalary) {
		System.out.println("constructor executed");
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		count++;
	}
	
	@Override
	public String toString() {
		return "NeoEmployee [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + "]";
	}
	/*common behavior*/
	public static String getCompanyName() {
		return companyName;
	}
	public void test() {
		System.out.println(companyName);
	}

}
