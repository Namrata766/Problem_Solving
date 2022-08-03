package practice;

import java.util.logging.Logger;

/**
 * @author NAMRATA
 * 
 * 
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
 * To accommodate this, nums1 has a length of m + n, 
 * where the first m elements denote the elements that should be merged, 
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 */
public class MergeSortedArray {

	public static final Logger LOGGER = Logger.getLogger(MergeSortedArray.class.getName());

	public static void main(String[] args) {
		int[] nums1 = {1,2,7,0,0};
		int[] nums2 = {3,4};

		merge(nums1, 3, nums2, 2);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0;
		int j = 0;
		int inc = 0;

		while(i<m + i && j<n) {

			System.out.println("i = " + i);
			System.out.println("j = " + j);
			System.out.println("nums1[i] = " + nums1[i]);
			System.out.println("nums2[j] = " + nums2[j]);
			System.out.println("inc = " + inc);

			if(nums1[i] > nums2[j] ) {  

				for(int k = m + i; k > i + 1; k--) {
					nums1[k] = nums1[k-1];
				}
				
				inc++;

				int tmp = nums1[i];
				nums1[i] = nums2[j];
				nums1[i + 1] = tmp;
				i++;
				j++;

			} else if (nums1[i] == nums2[j]	){ 
				for(int k = m + i; k > i + 1; k--) {
					System.out.println("k = " + k);
					nums1[k] = nums1[k-1];
				}
				inc++;
				nums1[i + 1] = nums2[j];
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				if(i <= m + n - 2 && i != m + inc - 1 && nums1[i + 1] < nums2[j]) {
					i++;
				} else {
					for(int k = m + i - 1; k > i + 1 && k < m + n; k--) {
						System.out.println("k = " + k);
						nums1[k] = nums1[k-1];
					}
					inc++;
					nums1[i + 1] = nums2[j];
					i++;
					j++;
				}
			}
				

			System.out.println("nums1 after sort =");
			for(int c = 0; c < m +	n; c++) { 
				System.out.println(nums1[c]); 
			}
		}
	}
}
