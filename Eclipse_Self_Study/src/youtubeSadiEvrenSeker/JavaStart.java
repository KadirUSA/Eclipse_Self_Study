package youtubeSadiEvrenSeker;

public class JavaStart {


	public static void main(String[] args) {


		
		/*
		 * Scanner num = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the day"); int day = num.nextInt();
		 * 
		 * System.out.println("Enter the month"); int month = num.nextInt();
		 * 
		 * System.out.println("Enter the year"); int year = num.nextInt();
		 * 
		 * System.out.println("The date you have entered is: " + " " + day + " " + month
		 * + " " + year);
		 */

		int i = 20;
		double d = 3.5;
		String str = "Kadri Dalcicek";

		System.out.println(i);
		System.out.println(d);

		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());
		
		// OR//

		str = str.toUpperCase();
		str = str.toLowerCase();

		System.out.println(str);
		
		String first_word = "First word is always greetings!";
		System.out.println(first_word.indexOf("s"));
		String firstword = first_word.substring(0, 5);
		System.out.println(firstword);

		

	}

}
