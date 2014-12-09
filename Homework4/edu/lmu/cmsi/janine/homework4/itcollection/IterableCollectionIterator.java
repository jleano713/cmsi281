package edu.lmu.cmsi.janine.homework4.itcollection;

import java.util.Iterator;

public class IterableCollectionIterator<E> implements Iterator<E> {
	private E object1;
	private E object2;
	private int currentObject = 1;
	
	public IterableCollectionIterator(E o1, E o2) {
		this.object1 = o1;
		this.object2 = o2;
	}
	
	public void remove() {
		throw new UnsupportedOperationException("Sorry, can't do that");
	}
	
	public E next() {
		if (this.currentObject == 1) {
			this.currentObject++;
			return object1;
		}
		else {
			this.currentObject++;
			return object2;
		}
		
		this.currentObject++;
		
		throw new IllegalStateArgument("Shouldn't get here");
	}
	
	public boolean hasNext() {
		if (this.currentObject == 1) {
			return this.object1 != null;
		}
		else if (this.currentObject == 2) {
			return.this.object2 != null;
		}
		
		return false;
	}
	
}