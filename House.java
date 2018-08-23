package insy.java.hw6;

public class House {

	private int streetNumber;
	private String street;
	private String town;
	private int yearConstructed;
	private int propertyTax;

	public House(int streetNumber, String street, String town, int yearConstructed, int propertyTax) {

		this(streetNumber, street, town);
		this.yearConstructed = yearConstructed;
		this.propertyTax = propertyTax;
	}

	public House(int streetNumber, String street, String town) {
		this.streetNumber = streetNumber;
		this.street = street;
		this.town = town;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public int getYearConstructed() {
		return yearConstructed;
	}

	public void setYearConstructed(int yearConstructed) {
		this.yearConstructed = yearConstructed;
	}

	public int getPropertyTax() {
		return propertyTax;
	}

	public void setPropertyTax(int propertyTax) {
		this.propertyTax = propertyTax;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("StreetNumber : ").append(this.streetNumber).append(" Street: ").append(this.street).append(" Town : ")
				.append(this.town).append(" PropertyTax : ").append(this.propertyTax).append(" YearOfConstruction : ")
				.append(this.yearConstructed);

		return sb.toString();
	}

}
