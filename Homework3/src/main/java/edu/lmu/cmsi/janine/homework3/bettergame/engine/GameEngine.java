package edu.lmu.cmsi.janine.homework3.bettergame.engine;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.Player;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_Z;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_X;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_A;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.monster.Monster_S;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss_O;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.moveable.boss.Boss_K;

import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Wall;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Rock;
import edu.lmu.cmsi.janine.homework3.bettergame.gameobjects.stationary.Tree;

import edu.lmu.cmsi.janine.homework3.bettergame.engine.render.Render;
import edu.lmu.cmsi.janine.homework3.bettergame.engine.render.RenderBosses;
import edu.lmu.cmsi.janine.homework3.bettergame.engine.render.RenderMonsters;
import edu.lmu.cmsi.janine.homework3.bettergame.engine.render.RenderPlayers;
import edu.lmu.cmsi.janine.homework3.bettergame.engine.render.RenderWalls;
import edu.lmu.cmsi.janine.homework3.bettergame.engine.render.RenderRocks;
import edu.lmu.cmsi.janine.homework3.bettergame.engine.render.RenderTrees;

public class GameEngine {

  	private int frame;
  	private int size;

  	// Game Objects
  	private Wall[] walls;
  	private Player player;
  	private Monster[] monsters;
  	private Boss[] bosses;
  	private Tree[] trees;
  	private Rock[] rocks;

  	public GameEngine(int size) {
  	
    	if (size < 1) {
      		throw new IllegalArgumentException("The world should exist.");
    	}
    	this.frame = 0;
    	this.size = size;
    	
    	this.createWalls();

    	this.player = new Player(3, 4, 0, 1);
    	this.monsters = new Monster[4];
    	this.monsters[0] = new Monster_Z(4, 3, 1, 0);
    	this.monsters[1] = new Monster_X(10, 12, 0, 1);
    	this.monsters[2] = new Monster_A(8, 1, 1, 1);
    	this.monsters[3] = new Monster_S(9, 1, 1, 0);
    	
    	this.bosses = new Boss[2];
    	this.bosses[0] = new Boss_O(1, 1, 0, 1);
    	this.bosses[1] = new Boss_K(2, 4, 1, 1);
    	
    	this.rocks = new Rock[2];
    	this.rocks[0] = new Rock(3, 2);
    	this.rocks[1] = new Rock(2, 2);
    	
    	this.trees = new Tree[2];
    	this.trees[0] = new Tree(18, 3);
    	this.trees[1] = new Tree(14, 14);
    	
  	}

  	private void createWalls() {
  	
    	int wallCount = 0;
    	
    	// calculate the amount of walls we'll need
    	this.walls = new Wall[this.size * 4 - 4];

    	for (int x = 0; x < this.size; x++) {
      		Wall x1 = new Wall(x, 0);
      		walls[wallCount++] = x1;
      		Wall x2 = new Wall(x, this.size - 1);
      		walls[wallCount++] = x2;
    	}

    	for (int y = 1; y < size - 1; y++) {
      		Wall y1 = new Wall(0, y);
      		walls[wallCount++] = y1;
      		Wall y2 = new Wall(this.size - 1, y);
      		walls[wallCount++] = y2;
    	}
    	
  	}

  	// the main update loop
  	public void update() {
  	
    	this.frame++;
    	this.render();
    	this.updateObjects();
    	this.checkCollisions();
    
  	}

  	private void render() {
  	
    	String[][] renderedWorld = new String[this.size][this.size];
    	RenderWalls renderWalls = new RenderWalls(renderedWorld, walls);
    	RenderPlayers renderPlayers = new RenderPlayers(renderedWorld, player);
    	RenderMonsters renderMonsters = new RenderMonsters(renderedWorld, monsters);
    	RenderBosses renderBosses = new RenderBosses(renderedWorld, bosses);
    	RenderTrees renderTrees = new RenderTrees(renderedWorld, trees);
    	RenderRocks renderRocks = new RenderRocks(renderedWorld, rocks);
    
    	renderWalls.render();
    	renderPlayers.render();
    	renderMonsters.render();
    	renderBosses.render();
    	renderTrees.render();
    	renderRocks.render();

    	System.out.println("=========================");
    	System.out.println("Frame: " + this.frame);  // book keeping

    	for (int row = 0; row < renderedWorld.length; row++) {
      		String[] rowOfWorld = renderedWorld[row];
      		for (int col = 0; col < rowOfWorld.length; col++) {
        		String w = rowOfWorld[col];
        		// If our string is null
        		if (w == null) {
          			w = ".";
        		}
        		System.out.print(w + " ");
      		}
      		System.out.println(""); // print a new line between each scene
    	}

		System.out.println(renderPlayers.stringHP());
    	System.out.println(renderBosses.stringHP());
    	System.out.println(renderMonsters.stringHP());
    	System.out.println("=========================");
    	
  	}

  	private void updateObjects() {
  	
    	this.player.update();
    	for (int i = 0; i < this.monsters.length; i++) {
    		this.monsters[i].update();
    	}
    	for (int i = 0; i < this.bosses.length; i++) {
    		this.bosses[i].update();
    	}
    	
  	}

  	private void checkCollisions() {
  		
  		//checking for player to object collisions
  		this.player.checkCollision((Boss_O)bosses[0]);
  		this.player.checkCollision((Boss_K)bosses[1]);
  		this.player.checkCollision((Monster_Z)monsters[0]);
  		this.player.checkCollision((Monster_X)monsters[1]);
  		this.player.checkCollision((Monster_A)monsters[2]);
  		this.player.checkCollision((Monster_S)monsters[3]);
  		
  		//checking for boss/monster to player collisions
  		for (int i = 0; i < this.bosses.length; i++) {
  			this.bosses[i].checkCollision(this.player);
  		}
  		
  		for (int i = 0; i < this.monsters.length; i++) {
  			this.monsters[i].checkCollision(this.player);
  		}
  		
  		//checking for object to wall collisions	
    	for (int i = 0; i < this.walls.length; i++) {
      		Wall wall = this.walls[i];
      		this.player.checkCollision(wall);
      		for (int j = 0; j < this.bosses.length; j++) {
      			this.bosses[j].checkCollision(wall);
      		}
      		for (int k = 0; k < this.monsters.length; k++) {
      			this.monsters[k].checkCollision(wall);
      		}
    	}
    	
    	//checking for object to tree collisions
    	for (int i = 0; i < this.trees.length; i++) {
      		Tree tree = this.trees[i];
      		this.player.checkCollision(tree);
      		for (int j = 0; j < this.bosses.length; j++) {
      			this.bosses[j].checkCollision(tree);
      		}
      		for (int k = 0; k < this.monsters.length; k++) {
      			this.monsters[k].checkCollision(tree);
      		}
    	}
    	
    	//checking for object to rock collisions
    	for (int i = 0; i < this.rocks.length; i++) {
      		Rock rock = this.rocks[i];
      		this.player.checkCollision(rock);
      		for (int j = 0; j < this.bosses.length; j++) {
      			this.bosses[j].checkCollision(rock);
      		}
      		for (int k = 0; k < this.monsters.length; k++) {
      			this.monsters[k].checkCollision(rock);
      		}
    	}
  	}
  	
}