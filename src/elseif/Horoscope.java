package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("What is your star sign?");
		if(a.equals("aries")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between March 20th and April 20th");
		}
		else if(a.equals("taurus")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between April 20th and May 21st");
		}
		else if(a.equals("gemini")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between May 21st and June 21st");
		}
		else if(a.equals("cancer")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between June 21st and July 23rd");
		}
		else if(a.equals("leo")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between July 23rd and August 23rd");
		}
		else if(a.equals("virgo")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between August 23rd and September 23rd");
		}
		else if(a.equals("libra")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between September 23rd and October 23rd");
		}
		else if(a.equals("scorpio")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between October 23rd and November 22nd");
		}
		else if(a.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between November 22nd and December 22nd");
		}
		else if(a.equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between December 22nd and January 20th");
		}
		else if(a.equals("aquarius")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between January 20th and Febuary 18th");
		}
		else if(a.equals("pisces")) {
			JOptionPane.showMessageDialog(null, "your horoscope is between Febuary 18th and March 20th");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
