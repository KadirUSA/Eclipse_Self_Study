package youtubeSadiEvrenSeker;

public class Break_And_Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i <=20; i++) {
			
			if(i == 15) {
				break;

			}
			System.out.println(i);
		}

	for (int i = 0; i <=20; i++) {
			
			if(i == 15) {
				continue;

			}
			System.out.println(i);
	}

	  int[] test = {0, 1, 2, 3, 4};  
      for (int s : test) {  
			if (s == 3) { // here s == 3 means third index[3] number of array.
              break;  
          }  
			System.out.print(s + "\n");
      }  
      System.out.println("break statement execution");  


		for (int a = 1; a <= 3; a++) {

			for (int b = 1; b <= 3; b++) {
				if (a == 2 && b == 2) {
					continue;
				}

				System.out.println(a + " " + b);

				}

			}

			int num1 = -95;

			System.out.println(Math.abs(num1));

			}
		}

