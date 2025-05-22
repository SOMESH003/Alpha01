package TwoD_Array;

public class NumberOf7 {
	public static void numberOf7(int arr[][],int key) {
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				if(arr[i][j] == key) {
					count++;
				}
			}
		}
		System.out.println("number of " + key + " in array : " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{4,7,8},{8,8,7}};
		int key = 7;
		numberOf7(array, key);
	}

}
