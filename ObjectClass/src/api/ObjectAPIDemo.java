package api;

public class ObjectAPIDemo {
public static void main(String[] args) {  // main thread starts from here
	
	MyDate date1=new MyDate(17,8,2022);
	MyDate date2=new MyDate(16,6,2021);
	MyDate date3=new MyDate(17,8,2022);
	MyDate date4=new MyDate(13,8,2021);
	/*hashCode is numeric representation of memory address of object*/
    int hashdate1=date1.hashCode();
    System.out.println("hashcode of "+date1+":"+hashdate1);
    int hashdate2=date2.hashCode();
    System.out.println("hashcode of "+date2+":"+hashdate2);
    int hashdate3=date3.hashCode();
    System.out.println("hashcode of "+date3+":"+hashdate3);
    int hashdate4=date4.hashCode();
    System.out.println("hashcode of "+date4+":"+hashdate4);
    
    boolean b1=date1.equals(date3);  // hashcode compared
    System.out.println(date1+" equals "+date3+" ? "+b1);
    
    System.out.println("------------------------");
    String s1=new String("Hi");  // new memory address, still hashcode same
    String s2=new String("Hello");
    String s3=new String("Hi");  // new memory address,  still hashcode same
    /*String class overrides hashCode method : s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]*/
    int hashs1=s1.hashCode();
    System.out.println("hashcode of "+s1+":"+hashs1);
    int hashs2=s2.hashCode();
    System.out.println("hashcode of "+s2+":"+hashs2);
    int hashs3=s3.hashCode();
    System.out.println("hashcode of "+s3+":"+hashs3);
    /*if Strings have same characters then hashcode comes same*/
    
    boolean sb1=s1.equals(s3);  // equals is overriden : character by character comparision
    System.out.println(s1+" equals "+s3+" ? "+sb1);
    
    /*rule : if u r overriding equals, override hashcode also*/
    
   
    MyDate1 date5=new MyDate1(17,8,2022);
	MyDate1 date6=new MyDate1(16,6,2021);
	MyDate1 date7=new MyDate1(17,8,2022);
	MyDate1 date8=new MyDate1(13,8,2021);
	
    int hashdate5=date5.hashCode();
    System.out.println("hashcode of "+date5+":"+hashdate5);
    int hashdate7=date7.hashCode();
    System.out.println("hashcode of "+date7+":"+hashdate7);
	boolean b2=date5.equals(date7);
	 System.out.println(date5+" equals "+date7+" ? "+b2);

	
}
}