package String;

public class CheckPalindrome {
	public static boolean checkPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		while(start<end) {
			/*
			if(str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
			}else {
				System.out.println(str + " is not palindrome");
				return false;
			}
			*/
			if(str.charAt(start) != str.charAt(end)) {
				System.out.println(str + " is not palindrome");
				return false;
			}
			start++;
			end--;
			
		}
		System.out.println(str + " is palindrome");
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "racepar";
		checkPalindrome(str);
	}
}