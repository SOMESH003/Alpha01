package Recursion;

public class SubstringWithStartAndEndSame {
	public static boolean checkEquality(String str) {
		return (str.charAt(0) == str.charAt(str.length()-1));
	}
	
	public static int countSubstring(String str) {
		int count = 0;
		int n = str.length();
		
		for(int i=0; i<n; i++) {
			for(int len = 1; len <= (n-i); len++) {
				if(checkEquality(str.substring(i, i+len))) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcab";
		System.out.println("Total substring : " + countSubstring(str));
	}

}
