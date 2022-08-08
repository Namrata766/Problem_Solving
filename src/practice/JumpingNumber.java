package practice;

public class JumpingNumber {

	public static void main(String[] args) {
		System.out.println(jumpingNums(5978L));

	}

	static long jumpingNums(long X) {

		if(isJumpingNumber(X)) {
			return X;
		} else {

			for(long i = X-1; i >= 0; i--) {
				if(isJumpingNumber(i)){
					return i;
				}
			}
		}

		return X;
	}
	
	private static boolean isJumpingNumber(long X) {
		
		System.out.println("No. to check : " + X);
		int c = 0;
		int y = (int) X;
		int prev = 0;
		boolean isJn = true;

		while(y > 0) {
			int cur = y%10;
			
			System.out.println("Current Digit: " + cur);
			System.out.println("Previous Digit: " + prev);
			y = y / 10;
			
			isJn = Math.abs(cur - prev) == 1;

			if(c > 0 && !isJn) {
				return isJn;
			}
			
			System.out.println("Is Jumping No. calc: " + isJn);

			prev = cur;
			c++;
		}
		
		return isJn;
	}
}
