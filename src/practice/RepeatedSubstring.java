package practice;

public class RepeatedSubstring {

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abcabcd"));
	}

	public static boolean repeatedSubstringPattern(String s) {
		return (s + s).indexOf(s, 1) != s.length();
	}
}
