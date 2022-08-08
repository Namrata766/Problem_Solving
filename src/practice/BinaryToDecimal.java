package practice;

/**
 * @author NAMRATA
 * 
 * Given a Binary Number B, find its decimal equivalent.
 * 1 <= number of bits in binary number  <= 16
 *
 */
public class BinaryToDecimal {

	public static void main(String[] args) {
		
		String bin = "1000111110111";
		System.out.println(binary_to_decimal(bin));		
	}

	public static int binary_to_decimal(String str) {

		long num = Long.parseLong(str);
		int d = 0;
		int dec = 0;

		do {
			dec = (int) (dec + ((num%10) * (int)(Math.pow(2, d))));
			d++;
			num = num / 10;
		} while (num > 0);

		return dec;
	}
}
