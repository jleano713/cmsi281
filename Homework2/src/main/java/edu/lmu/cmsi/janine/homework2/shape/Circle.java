package edu.lmu.cmsi.janine.homework2.shape;
import edu.lmu.cmsi.janine.homework2.shape.parts.*;

public class Circle {

	private Point center = new Point(1.0, 1.0);
	private double radius = 1.0;
	private double diameter = radius * 2.0;
	private double circumference = diameter * Math.PI;
	private double area = Math.PI * Math.pow(radius, 2);

	public Circle (Point center, double radius) {
		if (center != null) {
			this.center.setPoint(center);
		}
		if (radius <= 0) {
			throw new IllegalArgumentException("Radii cannot be less than or equal to 0");
		}
		if (center.getX() - radius < 0 || center.getY() - radius < 0) {
			throw new IllegalArgumentException("Circle must stay within the pos-pos quadrant");
		}
		this.radius = radius;
	}
	
	public Point getCenter() {
		return this.center;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Radii cannot be less than or equal to 0");
		}
		this.radius = radius;
	}
	
	public double getDiameter() {
		return this.diameter;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public double getCircumference() {
		return this.circumference;
	}

	public boolean containsPoint(Point point) {
		if (center.getDistance(point) > radius) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void translate (Point point) {
		center.setPoint(point);
	}
	
	public Rectangle getBoundedRectangle() {
		Point point1 = new Point(this.center.getX() - radius, this.center.getY() - radius);
		Rectangle bound = new Rectangle(point1, this.diameter, this.diameter);
		return bound;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Circle)) {
			return false;
		}
		if (this.center.equals(((Circle)object).getCenter()) && this.radius == ((Circle)object).getRadius()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "CENTER = " + this.center.toString() + " & RADIUS = " + this.radius;
	}
}
