package BitManipulation;

public class ClearIBits {
	public static int clearIBits(int n, int i, int j) {
		int a = (~0)<<(j+1);
		int b = (1<<i)-1;
		int bitMask = a|b;
		return n&bitMask; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clearIBits(10, 2, 4));
	}

}
