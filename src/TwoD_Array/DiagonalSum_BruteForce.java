package TwoD_Array;

public class DiagonalSum_BruteForce {
	public static int diagonalSum1(int[][] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(i==j) {
					sum += arr[i][j];
				}
				if(i+j == arr[0].length-1) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Diagonal Sum Total : " + diagonalSum1(arr));
	}

}
