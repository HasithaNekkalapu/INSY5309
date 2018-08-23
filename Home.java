package insy.java.hw6;

public class Home extends House {

	private String family;

	private OurDate movedIn;

	public Home(int streetNumber, String street, String town, String family, OurDate movedIn) {

		super(streetNumber, street, town);
		this.family = family;
		this.movedIn = movedIn;
	}

	public Home(int streetNumber, String street, String town, int yearConstructed, int propertyTax, String family,
			OurDate movedIn) {

		super(streetNumber, street, town, yearConstructed, propertyTax);
		this.family = family;
		this.movedIn = movedIn;

	}

	public OurDate getMovedIn() {
		return movedIn.clone();
	}

	public void setMovedIn(OurDate movedIn) {
		this.movedIn = movedIn;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append(super.toString()).append(" has been occupied by : ").append(this.family).append(" since : ")
				.append(this.movedIn);
		return sb.toString();
	}
}
