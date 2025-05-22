package SortingAlgorithm;

public class BubbleSort_DecendingOrder {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<=arr.length-2;i++) {
			int swap=0;
			for(int j=0; j<=arr.length-2-i; j++) {
				if(arr[j] < arr[j+1]) {
					swap++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(swap == 0) {
				break;
			}
		}
		printArr(arr);
	}
	
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,2,1,8,7,4,5,3,1};
		bubbleSort(arr);
	}

}
