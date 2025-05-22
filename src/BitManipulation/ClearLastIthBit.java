package BitManipulation;

public class ClearLastIthBit {
	public static int clearLatIBit(int n, int i) {
		int bitMask = ((~0) << i);
		return n&bitMask;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clearLatIBit(15, 2));
	}

}
