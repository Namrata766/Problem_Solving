package practice;

/**
 * @author NAMRATA
 * 
 * Given a string s, 
 * check if it can be constructed by taking a substring of 
 * it and appending multiple copies of the substring together.
 * 
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 *
 */
public class RepeatedSubstring {

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abcabcd"));
	}

	public static boolean repeatedSubstringPattern(String s) {
		return (s + s).indexOf(s, 1) != s.length();
	}
}
