package TwoD_Array;
import java.util.*;

public class Creating2DArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		int n = arr.length;
		int m = arr[0].length;
		
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("Input elements of 2-D array : ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//output
		System.out.println("The 2-D Array is : ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
