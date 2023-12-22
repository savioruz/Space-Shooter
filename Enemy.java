import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public int hold = 30;
    private int pause = 0;

    public void move () {
        setLocation(getX(), getY()+1);
        if (getY() > 600) {
            setLocation(Greenfoot.getRandomNumber(600),
             Greenfoot.getRandomNumber(50));
        }
    }

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        if (hold == 0) {
            hold = 30;
        }
        if (pause > 0) {
            pause--;
        }
        if (pause == 1) {
            getWorld().addObject(new EnemyAtk(), getX(), getY()+40);
        }
        if (pause == 0) {
            pause = 120;
        }
    }
}
