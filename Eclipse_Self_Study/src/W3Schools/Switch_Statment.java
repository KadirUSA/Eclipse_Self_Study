package W3Schools;

public class Switch_Statment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==Switch Method==");

		String punctuallity = "absent";

		switch (punctuallity) {
		case "late":
			System.out.println("Give worning letter.");
			break;
		case "on_time":
			System.out.println("Recognise by simple award.");
			break;
		case "absent":
			System.out.println("Give a first worning letter for the termination of a contract.");
			break;
		case "sick":
			System.out.println("Say \"Get well soon\" and ask for hospital report.");
			break;
		case "permitted":
			System.out.println("Do nothing.");
			break;
		case "on_leave":
			System.out.println("Say \"Have a nice holiday\".");
			break;
		default:
			System.out.println("Give a call and learn about situation.");
		}

		System.out.println("This is a morning shift report of the employee.");
		System.out.println();

		System.out.println("==If Statment==");

		boolean late1 = true; // "Give worning letter.";
		boolean on_time1 = true; // "Recognise by simple award.";
		boolean absent1 = true; // "Give a worning letter.";
		boolean sick1 = true; // "Say \"Get well soon\" and ask for hospital report.";
		boolean permitted1 = true; // "Do nothing";
		boolean on_leave1 = true; // "Say \"Have a nice holiday\".";

		if (late1) {
			System.out.println("Give worning letter.");
		} else if (on_time1) {
			System.out.println("Recognise by simple award.");
		} else if (absent1) {
			System.out.println("Give a worning letter.");
		} else if (sick1) {
			System.out.println("Say \"Get well soon\" and ask for hospital report.");
		} else if (permitted1) {
			System.out.println("Do nothing");
		} else if (on_leave1) {
			System.out.println("Say \"Have a nice holiday\".");
		}

		System.out.println("This is a morning shift report of the employee.");
		System.out.println();

		System.out.println("==Ternary Operator==");


		String late2 = "late";
		String on_time2 = "on_time";
		String absent2 = "absent";
		String sick2 = "sick";
		String permitted2 = "permitted";
		String on_leave2 = "on_leave";
		String result = "permitted";

		String xxx = result.equals(late2) ? "Give worning letter."
				: result.equals(on_time2) ? "Recognise by simple award."
						: result.equals(absent2) ? "Give worning letter."
								: result.equals(sick2) ? "Say \"Get well soon\" and ask for hospital report."
										: result.equals(permitted2)
												? "Do nothing."
												: result.equals(on_leave2) ? "Say \"Have a nice holiday\"."
														: "Do nothing";

		System.out.println(xxx);
		System.out.println();


		
		
	}


	public static void printSwitch(int amount) {
		System.out.println("==Switch Method==");
		switch (amount) {

		case 4: // you can add more case here. Since you do not print all will be depending on
				// "case 0:"
		case 2:
		case 0:
			System.out.println("amount is  0");
			break;
		case 5:
			System.out.println("amount is  5");
			break;
		case 10:
			System.out.println("amount is 10");
			break;
		default:
			System.out.println("amount is something else");
		}


	}

}
