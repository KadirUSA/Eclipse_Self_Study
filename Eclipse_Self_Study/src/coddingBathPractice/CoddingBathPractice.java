package coddingBathPractice;

public class CoddingBathPractice {

	public boolean mixStart(String str) {


		String take2 = str.substring(1, 3);

		if (str.length() < 3) {
			return false;
		}

		if (take2.equals("ix")) {
			return true;
		} else {
			return false;
		}

	}

}
	

