package methods;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
	

String Age = JOptionPane.showInputDialog("How old are you?");

int age = Integer.parseInt(Age);
	if(age>18)
	{
		JOptionPane.showInputDialog(null, "Who should the next president be?");
JOptionPane.showMessageDialog(null, "Good choice.");
	}
	
	else{
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
	}
}