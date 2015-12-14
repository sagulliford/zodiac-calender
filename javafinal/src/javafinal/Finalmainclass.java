package javafinal;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Finalmainclass {
	
	public static void main (String [] args)
	{
		
		
		frame chinese = new frame();
		
		ImageIcon ii = new ImageIcon("chinese-zodiac-chart.png");//displays the image
        JLabel lable = new JLabel(ii);
        JScrollPane jsp = new JScrollPane(lable);
        	chinese.getContentPane().add(jsp);
        	chinese.setSize(600, 600);
        	chinese.setLocationRelativeTo(null);
			chinese.setTitle("Chinese Calender");
			chinese.setLocationRelativeTo(null);
			chinese.setVisible(true);
			chinese.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel (new GridBagLayout());
        	chinese.add(panel);
        GridBagConstraints c = new GridBagConstraints ();
        
        //making the button for the JFrame
        JButton button1 = new JButton("Start");
        	panel.add(button1, c);
        button1.addActionListener (new Action1());
        
        JButton button2 = new JButton("Exit");
    	panel.add(button2, c);
        button2.addActionListener (new Action2());
        
       //Displays message at the beginning
        JOptionPane.showMessageDialog(null,"<html>Welcome to the Chinese New Year Calender!<br>"
    			+ "This Calender will help you calculate your Chinese Zodiac<br>"
        		+"sign and give you a little more information on it!<br>"
        		+ "Hit the start button to begin!<html>");

        
	}
	static class Action1 implements ActionListener {        
		  public void actionPerformed (ActionEvent e) {     
		   ZodiacSymbol run = new ZodiacSymbol();		    } 
	}
		  
     static class Action2 implements ActionListener {        
			  public void actionPerformed (ActionEvent e) {     
				  int dialogButton = JOptionPane.YES_NO_OPTION;
		            JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING", dialogButton);
		            if(dialogButton == JOptionPane.YES_OPTION) {
		                System.exit(0);{
		              
		                }
		                }    	
		              } 
	   
	private static void validate() {
		// TODO Auto-generated method stub
		
	}

	private static void add(JPanel jp) {
		// TODO Auto-generated method stub
		
	}
	
}
}
