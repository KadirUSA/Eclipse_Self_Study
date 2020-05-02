package udemyJavaIn28Minutes1;

public class FlowersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flowers rose = new Flowers();
		Flowers tulip = new Flowers();
		Flowers daisy = new Flowers();

		rose.bloom();
		daisy.bloom();
		tulip.bloom();


		rose.setDays(20);

		int roseDays = rose.getDays();// get current rose days
		roseDays = roseDays + 20; // increase days of rose flowers
		rose.setDays(roseDays); // set it to rose
		System.out.println(rose.getDays());

		daisy.setDays(30);

		int daisyDays = daisy.getDays();
		daisyDays = daisyDays + 50;
		daisy.setDays(daisyDays);
		System.out.println(daisy.getDays());

		tulip.setDays(5);

		int tulipDays = tulip.getDays(); // get current tulip days
		tulipDays = tulipDays + 90; // increase days of tulip flowers
		tulip.setDays(tulipDays); // set it to tulip
		System.out.println(tulip.getDays());

	}

}
