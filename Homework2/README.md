CMSI281 - Homework #2
=====================
Point & Line
* I gave it the simplest parameters: two doubles
* included varying setter methods for future use in Shapes

Square & Rectangle
* User inputs a point which acts as the lower-left corner point using inputted length(s)
* builds from that point clockwise, assigning points and forming lines
* not necessary to check for equal sides of a square because the code forms the shape itself from one point,
  ensuring all equal sides

Circle
* radius and center point is sufficient for the methods
* every other value builds up from the radius
* checks ensure that the circle stays within Quadrant 1 (pos-pos)

Right Triangle
* like square and rectangle, builds from one lower-left corner point clockwise using inputted base and height
* checking for right triangle isn't necessary since how lines are formed (horizontal + vertical for the height and base)
  ensures that by default the shape will have one right angle