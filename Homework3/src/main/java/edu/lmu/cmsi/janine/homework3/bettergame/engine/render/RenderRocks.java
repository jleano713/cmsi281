package edu.lmu.cmsi.janine.homework3.bettergame.engine.render;

import edu.lmu.cmsi.janine.homework3.bettergame.engine.GameEngine;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Rock;

public class RenderRocks implements Render {

	private String[][] renderedWorld;
	private Rock[] rocks;

    public RenderRocks(String[][] renderedWorld, Rock[] rocks) {
    	this.renderedWorld = renderedWorld;
    	this.rocks = rocks;
    }
    
    public void render() {
    	for (int i = 0; i < this.rocks.length; i++) {
      		Rock rock = this.rocks[i];
      		renderedWorld[rock.getY()][rock.getX()] = Character.toString(rock.getRenderedCharacter());
    	}
	}
}