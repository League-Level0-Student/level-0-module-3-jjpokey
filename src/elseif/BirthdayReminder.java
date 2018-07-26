
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "August 24th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String a = JOptionPane.showInputDialog("what birthday do you want!");
		// 3. Print out what the user typed
		if(a.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		else if(a.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(a.equals("jason")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "I do not remember that persons birthday");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
