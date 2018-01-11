

import java.awt.Color;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UI extends EzImage
{
    public JFrame Start;
    public JFrame win ;
    
    public UI(int x, int y, int w, int h, String i) {
    	super(x,y,w,h,i);
    	
    }
    
    
    public UI(){
    	
      win = new JFrame("PokeMemes");
      win.setLayout(null);
      win.setBounds(0,0,600,600);
      
      
      Rectangle b = new Rectangle(0,0,900,900);
      b.setBackground(Color.RED);
      win.add(b,0);
      
      JButton start;
      start = new JButton("START");
      start.setBounds(150,250,300,50);
      b.add(start,0);
      win.setVisible(true);
      
      start.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  loadWindow();
    	  }
      });
      
      //UI logo = new UI(50,50,40,40,".PNG");
      //win.add(logo,0);
      
        
        
        
        
        
        
        
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

	public void loadWindow() {
     Start = new JFrame("START");
     Start.setLayout(null);
   	 Start.setBounds(600,0,600,600);
   	 Start.setVisible(true);
   	Rectangle b = new Rectangle(0,0,900,900);
    b.setBackground(Color.RED);
    Start.add(b,0);
    
   	 JButton fight;
        fight = new JButton("FIGHT");
        fight.setBounds(150,200,300,50);
        b.add(fight,0);
        fight.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  
    	  }
      });
        
        
        JButton pokememe;
         pokememe = new JButton("POKEMEMES");
        pokememe.setBounds(150,300,300,50);
        b.add(pokememe,0);
        pokememe.addActionListener(new ActionListener() {
      	  public void actionPerformed(ActionEvent e) {
    		  
      	  }
        });
        
        JButton close;
        close = new JButton("CLOSE");
        close.setBounds(150,400,300,50);
        b.add(close,0);
        close.addActionListener(new ActionListener() {
      	  public void actionPerformed(ActionEvent e) {
    		  Start.dispose();
    		  win.dispose();
      	  }
        });
      
	}
	

}
