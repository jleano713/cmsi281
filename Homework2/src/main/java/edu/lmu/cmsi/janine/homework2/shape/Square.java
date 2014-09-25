package edu.lmu.cmsi.janine.homework2.shape;
import edu.lmu.cmsi.janine.homework2.shape.parts.*;

public class Square {
	private Point point1 = new Point(0.0, 0.0);
	private Point point2;
	private Point point3;
	private Point point4;
	private Line line1;
	private Line line2;
	private Line line3;
	private Line line4;
	private double length;
	

	public Square (Point point1, double length) {
		this.length = length;
		if (point1 != null) {
			this.point1.setPoint(point1);
		}
		this.point2 = new Point(this.point1.getX(), this.point1.getY() + length);
		this.point3 = new Point(this.point1.getX() + length, this.point2.getY());
		this.point4 = new Point(this.point1.getX() + length, this.point1.getY());
		this.line1 = new Line(this.point1, this.point2);
		this.line2 = new Line(this.point2, this.point3);
		this.line3 = new Line(this.point3, this.point4);
		this.line4 = new Line(this.point4, this.point1);
		if (line1.getLength() != line2.getLength()) {
			throw new IllegalArgumentException("Square isn't of equal length in all sides");
		}	
	}
	
	public Point getStartingPoint() {
		return this.point1;
	}
	
	public double getLength() {
		return this.length;
	}

	public double getPerimeter() {
		return this.length * 4.0;
	}
	
	public double getArea () {
		return this.length * this.length;
	}
	
	public boolean containsPoint (Point point) {
		if (point.getX() > this.point3.getX() || point.getX() < this.point1.getX() || 
			point.getY() >  this.point3.getY() || point.getY() < this.point1.getY()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void translate(Point point) {
		double xDiff = Math.abs(point.getX() - this.point1.getX());
		double yDiff = Math.abs(point.getY() - this.point1.getY());
		this.point1.setPoint(point);
		this.point2.movePoint(xDiff, yDiff);
		this.point3.movePoint(xDiff, yDiff);
		this.point4.movePoint(xDiff, yDiff);
	}	
	
	public Rectangle getBoundedRectangle () {
		return new Rectangle(this.point1, length, length);
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Square)) {
			return false;
		}
		if (this.length == ((Square)object).getLength() && this.point1.equals(((Square)object).getStartingPoint())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return this.line1.toString() + ", " + this.line2.toString() + ", " + 
		this.line3.toString() + ", " + this.line4.toString();
	}
}
