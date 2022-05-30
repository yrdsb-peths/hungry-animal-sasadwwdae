import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Myworld here.
 * 
 * @author Henry 
 * @version May 2022
 */
public class Myworld extends World
{

    /**
     * Constructor for objects of class Myworld.
     * 
     */
    public Myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Elephant elephant = new Elephant();
        addObject(elephant,300,200);
        
        createApple();
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = (0);
        addObject(apple,x,y);
    }
}
