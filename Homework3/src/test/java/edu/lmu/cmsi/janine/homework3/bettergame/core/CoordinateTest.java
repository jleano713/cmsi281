package edu.lmu.cmsi.janine.homework3.bettergame.core;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CoordinateTest {
	
	@Test
	public void getXTest() {
		Coordinate coordinate = new Coordinate(0,0);
		int x = 0;
		assertEquals("failure - x does not match", x, coordinate.getX());
	}
	
	@Test
	public void getYTest() {
		Coordinate coordinate = new Coordinate(0,0);
		int y = 0;
		assertEquals("failure - y does not match", y, coordinate.getY());
	}
	
	@Test
	public void setXTest() {
		Coordinate coordinate = new Coordinate(0,0);
		coordinate.setX(1);
		int newX = 1;
		assertEquals("failure - x was not set", newX, coordinate.getX());
	}
	
	@Test
	public void setYTest() {
		Coordinate coordinate = new Coordinate(0,0);
		coordinate.setY(1);
		int newY = 1;
		assertEquals("failure - y was not set", newY, coordinate.getY());
	}
	
	@Test
	public void equalsTest() {
		Coordinate coordinate = new Coordinate(0,0);
		Coordinate coorTest = new Coordinate(0,0);
		boolean equals = true;
		assertEquals("failure - coordinates are not equal", equals, coordinate.equals(coorTest));
	}
}