import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(2);
        turn(Greenfoot.getRandomNumber(10));
        turnAtEdge();
    }
    public void turnAtEdge(){
        if(getX() <= 15 || getX() >= getWorld().getWidth()-15){
            turn(60);
        }
        if(getY() <= 15 || getY() >= getWorld().getWidth()-15){
            turn(60);
        }
    }
}
