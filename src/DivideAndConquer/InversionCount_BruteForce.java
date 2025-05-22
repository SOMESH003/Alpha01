package DivideAndConquer;

public class InversionCount_BruteForce {
	public static void inversionCount(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					System.out.println("(" + arr[i] +  "," + arr[j] + ")");
					count++;
				}
			}
		}
		System.out.println("Inversion Count : " + count);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,1,3,5};
		inversionCount(arr);
	}

}
