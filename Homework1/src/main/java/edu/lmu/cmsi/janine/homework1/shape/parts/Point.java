public class Point {

	private double x;
	private double y;
	
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX () {
		return this.x;
	}
	public void setX (double x) {
		this.x = x;
	}
	public double getY () {
		return this.y;
	}
	public void setY (double y) {
		this.y = y;
	}
	public void setPoint (double x, double y) {	
		this.x = x;
		this.y = y;
	}
	public String toString () {
		return "(" + this.x + "," + this.y + ")";
	}	
	public double getDistance (Point point) {
		double xDist = Math.abs(this.x - point.getX());
		double yDist = Math.abs(this.y - point.getY());
		double distance = Math.pow(xDist, 2) + Math.pow(yDist, 2);
		distance = Math.sqrt(distance);
		return distance;
	}
		
	public boolean equals (Object object) {
		if (!(object instanceof Point)) {
			return false;
		}
		if (this.getX() == ((Point)object).getX() && this.getY() == ((Point)object).getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		Point example1 = new Point (5.0, 6.0);
		Point example1b = new Point (5.0, 6.0);
		Point example2 = new Point (5.0, -6.0);
		Point example3 = new Point (-5.0, -6.0);
		Point example4 = new Point (-5.0, 6.0);
	
		//setX and setY
		System.out.println("Example 2 [x] should be:" + example2.getX());
		System.out.println("Example 2 [y] should be:" + example2.getY());
		example2.setX(3.0);
		example2.setY(4.0);
		System.out.println("Example 2 [x] should now be:" + example2.getX());
		System.out.println("Example 2 [y] should now be:" + example2.getY());
		example3.setPoint(3.0, 4.0);
		System.out.println("Example 3 [x] should now be:" + example3.getX());
		System.out.println("Example 3 [y] should now be:" + example3.getY());

		//equals method
		if (example2.equals(example3) == true) {
			System.out.println("Example 2 is the same as Example 3!");
		}
		else {
			System.out.println("Example 2 is not the same as Example 3!");
		}
		
		//distance method
		System.out.println(example1.getDistance(example2) + "");
		
		//toString method
		System.out.println(example1.toString());
	}
		
}