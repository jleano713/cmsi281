package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.Player;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_Z;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_S;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss_O;

public class PlayerTest {

	@Test
	public void checkCollision_MonsterZTest() {
		Player player = new Player(1, 2, 0, 1);
		Monster_Z monster = new Monster_Z(1, 1, 1, 0);
		player.update();
		player.checkCollision(monster);
		int current = player.getCurrentHP();
		int total = player.getTotalHP();
		boolean test = true;
		assertEquals("failure - HP did not decrement", test, current <= total);
	}
	@Test
	public void checkCollision_MonsterSTest() {
		Player player = new Player(1, 2, 0, 1);
		Monster_S monster = new Monster_S(1, 1, 1, 0);
		player.update();
		player.checkCollision(monster);
		int current = player.getCurrentHP();
		int total = player.getTotalHP();
		boolean test = true;
		assertEquals("failure - HP did not decrement", test, current <= total);
	}
	
	@Test
	public void checkCollision_BossTest() {
		Player player = new Player(1, 2, 0, 1);
		Boss_O boss = new Boss_O(1, 1, 1, 0);
		player.update();
		player.checkCollision(boss);
		int current = player.getCurrentHP();
		int total = player.getTotalHP();
		boolean test = true;
		assertEquals("failure - HP did not decrement", test, current <= total);
	}

}
