/*	Name: 	Hasitha Nekkalapu
	ID:		1001511218
	Date: 	29 June 2018
	Course:	INSY 5309	*/

import javax.swing.*;
import java.text.*;

public class Hw3 {

	public static void main(String[] arg) {

		int cNo = 0, kwh = 0, totalUsage = 0, num_customers = 0;
		double totalCost = 0.00;

		// set the decimal format to 2 decimal places
		DecimalFormat d = new DecimalFormat("#.00");

		// Initialize the JtextArea to display the table format
		JTextArea table = new JTextArea();
		table.setText("Customer No.\tUsage in KWh\tTotal Charges\t\n\n");
		table.append("------------------------------------------------\n\n");

		while (true) {
			cNo = Integer.parseInt(JOptionPane.showInputDialog("Please enter the customer number of -999 to quit"));

			if (cNo != -999) {
				kwh = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Usage in KWH"));
				double total = findCharge(kwh);
				table.append(cNo + " \t " + kwh + " \t " + d.format(total) + "\n");
				totalCost += total;// calculates the total charges
				totalUsage += kwh;// calculates the total kwh usage
				num_customers++;// calculates the no of customers
			} else {
				break;
			}
		}

		table.append("---------------------------------------------------\n\n");
		table.append(num_customers + " \t " + totalUsage + " \t " + d.format(totalCost) + "\n");
		JOptionPane.showMessageDialog(null, table);
	}

	public static double findCharge(int kwh) {
		double total = 0;
		int usage = kwh;
		if (kwh <= 300)
			total += 0.09 * kwh;
		else if (kwh > 300 && kwh <= 600) {
			usage = kwh - 300;
			total += (0.09) * 300 + (0.08) * (600 - usage);
		} else if (kwh > 600 && kwh <= 1000) {
			usage = kwh - 600;
			total += (0.09) * 300 + (0.08) * 300 + (0.06) * usage;
		} else {
			usage = kwh - 1000;
			total += (0.09) * 300 + (0.08) * 300 + (0.06) * 400 + (0.05) * usage;
		}
		return total;
	}

}
