package abstractclasses;


public class AbstractDemo {
	public static void main(String[] args) {
		//Circle c=new Circle(); // can not create object of partially implemented classes(abstract classes)
		SemiCircle semicircle=new SemiCircle(); // superclass object gets automaticaly created
		semicircle.setRadius(12);  // super class method
		semicircle.calculateDiameter(); // subclass
		double ar=semicircle.area(); 
		System.out.println(ar);
		double p=semicircle.perimeter(); // subclass
		
		Circle c=new SemiCircle();
		c.setRadius(2);
		c.calculateDiameter();
		double ars=c.area();
		double prs=c.perimeter();
		System.out.println(ars);
		System.out.println(prs);
		
		c=new FullCircle();
		c.setRadius(2);
		c.calculateDiameter();
		double arc=c.area();
		double prc=c.perimeter();
		System.out.println(arc);
		System.out.println(prc);
		
	
	}
}