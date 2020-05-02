package udemyJavaIn28Minutes1;

public class BooksRunner {

	public static void main(String[] args) {

		Books artOfComputerProgramming = new Books();
		Books effectiveJava = new Books();
		Books cleanCode = new Books();

		cleanCode.read();
		effectiveJava.read();
		artOfComputerProgramming.read();

		artOfComputerProgramming.setNoOfCopy(100);
		System.out.println(artOfComputerProgramming.getNoOfCopy());
		cleanCode.setNoOfCopy(50);
		System.out.println(effectiveJava.getNoOfCopy());
		effectiveJava.setNoOfCopy(0);
		System.out.println(cleanCode.getNoOfCopy());




	}

}
