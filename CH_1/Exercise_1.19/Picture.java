import java.awt.*;
import java.awt.geom.*;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square horizon;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private int sunXpos = 10;
    private int sunYpos = 80;


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(sunXpos);
        sun.moveVertical(sunYpos);
        sun.changeSize(80);
        sun.makeVisible();
        
        horizon = new Square();
        horizon.changeSize(600);
        horizon.changeColor("green");
        horizon.moveHorizontal(-330);
        horizon.moveVertical(50);
        horizon.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
    }
    
    public void sunset() {
        int deltaX = 2;
        int deltaY = -1;
        while(sun.getYpos() < horizon.getYpos()) {
            sun.moveHorizontal(deltaX);
            sun.moveVertical(deltaY);
            if(sun.getYpos() == -30) {
                deltaY = 1;
            }
        }
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
