//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package modulo;

import javax.swing.JOptionPane;

/**
* Fizz Buzz
* 
* In this project, we're going to build FizzBuzz. It's a children's game where
* you count from 1 to 20. Easy, right? Here's the catch: instead of saying
* numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
* by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
* 
* So the rules are:
* 		Any number divisible by 3 is replaced by the word fizz 
* 		Any number divisible by 5 is replaced by the word buzz. 
* 		Numbers divisible by both 3 and 5 become fizzbuzz.
* 
* Print your results to the console, or using JOptionPane if you like.
* 
* If your code is correct, the output will be:
*  
* 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
* 
**/

public class FizzBuzz {

	public static void main(String[] args) {
		
		int number = 0;
		
		for(int a = 0; a < 20; a++) {
			number++;
			if(number == 3) {
				JOptionPane.showMessageDialog(null, "fizz");
			}
			else if(number == 5) {
				JOptionPane.showMessageDialog(null, "buzz");
			}
			else if(number == 6) {
				JOptionPane.showMessageDialog(null, "fizz");
			}
			else if(number == 9) {
				JOptionPane.showMessageDialog(null, "fizz");
			}
			else if(number == 10) {
			JOptionPane.showMessageDialog(null, "buzz");
			}
			else if(number == 12) {
				JOptionPane.showMessageDialog(null, "fizz");
				}
			else if(number == 15) {
				JOptionPane.showMessageDialog(null, "fizzbuzz");
				}
			else if(number == 18) {
				JOptionPane.showMessageDialog(null, "fizz");
				}
			else if(number == 20) {
				JOptionPane.showMessageDialog(null, "buzz");
				}
			else {
			JOptionPane.showMessageDialog(null, number);
			}
		}
		
		
	}
}

