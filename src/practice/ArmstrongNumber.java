package practice;

/**
 * @author NAMRATA
 * 
 * For a given 3 digit number, find whether it is armstrong number or not. 
 * An Armstrong number of three digits is an integer such that the sum of 
 * the cubes of its digits is equal to the number itself. 
 * Return "Yes" if it is a armstrong number else return "No".
 * NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 371;
		
		System.out.println(armstrongNumber(n));
	}
	
	static String armstrongNumber(int n) {
        //153, 371
        int m = n;
        int s = 0;
        
        while(m > 0) {
            s += Math.pow(m%10, 3);
            m = m/10;
        }
        
        if(n == s) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
