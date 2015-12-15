package javafinal;

import javax.swing.JOptionPane;

public class Compatibilty {
	{
		boolean loop = true;
		while (loop){				
				
			String number= JOptionPane.showInputDialog("<html>Enter Your Zodiac Sign to find who your compatibile with:<br>"
			+"Rat=1 Ox=2 Tige=3 Rabbit=4 Dragon=5 Snake=6 Horse=7 Sheep=8 Monkey=9 Rooster=10 Dog=11 Pig=12 ");
			int number1;
			 number1 = Integer.parseInt(number);//StackOverflow
		
		
			switch(number1) {
			case 1: 
				JOptionPane.showMessageDialog(null,"<html>The Rat is most compatible with the Ox, Rabbit and Dragon."
						+ "<br>The Rat is leat compatiable with the Horse and Rooster.<html>");
				loop = false;
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"<html>The Ox is most compatible with the Rat, Monkey, and Rooster."
						+ "<br>The Ox is leat compatiable with the Tiger, Dragon, Horse adn Sheep.<html>");
				loop = false;
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"<html>The Tiger is most compatible with the Dragon, Horse, and Pig."
						+ "<br>The Tiger is leat compatiable with the Ox, Tiger, Snake and Monkey.<html>");
				loop = false;
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"<html>The Rabbit is most compatible with the Sheep, Monkey, Dog and Pig."
						+ "<br>The Rabbit is leat compatiable with the Snake and the Rooster.<html>");
				loop = false;
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"<html>The Dragon is most compatible with the Rat, Tiger, and Snake."
						+ "<br>The Dragon is leat compatiable with the Ox, Sheep, and Dog.<html>");
				loop = false;
				break;	
			case 6:
				JOptionPane.showMessageDialog(null,"<html>The Snake is most compatible with the Dragon and the Rooster."
						+ "<br>The Snake is leat compatiable with the Tiger, Rabbit, Snake, Sheep and Pig.<html>");
				loop= false;
				break;	
			case 7:
				JOptionPane.showMessageDialog(null,"<html>The Hores perfect match is with the Tiger, Sheep and Rabbit."
						+ "<br>The Horse is to avoid the Rat, Ox and Rooster at all cost.<html>");
				loop = false;
				break;	
			case 8:
				JOptionPane.showMessageDialog(null,"<html>The Sheep is most compatible with the Horse, Rabbit, and Pig."
						+ "<br>The Sheep is leat compatiable with the Ox, Tiger, and Dog.<html>");
				loop = false;
				break;	
			case 9:
				JOptionPane.showMessageDialog(null,"<html>The Monkey is most compatible with the Ox and the Rabbit."
						+ "<br>The Monkey is leat compatiable with the Tiger and the Pig.<html>");
				loop = false;
				break;	
			case 10:
				JOptionPane.showMessageDialog(null,"<html>The Rooster is most compatible with the Ox, and Snake."
						+ "<br>The Rooster is leat compatiable with the Rat, Rabbit, Horse Rooster, and Dog.<html>");
				loop = false;
				break;	
			case 11:
				JOptionPane.showMessageDialog(null,"<html>The Dog is most compatible with the Rabbit."
						+ "<br>The Dog is leat compatiable with the Dragon, Sheep, and Rooster.<html>");
				loop = false;
				break;	
			case 12:
				JOptionPane.showMessageDialog(null,"<html>The Pig is most compatible with the Sheep, Tiger, Rabbit."
						+ "<br>The Pig is leat compatiable with the Monkey and Snake.<html>");
				loop = false;
				break;	
				
			}//while loop
	 		if ( number1<=1 && number1>=12 )
	 			{
	 			loop = false;
	 			
	 			}//if statement
	 		
	 }//ending of switch/case statement
	 
	}//ends boolean
		
}
