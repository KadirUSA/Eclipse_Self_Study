package youtubeSadiEvrenSeker;

public class Practice {

	public static void main(String[] args) {

		String str = "Today is Friday and tomorrow is Saturday";

		// str = str.replaceAll("[^a-zA-Z0-9 ]", "");


		System.out.println(str);

		char firstletter = str.charAt(0);
		System.out.println(firstletter);

		System.out.println(str.indexOf("a"));

		System.out.println(str.replace("tomorrow is Saturday", "yesterday was Thursday"));

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		String word1 = str.substring(0, 5);
		String word2 = str.substring(29, 31);

		int lastblank = str.lastIndexOf(" ");
		String word3 = str.substring(lastblank);
		System.out.println(word3);

		System.out.println(word1 + " " + word2 + word3);
		
		
		
		
		

	}
}
