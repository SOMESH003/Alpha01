package BackTracking;

public class findSubsets {
	public static void find_Subsets(String str, String ans, int i) {
		if(i == str.length()) {
			if(ans.length() == 0) {
				System.out.println("null");
			}
			else {
				System.out.println(ans);
			}
			return;
		}
		
		//yes
		find_Subsets(str, ans + str.charAt(i), i+1);
		//no
		find_Subsets(str, ans, i+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		find_Subsets(str, "" , 0);
	}

}
