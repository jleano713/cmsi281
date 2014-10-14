package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;

public class Rock extends StationaryObject {

	private Coordinate location;
	
	public Rock(int x, int y) {
		super(x, y);
		location = new Coordinate(x, y);
	}
	
	@Override
	public char getRenderedCharacter() {
		super.getRenderedCharacter();
		return 'r';
	}
	
}