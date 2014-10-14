package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;
import edu.lmu.cmsi.janine.homework3.bettergame.core.Displacement;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.MoveableObject;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.Player;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Wall;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Rock;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Tree;

public class Monster_Z extends Monster {
	
	private Coordinate location;
	private Displacement displacement;
	private int currentHP = 50;
	private final int totalHP = 50;
	
	public Monster_Z(int x, int y, int dx, int dy) {
		super(x, y, dx, dy);
		this.location = new Coordinate(x, y);
		this.displacement = new Displacement(dx, dy);
	}
	
	@Override
  	public char getRenderedCharacter() {
  		super.getRenderedCharacter();
    	return 'z';
  	}
  	
}