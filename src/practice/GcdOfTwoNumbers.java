package practice;

public class GcdOfTwoNumbers {

	public static void main(String[] args) {

		System.out.println(gcd(26, 77));
		System.out.println(gcd(23, 23));
		System.out.println(gcd(36, 8));
	}

	public static int gcd(int A , int B) { 

		if(A == 0) {
			return B;
		} 

		if(B == 0) {
			return A;
		}

		if(A == B){
			return A;
		}

		int X = A;
		int Y = B;
		while(X > Y || Y > X) {

			int C = 0;
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

		return 1;
	}
}
