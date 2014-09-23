package edu.lmu.cmsi.janine.homework1.shape;

import edu.lmu.cmsi.janine.homework1.shape.RightTriangle;
import edu.lmu.cmsi.janine.homework1.shape.parts.Point;
import edu.lmu.cmsi.janine.homework1.shape.parts.Line;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RightTriangleTest {
	@Test(expected = IllegalArgumentException.class)
	public void heightTest() {
		Point point1 = new Point(0.0, 0.0);
		RightTriangle rightTriangle = new RightTriangle(point1, 2.0, -1.0);
		fail("height cannot be less than or equal to zero");
	}
	@Test(expected = IllegalArgumentException.class)
	public void baseTest() {
		Point point1 = new Point(0.0, 0.0);
		RightTriangle rightTriangle = new RightTriangle(point1, -2.0, 1.0);
		fail("base cannot be less than or equal to zero");
	}
	
	@Test
	public void getPerimeterTest() {
		Point point1 = new Point(0.0, 0.0);
		RightTriangle rightTriangle = new RightTriangle(point1, 3.0, 4.0);
		double perimeter = 12.0;
		assertEquals("perimeter is not equal", 12.0, perimeter, rightTriangle.getPerimeter());
	}
	
	@Test
	public void getAreaTest() {
		Point point1 = new Point(0.0, 0.0);
		RightTriangle rightTriangle = new RightTriangle(point1, 3.0, 4.0);
		double area = 6.0;
		assertEquals("perimeter is not equal", 6.0, area, rightTriangle.getArea());
	}
	
	@Test
	public void getBoundedRectangleTest() {
		Point point1 = new Point(0.0, 0.0);
		RightTriangle rightTriangle = new RightTriangle(point1, 3.0, 4.0);
		Rectangle bound = new Rectangle(point1, 4.0, 3.0);
		assertEquals("bounded rectangle is not equal", true, bound.equals(rightTriangle.getBoundedRectangle()));
	}
	
	@Test
	public void translateTest() {
		Point point1 = new Point(0.0, 0.0);
		Point point2 = new Point(1.0, 0.0);
		RightTriangle rt1 = new RightTriangle(point1, 3.0, 4.0);
		rt1.translate(point2);
		RightTriangle rt2 = new RightTriangle(point2, 3.0, 4.0);
		assertEquals("translated triangle is not equal", true, rt1.getStartingPoint().equals(rt2.getStartingPoint()));
	}
	
	@Test
	public void toStringTest() {
		Point point1 = new Point(0.0, 0.0);
		RightTriangle rightTriangle = new RightTriangle(point1, 4.0, 3.0);
		String actual = "(0.0,0.0) >> (0.0,3.0), (0.0,3.0) >> (4.0,0.0), (4.0,0.0) >> (0.0,0.0)";
		assertEquals("failure - strings didn't match", true, actual.equals(rightTriangle.toString()));
	}
}