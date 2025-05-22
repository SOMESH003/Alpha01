package BitManipulation;

public class Add1WithoutOperator {
	public static int add1ToNumber(int n) {
		int m=1;
		while((n & m) >= 1) {
			n = n^m;
			m<<=1;
		}
		n = n^m;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("Next number of "+ n + " : " + add1ToNumber(5));
	}

}
