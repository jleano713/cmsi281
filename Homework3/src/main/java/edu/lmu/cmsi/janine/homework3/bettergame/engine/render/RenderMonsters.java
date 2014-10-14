package edu.lmu.cmsi.janine.homework3.bettergame.engine.render;

import edu.lmu.cmsi.janine.homework3.bettergame.engine.GameEngine;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_Z;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_X;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_A;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_S;

public class RenderMonsters implements Render {
	
	private String[][] renderedWorld;
	private Monster[] monsters;
	
    public RenderMonsters(String[][] renderedWorld, Monster[] monsters) {
    	this.renderedWorld = renderedWorld;
    	this.monsters = monsters;
    }
    
    public void render() {
    	for (int i = 0; i < this.monsters.length; i++) {
    		Monster m = this.monsters[i];
    		renderedWorld[m.getY()][m.getX()] = Character.toString(m.getRenderedCharacter());
    	}
    }
        	
    public String stringHP() {
    	String HP = "";
    	for (int i = 0; i < this.monsters.length; i++) {
    		HP += this.monsters[i].getClass().getSimpleName() + " HP: " +
    			this.monsters[i].getCurrentHP() + "/" + this.monsters[i].getTotalHP() + " | ";
    	}
    	return HP;
    }	
}