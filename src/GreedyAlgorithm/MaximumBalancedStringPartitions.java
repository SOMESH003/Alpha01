package GreedyAlgorithm;

public class MaximumBalancedStringPartitions {
	public static int balancedPartitions(String str, int n) {
		if(n == 0) {
			return 0;
			
		}
		
		
		int l = 0, r = 0;
		int ans = 0;
		
		for(int i=0; i < n; i++) {
			if(str.charAt(i) == 'R') {
				r++;
			}
			else if(str.charAt(i) == 'L') {
				l++;
			}
			
			if(l == r) {
				ans++;
				System.out.println(l +  " " + r);
				//l=0;r=0;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "LRRRRLLRLLRL";
		int n = str.length(); 
		System.out.println("Maximum Balanced String : " + balancedPartitions(str,n));

	}

}
