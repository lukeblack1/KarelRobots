
package Task5;

import becker.robots.*;

public class Gardener extends Robot

{
 public Gardener(City aCity,int aStreet,int anAvenue,
                 Direction aDirection,int numThings)
 {
     super(aCity,aStreet,anAvenue,aDirection,numThings);
 }
 
 public void pickApples()
 {
  this.move();
  this.move();
  this.pickThing();
  this.turnLeft();
  this.move();
  this.pickThing();
  this.turnAround();
  this.move();
  this.move();
  this.pickThing();
  
  
  this.turnLeft();
  this.move();
  this.pickThing();
  this.turnLeft();
  this.move();
  this.pickThing();
  this.move();
  this.pickThing();
  this.turnAround();
  this.turnLeft();
  
  this.move();
  this.pickThing();
  this.turnLeft();
  this.turnAround();
  this.move();
  this.pickThing();
  this.move();
  this.pickThing();
  
  //turning around
  this.turnAround();
  this.move();
  this.move();
  this.move();
  this.move();
  this.move();
  
  this.turnLeft();
  this.move();
  this.move();
  this.move();
  this.move();
  
  
  this.turnLeft();
  
  this.move();
  this.putThing();
  this.putThing();
  this.putThing();
  this.putThing();
  this.putThing();
  this.putThing();
  this.putThing();
  this.putThing();
  this.putThing();
  this.turnAround();
  this.move();
  
  
  
  
  
 }
 
 public void turnAround()
 {
  this.turnLeft();
  this.turnLeft();
  
  
 }
 
 
}


