package edu.lmu.cmsi.janine.homework3.bettergame.engine.render;

import edu.lmu.cmsi.janine.homework3.bettergame.engine.GameEngine;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Tree;

public class RenderTrees implements Render {

	private String[][] renderedWorld;
	private Tree[] trees;

    public RenderTrees(String[][] renderedWorld, Tree[] trees) {
    	this.renderedWorld = renderedWorld;
    	this.trees = trees;
    }
    
    public void render() {
    	for (int i = 0; i < this.trees.length; i++) {
      		Tree tree = this.trees[i];
      		renderedWorld[tree.getY()][tree.getX()] = Character.toString(tree.getRenderedCharacter());
    	}
	}
}