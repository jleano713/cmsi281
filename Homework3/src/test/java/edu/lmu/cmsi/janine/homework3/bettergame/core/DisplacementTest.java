package edu.lmu.cmsi.janine.homework3.bettergame.core;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DisplacementTest {
	
	@Test
	public void getXDisplacementTest() {
		Displacement displacement = new Displacement(0,0);
		int x = 0;
		assertEquals("failure - x does not match", x, displacement.getXDisplacement());
	}
	
	@Test
	public void getYDisplacementTest() {
		Displacement displacement = new Displacement(0,0);
		int y = 0;
		assertEquals("failure - y does not match", y, displacement.getYDisplacement());
	}
	
	@Test
	public void invertTest() {
		Displacement displacement = new Displacement(1,1);
		displacement.invert();
		Displacement distTest = new Displacement(-1,-1);
		assertEquals("failure - displacement is not inverted", true, displacement.equals(distTest));
	}
	
	@Test
	public void equalsTest() {
		Displacement displacement = new Displacement(0,0);
		Displacement distTest = new Displacement(0,0);
		boolean equals = true;
		assertEquals("failure - displacements are not equal", equals, displacement.equals(distTest));
	}

}