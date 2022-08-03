package practice;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author NAMRATA
 *
 */
public class FibonacciSeries {
	
	public static final Logger LOGGER = Logger.getLogger(FibonacciSeries.class.getName());

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer upto which the Fibonacci series should print - ");
		int n = s.nextInt();
		
		s.close();
		
		if(n > 20) {
			System.out.println("Please enter a number less than or equal to 20.");
			
		} else {
			System.out.println("Printing Finonacci series upto " + n + ". ->");
			System.out.println("Through iteration :");
			fibonacciIteration(n);
			
			System.out.println("Through recursion :");
			System.out.println(fibonacciRecursion(n));
		}
	}

	private static void fibonacciIteration(int n) {
		long first = 1;
		long second = 1;

		System.out.println(first);
		System.out.println(second);

		for (int i = 3; i <= n; i++) {

			long third = first + second;
			System.out.println(third);
			first = second;
			second = third;
		}
	}

	private static int fibonacciRecursion(long number) {
		
		//LOGGER.info("Invoking for : " + number);
		
		if(number == 1 || number == 2){
			return 1;
		}

		return fibonacciRecursion(number-1) + fibonacciRecursion(number -2);
	}
}