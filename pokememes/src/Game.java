
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener;

public class Game
{
    public static void main(String[]args){
        JFrame win = new JFrame("Game");
        Character generic = new Character(20,20,20,20,"duck.jpg");
        win.setBounds(100,100,300,300);
        win.setLayout(null);
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
        win.add(generic,0);
        win.setVisible(true);
    }
}
