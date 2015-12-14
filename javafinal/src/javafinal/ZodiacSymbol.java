package javafinal;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZodiacSymbol extends JFrame {
	
	private JLabel item2;
	
	public void frame(){ 
		setLayout(new FlowLayout());
		
		item2 = new JLabel();
		add(item2); 
		
		JFrame zodiac = new JFrame();
		zodiac.setTitle("Zodiac Signs");
		zodiac.setSize(500, 300);
		zodiac.setLocationRelativeTo(null);
		zodiac.setVisible(true);
		zodiac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel (new GridBagLayout());
    	zodiac.add(panel);
    GridBagConstraints c = new GridBagConstraints ();
	}
    
   
   		
	}		

