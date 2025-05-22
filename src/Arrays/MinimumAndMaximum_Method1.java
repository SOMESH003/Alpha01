package Arrays;
import java.util.*;

public class MinimumAndMaximum_Method1 {
	public static void getMinMax(int arr[]) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length-1];
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		getMinMax(arr);
	}

}
