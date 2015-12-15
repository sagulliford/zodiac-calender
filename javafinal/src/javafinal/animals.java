package javafinal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class animals {
	Scanner input = new Scanner(System.in);
		
	{
		boolean loop = true;
		while (loop){
			//source: Stack Overflow
			String year = JOptionPane.showInputDialog("Please enter the year you were born(between 1984 and 2009):");
	int year1;
	 year1 = Integer.parseInt(year);//StackOverflow

	
	 switch (year1){
	 		case 2008: case 1996: case 1984: case 1972: case 1960: case 1948:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Rat.");
	 			loop = false;
	 			
	 	break;
	 		case 2009: case 1997: case 1985: case 1973: case 1961: case 1949:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Ox.");
	 			loop =false;
	 	break;
	 		case 2010: case 1998: case 1986: case 1974: case 1962: case 1950:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Tiger.");
	 			loop =false;
	 	break;
	 		case 2011: case 1999: case 1987: case 1975: case 1963: case 1951:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Rabbit.");
	 			loop =false;
	 	break;
	 		case 2012: case 2000: case 1988: case 1976: case 1964: case 1952:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Dragon.");
	 			loop =false;
	 	break;
	 		case 2013: case 2001: case 1989: case 1977: case 1965: case 1953:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Snake.");
	 			loop =false;
	 	break;
	 		case 2014: case 2002: case 1990: case 1978: case 1966: case 1954:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Horse.");
	 			loop =false;
	 	break;
	 		case 2015: case 2003: case 1991: case 1979: case 1967: case 1955:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Sheep.");
	 			loop =false;
	 	break;
	 		case 2016: case 2004: case 1992: case 1980: case 1968: case 1956:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Monkey.");
	 			loop = false;
	 	break;
	 		case 2017: case 2005: case 1993: case 1981: case 1969: case 1957:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Rooster.");
	 			loop = false;
	 	break;
	 		case 2018: case 2006: case 1994: case 1982: case 1970: case 1958:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Dog.");
	 			loop = false;
	 	break;
	 		case 2019: case 2007: case 1995: case 1983: case 1971: case 1959:
	 			JOptionPane.showMessageDialog(null,"You are the year of the Pig.");
	 			loop = false;
	 	break;
	 		}//while loop
	 		if ( year1<=1984 && year1>=2019 )
	 			{
	 			loop = false;
	 			
	 			}//if statement
	 		
	 }//ending of switch/case statement
}
}
