package edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary;

import edu.lmu.cmsi.janine.homework3.bettergame.core.Coordinate;

public class Wall extends StationaryObject {

	private Coordinate location;

  	public Wall(int x, int y) {
  		super(x, y);
    	this.location = new Coordinate(x, y);
  	}

  	@Override
  	public char getRenderedCharacter() {
  		super.getRenderedCharacter();
    	return 'w';
  	}
  
}