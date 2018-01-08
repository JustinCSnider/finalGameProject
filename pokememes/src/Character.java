import java.awt.event.*;
import java.awt.event.KeyListener;
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Character extends EzImage implements KeyListener{
    private int deltaX, deltaY;

    public Character(int x, int y, int w, int h, String i){
        super(x,y,w,h,i);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        int y = this.getY();
        int x = this.getX();
        if(keyCode == KeyEvent.VK_DOWN){
            down();
        }
        if(keyCode == KeyEvent.VK_UP){
            up();
        }
        if(keyCode == KeyEvent.VK_LEFT){
            left();
        }
        if(keyCode == KeyEvent.VK_RIGHT){
            right();
        }
        this.setLocation(x + deltaX, y + deltaY);
    }

    public void keyTyped(KeyEvent e){}

    public void keyReleased(KeyEvent e){}

    public void down(){
        deltaY = 5;
        deltaX = 0;
    }

    public void up(){
        deltaY = -5;
        deltaX = 0;
    }

    public void left(){
        deltaX = -5;
        deltaY = 0;
    }

    public void right(){
        deltaX = 5;
        deltaY = 0;
    }
}