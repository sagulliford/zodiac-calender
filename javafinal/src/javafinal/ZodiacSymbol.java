package javafinal;

import java.awt.Color;
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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
/*
 * runs the 2nd JFrame and JButtons
 * Zodiac Information from http://www.travelchinaguide.com/intro/social_customs/zodiac/
 */
public class ZodiacSymbol extends JFrame {
	
	private static final String RED = null;
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
     //borrowed code from Stack OverFlow
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
	b13.setBackground(Color.RED);
    // these next two lines do the magic..
    b13.setContentAreaFilled(false);
    b13.setOpaque(true);
     //changing the color of buttons
	JButton b14= new JButton("Figure Out Your Sign Here!");
	JButton b15= new JButton("Compatibility Test!");
	
	JButton b16= new JButton("Exit");
	b16.setBackground(Color.RED);
    b16.setContentAreaFilled(false);
    b16.setOpaque(true);
    	//changing the color of the buttons
	
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
				JOptionPane.showMessageDialog(null, "<html>Years of the Dragon:1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000, 2012. Dragon enjoys a very high reputation in Chinese culture.<br>"
	 			+"Chinese people always regard themselves as descendents of the dragon. In ancient China, this imaginary<br>"
	 			+" creature was thought to speed across the sky with divine power. It is the token of authority, dignity,<br>"
	 			+" honor, success, luck, and capacity. Emperors entitled themselves exclusively as 'dragon'.");
	 			
			}
		});
		
		//Adding an action to button 6
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Snake:1917, 1929, 1941, 1953, 1965, 1977, 1989, 2001, 2013. Snake carries the meanings of malevolence, cattiness and<br>"
	 			+" mystery, as well as acumen and divination. In some places, people believe that a snake found in<br>"
	 			+"their court can bring delight. However, in most cases, this animal is considered evil, which scares<br>"
	 			+"people from the bottom of the heart. There are some idioms in China indicating the danger of this animal,<br>"
	 			+"for example, once bitten by the snake twice shy of ten years.");
			}
		});
		
		//Adding an action to button 7
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Horse: 1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014. The Five Elements of Horse is Fire (Huo), which symbolizes<br>"
	 			+"enthusiasm and energy. The animal gives people an impression of independence and integrity. Its<br>"
	 			+"spirit is recognized to be Chinese people's ethos - making unremitting efforts to improve themselves<br>"
	 			+" with passion and diligence.");
			}
		});
		
		//Adding an action to button 8
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Sheep: 1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015. Sheep (goat, or ram) is among the animals that people like<br>"
	 			+"most. It is gentle and calm. Since ancient times, people have learned to use its fleece to make<br>"
	 			+"writing brushes and skin to keep warm. The white cute creature often reminds people of beautiful<br>"
	 			+"things.");
			}
		});
		
		//Adding an action to button 9
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Monkey: 1920, 1932, 1944, 1956, 1968, 1980, 1992, 2004, 2016. The monkey is a clever animal. It is usually compared to a<br>"
	 			+"smart person. During the Spring and Autumn Period (770 - 476 BC), the dignified Chinese official title<br>"
	 			+"of marquis was pronounced 'Hou', the same as the pronunciation of ‘monkey’ in Chinese. The animal was<br>"
	 			+"thereby bestowed with an auspicious meaning.");
			}
		});
		
		//Adding an action to button 10
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Rooster: 1921, 1933, 1945, 1957, 1969, 1981, 1993, 2005, 2017. Rooster is almost the epitome of fidelity and punctuality. For<br>"
	 			+"ancestors who had no alarm clocks, the crowing was significant, as it could awaken people to get up and start to<br>"
	 			+"work. In Chinese culture, another symbolic meaning this animal carries is exorcising evil spirits.");
			}
		});
		
		//Adding an action to button 11
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Dog: 1922, 1934, 1946, 1958, 1970, 1982, 1994, 2006, 2018. Dog is man's good friend who can understand the human's spirit and obey<br>"
	 			+"its master, whether he is wealthy or not. The Chinese regard it as an auspicious animal. If a dog happens to come<br>"
	 			+"to a house, it symbolizes the coming of fortune. The invincible God Erlang in Chinese legend used a loyal wolfhound<br>"
	 			+"to help him capture monsters. ");
			}
		});
		
		//Adding an action to button 12
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Years of the Pig: 1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019. Pig is not thought to be smart as dog. It likes sleeping and eating and becomes<br>"
	 			+"fat. Thus it usually features laziness and clumsiness. On the positive side, it behaves itself, has no calculation to<br>"
	 			+"harm others, and can bring affluence to people. Consequently, pigs were once regarded as wealth.");
			}

			public void actionPerformed1(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Adding an action to button 14
				b14.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						animals run = new animals();
					}

					public void actionPerformed1(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//Adding an action to button 15
				b15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 Compatibilty go = new  Compatibilty();
						
					}

					public void actionPerformed1(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//Adding an action to button 16
				b16.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Thanks for visiting! Before you leave give us a rating on how satisfied you were with us!" );
						final String[] array = {
				                "Frantastic!",
				                "Good",
				                "Okay",
				                "Hated it!"
				        };
				        SwingUtilities.invokeLater(new Runnable() {
				            @Override
				          public void run() {
				                JOptionPane.showMessageDialog(null,new JList(array));
				                //Stack OverFlow using an array and displaying it with a JOption
				                System.exit(0);
				            }
				        });
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
	    


