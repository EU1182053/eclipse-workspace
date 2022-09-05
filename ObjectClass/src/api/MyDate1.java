package api;

public class MyDate1 {
	private int day,month,year;
	public MyDate1() {
	day=0;month=0;year=0;
	}
	public MyDate1(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals overriden by MyDate1");
	  // if date same then it should true
		// how can we compare 2 dates for day, month and year
		MyDate1 dd=(MyDate1)obj;  // downcasting
		//this->date5, dd->date7
		if(this.day==dd.day && this.month==dd.month && this.year==dd.year) 
			return true;
		else return false;
		
	}
	
	@Override
	public int hashCode() {
		int realHashcode=super.hashCode();
		System.out.println(realHashcode);
		System.out.println("hashcode overriden by MyDate1");
		return day+month+year;
	}
	@Override
	public String toString() {
		return "MyDate1 ["+ day +"/" + month + "/" + year + "]";
		
	}
	
}