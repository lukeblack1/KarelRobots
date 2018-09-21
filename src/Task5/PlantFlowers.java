//Ch02 page 15 - page 20
//Karel Robot Workbook

//Luke Black
//06 09 2018
//EC1405935

package Task5;

import Task5.Garden;
import Task5.Garden;
import Task5.Gardener;
import Task5.Gardener;
import becker.robots.*;


public class PlantFlowers 

{

    
    public static void main(String[] args) 
    {
    /*
        City berlin = new City();
        Wall eWall = new Wall(berlin, 1,2, Direction.EAST);
        Wall nWall = new Wall(berlin, 1,2, Direction.NORTH);
        Wall wWall = new Wall(berlin, 1,2, Direction.WEST);
        Wall sWall = new Wall(berlin, 1,2, Direction.SOUTH);
      */
        City berlin = new City("MyCity.txt");
        
        
        
        
        Gardener karel = new Gardener(berlin,4,1,Direction.EAST,8);
        
        karel.pickApples();
        
        
       //Plant
    
     
     //PROBLEM
     
    
     
     
        //karel.plantFlowers();
        
    }

    private static void putThing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

        
        
        
    
    

