import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Attack
{
    private int health;    

    public void move() {
        setLocation(getX(), getY()+5);
        if (getY() > 790) {
            getWorld().removeObject(this);
        } else {
            checkDamage();
        }
    }
    
    public void checkDamage() {
        if (isTouching(AirForce.class)) {
            getWorld().addObject(new Damage(), getX(), getY());
            Background bg = (Background) getWorld();
            bg.updateHealth(-1);
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Act - do whatever the EnemyAtk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
}
