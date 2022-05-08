import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    

    public void act()
    {
        // Add your action code here
        move(5);
        
        if (Greenfoot.getRandomNumber(100) < 25) {
            turn(10);
        }
        if(atWorldEdge()){
            
            turn(10);
            
        }
        
      
    }
}


