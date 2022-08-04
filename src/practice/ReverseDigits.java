package practice;

/**
 * @author NAMRATA
 *
 * Given N,  reverse the digits of N.
 */
public class ReverseDigits {

	public static void main(String[] args) {
		long n = 56757579;
		
		System.out.println(reverse_digit(n));

	}
	
	public static long reverse_digit(long n) {
        long rev = 0;
        while(n > 0) {
            rev = (rev * 10) + n%10;
            n = n/10;
        }
        
        return rev;
    }
}
