package edu.lmu.cmsi.janine.homework3.bettergame.engine.render;

import edu.lmu.cmsi.janine.homework3.bettergame.engine.GameEngine;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss_O;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss_K;

public class RenderBosses implements Render {

	private String[][] renderedWorld;
	private Boss[] bosses;
	
	public RenderBosses(String[][] renderedWorld, Boss[] bosses) {
		this.renderedWorld = renderedWorld;
		this.bosses = bosses;
	}
    
    public void render() {
    	for (int i = 0; i < this.bosses.length; i++) {
    		Boss boss = this.bosses[i];
    		renderedWorld[boss.getY()][boss.getX()] = Character.toString(boss.getRenderedCharacter());
    	}
    }
    
    public String stringHP() {
    	String HP = "";
    	for (int i = 0; i < this.bosses.length; i++) {
    		HP += this.bosses[i].getClass().getSimpleName() + " HP: " +
    			this.bosses[i].getCurrentHP() + "/" + this.bosses[i].getTotalHP() + " | ";
    	}
    	return HP;
    }	
    	
}