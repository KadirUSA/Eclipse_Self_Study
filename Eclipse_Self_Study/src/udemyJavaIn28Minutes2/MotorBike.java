package udemyJavaIn28Minutes2;

public class MotorBike {

	private int speed; // a variable can be called from MotorBike class by object of "ducati" and
						// "honda".

	MotorBike(int speed) { // This a constructor class. The name of the constructor class must be the same
							// name of class. you can use constractor class to initialize your method.
							// Belirli bir deger ile baslatmak.
		this.speed = speed;
	}

	MotorBike() {
		this(15);
		System.out.println("The second constructor speed will start soon");
	}

	void start() { // a method

		System.out.println("Bike has started");

	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void dicreasSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

}
