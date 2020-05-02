package udemyJavaIn28Minutes2;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		ducati.increaseSpeed(100); // *** Second Solution Increase
		honda.setSpeed(80);
		honda.increaseSpeed(80); // *** Second Solution Increase

		ducati.decreaseSpeed(199);
		honda.decreaseSpeed(10);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());


		ducati.setSpeed(100); // *** First Solution

		int ducatiSpeed = ducati.getSpeed();// get current ---ducati speed---
		ducatiSpeed = ducatiSpeed + 100; // increase ---ducati speed--
		ducati.setSpeed(ducatiSpeed); // set it to --ducati--
		System.out.println(ducati.getSpeed());

		honda.setSpeed(80); // *** First Solution

		int hondaSpeed = honda.getSpeed();// get current honda speed
		hondaSpeed = hondaSpeed + 100; // increase speed of honda
		honda.setSpeed(hondaSpeed); // set it to honda
		System.out.println(honda.getSpeed());


	}

}

