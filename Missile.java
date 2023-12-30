import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Attack
{
    public void move() {
        setLocation(getX(), getY()-5);
        if (getY() < 20) {
            getWorld().removeObject(this);
        } else {
            checkDamage();
        }
    }

    public void checkDamage() {
        if (isTouching(Enemy.class)) {
            getWorld().addObject(new Damage(), getX(), getY());
            Background bg = (Background)getWorld();
            bg.addScore(20);
            removeTouching(Enemy.class);
        }

        if (isTouching(Laser.class)) {
            getWorld().addObject(new Damage(), getX(), getY());
            removeTouching(Laser.class);
        }
    }

    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
}
