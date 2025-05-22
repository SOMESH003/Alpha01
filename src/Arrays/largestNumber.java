package Arrays;
import java.util.*;

public class largestNumber {
	public static int largestNumber(int numbers[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest Number in Array numbers[] : " + smallest);
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1,2,5,9,3,6,10,4,7,8};
		System.out.println(Arrays.toString(numbers));
		int largest = largestNumber(numbers);
		
		System.out.println("Largest number in Array numbers[] : " + largest);

	}

}
