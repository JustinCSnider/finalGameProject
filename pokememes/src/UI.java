

//import java.awt.Color;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UI
{
    public JFrame Start;
    public JFrame win ;
    public JButton b1 = new JButton("START");
    
    
    public UI(){
    	
      win = new JFrame("PokeMemes");
      win.setBounds(0,0,600,600);
      
      win.add(b1,0);
      win.setVisible(true);
      b1.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  loadWindow();
    	  }
      });
      
        
         
//        Rectangle tan = new Rectangle(0,0,900,900);
//        tan.setBackground(Color.black);
//        win.add(tan,0);
        
        
        
        
        
        
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

	public void loadWindow() {
     Start = new JFrame("START");
     Start.setLayout(null);
   	 Start.setBounds(600,0,600,600);
   	 Start.setVisible(true);
   	 
   	 JButton fight;
        fight = new JButton("FIGHT");
        fight.setBounds(150,0,300,50);
        Start.add(fight,0);
        fight.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  
    	  }
      });
        
        JButton parties;
         parties = new JButton("PARTIES");
        parties.setBounds(150,100,300,50);
        Start.add(parties,0);
        parties.addActionListener(new ActionListener() {
      	  public void actionPerformed(ActionEvent e) {
    		  
      	  }
        });
        
        JButton close;
        close = new JButton("CLOSE");
        close.setBounds(150,200,300,50);
        Start.add(close,0);
        close.addActionListener(new ActionListener() {
      	  public void actionPerformed(ActionEvent e) {
    		  Start.dispose();
    		  win.dispose();
      	  }
        });
        
	}
	

}
