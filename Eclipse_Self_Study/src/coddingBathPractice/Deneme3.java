package coddingBathPractice;

public class Deneme3 { // called this mehotd from Deneme2

	public static String makeAbba(String a, String b) { // Static Method-Instance method

		String first = a.concat(b);
		String last = b.concat(a);

		return first + last;
	}

	public static void makeAbba1(String a, String b) {

		String first = a.concat(b);
		String last = b.concat(a);

		System.out.println(first + last);
	}

	public static void makeTags(String tag, String word) {

		/*
		 * String body = "<></>";
		 * 
		 * String addTag = body.(1, tag); String addWord = addTag.insert(3, word);
		 * String complete = addWord.insert(6, tag);
		 * 
		 * return complete;
		 * 
		 */

		/*
		 * public static String makeOutWord(String out, String word) {
		 * 
		 * String firstpart = out.substring(0, 2); String lastpart =
		 * out.substring(out.length() -2);
		 * 
		 * String makeout = firstpart + word + lastpart;
		 */

	}

	public static String extraEnd(String str) {

		*
		 * if (str.length() < 3) { return str + str + str; }
		 * 
		 * String lasttwo = str.substring(str.length() - 2);
		 * 
		 * return lasttwo + lasttwo + lasttwo;
		 */
	}

	public String withoutEnd(String str) {

		/*
		 * String lastChar = str.substring(str.length(), 0);
		 * 
		 * 
		 * return str.substring(1, (str.length()-1));
		 * 
		 * int charfirst = str.substring(0,1)
		 * 
		 * int charlast = str.substirng(str.length() - 1);
		 * 
		 * 
		 * return d;
		 */

	}

	public static String right2(String str) {

		String lastChar = str.substring(str.length() - 1);

		// return +lasttwo + firstpart;

		return lastChar;

	}

	public static String theEnd(String str, boolean front) {
		  
		  if (front = true){
		  
		  return str.substring(0,1);
		  }
		  
		  else if (front = false){
		    
		  }
			return str.substring(str.length() - 1);
		}



	public static void main(String[] args) {

		/*
		 * System.out.println(makeAbba("Hi", "Bye"));
		 * 
		 * makeAbba1("Hi", "Bye");
		 * 
		 * System.out.println(makeTags("i", "Yay"));
		 */

		// System.out.println(extraEnd("Kadir"));

		System.out.println(right2("Kadir"));
		
		// System.out.println(theEnd("Kadir", false));
		
		

	}

}
