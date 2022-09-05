package listdemos;

import java.util.Arrays;
import java.util.List;

public class ListDemo2 {
public static void main(String[] args) {
	String cities[]={"mumbai","Pune","mumbai","Satara"};
	
	List<String> cityList=Arrays.asList(cities);  // immutable
	System.out.println(cityList);
	System.out.println(cityList.getClass());
	cityList.add("solapur");
	System.out.println(cityList);
	List<Double> salaryList=List.of(67890.00,56000.80,45000.50,60000.00); // immutable
	salaryList.add(67000.00);
	List<Double> salaryList1=List.of();
	List<Double> salaryList2=List.of(10000.0);
	List<Double> salaryList3=List.of(10000.0,50000.0,45000.0);
	/*var args : ...*/
}
}