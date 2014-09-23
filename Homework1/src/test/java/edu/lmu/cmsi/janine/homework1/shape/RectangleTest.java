package edu.lmu.cmsi.janine.homework1.shape;

import edu.lmu.cmsi.janine.homework1.shape.Rectangle;
import edu.lmu.cmsi.janine.homework1.shape.parts.Point;
import edu.lmu.cmsi.janine.homework1.shape.parts.Line;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

	@Test
	public void getHeightTest() {
		Point point1 = new Point(3.0, 3.2);
		Rectangle rectangle = new Rectangle(point1, 3.0, 2.0);
		double height = 3.0;
		assertEquals("failure - heights didn't match", 3.0, height, rectangle.getHeight());
	}
	
	@Test
	public void getWidthTest() {
		Point point1 = new Point(3.0, 3.2);
		Rectangle rectangle = new Rectangle(point1, 3.0, 2.0);
		double width = 2.0;
		assertEquals("failure - widths didn't match", 2.0, width, rectangle.getWidth());
	}
	
	@Test
	public void getStartingPointTest() {
		Point point1 = new Point(3.0, 3.2);
		Point test = new Point(3.0, 3.2);
		Rectangle rectangle = new Rectangle(point1, 3.0, 2.0);
		assertEquals("failure - starting point [point1] didn't match", true, test.equals(rectangle.getStartingPoint()));
	}
	@Test
	public void getPerimeterTest() {
		Point point1 = new Point(3.0, 3.2);
		Rectangle rectangle = new Rectangle(point1, 3.0, 2.0);
		double perimeter = 10.0;
		assertEquals("failure - perimeters didn't match", 10.0, perimeter, rectangle.getPerimeter());
	}
	
	@Test
	public void getAreaTest() {
		Point point1 = new Point(3.0, 3.2);
		Rectangle rectangle = new Rectangle(point1, 3.0, 2.0);
		double area = 6.0;
		assertEquals("failure - areas didn't match", 6.0, area, rectangle.getArea());
	}
	
	@Test
	public void containsPoint1Test() {
		Point point = new Point(3.0, 3.2);
		Rectangle rectangle = new Rectangle(point, 3.0, 2.0);
		assertEquals("failure - does not contain point", true, rectangle.containsPoint(point));
	}
	@Test
	public void containsPoint2Test() {
		Point point1 = new Point(3.0, 3.2);
		Point point2 = new Point(4.0, 12.0);
		Rectangle rectangle = new Rectangle(point1, 3.0, 2.0);
		assertEquals("failure - contains point", false, rectangle.containsPoint(point2));
	}
	@Test
	public void containsPoint3Test() {
		Point point1 = new Point(3.0, 3.0);
		Point point2 = new Point(4.0, 4.2);
		Rectangle rectangle = new Rectangle(point1, 1.0, 2.0);
		assertEquals("failure - contains point", false, rectangle.containsPoint(point2));
	}
	@Test
	public void containsPoint4Test() {
		Point point1 = new Point(12.0, 3.2);
		Point point2 = new Point(1.0, 12.0);
		Rectangle rectangle = new Rectangle(point1, 3.0, 2.0);
		assertEquals("failure - contains point", false, rectangle.containsPoint(point2));
	}
	
	@Test
	public void translateTest() {
		Point point1 = new Point(5.0, 3.2);
		Point point2 = new Point(1.0, 12.0);
		Rectangle rectangle = new Rectangle(point1, 16.0, 2.0);
		Rectangle test = new Rectangle(point2, 16.0, 2.0);
		rectangle.translate(point2);
		assertEquals("failure - does not translate to given point", true, rectangle.equals(test));
	}
	
	@Test
	public void getBoundedRectangleTest() {
		Point point1 = new Point(5.0, 3.2);
		Point point2 = new Point(5.0, 3.2);
		Rectangle rectangle = new Rectangle(point1, 16.0, 16.0);
		Rectangle bound = new Rectangle(point2, 16.0, 16.0);
		assertEquals("failure - bounded rectangle does not match", true, rectangle.equals(bound));
	}
	
	@Test
	public void equalsTest() {
		Point point1 = new Point(5.0, 3.2);
		Point point2 = new Point(5.0, 3.2);
		Rectangle rectangle = new Rectangle(point1, 16.0, 16.0);
		Rectangle test = new Rectangle(point2, 16.0, 16.0);
		assertEquals("failure - rectangle didn't match", true, rectangle.equals(test));
	}
	
	@Test
	public void toStringTest() {
		Point point1 = new Point(1.0, 1.0);
		Rectangle rectangle = new Rectangle(point1, 5.0, 2.0);
		String actual = "(1.0,1.0) >> (1.0,6.0), (1.0,6.0) >> (3.0,6.0), (3.0,6.0) >> (3.0,1.0), (3.0,1.0) >> (1.0,1.0)";
		assertEquals("failure - strings didn't match", true, actual.equals(rectangle.toString()));
	}
	
}