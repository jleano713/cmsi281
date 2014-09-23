package edu.lmu.cmsi.janine.homework1.shape.parts;

public class Shape {

	private Points[] points;
	private String shape;

	public Shape (Points[] points, String shape)  {
		points = new Points[args.length - 2];
		for (int i = 0; i < args.length - 1; i++) {
			points[i] = args[i];
		}
		this.shape = shape;
	}
	
	public boolean containsPoint (Point point) {
		
	}
	
	public void translate (Point point1, Point point2) {
	}
	
	public Rectangle boundRectangle (Shape x) {
	}
	
}
