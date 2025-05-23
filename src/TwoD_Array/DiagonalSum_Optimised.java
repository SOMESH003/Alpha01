package TwoD_Array;

public class DiagonalSum_Optimised {
	public static int diagonalSum2(int[][] arr) {
		int sum=0;
		for(int i=0; i<arr[0].length; i++) {
			//pd
			sum += arr[i][i];
			//sd
			if(i != arr.length-i-1) {
				sum += arr[i][arr.length-i-1];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Total Diagonal Sum : " + diagonalSum2(arr));
	}	

}
