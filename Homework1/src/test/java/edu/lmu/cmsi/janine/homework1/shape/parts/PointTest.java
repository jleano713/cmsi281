package edu.lmu.cmsi.janine.homework1.shape.parts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PointTest {
	
	@Test
	public void getXTest() {
		Point point = new Point(1.0, 1.0);
		double actualX = 1.0;
		assertEquals("failure - x didn't match", 1.0, actualX, point.getX());
	}
	@Test(expected = IllegalArgumentException.class)
	public void setXTest() {
		Point point = new Point(1.0, 1.0);
		point.setX(-3.0);
		fail("x cannot be set to a negative value");
	}
	
	@Test
	public void getYTest() {
		Point point = new Point(1.0, 1.0);
		double actualY = 1.0;
		assertEquals("failure - y didn't match", 1.0, actualY, point.getY());
	}
	@Test(expected = IllegalArgumentException.class)
	public void setYTest() {
		Point point = new Point(1.0, 1.0);
		point.setY(-3.0);
		fail("y cannot be set to a negative value");
	}
	
	@Test
	public void setPointTest() {
		Point point = new Point(1.0, 1.0);
		Point test = new Point(3.0, 3.0);
		point.setPoint(test);
		assertEquals("failure - point didn't match", true, point.equals(test));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void movePointTest() {
		Point point = new Point(1.0, 1.0);
		point.movePoint(-3.0, -3.0);
		fail("ending result cannot be less than 0");
	}
	
	@Test
	public void getDistanceTest() {
		Point point = new Point(3.0, 3.0);
		Point test = new Point(4.0, 4.0);
		double distance = point.getDistance(test);
		assertEquals("failure - distance didn't match", Math.sqrt(2), distance, point.getDistance(test));
	}
	
	@Test
	public void getSlopeTest() {
		Point point = new Point(3.0, 3.0);
		Point test = new Point(4.0, 4.0);
		double slope = 1.0;
		assertEquals("failure - slope didn't match", 1.0, slope, point.getSlope(test));
	}
	
	@Test
	public void equalsTest() {
		Point point = new Point(3.0, 3.0);
		Point test = new Point(3.0, 3.0);
		assertEquals("failure - points aren't equal", true, point.equals(test));
	}
	
	@Test
	public void toStringTest() {
		Point point = new Point(3.0, 3.0);
		String string = point.toString();
		String actual = "(3.0,3.0)";
		assertEquals("failure - strings didn't match", actual, string);
	}
	
}