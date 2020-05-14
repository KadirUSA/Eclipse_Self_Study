package udemyJavaIn28Minutes2;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100); // call all methods from MotorBike class by "ducati" and honda.
		// MotorBike honda = new MotorBike(200); // you can add int value after creating
		// a constructor method...

		System.out.println("Motorbike starting speed: " + ducati.getSpeed()); // for printing MotorBike constructor
																				// class output...

		MotorBike secondConstructor = new MotorBike(); // If you would like to create another constructor
														// should first create a new constructor in class of MotorBike
		secondConstructor.getSpeed();

		System.out.println(secondConstructor.getSpeed());

		ducati.start(); // 1. will print this method. In MotorBike class under the method od "start" its
						// written System.out.println("Bike has started");
		// honda.start();

		// ducati.setSpeed(100);
		// System.out.println(ducati.getSpeed());

		ducati.setSpeed(40); // you can also create a decrement of speed method inside of MotorBike class

		/*
		 * int ducatiSpeed = ducati.getSpeed(); ducatiSpeed = ducatiSpeed + 120;
		 * ducati.setSpeed(ducatiSpeed); // I can do this increment inside of setter and
		 * getter in MotorBike class by creating a increment method
		 */

		ducati.increaseSpeed(50);
		ducati.dicreasSpeed(100);

		System.out.println(ducati.getSpeed());

	}
}
