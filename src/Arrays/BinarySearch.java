package Arrays;

public class BinarySearch {
	public static int binarySearch(int numbers[], int key) {
		int start = 0;
		int end = numbers.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(numbers[mid] == key) {
				return mid;
			}
			else if(numbers[mid] > key) {
				end = mid-1;
			}
			else if(numbers[mid] < key) {
				start = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		int key = 7;
		int index = binarySearch(numbers, key);
		
		if(index == -1) {
			System.out.println(key + "Not Found");
		}
		else {
			System.out.println(key + " found at index : " + index);
		}
	}

}
