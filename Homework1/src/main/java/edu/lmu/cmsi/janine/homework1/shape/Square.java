package edu.lmu.cmsi.janine.homework1.shape;
import edu.lmu.cmsi.janine.homework1.shape.parts.*;

public class Square {
	private Shape shape;
	private Line line1;
	private Line line2;

	public Square (Point point1, Point point2) {
		this.line1 = new Line (point1, point2);
		this.line2 = new Line (point3, point4);

		
	}
	

	public int getPerimeter () {
		return line1.getLength() * 4;
	}
	
	public int getArea () {
		return Math.pow(line1.getLength(), 2);
	}
}
