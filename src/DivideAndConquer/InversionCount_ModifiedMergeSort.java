package DivideAndConquer;

public class InversionCount_ModifiedMergeSort {
	public static int merge(int[] arr, int si, int mid, int ei) {
		int i = si;
		int j = mid+1;
		int k = 0;
		int invCount = 0;
		int[] temp = new int[ei-si+1];
		
		while(i<=mid && j<=ei) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			}
			else {
				temp[k] = arr[j];
				invCount += (mid-i);
				k++;
				j++;
			}
		}
		while(i<mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while(j<=ei) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		
		for(i=si,k=0; i<=ei; i++,k++) {
			arr[i] = temp[k];
		}
		return invCount;
	}
	
	public static int mergeSort(int arr[], int si, int ei) {
		int invCount = 0;
		if(si<ei) {
			int mid = si + (ei-si)/2;
			invCount = mergeSort(arr, si, mid);
			invCount += mergeSort(arr, mid+1, ei);
			invCount += merge(arr,si,mid+1,ei);
		}
		return invCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,1,3,5};
		System.out.println("Inversion Count : " + mergeSort(arr, 0, arr.length-1));
	}

}
