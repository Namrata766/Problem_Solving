package practice;

/**
 * @author NAMRATA
 * 
 * Given two numbers A and B. The task is to find out their LCM and GCD.
 * 
 * Input:
 * A = 5 , B = 10
 * Output:
 * 10 5
 * Explanation:
 * LCM of 5 and 10 is 10, while
 * their GCD is 5.
 *
 */
public class LcmAndGcdOfTwoNumbers {

	public static void main(String[] args) {
		Long[] result = lcmAndGcd(222L, 11L);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	static Long[] lcmAndGcd(Long A , Long B) {

		long gcd = gcd(A, B);
		long lcm = (A * B)/gcd;

		Long[] result = {lcm, gcd};
		return result;
	}

	public static long gcd(Long A, Long B){
		if(A == 0) {
			return B;
		} 

		if(B == 0) {
			return A;
		}

		if(A == B){
			return A;
		}

		long X = A;
		long Y = B;
		while(X > Y || Y > X) {

			long C = 0;
			if(X > Y) {
				C = X - Y;
			} else {
				C = Y - X;
			}

			if(A%C == 0 && B%C == 0) {
				return C;
			} else {
				if(X > Y) {
					X = C;
				} else {
					Y = C;
				}
			}
		}

		return 1L;
	}
}
