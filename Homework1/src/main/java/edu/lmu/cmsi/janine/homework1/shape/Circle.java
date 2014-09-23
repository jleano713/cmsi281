package edu.lmu.cmsi.janine.homework1.shape;
import edu.lmu.cmsi.janine.homework1.shape.parts.*;

public class Circle {

	private double radius;
	private double diameter = radius * 2.0;
	private double circumference = diameter * Math.PI;
	private double area = Math.PI * Math.pow(radius, 2);

	public Circle (Point center, double radius) {
		this.radius = radius;
	}

	public double getRadius () {
		return this.radius;
	}
	public void setRadius (double radius) {
		this.radius = radius;
	}
	public double getDiameter() {
		return this.diameter;
	}
	
	public double getArea () {
		return this.area;
	}

	public boolean containsPoint (Point point) {
		if () {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
}
