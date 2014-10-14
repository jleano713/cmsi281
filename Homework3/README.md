CMSI281 - Homework #3
=====================

CREDIT: Basic classes (Coordinate, Displacement, GameEngine, Player, Monster, Walls) created by Mike Megally from original LameGame package
Modifications made by Janine Leano

Coordinate & Displacement
> I kept the basics. I added an equals() method for unit test purposes.

GameEngine
> I really wanted to keep it generic and basic for future modifications (ex: if I wanted to add a game object, I wouldn't have to tamper with the GameEngine)
> but unfortunately I only managed to simplify the render by making a render interface which the current and future game objects could mimic.
> I did not know how to further simplify the updateObjects or how to optimize how the game objects are handled in general since I ran out of time.
> This was the hardest to think of in terms of object-oriented design - especially in the render, update, checkCollisions aspect. 
> I also had a hard time dealing with the checkCollisions that dealt with monsters and bosses. I'm not sure what I did wrong but they only worked if you 
> cast the elements of their array with their respective subclasses. I'm not sure how this could be dealt with. It works, but it poses a future
> problem for other objects that could be added in the future since it's a lot of code duplication.

Render
> An interface. There were too many differences in its subclasses to make this an abstract class. Not entirely sure if this is necessary actually but
> this could be useful in case I add more functionality.

RenderBosses, RenderMonsters, RenderPlayers, RenderWalls 
> Contains a render() method which are similar to each other except for player, since there's only one unit of it for now. 
> I was going to create multiple constructors for each (ex: one with Player player and Player[] players) for future purposes but I
> unfortunately ran out of time.

MoveableObject
> MoveableObject is an abstract class. I considered making it an interface but there were too many methods that the subclasses already had in common
> and I didn't want to duplicate too much code.

Player
> Extends MoveableObject. I kept the basics. Only added the HP functionality and the collisions. I wasn't sure how I could reduce the duplication
> in the different collisions for the other MoveableObjects.

Monster
> Extends MoveableObject. Monster is an abstract class.

Monster Z, Monster X, Monster A, Monster S
> Extends Monster. These types are only different in how they handle collisions with other game objects.

Boss
> Extends MoveableObject. Similar to Monster in its functionality.

Boss O, Boss K
> Extends Boss. Only differs in their collision behaviors and HP.

StationaryObject
> An abstract class. Pretty much defines all of its subclasses.

Wall, Rock, Trees
> I kept the basics for wall and modeled Rock and Tree after it. I chose for the MoveableObjects to handle collisions since these were more
> final and static.

Upon hindsight after finishing this assignment, I realized I could have reduced even more code by having MoveableObject and
StationaryObject extend to a superclass which would contain all the boring methods such as the getters, etc.