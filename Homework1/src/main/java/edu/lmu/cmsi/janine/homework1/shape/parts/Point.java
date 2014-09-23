package edu.lmu.cmsi.janine.homework1.shape.parts;

public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y) {
		//checks to see if negative
		if (x < 0.0 || y < 0.0) {
			throw new IllegalArgumentException("Values must be greater than or equal to zero.");
		}
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	public void setX(double x) {
		if (x < 0.0) {
			throw new IllegalArgumentException("Values must be greater than or equal to zero.");
		}
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	public void setY(double y) {
		if (y < 0.0) {
			throw new IllegalArgumentException("Values must be greater than or equal to zero.");
		}
		this.y = y;
	}
	
	public void setPoint(Point point) {
		this.x = point.getX();
		this.y = point.getY();
	}
	
	public void movePoint(double x, double y) {
		this.x += x;
		this.y += y;
		if (this.x < 0.0 || this.y < 0.0) {
			throw new IllegalArgumentException("Ending value must be greater than or equal to zero.");
		}
	}
	
	public double getDistance(Point point) {
		double xDist = Math.abs(this.x - point.getX());
		double yDist = Math.abs(this.y - point.getY());
		double distance = Math.pow(xDist, 2) + Math.pow(yDist, 2);
		distance = Math.sqrt(distance);
		return distance;
	}
	
	public double getSlope(Point point) {
		double yDiff = Math.abs(point.getY() - this.y);
		double xDiff = Math.abs(point.getX() - this.x);
		if (xDiff == 0.0) {
			return 0.0;
		}
		return yDiff / xDiff;
	}
	public boolean equals(Object object) {
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
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}	
		
}