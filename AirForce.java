import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirForce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirForce extends Plane
{
    private int pause = 0;
    private int health;  
    public int hold = 10;

    protected void move(){
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() -4);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() +4);
        }
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() -4, getY());
        }
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() +4, getY());
        }

        if(hold == 0) {
            if (Greenfoot.isKeyDown("space")) {
                getWorld().addObject(new Missile(), getX(), getY());
            }
            hold = 10;
        }
    }


    /**
     * Act - do whatever the AirForce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        hold--;
        move();
        if (pause > 0) pause--;
        if (pause == 1)
        if (pause == 0) pause -= 20;
    }
}
