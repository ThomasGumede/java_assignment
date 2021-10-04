class Circle extends Point{
	int radius;
	
	double temp = Math.PI;

	/**
	 * 
	 */
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param xCoord
     * @param yCoord
     * @param radius
	 */
	public Circle(int xCoord, int yCoord, int radius) {
		super(xCoord, yCoord);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	// area calculation
	public double area() {
		//calculate area
		double area = temp * (radius * radius);
		return area;
	}
	//Circumference calculation
	public double circumference() {
		//calculate Circumference
		double circumference = 2 * temp * radius;
		return circumference;
	}
	
	//print the Circle parameters, are and circumference
	public void print() {
		System.out.println("Area = " + area());
		System.out.println("Circumference = " + circumference());
		System.out.println("Radius = " + radius);
		super.print();
	}
	

}

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two Cicle object, p1 and p2
		Circle p1 = new Circle();
		Circle p2 = new Circle(20, 34, 30);

		// Space...
		System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
		
		//Print Points
		// p1.print();
		p2.print();


		// Space...
		System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
		
		//Test the getter and setter methods
		p1.setxCoord(45);
		p1.setyCoord(100);
		p1.setRadius(5);
		
		//Print new content of p1 object
		p1.print();


		// Space...
		System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
		
		//use get methods
		int xTemp, yTemp, radiusTemp;
		xTemp = p2.getxCoord();
		yTemp = p2.getyCoord();
		radiusTemp = p2.getRadius();
		
		new Circle(xTemp, yTemp, radiusTemp).print();

	}

}

