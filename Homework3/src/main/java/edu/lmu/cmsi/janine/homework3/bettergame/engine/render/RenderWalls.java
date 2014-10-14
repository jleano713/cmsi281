package edu.lmu.cmsi.janine.homework3.bettergame.engine.render;

import edu.lmu.cmsi.janine.homework3.bettergame.engine.GameEngine;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Wall;

public class RenderWalls implements Render {

	private String[][] renderedWorld;
	private Wall[] walls;

    public RenderWalls(String[][] renderedWorld, Wall[] walls) {
    	this.renderedWorld = renderedWorld;
    	this.walls = walls;
    }
    
    public void render() {
    	for (int i = 0; i < this.walls.length; i++) {
      		Wall w = this.walls[i];
      		renderedWorld[w.getY()][w.getX()] = Character.toString(w.getRenderedCharacter());
    	}
	}
}