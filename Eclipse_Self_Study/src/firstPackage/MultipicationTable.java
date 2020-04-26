package firstPackage;


public class MultipicationTable {

	public static void main(String[] args) {

		multipicationTable(3);
		
		multipicationTable(6, 11, 20);
		
		multipicationTable(8);
	}

	public static void multipicationTable()
{   	for (int i = 1; i <=10; i++) {
	System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
}
	
}

	public static void multipicationTable(int num)
	{
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", num, i, num * i).println();
}
}
		
	public static void multipicationTable(int num, int from, int to)
	{
		for(int i = from; i<=to; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i).println();
		}
				

}
}