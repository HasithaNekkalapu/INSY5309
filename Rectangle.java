/*	Name: 	Hasitha Nekkalapu
	ID:	1001511218
	Date: 	06 July 2018
	Course:	INSY 5309	*/

public class Rectangle {

	private float length;
	private float width;

	public float getLength() {
		return length;
	}

	public void setLength(float pLength) {
		length = pLength;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float pWidth) {
		width = pWidth;
	}

	public String toString() {
		return "Rectangle has Length=" + length + " and Width=" + width;
	}

	public float perimeter() {
		return 2 * (length + width);
	}

	public float area() {
		return length * width;
	}

	public Rectangle() {
		length = 0;
		width = 0;
	}

	public Rectangle(float pLength, float pWidth) {
		length = pLength;
		width = pWidth;
	}
}
