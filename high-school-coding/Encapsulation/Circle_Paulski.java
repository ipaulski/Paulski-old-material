/**
 * Circle class.
 */
public class Circle_Paulski {
	private static double PI = 3.14;
	private double radius;
	
	public Circle_Paulski() {
		radius = 1;			
	}
	
	public Circle_Paulski(double r) {
		radius = r;
	}

	public void setRadius(double newRadius) {
	 	radius = newRadius;
	}


	public double area() {
	 	double circleArea;
	 	
	 	circleArea = PI * radius * radius;
	 	return(circleArea);
	}

	
	public double getRadius() {
	 	return(radius);
	}
	
	
	public static void displayAreaFormula() {
	 	System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	
	public boolean equals(Object obj) {
		Circle_Paulski testObj = (Circle_Paulski)obj;
		
	 	if (testObj.getRadius() == radius) {
			return(true);
		} else {
			return(false);
		}
	}


	public String toString() {
		String circleString;

		circleString = "Circle has radius " + radius;
	 	return(circleString);
	}
}
