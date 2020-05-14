package W3Schools;

public class Ternary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==Ternary Operator=="); // it works under depending of tru or false.
		int age = 19;

		String massage = (age >= 20) ? "You are elligble to vote" : "You are not elligble to vote";

		System.out.println(massage);
		System.out.println();

		System.out.println("==Where does John lives==");
		String city = "New York";

		String correctcity = "John live in " + city;

		String checkCity = city == "Seattle" ? correctcity
				: city == "Chicago" ? correctcity : city == "Texas" ? correctcity : "John does not live in " + city;
		System.out.println(checkCity);
		System.out.println();

		System.out.println("***Grade Chart***");
		int grade = 67;
		String failed = "Absent";
		String failed1 = "Faild";
		String passedD = "Passed. Work harder. Grade is: D";
		String passedC = "Passed. Good. Get better. Grade is: C";
		String passedB = "Passed. Great job! Grade is: B";
		String passedA = "Passed. Congradulation. Well done! Grade is: A";

		String result = grade < 50 ? failed1
				: grade < 65 ? passedD : grade < 75 ? passedC : grade < 90 ? passedB : grade <= 100 ? passedA : failed;
		System.out.println(result);

	}

}
