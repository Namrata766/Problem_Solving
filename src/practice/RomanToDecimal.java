package practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

	public static void main(String[] args) {
		romanToInt("MCDLXXVI");
	}
	
	public static int romanToInt(String s) {
        int num = 0;
        
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        int size = s.length();
	
        num += roman.get(String.valueOf(s.charAt(size - 1)));
        
        for(int i = size - 2; i >= 0; i--) {
            if(roman.get(String.valueOf(s.charAt(i))) < roman.get(String.valueOf(s.charAt(i + 1)))) {
                num -= roman.get(String.valueOf(s.charAt(i)));
            } else {
                num += roman.get(String.valueOf(s.charAt(i)));                
            }
        }
        System.out.println("final result: " + num);
        return num;
    }

}
