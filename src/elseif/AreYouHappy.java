package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Are you happy?");
		if(a.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
		}
		else if(a.equals("no")) {
			String b = JOptionPane.showInputDialog("Do you want to be happy?");
		
		if(b.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
		}
		else if(b.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Then change something!");
		}
		}
		
		
	}
}
