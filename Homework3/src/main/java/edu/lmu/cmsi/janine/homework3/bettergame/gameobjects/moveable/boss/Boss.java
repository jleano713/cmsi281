package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;
import edu.lmu.cmsi.janine.homework3.bettergame.core.Displacement;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.MoveableObject;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.Player;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Wall;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Rock;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Tree;

public abstract class Boss extends MoveableObject {
	
	private Coordinate location;
	private Displacement displacement;
	private int currentHP = 50;
	private final int totalHP = 50;
	
	public Boss(int x, int y, int dx, int dy) {
		super(x, y, dx, dy);
		this.location = new Coordinate(x, y);
		this.displacement = new Displacement(dx, dy);
	}
	
	@Override
  	public char getRenderedCharacter() {
  		super.getRenderedCharacter();
    	return 'b';
  	}
  	 
  	public void checkCollision(Player player) {
  		if (this.getX() == player.getX() && this.getY() == player.getY()) {
  			if (Math.random() > 0.7) {
  				this.decrementHP();
  			}
  		}
  	}
  		
}