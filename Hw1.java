/*Name: 	Hasitha Nekkalapu
  ID:		1001511218
  Date: 	15 June 2018
  Course: 	INSY 5309*/


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hw1 {
	static JFrame f;

	public static void main(String[] args) {
		Hw1();
	}

	private static void Hw1() {
		f = new JFrame();
		String fname1 = JOptionPane.showInputDialog(f, "Enter First Name for Person1");
		String lname1 = JOptionPane.showInputDialog(f, "Enter Last Name for Person1");
		String age1 = JOptionPane.showInputDialog(f, "Enter Age for Person1");
		String fname2 = JOptionPane.showInputDialog(f, "Enter First Name for Person2");
		String lname2 = JOptionPane.showInputDialog(f, "Enter Last Name for Person2");
		String age2 = JOptionPane.showInputDialog(f, "Enter Age Name for Person2");
		String message = "First Person: " + lname1 + ", " + fname1 + " (" + age1 + ")" + "\n" + "Second Person: "
				+ lname2 + ", " + fname2 + " (" + age2 + ")" + "\n";
		if (Integer.parseInt(age1) > Integer.parseInt(age2)) 
			JOptionPane.showMessageDialog(f, message + "\n" + lname1 + " is older than " + lname2);
		else if(Integer.parseInt(age1) = Integer.parseInt(age2)) 
			JOptionPane.showMessageDialog(f, message + "\n" + lname1 + " is same as " + lname2);
		else
			JOptionPane.showMessageDialog(f, message + "\n" + lname2 + " is older than " + lname1);
	}
}
