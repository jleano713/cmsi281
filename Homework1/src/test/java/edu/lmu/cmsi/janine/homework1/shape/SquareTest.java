package edu.lmu.cmsi.janine.homework1.shape;

import edu.lmu.cmsi.janine.homework1.shape.Square;
import edu.lmu.cmsi.janine.homework1.shape.parts.Point;
import edu.lmu.cmsi.janine.homework1.shape.parts.Line;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

	@Test
	public void getLengthTest() {
		Point point1 = new Point(3.0, 3.2);
		Square square = new Square(point1, 3.0);
		double length = 3.0;
		assertEquals("failure - lengths didn't match", 3.0, length, square.getLength());
	}
	@Test
	public void getStartingPointTest() {
		Point point1 = new Point(3.0, 3.2);
		Point test = new Point(3.0, 3.2);
		Square square = new Square(point1, 3.0);
		assertEquals("failure - starting point [point1] didn't match", true, test.equals(square.getStartingPoint()));
	}
	@Test
	public void getPerimeterTest() {
		Point point1 = new Point(3.0, 3.2);
		Square square = new Square(point1, 3.0);
		double perimeter = 12.0;
		assertEquals("failure - perimeters didn't match", 12.0, perimeter, square.getPerimeter());
	}
	
	@Test
	public void getAreaTest() {
		Point point1 = new Point(3.0, 3.2);
		Square square = new Square(point1, 3.0);
		double area = 9.0;
		assertEquals("failure - areas didn't match", 9.0, area, square.getArea());
	}
	
	@Test
	public void containsPoint1Test() {
		Point point = new Point(3.0, 3.2);
		Square square = new Square(point, 3.0);
		assertEquals("failure - does not contain point", true, square.containsPoint(point));
	}
	@Test
	public void containsPoint2Test() {
		Point point1 = new Point(3.0, 3.2);
		Point point2 = new Point(4.0, 12.0);
		Square square = new Square(point1, 3.0);
		assertEquals("failure - contains point", false, square.containsPoint(point2));
	}
	@Test
	public void containsPoint3Test() {
		Point point1 = new Point(3.0, 3.0);
		Point point2 = new Point(4.0, 4.2);
		Square square = new Square(point1, 1.0);
		assertEquals("failure - contains point", false, square.containsPoint(point2));
	}
	@Test
	public void containsPoint4Test() {
		Point point1 = new Point(12.0, 3.2);
		Point point2 = new Point(1.0, 12.0);
		Square square = new Square(point1, 3.0);
		assertEquals("failure - contains point", false, square.containsPoint(point2));
	}
	
	@Test
	public void translateTest() {
		Point point1 = new Point(5.0, 3.2);
		Point point2 = new Point(1.0, 12.0);
		Square square = new Square(point1, 16.0);
		Square test = new Square(point2, 16.0);
		square.translate(point2);
		assertEquals("failure - does not translate to given point", true, square.equals(test));
	}
	
	@Test
	public void getBoundedRectangleTest() {
		Point point1 = new Point(5.0, 3.2);
		Square square = new Square(point1, 16.0);
		Rectangle bound = new Rectangle(point1, 16.0, 16.0);
		boolean test = square.getStartingPoint().equals(bound.getStartingPoint()) &&
					   square.getLength() == bound.getHeight() && square.getLength() == bound.getWidth();
		assertEquals("failure - bounded rectangle does not match", true, test);
	}
	
	@Test
	public void equalsTest() {
		Point point1 = new Point(4.0, 2.0);
		Point point2 = new Point(4.0, 2.0);
		Square square1 = new Square(point1, 1.0);
		Square square2 = new Square(point2, 1.0);
		assertEquals("failure - squares not equal", true, square1.equals(square2));
	}
	
	@Test
	public void toStringTest() {
		Point point1 = new Point(1.0, 1.0);
		Square square = new Square(point1, 5.0);
		String actual = "(1.0,1.0) >> (1.0,6.0), (1.0,6.0) >> (6.0,6.0), (6.0,6.0) >> (6.0,1.0), (6.0,1.0) >> (1.0,1.0)";
		assertEquals("failure - strings didn't match", true, actual.equals(square.toString()));
	}
	
}