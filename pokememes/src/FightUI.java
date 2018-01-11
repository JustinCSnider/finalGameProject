import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FightUI {
public JFrame win;


	public FightUI() {
		win = new JFrame("fight menu");
	      win.setLayout(null);
	      win.setBounds(0,0,650,600);
	      
	      
	      Rectangle b = new Rectangle(0,0,900,900);
	      b.setBackground(Color.gray);
	      win.add(b,0);
	      
	      JLabel event;
	      event = new JLabel();
	      event.setText(" Is it working?");     
	      event.setBounds(10,470,300,50);
	      b.add(event,0);
	      
	      Rectangle box = new Rectangle(10,290,100,40);
	      box.setBackground(Color.white);
	      b.add(box,0);
	      
	      Rectangle boxe = new Rectangle(420,10,100,40);
	      boxe.setBackground(Color.white);
	      b.add(boxe,0);
	      
	      JLabel enemyHP;
	     enemyHP = new JLabel();
	      enemyHP.setText("EnemyHP:" );//add Hp
	      enemyHP.setBounds(5,5,100,50);
	      boxe.add(enemyHP,0);
	      
	      JLabel enemyName;
	      enemyName = new JLabel();
	      enemyName.setText("ChangeLater");
	    		  enemyName.setBounds(5,-15,100,50);
		      boxe.add(enemyName,0);
		      
		      JLabel heroName;
		      heroName = new JLabel();
		      heroName.setText("ChangeLater");
		      heroName.setBounds(5,-15,100,50);
			      box.add(heroName,0);
	      
	      JLabel heroHP;
	     heroHP = new JLabel();
	      heroHP.setText("HeroHP:" ); //add Hp
	      heroHP.setBounds(5,5,100,50);
	      box.add(heroHP,0);
	      
	      Oval standy;
	      standy = new Oval(70,370,150,90);
	      standy.setBackground(Color.white);
	      b.add(standy,0);
	      
	      Oval standy2;
	      standy2 = new Oval(470,90,150,90);
	      standy2.setBackground(Color.white);
	      b.add(standy2,0);
	      
	      JButton attack;
	      attack = new JButton("Attack");
	      attack.setBounds(10,520,300,50);
	      attack.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		  
	    	  }
	      });
	      b.add(attack,0);
	      
	      JButton run;
	      run = new JButton("Run");
	      run.setBounds(340,520,300,50);
	      run.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		  
	    	  }
	      });
	      b.add(run,0);
	      
	      JButton catch1;
	      catch1 = new JButton("Catch");
	      catch1.setBounds(340,470,300,50);
	      catch1.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		 
	    	  }
	      });
	      b.add(catch1,0);
	      
	      
	      
	      
	      
	      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      win.setVisible(true);
	      

	}

}
