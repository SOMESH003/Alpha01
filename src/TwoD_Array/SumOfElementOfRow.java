package TwoD_Array;

public class SumOfElementOfRow {
	public static void sumOfElementOfRow(int arr[][],int row) {
		int sum=0;
		for(int i=0; i<arr[row-1].length;i++) {
			sum += arr[row-1][i];			
		}
		System.out.println("Sum of " +row+ "nd row : " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,9},{11,4,3},{2,2,3}};
		int row = 2;
		sumOfElementOfRow(arr, row);
	}
}
