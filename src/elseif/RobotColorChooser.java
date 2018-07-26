//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot aaa = new Robot();
		for(int b = 0; b < 50; b++) {
		//3. Ask the user what color they would like the robot to draw
		String a = JOptionPane.showInputDialog("what color would you like the robot to draw, red or blue??");
		//5. Use an if/else statement to set the pen color that the user requested
if(a.equals("red")) {
	aaa.setPenColor(Color.red);
}
else if (a.equals("blue")) {
	aaa.setPenColor(Color.blue);
}
else {
	aaa.setRandomPenColor();
}
	

		
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		aaa.setPenWidth(10);
		aaa.setSpeed(200);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		aaa.penDown();
aaa.move(90);
aaa.turn(90);
aaa.move(90);
aaa.turn(90);
aaa.move(90);
aaa.turn(90);
aaa.move(90);
aaa.hide();

		}
	}
}
