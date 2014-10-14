package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;
import edu.lmu.cmsi.janine.homework3.bettergame.core.Displacement;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.Player;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_Z;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_X;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_A;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_S;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss_O;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss_K;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Wall;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Rock;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Tree;

public class Player extends MoveableObject {

  	private Coordinate location;
	private Displacement displacement;
	private int currentHP = 50;
	private final int totalHP = 50;
  
  	public Player(int x, int y, int dx, int dy) {
  		super(x, y, dx, dy);
    	this.location = new Coordinate(x, y);
    	this.displacement = new Displacement(dx, dy);
  	}
	
	@Override
  	public char getRenderedCharacter() {
  		super.getRenderedCharacter();
    	return 'p';
  	}
  	
  	public void checkCollision(Boss_O boss) {
  		double odds;
  		if (this.getX() == boss.getX() && this.getY() == boss.getY()) {
			if (Math.random() < 0.7) {
				this.decrementHP();
			}
		}
	}
	
	public void checkCollision(Boss_K boss) {
  		double odds;
  		if (this.getX() == boss.getX() && this.getY() == boss.getY()) {
			if (Math.random() < 0.7) {
				this.decrementHP();
			}
		}
	}

  	public void checkCollision(Monster_A monster) {
  		if (this.getX() == monster.getX() && this.getY() == monster.getY()) {
  			if (Math.random() < 0.6) {
  				this.decrementHP();
  			}
  		}
  	}
  	
  	public void checkCollision(Monster_S monster) {
  		if (this.getX() == monster.getX() && this.getY() == monster.getY()) {
  			if (Math.random() < 0.6) {
  				this.decrementHP();
  			}
  		}
  	}
  	
  	public void checkCollision(Monster_Z monster) {
  		if (this.getX() == monster.getX() && this.getY() == monster.getY()) {
  			if (Math.random() < 0.5) {
  				this.decrementHP();
  			}
  		}
  	}
  	
  	public void checkCollision(Monster_X monster) {
  		if (this.getX() == monster.getX() && this.getY() == monster.getY()) {
  			if (Math.random() < 0.5) {
  				this.decrementHP();
  			}
  		}
  	}	

}