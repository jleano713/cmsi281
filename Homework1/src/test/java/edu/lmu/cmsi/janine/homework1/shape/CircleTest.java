package edu.lmu.cmsi.janine.homework1.shape;

import edu.lmu.cmsi.janine.homework1.shape.Circle;
import edu.lmu.cmsi.janine.homework1.shape.parts.Point;
import edu.lmu.cmsi.janine.homework1.shape.parts.Line;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CircleTest {

	@Test(expected = IllegalArgumentException.class)
	public void radiusTest1() {
		Point point1 = new Point(3.0, 3.2);
		Circle circle = new Circle(point1, -3.0);
		fail("radii cannot be less than or equal to zero");
	}
	@Test(expected = IllegalArgumentException.class)
	public void radiusTest2() {
		Point point1 = new Point(3.0, 3.0);
		Circle circle = new Circle(point1, 4.0);
		fail("circle must stay within the boundary of the pos-pos quadrant");
	}
	
	@Test
	public void getRadiusTest() {
		Point point1 = new Point(3.0, 3.2);
		Circle circle = new Circle(point1, 3.0);
		double radius = 3.0;
		assertEquals("failure - radii didn't match", 3.0, radius, circle.getRadius());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setRadiusTest() {
		Point point1 = new Point(3.0, 3.2);
		Circle circle = new Circle(point1, 3.0);
		circle.setRadius(-2.0);
		fail("radii cannot be less than or equal to zero");
	}
	
	@Test
	public void getDiameterTest() {
		Point point1 = new Point(3.0, 3.2);
		Circle circle = new Circle(point1, 3.0);
		double diameter = circle.getRadius() * 2.0;
		assertEquals("failure - diameter didn't match", 6.0, diameter, circle.getDiameter());
	}
	
	@Test
	public void getAreaTest() {
		Point point1 = new Point(3.0, 3.2);
		Circle circle = new Circle(point1, 3.0);
		double area = Math.pow(circle.getRadius(),2) * Math.PI;
		assertEquals("failure - area didn't match", Math.pow(circle.getRadius(),2) * Math.PI, area, circle.getArea());
	}

	@Test
	public void containsPoint1Test() {
		Point point1 = new Point(3.0, 3.0);
		Point point2 = new Point(0.0, 3.0);
		Circle circle = new Circle(point1, 3.0);
		assertEquals("failure - does not contain point", true, circle.containsPoint(point2));
	}
	@Test
	public void containsPoint2Test() {
		Point point1 = new Point(3.0, 3.0);
		Point point2 = new Point(2.5, 2.3);
		Circle circle = new Circle(point1, 1.0);
		assertEquals("failure - does not contain point", true, circle.containsPoint(point2));
	}
	
	@Test
	public void translateTest() {
		Point point1 = new Point(5.0, 3.2);
		Point point2 = new Point(1.0, 12.0);
		Circle circle1 = new Circle(point1, 1.0);
		Circle circle2 = new Circle(point2, 1.0);
		circle2.translate(point1);
		assertEquals("failure - does not translate to given point", true, circle1.equals(circle2));
	}
	
	@Test
	public void getBoundedRectangleTest() {
		Point point1 = new Point(5.0, 5.0);
		Point point2 = new Point(0.0, 0.0);
		Circle circle = new Circle(point1, 5.0);
		Rectangle bound = new Rectangle(point2, 10.0, 10.0);
		assertEquals("failure - bounded rectangle does not match", true, bound.equals(circle.getBoundedRectangle()));
	}

	@Test
	public void equalsTest() {
		Point point1 = new Point(5.0, 3.2);
		Point point2 = new Point(5.0, 3.2);
		Circle circle1 = new Circle(point1, 1.0);
		Circle circle2 = new Circle(point2, 1.0);
		assertEquals("failure - circle didn't match", true, circle1.equals(circle2));
	}

	@Test
	public void toStringTest() {
		Point point1 = new Point(1.0, 1.0);
		Circle circle = new Circle(point1, 1.0);
		String actual = "CENTER = (1.0,1.0) & RADIUS = 1.0";
		assertEquals("failure - strings didn't match", true, actual.equals(circle.toString()));
	}

}