package edu.lmu.cmsi.janine.homework1.shape;
import edu.lmu.cmsi.janine.homework1.shape.parts.*;

public class RightTriangle {

	private Point point1 = new Point(0.0,0.0);
	private Point point2;
	private Point point3;
	private Line line1;
	private Line hypotenuse;
	private Line line3;
	private double height;
	private double hypotenuseLength;
	private double base;
	
	public RightTriangle(Point point1, double base, double height) {
		if (base <= 0 || height <= 0) {
			throw new IllegalArgumentException("Base and height must be greater than zero");
		}
		this.base = base;
		this.height = height;
		if (point1 != null) {
			this.point1.setPoint(point1);
		}
		this.point2 = new Point(this.point1.getX(), this.point1.getY() + this.height);
		this.point3 = new Point(this.point1.getX() + this.base, this.point1.getY());
		this.line1 = new Line(this.point1, this.point2);
		this.hypotenuse = new Line(this.point2, this.point3);
		this.line3 = new Line(this.point3, this.point1);
		
		hypotenuseLength = hypotenuse.getLength();
	}
		
	public double getPerimeter() {
		return base + height + hypotenuseLength;
	}
	
	public double getArea() {
		return 0.5 * base * height;
	}
	
	public Point getStartingPoint() {
		return this.point1;
	}
	
	public Rectangle getBoundedRectangle() {
		return new Rectangle (this.point1, height, base);
	}
	
	public void translate(Point point) {
		double xDiff = Math.abs(point.getX() - this.point1.getX());
		double yDiff = Math.abs(point.getY() - this.point1.getY());
		this.point1.setPoint(point);
		this.point2.movePoint(xDiff, yDiff);
		this.point3.movePoint(xDiff, yDiff);
	} 
	
	public String toString() {
		return this.line1.toString() + ", " + this.hypotenuse.toString() + ", " + this.line3.toString();
	}
		
	/* 
	//i was not able to make this method
	public boolean containsPoint(Point point) {
	} 
	*/
}
