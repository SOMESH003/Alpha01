package Recursion;

public class SubstringWithStartAndEndSame_Method2 {
	public static int countSubstring(String str) {
		int count=0;
		int n = str.length();
		
		for(int i = 0; i < n; i++) {
			for(int j=i; j < n; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcab";
		System.out.println("Total Substring : " + countSubstring(str));
	}

}
