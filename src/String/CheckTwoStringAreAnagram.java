package String;
import java.util.*;

public class CheckTwoStringAreAnagram {
	public static boolean checkAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length()) {
			char[] str1Char = str1.toCharArray();
			char[] str2Char = str2.toCharArray();
			Arrays.sort(str1Char);
			Arrays.sort(str1Char);
			
			if(Arrays.equals(str1Char, str2Char)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "race";
		String str2 = "care";
		if(checkAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are Anagram");
		}
		else {
			System.out.println(str1 + " and " + str2 + " are not Anagram");
		}
	}

}
