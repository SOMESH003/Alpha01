package Recursion;

public class SubstringWithStartAndEndSame_RecursiveMethod {
	public static int countSubstring(String str, int i, int j,int n) {
		if(n==1) {
			return 1;
		}
		if(n<=0) {
			return 0;
		}
		
		int res = countSubstring(str, i+1,j,n-1)+
				  countSubstring(str, i, j-1, n-1)-
				  countSubstring(str, i+1, j-1, n-2);
		if(str.charAt(i) == str.charAt(j)) {
			res++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcab";
		System.out.println(countSubstring(str, 0, str.length()-1, str.length()));

	}

}
