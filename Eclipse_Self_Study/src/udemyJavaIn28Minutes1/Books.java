package udemyJavaIn28Minutes1;

public class Books {

	// state
	private int noOfCopy;

	public int getNoOfCopy() {
		return noOfCopy;
	}

	public void setNoOfCopy(int noOfCopy) {
		this.noOfCopy = noOfCopy;
	}

	void read() {
		System.out.println("Lets read a book!");
	}

}
