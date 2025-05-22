package BitManipulation;

public class UpdateIthBit {
	public static int clearIthBit(int n, int i) {
		int bitMask = ~(1<<i);
		return n & bitMask;
	}
	
	public static int setIthBit(int n, int i) {
		int bitMask = 1<<i;
		return n|bitMask;
	}
	
	public static int updateIthBit(int n, int i, int newBit) {
		/*using direct set and clear methods
		 
		if(newBit == 0) {
			return clearIthBit(n, i);
		}
		else {
			return setIthBit(n, i);
		}*/
		
		// Using only clear Method only in first line
		n = clearIthBit(n,i);
		int bitMask = newBit<<i;
		return n|bitMask;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(updateIthBit(10, 2, 1));
	}

}
