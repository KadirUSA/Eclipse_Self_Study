package youtubeSadiEvrenSeker;

import java.util.Scanner;

public class If_ElseIf_Else_Practice {

	public static void main(String[] args) {

	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your score: ");

		/*
		 * 90-100 = A 80-90 = B 70-80 = C 50-70 = D 0-50 = Fail
		 */

		int score = scanner.nextInt();

		if (score < 0) {
			System.out.println("You can not enter negative numbers");
		}

		else if (score >= 90 && score <= 100) {
			System.out.println("A");
		}

		else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else if (score < 70 && score >= 50) {
			System.out.println("D");
		}

		else if (score < 50 && score >= 0) {
			System.out.println("Fail");
		}

		else {
			System.out.println("Please enter a valid value!");
		}

//		if (score == 10)
//	{
//		System.out.println("Correct");
//	}
//
//	else
//	{
//		System.out.println("Not Correct");
//	}
//
//	if (score != 10)
//	{
//		System.out.println(score);
//	}
		
		

}
	

}
