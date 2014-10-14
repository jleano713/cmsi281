package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;

public class Tree extends StationaryObject {

	private Coordinate location;
	
	public Tree(int x, int y) {
		super(x, y);
		location = new Coordinate(x, y);
	}
	
	@Override
	public char getRenderedCharacter() {
		super.getRenderedCharacter();
		return 't';
	}
	
}