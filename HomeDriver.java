import javax.swing.*;

import insy.java.hw6.Home;
import insy.java.hw6.OurDate;

public class HomeDriver {

	public static void main(String[] args) {

		Home[] home = new Home[2];
		JFrame frame = new JFrame();
		String town, street, family;
		int month, sNo, year, day, yearConstructed, propertyTax;
		while (true) {
			int i = 0;
			sNo = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Street Number or -999 to quit"));
			if (sNo != -999) {
				i++;
				street = JOptionPane.showInputDialog("Please enter the Street Name");
				town = JOptionPane.showInputDialog("Please enter the Town name");
				yearConstructed = Integer
						.parseInt(JOptionPane.showInputDialog("Please enter year house was Constructed"));
				propertyTax = Integer.parseInt(JOptionPane.showInputDialog("Please enter property tax"));

				month = Integer.parseInt(JOptionPane.showInputDialog("Please enter an int month"));
				day = Integer.parseInt(JOptionPane.showInputDialog("Please enter an int day"));
				year = Integer.parseInt(JOptionPane.showInputDialog("Please enter an int day"));
				family = JOptionPane.showInputDialog("Please enter the Family Name");
				home[i] = new Home(sNo, street, town, yearConstructed, propertyTax, family,
						new OurDate(month, day, year));
				JOptionPane.showMessageDialog(frame, "Area : " + home[i]);

			} else
				break;
		}

	}
}
