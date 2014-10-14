package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;

public abstract class StationaryObject {

	private Coordinate location;
	
	public StationaryObject(int x, int y) {
		this.location = new Coordinate(x, y);
	}
	
	public Coordinate getLocation() {
		return this.location;
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
}