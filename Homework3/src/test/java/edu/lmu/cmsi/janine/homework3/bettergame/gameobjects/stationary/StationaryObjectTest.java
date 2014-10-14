package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Tree;

public class StationaryObjectTest {

	@Test
	public void getLocationTest() {
		Tree tree = new Tree(1, 1);
		Coordinate test = new Coordinate(1, 1);
		assertEquals("failure - location does not match", true, tree.getLocation().equals(test));
	}
	
	@Test
	public void getXTest() {
		Tree tree = new Tree(1, 1);
		int test = 1;
		assertEquals("failure - x does not match", test, tree.getX());
	}
	
	@Test
	public void getYTest() {
		Tree tree = new Tree(1, 1);
		int test = 1;
		assertEquals("failure - y does not match", test, tree.getY());
	}
	
	@Test
	public void getRenderedCharacterTest() {
		Tree tree = new Tree(1, 1);
		char test = 't';
		assertEquals("failure - rendered character does not match", test, tree.getRenderedCharacter());
	}
}
	