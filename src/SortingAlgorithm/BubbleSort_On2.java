package SortingAlgorithm;

public class BubbleSort_On2 {
	public static void bubbleSort(int arr[]) {
		for(int turn = 0; turn<arr.length-1; turn++) {
			for(int j=0; j<arr.length-1-turn; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArr(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		System.out.println("Unsorted Array : ");
		printArr(arr);
		bubbleSort(arr);
		System.out.println("Sorted Array : ");
		printArr(arr);
		
	}

}
