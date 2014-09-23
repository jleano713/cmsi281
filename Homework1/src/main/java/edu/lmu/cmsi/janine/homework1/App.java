package edu.lmu.cmsi.janine.homework1;

import edu.lmu.cmsi.janine.homework1.shape.Square;
import edu.lmu.cmsi.janine.homework1.shape.Rectangle;
import edu.lmu.cmsi.janine.homework1.shape.Circle;
import edu.lmu.cmsi.janine.homework1.shape.RightTriangle;
import edu.lmu.cmsi.janine.homework1.shape.parts.Point;
import edu.lmu.cmsi.janine.homework1.shape.parts.Line;

public class App {
  public static void main(String[] args) {
  	double height = 5.0;
  	double width = 6.0;
  	double base = 6.0;
  	double length = 5.0;
  	double radius = 5.0;
  	
  	Point point1 = new Point(10.0, 10.0);
  	Point point2 = new Point(2.0, 2.0);
  	Line line = new Line(point1, point2);
    Square square = new Square(point1, length);
    Rectangle rectangle = new Rectangle(point1, height, width);
    Circle circle = new Circle(point1, radius);
    RightTriangle rightTriangle = new RightTriangle(point1, base, height);

    System.out.println("Point #1 successfully created: " + point1.toString());
    System.out.println("Point #2 successfully created: " + point2.toString());
    System.out.println("Line successfully created: " + line.toString());
    System.out.println("Square successfully created: " + square.toString());
    System.out.println("Rectangle successfully created: " + rectangle.toString());
    System.out.println("Circle successfully created: " + circle.toString());
    System.out.println("Right Triangle successfully created: " + rightTriangle.toString());
  }
}
