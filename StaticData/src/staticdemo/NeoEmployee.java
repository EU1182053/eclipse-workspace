package staticdemo;

public class NeoEmployee {
	/*shared data, loaded at the time of class loading before object creation
	 *single copy, access via class name*/
	private int empId;
	private String empName;
	private double basicSalary;
	public  static String companyName;
	/*used to initialize static variables, loaded automatically at the time of class loading*/
	/*block loading done in multi-threading environment*/
	

	static {
		System.out.println("static block executed");
		companyName="Neosoft";
	}
	static {
		System.err.println("static block 2 executed");
	}
	
	
	public NeoEmployee(int empId, String empName, double basicSalary) {

		System.out.println("constructor executed");
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}
	
	@Override
	public String toString() {
		return "NeoEmployee [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + "]";
	}
	
	/*common behavior*/
	public static String getCompanyName() {
		return companyName;
	}
	
	public static void changeCompanyName(String cname) {
		companyName=cname;
	}
	public void test() {
		System.out.println(companyName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
