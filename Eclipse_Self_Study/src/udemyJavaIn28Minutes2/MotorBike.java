package udemyJavaIn28Minutes2;

public class MotorBike {

	// ***state (what is the current situation a specific bike is in. Like I am
	// driving
	// ducati and my current speed is 60hpm)

	private int speed; // member variable (might be byte, short, int or long)
						// other classes should not access to this class. That is why we added private
						// before "int speed" How they can
						// can access to this class? They can access by using method called
						// "getSpeed()..

	public int getSpeed() {

			return speed;

	}

	// ***each objects have behavior
	// *method
	// input --> int speed
	// output --> void
	// name --> setSpeed

	// *** First Solution
	public void setSpeed(int speed) {// local variable (degisken)
		if (speed > 0) { // Protecting valuation from mines(-)
			this.speed = speed;
		}
	}

	// ***Second Solution instead of FlowersRunner class
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);

	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
		{

		}
		
	}

	void start() {

		System.out.println(" Bike started");

	}

}
