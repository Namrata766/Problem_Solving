package practice;

import java.util.Scanner;

/**
 * @author NAMRATA
 *
 */
public class InsertionSort {

	public static void main(String[] args) {

		System.out.println("Enter a list of integers to be sorted in ascending order : ");
		System.out.println("But first enter the number of integers you are about to enter : ");
		Scanner sc = new Scanner(System.in); 
		int length = sc.nextInt();

		int[] arrayToSort = new int[length];

		System.out.println("OK. Now enter " + length + " integers :");

		for(int i = 1; i <= length; i++) {
			arrayToSort[i-1] = sc.nextInt();
		}

		sc.close();
		
		System.out.println("Sorting the list . . . ");

		for(int i = 1; i < length; i++) {
			
			int j = i - 1;

			while( j >= 0 && arrayToSort[j] > arrayToSort[j + 1]) {

				int key = arrayToSort[j+1];
				arrayToSort[j+1] = arrayToSort[j];
				arrayToSort[j] = key;
				j--;				
			}			
		}

		System.out.println("Sorted list of integers is as follows : ");

		for(int i = 0; i < length; i++) {
			System.out.println(arrayToSort[i]);
		}
	}
}