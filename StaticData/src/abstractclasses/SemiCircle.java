package abstractclasses;
/*if any class is extending any abstract class then, it has to override and implement all abstract methods of super class*/
/*if subclass does not want to implement all abstract methods : declare that class also abstract but any future classes has to implement those
 * abstract methods*/
public  class SemiCircle extends Circle {
	@Override
		public double area() {
		System.out.println("in subclass method");
				return 0.5*pie*getRadius()*getRadius();
		}	
	
	@Override
     public double perimeter() {
    	 return pie*getRadius()+2*getRadius();
     }
	@Override
	public void calculateDiameter() {
		diameter=2*getRadius();
	}
	
	public void ownMethod() {
		System.out.println("this is own property of Semicircle");
	}
	
}

