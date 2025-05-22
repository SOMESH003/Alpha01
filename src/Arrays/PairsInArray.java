package Arrays;

public class PairsInArray {
	public static void pairInArray(int numbers[]) {
		int tp = 0;
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length;j++) {
				System.out.print("("+numbers[i]+","+numbers[j]+")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total Pairs : " + tp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,4,6,8,10};
		pairInArray(numbers);

	}

}
