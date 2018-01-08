import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FightUI {
public JFrame win;

	public FightUI() {
		win = new JFrame("fight menu ");
	      win.setLayout(null);
	      win.setBounds(0,0,650,600);
	      
	      
	      Rectangle b = new Rectangle(0,0,900,900);
	      b.setBackground(Color.gray);
	      win.add(b,0);
	      
	      //add jlabel
	      
	      JButton attack;
	      attack = new JButton("Attack");
	      attack.setBounds(10,520,300,50);
	      b.add(attack,0);
	      
	      JButton run;
	      run = new JButton("Run");
	      run.setBounds(340,520,300,50);
	      b.add(run,0);
	      
	      JButton catch1;
	      catch1 = new JButton("Catch");
	      catch1.setBounds(340,470,300,50);
	      b.add(catch1,0);
	      
	      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      win.setVisible(true);
	      attack.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		  //add what is called
	    	  }
	      });

	}

}
