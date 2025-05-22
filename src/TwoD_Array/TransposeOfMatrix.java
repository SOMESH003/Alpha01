package TwoD_Array;

import java.util.Arrays;

public class TransposeOfMatrix {
	public static void transposeOfMatrix(int[][] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<i;j++) {
				
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				
			}
		}
		System.out.println("Transpose Of Matrix : ");
		arrPrint(arr);
	}
	
	public static void arrPrint(int[][] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Original Matrix : ");
		arrPrint(arr);
		
		transposeOfMatrix(arr);
		
		//arrPrint(arr);
	}

}
