package edu.lmu.cmsi.janine.homework3.bettergame.engine.render;

import edu.lmu.cmsi.janine.homework3.bettergame.engine.GameEngine;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.Player;

public class RenderPlayers implements Render {
	
	private String[][] renderedWorld;
	private Player player;
	
	public RenderPlayers(String[][] renderedWorld, Player player) {
		this.renderedWorld = renderedWorld;
		this.player = player;
	}
	
	public void render() {
		renderedWorld[this.player.getY()][this.player.getX()] =
        	Character.toString(this.player.getRenderedCharacter());
	}
	
	public String stringHP() {
    	String HP = player.getClass().getSimpleName() + " HP: " + player.getCurrentHP() + "/" + player.getTotalHP();
    	return HP;
    }	

}