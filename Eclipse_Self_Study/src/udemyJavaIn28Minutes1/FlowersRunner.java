package udemyJavaIn28Minutes1;

public class FlowersRunner {

	public static void main(String[] args) {

		Flowers rose = new Flowers();
		Flowers diasy = new Flowers();

		rose.bloomed(); // 1. number will print the status of flowers
		diasy.bloomed();

		rose.numberOfFlowers = 250;
		diasy.numberOfFlowers = 500;

		System.out.println(rose.numberOfFlowers); // 2. will print number of flowers which bloomed by using
													// numberOfFlowers variable calling by ducati method
		System.out.println(diasy.numberOfFlowers);

	}

}
