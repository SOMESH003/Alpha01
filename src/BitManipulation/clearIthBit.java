package BitManipulation;

public class clearIthBit {
	public static int clearIthBit(int n, int i) {
		int bitMask = ~(1<<i);
		return (n & bitMask);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clearIthBit(10, 1));
	}

}
