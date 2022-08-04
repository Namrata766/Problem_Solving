package practice;

/**
 * @author NAMRATA
 * 
 * Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
 * Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.
 *
 */
public class SumOfDigitsPalindrome {
	
	public static void main(String args[]) {
		
		int N = 56;
		
		System.out.println(isDigitSumPalindrome(N));
	}

	public static int isDigitSumPalindrome(int N) {
        int M = N;
        int sum = 0;
        int rev = 0;
        
        while(M>0) {
            sum += M%10;
            M = M/10;
        }
        
        int K = sum;
        while(K>0) {
            rev = (rev * 10) + K%10;
            K = K/10;
        }
        
        if(sum == rev){
            return 1;
        } else {
            return 0;
        }
    }
}
