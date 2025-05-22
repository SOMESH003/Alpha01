package SortingAlgorithm;

public class BubbleSort_O_n {
	public static void bubbleSort(int arr[]) {
		for(int i=0; i<arr.length-1;i++) {
			int swap=0;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
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
		int[] arr = {1,2,3,4,5};
		bubbleSort(arr);
	//	printArr(arr);
		
	}

}
