package edu.lmu.cmsi.janine.homework3.bettergame.core;

public class Coordinate {

  	private int x;
  	private int y;

  	public Coordinate(int x, int y) {
    	this.setX(x);
    	this.setY(y);
  	}

  	public int getX() {
    	return this.x;
  	}

  	public void setX(int x) {
    	this.x = x;
  	}

  	public int getY() {
    	return this.y;
  	}

  	public void setY(int y) {
    	this.y = y;
  	}
  
  	public boolean equals(Object object) {
  		if (!(object instanceof Coordinate)) {
  			return false;
  		}
  		if (this.getX() == ((Coordinate)object).getX() && this.getY() == ((Coordinate)object).getY()) {
  			return true;
  		}
  		else {
  			return false;
  		}
  	}

}