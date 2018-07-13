/*Name: 	Hasitha Nekkalapu
ID:		1001511218
Date: 		18 June 2018
Course: 	INSY 5309*/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hw2 {
	static JFrame f;

	public static void main(String[] args) {
		f = new JFrame();
		int year;
		do {
			year = Integer.parseInt(JOptionPane.showInputDialog(f, "Enter the year"));
			checkLeapYear(year);
		} while (year != -99);
	}

	private static void checkLeapYear(int year) {
		if (year % 4 != 0) {
			JOptionPane.showMessageDialog(f, "Not Leap Year");
		} else if (year % 400 == 0) {
			JOptionPane.showMessageDialog(f, "Leap Year");
		} else if (year % 100 == 0) {
			JOptionPane.showMessageDialog(f, "Not Leap Year");
		} else
			JOptionPane.showMessageDialog(f, "Leap Year");
	}
}
