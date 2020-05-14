package W3Schools;

//import java.util.Arrays;

public class Arrays {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Multidimensional Array
		/*
		 * int[][] intArray = new int[10][20];
		 * 
		 * intArray[0][2] = 129;
		 * 
		 * int oneInt = intArray[0][2]; System.out.println(oneInt);
		 */

		/*
		 * int[][] intArray1 = new int[3][5];
		 * 
		 * for (int i = 0; i < intArray1.length; i++) { for (int j = 0; j <
		 * intArray1[i].length; j++) { System.out.println("i: " + i + ", j: " + j); } }
		 */

		// Inserting an element to an array
		/*
		 * int[] ints = new int[20];
		 * 
		 * int insertIndex = 10; int newValue = 123;
		 * 
		 * move elements below insertion point. for (int i = ints.length - 1; i >
		 * insertIndex; i--) { ints[i] = ints[i - 1]; }
		 * 
		 * insert new value ints[insertIndex] = newValue;
		 * 
		 * System.out.println(Arrays.toString());
		 * 
		 * *****Inserting an element to Array creating a method public void
		 * insertIntoArray( int[] array, int insertIndex, int newValue){
		 * 
		 * //move elements below insertion point. for(int i=array.length-1; i >
		 * insertIndex; i--){ array[i] = array[i-1]; }
		 * 
		 * //insert new value array[insertIndex] = newValue; } Method int[] ints = new
		 * int[20];
		 * 
		 * insertIntoArray(ints, 0, 10); insertIntoArray(ints, 1, 23);
		 * insertIntoArray(ints, 9, 67);
		 * 
		 * //Removing an element creating a method public void removeFromArray( int[]
		 * array, int removeIndex){
		 * 
		 * for(int i = removeIndex; i < array.length -1; i++){ array[i] = array[i + 1];
		 * } } Method int[] ints = new int[20];
		 * 
		 * insertIntoArray(ints, 0, 10); insertIntoArray(ints, 1, 23);
		 * insertIntoArray(ints, 9, 67);
		 */

		/*
		 * *****Finding Min Element in Array int[] ints = {0,2,4,6,8,10};
		 * 
		 * int minVal = Integer.MAX_VALUE;
		 * 
		 * for(int i=0; i < ints.length; i++){ if(ints[i] < minVal){ minVal = ints[i]; }
		 * }
		 * 
		 * System.out.println("minVal = " + minVal);
		 */

		/*
		 * *****Finding Max Element in Array int[] ints = {0,2,4,6,8,10};
		 * 
		 * int maxVal = Integer.MIN_VALUE; for(int i=0; i < ints.length; i++){
		 * if(ints[i] > maxVal){ maxVal = ints[i]; } } System.out.println("maxVal = " +
		 * maxVal); }
		 */

		// *****Min and Max element in Array

		/*
		 * int[] Element = { 32, 65, 76, 34, 87, 97, 16 };
		 * 
		 * int minVal = Integer.MAX_VALUE;
		 * 
		 * for (int i = 0; i < Element.length; i++) {
		 * 
		 * if (Element[i] < minVal) {
		 * 
		 * minVal = Element[i];
		 * 
		 * } }
		 *
		 * System.out.println("Min element in Array is: " + minVal);
		 * 
		 * int maxVal = Integer.MIN_VALUE;
		 * 
		 * for (int i = 0; i < Element.length; i++) { if (Element[i] > maxVal) {
		 * 
		 * maxVal = Element[i]; } } System.out.println("Max element in Array is: " +
		 * maxVal);
		 */

		// Arrays

		// int[] myArray = new int[] { 10, 20, 30, 40, 50 };
		// System.out.println(myArray[2]); // it gives you an element in index [2] which
		// is 30

		// updating an element in array
		// myArray[1] = 21;
		// System.out.println(myArray[1]);

		// Single Value Containers
		/*
		 * int state1PopulationCount = 502; int state2PopulationCount = 678; int
		 * state3PopulationCount = 456; int state4PopulatoinCount = 235; int
		 * state5PopulationCount = 957;
		 */

		// Multi Value Containers
		// read single element
		// int[] countryPopulation = new int[5]; // All elements were be default initial
		// value "0"
		// int[] countryPopulation = { 502, 678, 456, 235, 957 }; // All elements have
		// values initially. *** implicitly
		// int[] countryPopulation = new int[] { 502, 678, 456, 235, 957 }; //
		// ***explicitly

		/*
		 * System.out.println("country{Population[0]: " + countryPopulation[0]); //
		 * since we have not assign a value the // default value will be "0"
		 * System.out.println("country{Population[1]: " + countryPopulation[1]);
		 * 
		 * // read all elements System.out.println(countryPopulation.length); // length
		 * of array is 5. That is why we are saying i < // countryPopulation.length it
		 * means i greater than 5 which goes
		 * System.out.println("====after value initilazed===="); // up to index number
		 * of 4 only for (int i = 0; i < countryPopulation.length; i++) {
		 * System.out.println("countryPopulation[" + i + "]) is " +
		 * countryPopulation[i]); }
		 */

		// write/update operation
		/*
		 * countryPopulation[0] = 1502; countryPopulation[1] = 2678;
		 * countryPopulation[2] = 3456; countryPopulation[3] = 4235;
		 * countryPopulation[4] = 5957;
		 */

		/*
		 * System.out.println("== Re Reading After Writing/Updating Oparation==");
		 * System.out.println("countryPopulation[0] is " + countryPopulation[0]);
		 * System.out.println("== Printing all together=="); for (int i = 0; i <
		 * countryPopulation.length; i++) { System.out.println("countryPopulation[" + i
		 * + "]) is " + countryPopulation[i]); }
		 */

		// Enhanced For Loop | For Each Loop
		/*
		 * for (int element : countryPopulation) { System.out.println(element); }
		 */

		// Sum of all elements
		/*
		 * int count = 0; for (int element : countryPopulation) { count += element; //
		 * System.out.println(element); }
		 * System.out.println("Population of all countries is " + count); // Sum of all
		 * elements
		 */
		// Two Dimension Arrays
		/*
		 * int[][] worldPopulation = { // 0 1 2 3 4 5 6 colum { 2432, 2342, 1432, 543,
		 * 7654, 78, 896 }, // 0 { 534, 46, 675, 34654, 6546, 7865, 534 }, // 1 { 32423,
		 * 75, 86, 459, 9087, 4334, 3243 } // 2 row
		 * 
		 * };
		 * 
		 * 
		 * int rowToatal1 = 0; for (int i = 0; i < 1; i++) { for (int j = 0; j <
		 * worldPopulation[1].length; j++) { rowToatal1 += worldPopulation[0][j]; } }
		 */
		// System.out.println(rowToatal1);

		// int firstcountry = 0;
		/*
		 * for (int i = 0; i < worldPopulation.length; i++) { for (int j = 0; j <
		 * worldPopulation[i].length; j++) { // firstcountry = firstcountry + j;
		 * System.out.print(worldPopulation[i][j] + " "); } System.out.println(".....");
		 * }
		 * 
		 * // System.out.println("Population of first country is " + firstcountry);
		 * 
		 * System.out.println(worldPopulation[1][3]);
		 * System.out.println("World population is: " + worldPopulation[2][6] +
		 * " and length is: " + worldPopulation.length);
		 */

		// Total of a row and a colum
		// int rowTotal = 0;

		/*
		 * int columTotal = 0;
		 * 
		 * for (int k = 0; k < worldPopulation.length; k++) { columTotal +=
		 * worldPopulation[k][0];
		 * 
		 * }
		 */

		// System.out.println(columTotal);

		// *****How to Coppy one Array to Another Array
		/*
		 * int[] word = { 1, 2, 4, 6, 7, 8, 9 };
		 * 
		 * int[] coppyWord = new int[7];
		 * 
		 * System.arraycopy(word, 1, coppyWord, 0, word.length - 1); //2. way is coping
		 * desire elements to any index number
		 * 
		 * for (int i = 0; i < word.length; i++) { // coppyWord[i] = word[i]; 1.Way is
		 * only coping all elements to second array.
		 * 
		 * coppyWord[2] = 500; System.out.print(coppyWord[i] + " ");
		 * 
		 * }
		 * 
		 * word[2] = 100; System.out.println(); System.out.print("--------------");
		 * System.out.println(); for (int i = 0; i < word.length; i++) {
		 * System.out.print(word[i] + " ");
		 * 
		 * } int[] source = new int[10]; int[] dest = new int[10];
		 * 
		 * //3.Way to coppy an array to another array for(int i=0; i < source.length;
		 * int[] source = new int[10]; int[] dest = new int[10];
		 * 
		 * 
		 * for(int i=0; i < source.length; i++) { source[i] = i; }
		 * 
		 * for(int i=0; i < source.length; i++) { dest[i] = source[i]; }
		 * 
		 * System.out.println(Arrays.toString(source));
		 * System.out.println(Arrays.toString(dest));
		 * 
		 * int[] dst = Arrays.copyOf(source, 10);
		 * 
		 * source[2] = 17;
		 * 
		 * System.out.println(Arrays.toString(source));
		 * System.out.println(Arrays.toString(dest));
		 */

		/*
		 * int[][] worldPopulation = { // 0 1 2 3 4 5 6 colum { 2432, 2342, 1432, 543,
		 * 7654, 78, 896 }, // 0 { 534, 46, 675, 34654, 6546, 7865, 534 }, // 1 { 32423,
		 * 75, 86, 459, 9087, 4334, 3243 } // 2 row
		 * 
		 * };
		 * 
		 * int[][] coppyWorldPopulation = new int[5][7];
		 * System.arraycopy(worldPopulation, 1, coppyWorldPopulation, 1,
		 * worldPopulation.length - 1);
		 * 
		 * // System.out.println(Arrays.toString(worldPopulation));
		 * 
		 * for (int i = 1; i < 2; i++) { for (int j = 0; j < 7; j++) {
		 * 
		 * System.out.println(coppyWorldPopulation[i][j]); }
		 * 
		 * }
		 */
		/*
		 * *****Filling Method in Array int[] source = new int[10];
		 * 
		 * Arrays.fill(source, 0);
		 * 
		 * System.out.println(Arrays.toString(source));
		 * 
		 * Arrays.fill(source, 3, 5, 21);
		 * 
		 * System.out.println(Arrays.toString(source));
		 */


		// How to print Array with its value and index number

		/*
		 * System.out.println("index      value");
		 * 
		 * int[] apple = { 2, 4, 7, 9, 3, 10, 50, 30 };
		 * 
		 * for (int i = 0; i < apple.length; i++) {
		 * 
		 * System.out.println(i + "             " + apple[i]); }
		 */

		// Adding a number to an array

		/*
		 * int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		 * 
		 * int pos = 4; // size++;
		 * 
		 * for (int i = arr.length - 1; i > 4; i--) {
		 * 
		 * arr[i] = arr[i - 1];
		 * 
		 * } arr[4] = 5; // ======> after moving elements to forward. indext number of 4
		 * will be "0" than we can assign a new value for (int i = 0; i < arr.length;
		 * i++) { System.out.println(arr[i]); }
		 * 
		 * // Removing a number from an array
		 * 
		 * int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		 * 
		 * int pos1 = 2;
		 * 
		 * for (int i = pos1; i < arr1.length - 1; i++) {
		 * 
		 * arr1[i] = arr1[i + 1];
		 * 
		 * }
		 * 
		 * for (int i = 0; i < arr1.length; i++) {
		 * 
		 * System.out.println(arr1[i]); }
		 * 
		 * arr1[arr1.length - 1] = 0;
		 * 
		 * // arr1[9] = 0;
		 * 
		 * for (int i = 0; i < arr1.length; i++) {
		 * 
		 * System.out.println(arr1[i]); }
		 */

		
		// Printing elements in Aray in Two Ways
		/*
		 * int[] arrNum = { 10, 20, 30, 40, 50 };
		 * 
		 * System.out.println("--Print elements in an Array--");
		 * 
		 * for (int i = 0; i < arrNum.length; i++) {
		 * 
		 * System.out.println(arrNum[i]); }
		 * 
		 * System.out.println("--For Each element in Array--");
		 * 
		 * for (int k : arrNum) {
		 * 
		 * System.out.print(k + " "); }
		 */

		// Coping multidimension Arrays

		// int[][] multiDimension1 = new int [3][7];
		// int[][] multiDimension2 = new int [3][7];

		
		// Multidimension Arrays Copy

		/*
		 * int[][] multiDimension1 = { { 10, 11, 12, 13, 14, 0, 0 }, // 1 { 20, 21, 22,
		 * 23, 24, 0, 0 }, // 2 { 30, 31, 32, 33, 34, 0, 0 } }; // 3
		 * 
		 * int[][] multiDimension2 = { { 40, 41, 42, 43, 44, 0, 0 }, { 50, 51, 52, 53,
		 * 54, 0, 0 }, { 60, 61, 62, 63, 64, 0, 0 } };
		 * System.out.println("***Arrays before coping***");
		 * System.out.println(Arrays.deepToString(multiDimension1));
		 * System.out.println(Arrays.deepToString(multiDimension2));
		 * 
		 * System.out.println();
		 * System.out.println("***Arrays after coping second Array***");
		 * System.arraycopy(multiDimension1, 1, multiDimension2, 1, 2); // coping 1st
		 * and 2nd index number to // multiDimension2
		 * 
		 * System.out.println(Arrays.deepToString(multiDimension2));
		 * 
		 * System.out.println(); System.out.
		 * println("Coping Whole elements from multiDimension1 to multiDimension2");
		 * 
		 * System.arraycopy(multiDimension1, 0, multiDimension2, 0, 1);
		 * System.out.println(Arrays.deepToString(multiDimension2));
		 */

		/*
		 * int[][] newArr = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 0, 1, 2, 3, 4, 5, 6,
		 * 7, 8, 9 } };
		 * 
		 * System.out.println("Print All Elements");
		 * 
		 * for (int i = 0; i < newArr.length; i++) { System.out.println(); for (int j =
		 * 0; j < newArr[i].length; j++) {
		 * 
		 * System.out.print("| index no: "); System.out.print(i);
		 * System.out.print(newArr[i][j] + " | "); } }
		 */
		
		
		
		
		
	}

}
