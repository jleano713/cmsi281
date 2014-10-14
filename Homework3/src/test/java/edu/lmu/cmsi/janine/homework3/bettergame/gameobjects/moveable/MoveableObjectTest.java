package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;
import edu.lmu.cmsi.janine.homework3.bettergame.core.Displacement;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.Player;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Wall;

public class MoveableObjectTest {

	@Test
	public void updateTest() {
		Player player = new Player(1, 1, 1, 1);
		player.update();
		Coordinate newLocation = new Coordinate(2, 2);
		boolean test = true;
		assertEquals("failure - did not update", test, player.getLocation().equals(newLocation));	
	}
	
	@Test
	public void checkCollisionTest() {
		Player player = new Player(1, 1, 1, 1);
		Wall wall = new Wall(1, 1);
		player.checkCollision(wall);
		Displacement displacement = new Displacement(-1, -1);
		boolean test = true;
		assertEquals("failure - did not check collision", test, player.getDisplacement().equals(displacement));
	}
			
}
	
		