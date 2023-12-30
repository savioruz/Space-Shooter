import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private int score;
    private int health = 3;
    private int time;

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        super(600, 800, 1); 
        showHealth();
        showScore();
        showTime();
        time = 5000;
        addObject(new AirForce(), 300, 700);
    }

    public void updateHealth(int point) {
        health += point;
        showHealth();

        if (health == 0) {
            Greenfoot.stop();
            addObject(new Defeat(), 300, 400);
        }
    }

    public void showHealth() {
        showText("Health: " + health, 400, 25);
    }

    public void addScore(int point) {
        score += point;
        showScore();
    }

    private void showScore() {
        showText("Score: " + score, 100, 25);
    }

    private void countTime() {
        time--;
        showTime();
        
        if (time == 0) {
            Greenfoot.stop();
            addObject(new Victory(), 300, 400);
        }
    }

    private void showTime() {
        showText("Time: " + time, 250, 25);
    }

    public void act() {
        if (Greenfoot.getRandomNumber(600) < 5) {
            addObject(new Enemy(), Greenfoot.getRandomNumber(getWidth()), 600);
        }
        countTime();
    }
}
