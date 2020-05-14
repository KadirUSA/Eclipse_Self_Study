package W3Schools;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "We \tare the \b\b\bso-called \"Vikings\"\"\"\" \rfrom the \nnorth.";

		// System.out.println(txt);

		String text = "\tThis text is one tab in.\r\n";
		System.out.println(text);

		// ***** concat. method
		String one = "Hello";
		String two = "World";

		String three = one + " " + two;

		System.out.println(three);

		String str = "Kadir Dalcicek";

		System.out.println(str.substring(0, 3)); // substring from beginning to index number 3(excluding)
		System.out.println(str.substring(8)); // substring from index number 8(including) to last index
		System.out.println(str.substring(str.length() - 3, str.length() - 1)); // substring from -3 index to -1(last
																				// index)
		System.out.println(str.indexOf("D")); // return index number of first "D" in the string
		System.out.println(str.indexOf("cicek")); // return index number of first "cicek" in the string. Actually return
													// index number of first letter of "cicek" that means "c"
		System.out.println(str.lastIndexOf("c")); // return last index number of "c" in the string
		System.out.println(str.indexOf("i", 6)); // you can search a character from an index number

		// ***** to find all characters in the string

		System.out.println();
		System.out.println("Index Number of All \"is\" character");
		String theString = "If I say that; is this good or is this bad? Most probably your answer will be it is good";
		String substring = " is ";

		int index = theString.indexOf(substring);

		while(index != -1) {
		    System.out.println(index);
			index = theString.indexOf(substring, index + 1);
		}

		System.out.println(theString.matches(".*question.*")); // if "question" is in the string return true; else
																// return false
		System.out.println(theString.matches(".*answer.*")); // if "answer" is in the string return true; else return
																// false

		System.out.println(theString.replace("s", "f"));
		System.out.println(theString.replaceAll(" is", " IS"));
		System.out.println(theString.replaceAll("is", "are").toUpperCase());
		System.out.println(theString.replaceFirst(" is", " IS"));

		/*
		 * System.out.println(); System.out.println("===Compare method==="); String str1
		 * = "a"; String str2 = "b"; String str3 = "a"; String str4 = "d"; String str5 =
		 * "A";
		 * 
		 * System.out.println(str1.compareTo(str3));
		 * System.out.println(str1.compareTo(str4));
		 * System.out.println(str4.compareTo(str1));
		 * System.out.println(str1.compareTo(str5));
		 * System.out.println(str1.compareToIgnoreCase(str5));
		 */

		String str1 = "abc";
		String str2 = "bda";
		String str3 = "abc";
		String str4 = "defghkhgfdsfgh";
		String str5 = "ABCKJBMJKLJ";

		System.out.println();
		System.out.println("===Compare with longer string");
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str4.compareTo(str1));
		System.out.println(str1.compareTo(str5));
		System.out.println(str1.compareToIgnoreCase(str5));

		String source = "A man drove with a car.";
		int limit = 3;
		String[] occurrences = source.split(" ", limit);
		System.out.println(Arrays.toString(occurrences)); // [A m, n drove with a car.]

		System.out.println(source.lastIndexOf(""));
		System.out.println(source.length());

		System.out.println(); // trim method execute the string without whitespace at the beginning and end
		System.out.println("==String Trim method==");
		String trim = "  How can I trim my string!   ";
		System.out.println("*trim string without trim method*");
		System.out.println(trim);
		System.out.println();
		System.out.println("*trim string with trim method*");
		System.out.println(trim.trim());

		/*
		 * Comparing Strings Java Strings also have a set of methods used to compare
		 * Strings. These methods are:
		 * 
		 * equals() equalsIgnoreCase() startsWith() endsWith() compareTo() all return
		 * boolean method true or false
		 */
		System.out.println();
		System.out.println("==Replace Method==");
		String replace = "I would like to replace hello charachter in this string but string will not allow me to do without replace method";
		System.out.println(replace.replace("hello", "newchar"));
		System.out.println(replace.replaceFirst("string", "newreplacment")); // changing only first element
		System.out.println(replace.replaceAll("string", "newreplacment")); // changing all same elements in the string
		System.out.println();

		System.out.println("Converting Objects like int To String");
		Integer integer = new Integer(123);
		String intStr = integer.toString();
		System.out.println(intStr);
		System.out.println(integer);
		System.out.println();

		System.out.println("==Getting A Char in a string==");
		String theString1 = "This is a good day to code";
		System.out.println(theString1.charAt(0)); // will return a char at 0 index (T)
		System.out.println(theString1.charAt(3)); // will return a char at 0 index (s)
		System.out.println();

		
		System.out.println("==String Formatting==");
		String input = "Hello %s";

		String output1 = input.formatted("World"); // .formatted will add value in the method to where %s is in the
													// string.
		System.out.println(output1);

		String output2 = input.formatted("Jakob"); // .formatted will add value in the method to where %s is in the
													// string.
		System.out.println(output2);
		System.out.println();
		
		
		System.out.println("==indentation method called 'stripIntend'==");
		String input2 = "   Hey \n     This \n   is \n  indented.";
		String output = input2.stripIndent();

		System.out.println("*String without method*");
		System.out.println(input2);

		System.out.println();
		System.out.println("*String with method*"); // the shortest line will be intended and others will be intended
													// according to shortest length intention
		System.out.println(output);
		System.out.println();

		String input3 = "Hey, \\n This is not normally a line break.";
		System.out.println(input3);

		String output3 = input3.translateEscapes();
		System.out.println(output3);
		System.out.println();

		System.out.println("***Java Operatores***");
		System.out.println("==TotalValue==");
		int price1 = 123;
		int price2 = 456;

		int total = price1 + price2;
		int totalPlusFee = total + 999;
		System.out.println(totalPlusFee);
		System.out.println();

		System.out.println("==Subtraction==");
		int diff = 456 - 123;
		System.out.println(diff);
		System.out.println();

		System.out.println("==Multipicatoin==");
		int result = 123 * 456;
		System.out.println(result);
		System.out.println();

		System.out.println("==Division==");
		int result1 = 100 / 10;
		System.out.println(result1);
		System.out.println();

		System.out.println("One more comlication Division Example");
		int price = 12;
		int amount = 23;

		int totalPrice = price * amount;

		int discount = 20; // 20%
		int totalAfterDiscount = (totalPrice * (100 - discount)) / 100;
		System.out.println(totalAfterDiscount);
		System.out.println();

		double d = 100d / 11d;

		System.out.println(d);
		System.out.println();

		System.out.println("==if, else if and else statment==");
		int amount1 = 10;

		if (amount1 > 9) {
			System.out.println("amount is greater than 9");
		} else {
			System.out.println("amount is 9 or less)");
		}
		System.out.println();

		System.out.println("==Switch Statment==");
		int amount2 = 9;

		switch (10) {
		case 0:
			System.out.println("Grade is  0, failed");
			break; // breaks are important here. If you do not type the break it goes case by case
					// until it reach to default and will print all cases with default
		case 5:
			System.out.println("Grade is  5, passed");
			break;
		case 10:
			System.out.println("Grade is 10, graet job. Five Star*****");
			break;
		default:
			System.out.println("Value is not valid");
		}
		System.out.println();


		System.out.println("==While Statment==");
		int amount4 = 0;

		while (amount4 < 10) {
			System.out.println("amount is " + amount4);

			amount4++;
		}
		System.out.println("while loop ended before " + amount4);
		System.out.println();

		System.out.println("==Do While Loop==");
		int amount5 = 7;

		do {
			System.out.println(amount5);
			amount5++;
		} while (amount5 < 10);
	
		System.out.println("Do while loop ended");
		System.out.println();

		System.out.println("== for loop==");
		int var1 = 50;

		for (int i = var1; i > 45; i--) {
			System.out.println(i);
		}
		System.out.println("The next value is not met with condition");
		System.out.println();


	}

}
