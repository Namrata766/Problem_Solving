package practice;

/**
 * @author NAMRATA
 *
 *
 * Given two numbers A and B, find Kth digit from right of AB.
 */
public class KthDigit {

	public static void main(String[] args) {
		int A = 12;
		int B = 11;
		int K = 2;
		
		System.out.println(kthDigit(A, B, K));
	}

	static long kthDigit(int A,int B,int K){

		long v = (long)(Math.pow(A, B));
		int n = 0;

		while(v > 0) {
			long d = v%10;
			v = v/10;
			n++;

			if(n == K){
				return d;
			}
		}

		return 0;
	}
}
