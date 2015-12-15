package javafinal;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ZodiacSymbol extends JFrame {
	
	private JLabel item2;
	
	public ZodiacSymbol(){ 
		setLayout(new FlowLayout());
		
		item2 = new JLabel();
		add(item2); 
		
		JFrame zodiac = new JFrame();
		zodiac.setTitle("Zodiac Signs");
		zodiac.setLayout(new GridLayout(4,4));
		zodiac.setSize(750,550);
		zodiac.setLocationRelativeTo(null);
		zodiac.setVisible(true);
		zodiac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
  

	
    
    setLayout(new FlowLayout());
	
	//creating the buttons
	//Mandy's JButtons on Moodle
    ImageIcon rat = new ImageIcon("rat-2015.jpg");
	JButton b1=new JButton(rat);
	
	ImageIcon ox = new ImageIcon("ox.jpg");
	JButton b2=new JButton(ox);
	
	ImageIcon tig = new ImageIcon("tiger.jpg");
	JButton b3=new JButton(tig);
	
	ImageIcon rab = new ImageIcon("rabbit.jpg");
	JButton b4=new JButton(rab);
	
	ImageIcon drag = new ImageIcon("dragon.gif");
	JButton b5=new JButton(drag);
	
	ImageIcon snake = new ImageIcon("snake.jpg");
	JButton b6=new JButton(snake);
	
	ImageIcon horse = new ImageIcon("horse.jpg");
	JButton b7=new JButton(horse);
	
	ImageIcon sheep = new ImageIcon("sheep.jpg");
	JButton b8=new JButton(sheep);
	
	ImageIcon monkey = new ImageIcon("monkey.jpg");
	JButton b9=new JButton(monkey);
	
	ImageIcon roost = new ImageIcon("rooster.jpg");
	JButton b10=new JButton(roost);
	
	ImageIcon dog = new ImageIcon("dog.jpg");
	JButton b11=new JButton(dog);
	
	ImageIcon pig = new ImageIcon("pig.jpg");
	JButton b12=new JButton(pig);
	
	JButton b13= new JButton();
	JButton b14= new JButton("Figure Out Your Sign Here!");
	JButton b15= new JButton("Compatibility Test!");
	JButton b16= new JButton();
	
		//Adding an action to button 1
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Rat: 2008, 1996, 1984, 1972, 1960, 1948. Though people consider the rat not adorable<br>"
			+"and it even makes its way into derogatory languages, it ranks first on the Chinese<br>"
			+"zodiac signs. It has characteristics of an animal with spirit, wit, alertness, delicacy,<br>"
			+"flexibility and vitality.");
			}
		});
		
		//Adding an action to button 2
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "<html> Years of the Ox: 2009, 1997, 1985, 1973, 1961, 1949. Oxen used to be capable farming tools in agricultural<br>"
				+"society, which attach to the symbol of diligence, persistence and honesty. They are probably<br>"
	 			+"tardy in action, but industrious and cautious. Most of them are conservative and hold their<br> "
	 			+"faith firmly.");
			}
		});
		
		//Adding an action to button 3
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Tiger: 2010, 1998, 1986, 1974, 1962, 1950. Tigers, considered to be brave, cruel, forceful,<br>"
	 			+"stately and terrifying, are the symbol of power and lordliness. In ancient times,<br>"
	 			+"people usually compared emperors or grandees with the tiger. Court officials often said that<br>"
	 			+"'accompanying the emperor is just like being at the side of a tiger'. There are also many legends<br>"
	 			+"about this animal.");
			}
		});
		
		//Adding an action to button 4
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Rabbit: 2011, 1999, 1987, 1975, 1963, 1951. For Chinese people, the rabbit is a tame creature<br>"
			 			+"representing hope for a long time. It is tender and lovely. The moon goddess Chang'e in Chinese<br>"
			 			+" legend had a rabbit as her pet, which stimulated the thought that only this creature was amiable<br>"
			 			+" to match her noble beauty. People in Rabbit sign are not aggressive but approachable. They have a<br>"
			 			+" decent, noble and elegant manner.");}
		});
		
		//Adding an action to button 5
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html><strong>Day 5:</strong> What do snowmen like to do on the weekends?<br> click ok for the answer</html>");
				JOptionPane.showMessageDialog(null, "Chill out!");
			}
		});
		
		//Adding an action to button 6
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html><strong>Day 6:</strong> \"The four basic food groups are candy, candy canes, candy corns and syrup. So go and enjoy some candy!\" - Buddy the Elf</html>");
			}
		});
		
		//Adding an action to button 7
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html><strong>Day 7:</strong> Hopefully this picture will brighten up your day!</html>");
			}
		});
		
		//Adding an action to button 8
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html><strong>Day 8:</strong> Make homemade Hot Cocoa!</html>");
			}
		});
		
		//Adding an action to button 9
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html><strong>Day 9:</strong> Drive around & see all the lights</html>");
			}
		});
		
		//Adding an action to button 10
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html><strong>Day 10:</strong> Make some sugar cookies & decorate them</html>");
			}
		});
		
		//Adding an action to button 11
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html><strong>Day 11:</strong>Two snowmen in a field, one turned to the other and said \"I don't know about you but I can smell carrots.\"!</html>");
			}
		});
		
		//Adding an action to button 12
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//curtousy of whychristmas.com
				JOptionPane.showMessageDialog(null, "<html><strong>Day 12:</strong> DID YOU KNOW... <br>The custom of kissing under Mistletoe comes from England.<br> The original custom was that a berry was picked from the sprig of Mistletoe <br>before the person could be kissed and when all the berries had gone, there could be no more kissing!</html>");
			}

			public void actionPerformed1(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Adding an action to button 12
				b14.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						animals run = new animals();
					}

					public void actionPerformed1(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//Adding an action to button 12
				b15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//curtousy of whychristmas.com
						JOptionPane.showMessageDialog(null, "<html><strong>Day 12:</strong> DID YOU KNOW... <br>The custom of kissing under Mistletoe comes from England.<br> The original custom was that a berry was picked from the sprig of Mistletoe <br>before the person could be kissed and when all the berries had gone, there could be no more kissing!</html>");
					}

					public void actionPerformed1(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});


//adding the buttons to the frame
zodiac.add(b1);
zodiac.add(b2);
zodiac.add(b3);
zodiac.add(b4);
zodiac.add(b5);
zodiac.add(b6);
zodiac.add(b7);
zodiac.add(b8);
zodiac.add(b9);
zodiac.add(b10);
zodiac.add(b11);
zodiac.add(b12);
zodiac.add(b13);
zodiac.add(b14);
zodiac.add(b15);
zodiac.add(b16);
JOptionPane.showMessageDialog(null,"<html>Click on the pictures to find out what your Chinese Zodiac has to say!<html>");

	}                                   
    
 }
	    


