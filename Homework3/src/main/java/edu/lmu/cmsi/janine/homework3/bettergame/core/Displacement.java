package edu.lmu.cmsi.janine.homework3.bettergame.core;

public class Displacement {

  	private int dX;
  	private int dY;

  	public Displacement(int dX, int dY) {
    	this.dX = dX;
    	this.dY = dY;
  	}

	public Displacement getDisplacement() {
		return this;
	}
	
  	public int getXDisplacement() {
    	return this.dX;
  	}

  	public int getYDisplacement() {
    	return this.dY;
  	}

  	public void invert() {
    	this.dX = this.dX * -1;
    	this.dY = this.dY * -1;
  	}
  
  	public boolean equals(Object object) {
  		if (!(object instanceof Displacement)) {
  			return false;
  		}
  		if (this.getXDisplacement() == ((Displacement)object).getXDisplacement() 
  			&& this.getYDisplacement() == ((Displacement)object).getYDisplacement()) {
  			return true;
  		}
  		else {
  			return false;
  		}
  	}
  	
}