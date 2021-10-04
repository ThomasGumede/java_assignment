class Cylinder extends Circle{
    // these are the instance variables
    private double height;

		
	/**
     * @param xCoord
     * @param yCoord
     * @param radius
     * @param height
     */
	public Cylinder(int xCoord, int yCoord, int radius, double height) {
        super(xCoord, yCoord, radius);
        setHeight(height);
	}
	/**
	 * 
	 */
    public Cylinder() {
        super();
    }

    // Set height of cylinder
    public void setHeight(double height)
    {
        
        this.height = height;
    }

    // Get height of cylinder
    public double getHeight()
    {
        return height;
    }
	//printing the coordinates
	// Calculate surface area of the cylinder
    public double surfaceArea()
    {
        return 2 * super.area() + (2 * Math.PI * radius * height);
    }

    // Calculate volume of Cylinder
    public double volume()
    {
        return super.area() * height;
    }

    // print all
    public void print()
    
    {
        super.print();
        System.out.println("Height = " + height);
        System.out.println("Surface area = " + surfaceArea());
        System.out.println("Volume = " + volume());
        
    }	

}
public class TestCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two Cylinder object, p1 and p2
		Cylinder p1 = new Cylinder();
		Cylinder p2 = new Cylinder(10, 20, 12, 11);
		
		// Space...
		System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
		
		//Print Points
		p1.print();
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
        p1.setHeight(13);
		
		//Print new content of p1 object
		p1.print();
		
        // Space...
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

		//use get methods
        int xTemp, yTemp, radiusTemp;
        double tempHeight;
		xTemp = p2.getxCoord();
		yTemp = p2.getyCoord();
        radiusTemp = p2.getRadius();
        tempHeight = p2.getHeight();
		
		new Cylinder(xTemp, yTemp, radiusTemp, tempHeight).print();

	}

}
