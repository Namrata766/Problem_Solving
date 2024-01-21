package practice;

public class LongestPrefix {

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"hoxxhoramo"}));
	}


	public static String longestCommonPrefix(String[] strs) {
		
		if(strs.length == 1) {
			return strs[0];
		}
		
		int l = strs[0].length();

		for(int i = 0; i < strs.length; i++) {
			if(strs[i].length() < l) {
				l = strs[i].length();
			}
		}
		
		StringBuilder lp = new StringBuilder();
		String temp = null;
		boolean cp = false;
				
		for(int i = 0; i < l; i++) {			
			for(int j = 0; j < strs.length; j++) {
				if(temp == null) {
					temp = String.valueOf(strs[j].charAt(i));
				} else if (String.valueOf(strs[j].charAt(i)).equals(temp)) {
					cp = true;
				} else {
					cp = false;
					break;
				}
			}
			
			if(cp) {
				lp = lp.append(temp);
			} else {
				break;
			}
			cp = false;
			temp = null;
		}
		return lp.toString();
	}
}
