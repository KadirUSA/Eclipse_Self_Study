package udemyJavaIn28Minutes1;

public class Flowers {

	private int days; // member variable

	// behaviors
	// method
	// input --> int days
	// output --> void
	// name --> setDays

	public void setDays(int days) { // local variable
		this.days = days;

	}

	int getDays() {
		return this.days;
	}

	void bloom() {
		System.out.println("I love spring. All flowers bloom in spring and everywhere gets colorful!");
	}

}
