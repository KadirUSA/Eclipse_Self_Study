package coddingBathPractice;

public class Deneme2 {


	public static void main(String[] args) {

		// String str = "Hello";
		
		// System.out.println(theEnd(str, false));
		// System.out.println(withouEnd2("aba"));

//				theEnd("Hello", true) → "H"
//				theEnd("Hello", false) → "o"
//				theEnd("oh", true) → "o"

		/*
		 * System.out.println(Deneme3.makeAbba("Zeynep", "Meral"));
		 * Deneme3.makeAbba1("Zeynep", "Meral");
		 * 
		 * Deneme3 methods = new Deneme3();
		 * System.out.println(methods.makeAbba("Zeynep", "Meral"));
		 * methods.makeAbba1("Bera", "Dalcicek");
		 */
		System.out.println(endsLy("ltkjly"));
		
	}

	public static boolean endsLy(String str) {

		String lasttwo = str.substring(str.length() - 2);
		String ly = "ly";
		
		
		if (str.length() < 2) {
			return false;

			
		}

		else if (lasttwo == ly) {

			return true;

	}
	return false;

/*	public static String withouEnd2(String str) {
		  
		  String withoutFront = str.substring(1);
		   
			String withoutEnd = withoutFront.substring(0, str.length() - 2);
		  
		  
			
			 * if (str.length() <= 2); {
			 * 
			 * return ""; }
			 

	return withoutEnd;*/

}

	/*
	 * public static String theEnd(String str, boolean front) {
	 * 
	 * String lastChar = str.substring(str.length() - 1); String firstChar =
	 * str.substring(0, 1);
	 * 
	 * if (front == false) {
	 * 
	 * return lastChar; }
	 * 
	 * return firstChar;
	 */
/*
 * public static String withouEnd2(String str) {
 * 
 * If(str.length() <= 2);
 * 
 * return "";
 * 
 * String lastone = str.substring(str.length() - 1);
 * 
 * String withoutFront = str.substring(1);
 * 
 * return withoutFront;
 * 
 * }
 * 
 * private static void If(boolean b) { // TODO Auto-generated method stub
 * 
 * }
 */
}
