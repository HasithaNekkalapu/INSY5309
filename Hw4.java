/*	Name: 	Hasitha Nekkalapu
	ID:	1001511218
	Date: 	06 July 2018
	Course:	INSY 5309	*/

import java.util.Scanner;
import javax.swing.*;

public class Hw4 {
	private static JFrame frame = new JFrame();
	private static Scanner sc = new Scanner(System.in);
	private static int option;
	private static float length, width, perimeter, area;

	public static void main(String[] args) {
		System.out.println("****************** Hw4.java ******************\nOptions : ");
		System.out.println(" 1 - to set the length \n" + " 2 - to set the width \n" + " 3 - to get the length \n"
				+ " 4 - to get the width \n" + " 5 - to get the perimeter \n" + " 6 - to get the area \n"
				+ " 7 - to print the object as string \n" + " 0 - to quit ");
		Rectangle rectangle = new Rectangle();

		while (true) {
			try {
				option = Integer.valueOf(JOptionPane.showInputDialog(frame, "Choose Option:"));
				;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(frame, "Please enter valid option!! Exiting the program");
				sc.close();
				System.exit(0);
			}

			switch (option) {
			case 0:
				JOptionPane.showMessageDialog(frame, "Exiting the Program..");
				sc.close();
				System.exit(0);

			case 1:
				try {
					length = Float.valueOf(JOptionPane.showInputDialog(frame, "Enter Length :"));
					rectangle.setLength(length);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, "Not a valid value!!");
				}
				break;

			case 2:
				try {
					width = Float.valueOf(JOptionPane.showInputDialog(frame, "Enter Width :"));
					rectangle.setWidth(width);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, "Not a valid value!!");
				}
				break;

			case 3:
				length = rectangle.getLength();
				JOptionPane.showMessageDialog(frame, "Current Length: " + length);
				break;

			case 4:
				width = rectangle.getWidth();
				JOptionPane.showMessageDialog(frame, "Current Width: " + width);
				break;

			case 5:
				perimeter = rectangle.perimeter();
				JOptionPane.showMessageDialog(frame, "Permieter : " + perimeter);
				break;

			case 6:
				area = rectangle.area();
				JOptionPane.showMessageDialog(frame, "Area : " + area);
				break;

			case 7:
				JOptionPane.showMessageDialog(frame, "Rectangle Detail : " + rectangle.toString());
				break;

			default:
				JOptionPane.showMessageDialog(frame, "Please enter valid option!!");
			}
		}
	}
}