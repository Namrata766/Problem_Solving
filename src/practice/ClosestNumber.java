package practice;

/**
 * @author NAMRATA
 *
 * Given non-zero two integers N and M. 
 * The problem is to find the number closest to N and divisible by M. 
 * If there are more than one such number, then output the one having maximum absolute value.
 */
public class ClosestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = -16;
		int M = 5;

		System.out.println(closestNumber(N, M));
	}

	static int closestNumber(int N , int M) {

		int r1 = 0;
        int r2 = 0;
    
    	for(int i = 0; i <= Math.abs(M); i++) {
    		
    		boolean found = false;
    		if ((N + i) % M == 0) {
    			r1 = (N + i);
    			found = true;
    		}
    
			if((N - i) % M == 0) {
				r2 = (N - i);
				found = true;
			}
			
			System.out.println("R1 = " + r1 + " R2 = " + r2);
			
			if(found) {
				return Math.abs(r1) > Math.abs(r2) ? r1 : r2;
			}
		}

		return r1;
	}
}
