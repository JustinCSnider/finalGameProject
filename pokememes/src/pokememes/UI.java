package pokememes;

import java.awt.Color;
import javax.swing.*;

public class UI extends ButtonWindow
{
    private ButtonWindowFrame win;
    public UI(){
        win = new ButtonWindowFrame("PokeMemes");
        win.addActButton(350,450,100,25);
        win.setActButtonText("Fight");
        
    }

    public void act(){

    }

}
