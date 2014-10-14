package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;
import edu.lmu.cmsi.janine.homework3.bettergame.core.Displacement;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Wall;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Rock;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Tree;

public abstract class MoveableObject {

	private Coordinate location;
	private Displacement displacement;
	private int currentHP = 50;
	private final int totalHP = 50;
	
	public MoveableObject(int x, int y, int dx, int dy) {
		this.location = new Coordinate(x, y);
		this.displacement = new Displacement(dx, dy);
	}
	
	public Coordinate getLocation() {
		return this.location;
	}
	
	public Displacement getDisplacement() {
		return this.displacement;
	}
		
	public int getX() {
		return this.location.getX();
	}
	
	public int getY() {
		return this.location.getY();
	}
	
	public char getRenderedCharacter() {
		return '.';
	}
	
	public void decrementHP() {
		this.currentHP --;
		if (this.currentHP < 0) {
			this.currentHP = 0;
		}
	}
	
	public int getCurrentHP() {
		return this.currentHP;
	}
	
	public int getTotalHP() {
		return this.totalHP;
	}
	
	public void update() {
		this.location.setX(this.location.getX() + this.displacement.getXDisplacement());
    	this.location.setY(this.location.getY() + this.displacement.getYDisplacement());
	}
	
	public void checkCollision() {
		throw new IllegalArgumentException("checkCollision must have an argument of a game object");
	}
	
	public void checkCollision(Wall wall) {
		if (this.getX() == wall.getX() && this.getY() == wall.getY()) {
			this.displacement.invert();
		}
	}
	
	public void checkCollision(Rock rock) {
		if (this.getX() == rock.getX() && this.getY() == rock.getY()) {
			displacement.invert();
			this.decrementHP();
		}
	}
	
	public void checkCollision(Tree tree) {
		if (this.getX() == tree.getX() && this.getY() == tree.getY()) {
			displacement.invert();
			this.decrementHP();
		}
	}	
}