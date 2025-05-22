package Arrays;

public class LinearSearch {
	public static int linearSearch(int numbers[], int key) {
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,4,6,8,10,12,14,16,18};
		int key = 12;
		int index = linearSearch(numbers,key);
		if(index == -1) {
			System.out.println(key + " Not Found");
		}else {
			System.out.println(key + " found at index : " + index);
		}

	}

}
