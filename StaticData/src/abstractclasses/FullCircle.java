package abstractclasses;

public class FullCircle extends Circle{

	@Override
	 double perimeter() {
	
		return 2*pie*getRadius();
	}

	@Override
	public void calculateDiameter() {
		 diameter=2*getRadius();
		
	}

}