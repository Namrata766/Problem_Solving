package practice;


/**
 * 
 * @author NAMRATA
 * 
 *  You a given a number N. You need to print the pattern for the given value of N.
 *
 *	For N = 2 the pattern will be 
 *	2 2 1 1
 *	2 1
 *	
 *	For N = 3 the pattern will be 
 *	3 3 3 2 2 2 1 1 1
 *	3 3 2 2 1 1
 *	3 2 1
 *
 */
public class PrintPattern1 {

	public static void main(String[] args) {
		int n = 6;
		
		for(int i = n; i >= 1; i--) {
            int toprint = n;
            for(int k = n; k >= 1; k--) {
                
                for(int j = i; j >= 1; j--) {
                    System.out.print(toprint + " ");
                }
                toprint--;
            }
            System.out.print("$");
        }
	}
}
