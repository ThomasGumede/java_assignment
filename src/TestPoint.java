class Point {
	// these are the instance variables
	private int xCoord;
	private int yCoord;
	/**
	 * @return the xCoord
	 *///returning the x coordinate
	public int getxCoord() {
		return xCoord;
	}
	/**
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}
	/**
	 * @return the yCoord
	 *///returning the y coordinate
	public int getyCoord() {
		return yCoord;
	}
	/**
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	//showing the point
	public void showPoint() {
		
		System.out.println("I am showing point " + "("+xCoord+", "+yCoord+")");
	}
		
	/**
	 * @param xCoord
	 * @param yCoord
	 */
	public Point(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	/**
	 * 
	 */
	public Point() {
		this(0, 0);
	}
	//printing the coordinates
	public void print() {
		
		System.out.println("x = "+ xCoord+ " y = "+yCoord);
	}	

}
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two Point object, p1 and p2
		Point p1 = new Point();
		Point p2 = new Point(10, 20);
		
		// Show the Points
		p1.showPoint();
		p2.showPoint();
		
		//Print Points
		p1.print();
		p2.print();
		
		//Test the getter and setter methods
		p1.setxCoord(45);
		p1.setyCoord(100);
		
		//Print new content of p1 object
		p1.print();
		
		//use get methods
		int xTemp, yTemp;
		xTemp = p2.getxCoord();
		yTemp = p2.getyCoord();
		
		new Point(xTemp, yTemp).print();

	}

}
