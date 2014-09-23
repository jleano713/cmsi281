package edu.lmu.cmsi.janine.homework1.shape.parts;

public class Line {

	private Point point1;
	private Point point2;
	
	public Line (Point point1, Point point2) {
		this.point1 = new Point(point1.getX(), point2.getY());
		this.point2 = new Point(point2.getX(), point2.getY());
	}

	public Point getPoint1 () {
		return this.point1;
	}
	public void setPoint1 (Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2 () {
		return this.point2;
	}
	public void setPoint2 (Point point2) {
		this.point2 = point2;
	}
	public Point getMidpoint () {
		double midX = this.point1.getX() + this.point2.getX() / 2;
		double midY = this.point1.getY() + this.point2.getY() / 2;
		Point midpoint = new Point(midX, midY);
		return midpoint;
	}
	
	public String toString () {
		return this.point1.toString() + " & " + this.point2.toString();
	}

	/* public boolean isHorizontal () {
	}
	
	public boolean doesItIntersect (Line line) {
	}

	public boolean isVertical () {
	} */
	
	public boolean equals (Object object) {
		if (!(object instanceof Line)) {
			return false;
		}
		if (this.toString() == object.toString()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getLength() {
		return this.point1.getDistance(this.point2);
	}
}
