package youtubeSadiEvrenSeker;

public class For_Loops_Practice {

	public static void main(String[] args) {

		// 100 to 1 odd numbers
		// 1 to 100 print numbers which dived by 5 and 3 together
		// 2, 4, 8 ,16 ,32
		// 1 to 50 print numbers which dived by 5 only

		// 1.

		for (int i = 99; i >= 1; i -= 2) {
			System.out.println(i + " is a odd number");
		}

		// 2.
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Number is diveded by 3 and 5: " + i);
			}
		}

		// 3.
		for (int i = 2; i <= 100; i = 2 * i) {
			System.out.println("This is square number of 2: " + i);
		}
		
		for (int i = 1; i <= 50; i++) {
			
			if (i % 5 == 0) {
				System.out.println("This number is diveded by 5 correctly: " + i);
			}
				
			
		}
		
		
		
		
		
		
		
		
		
	}
}
