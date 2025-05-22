package Arrays;

public class ReverseArray {
	public static void reverseArray(int number[]) {
		int first = 0;
		int last = number.length-1;
		while(first < last) {
			int temp = number[first];
			number[first] = number[last];
			number[last] = temp;
			first++;
			last--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {2,4,6,8,10};
		System.out.print("Original Array : ");
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		reverseArray(number);
		
		System.out.print("Reversed Array : ");
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + " ");
		}

	}

}
