import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Damage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Damage extends Actor
{
    private int pause = 5;

    /**
     * Act - do whatever the Damage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (pause > 0) {
            pause--;
        } else {
            getWorld().removeObject(this);
        } 
    }
}
