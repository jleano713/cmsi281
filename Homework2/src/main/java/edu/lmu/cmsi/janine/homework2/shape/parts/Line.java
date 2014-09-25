package edu.lmu.cmsi.janine.homework2.shape.parts;

public class Line {

	private Point point1 = new Point(0.0, 0.0);
	private Point point2 = new Point(1.0, 1.0);
	private double slope;
	
	public Line(Point point1, Point point2) {
		if (point1 == null || point2 == null) {
			throw new IllegalArgumentException("points cannot be null");
		}
		this.point1.setPoint(point1);
		this.point2.setPoint(point2);
		this.slope = point2.getSlope(point1);
	}

	public Point getPoint1() {
		return this.point1;
	}
	public void setPoint1(Point point1) {
		this.point1.setPoint(point1);
	}
	
	public Point getPoint2() {
		return this.point2;
	}
	public void setPoint2(Point point2) {
		this.point2.setPoint(point2);
	}
	
	public double getSlope() {
		return this.slope;
	}
	
	public void setLine(Line line) {
		this.setPoint1(line.getPoint1());
		this.setPoint2(line.getPoint2());
	}

	public Point getMidpoint () {
		double midX = (this.point1.getX() + this.point2.getX()) / 2.0;
		double midY = (this.point1.getY() + this.point2.getY()) / 2.0;
		Point midpoint = new Point(midX, midY);
		return midpoint;
	}
	
	public boolean equals (Object object) {
		if (!(object instanceof Line)) {
			return false;
		}
		if (this.point1.equals(((Line)object).getPoint1()) && this.point2.equals(((Line)object).getPoint2())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString () {
		return this.point1.toString() + " >> " + this.point2.toString();
	}

	/* 
	// i was not able to make this method
	public boolean doesItIntersect (Line line) {
		double equation = 
	} 
	*/
	
	public double getLength() {
		return this.point1.getDistance(this.point2);
	}
}
