package practice;

import java.util.Scanner;

/**
 * @author NAMRATA
 *
 */
public class SelectionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of terms in the array : ");
		int num = sc.nextInt();
		System.out.println("Enter the array :");

		int[] array = new int[num];
		for(int i = 0; i< num; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < num - 1; i++) {
			for(int j = i + 1; j < num; j++) {
				if(array[j] < array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		System.out.println("Array after sorting :");

		for(int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}
	}
}