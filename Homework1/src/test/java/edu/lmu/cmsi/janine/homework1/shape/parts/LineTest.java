package edu.lmu.cmsi.janine.homework1.shape.parts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail; 

public class LineTest {

	@Test(expected = IllegalArgumentException.class)
	public void nullPointTest() {
		Line line = new Line(null, null);
		fail("points in line's parameters cannot be null");
	}
	
	@Test
	public void getPoint1Test() {
		Point point1 = new Point(1.0, 1.0);
		Point point2 = new Point(2.0, 2.0);
		Line line = new Line(point1, point2);
		assertEquals("failure - point1 didn't match", point1, line.getPoint1());
	}
	
	@Test
	public void getPoint2Test() {
		Point point1 = new Point(1.0, 1.0);
		Point point2 = new Point(2.0, 2.0);
		Line line = new Line(point1, point2);
		assertEquals("failure - point2 didn't match", point2, line.getPoint2());
	}
	
	@Test
	public void getMidpointTest() {
		Point point1 = new Point(5.0, 9.0);
		Point point2 = new Point(2.0, 1.0);
		Line line = new Line(point1, point2);
		Point midpoint = new Point(7.0/2.0, 5.0);
		assertEquals("failure - midpoints didn't match", midpoint, line.getMidpoint());
	}
	
	@Test
	public void getSlopeTest() {
		Point point1 = new Point(5.0, 9.0);
		Point point2 = new Point(2.0, 1.0);
		Line line = new Line(point1, point2);
		double slope = 8.0/3.0;
		assertEquals("failure - slopes didn't match", 8.0/3.0, slope, line.getSlope());
	}
	
	@Test
	public void equalsTest() {
		Point point1 = new Point(1.0, 1.0);
		Point point2 = new Point(3.0, 3.0);
		Point test = new Point(4.0, 1.0);
		Line line = new Line(point1, point2);
		assertEquals("failure - lines are supposed to be unequal", false, line.equals(test));
	}
	
	@Test
	public void toStringTest() {
		Point point1 = new Point(5.0, 9.0);
		Point point2 = new Point(2.0, 1.0);
		Line line = new Line(point1, point2);
		String actual = "(5.0,9.0) >> (2.0,1.0)";
		assertEquals("failure - strings didn't match", true, actual.equals(line.toString()));
	}
	
	@Test
	public void getLengthTest() {
		Point point1 = new Point(3.0, 3.0);
		Point point2 = new Point(4.0, 4.0);
		Line line = new Line(point1, point2);
		double length = point1.getDistance(point2);
		assertEquals("failure - length didn't match", 1.0, length, line.getLength());
	}

}