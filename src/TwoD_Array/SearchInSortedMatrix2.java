package TwoD_Array;

public class SearchInSortedMatrix2 {
	public static boolean staircaseSearch2(int[][] arr, int key) {
		int row = arr.length-1; 
		int col = 0;
		while(row >= 0 && col < arr[0].length) {
			if(arr[row][col] == key) {
				System.out.println(key + " is found at : (" + row + "," + col + ")");
				return true;
			}
			else if(key < arr[row][col]) {
				row--;
			}
			else {
				col++;
			}
		}
		System.out.println(key + " not Found");
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,20,30,40},
				       {15,25,35,45},
				       {27,29,37,48},
				       {32,33,39,50}};
	int key = 35;
	staircaseSearch2(arr, key);
	}

}
