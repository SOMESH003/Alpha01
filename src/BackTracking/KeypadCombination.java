package BackTracking;

public class KeypadCombination {
	final static String[] L = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void letterCombination(String digit) {
		int len = digit.length();
		if(len == 0) {
			System.out.println("");
			return;
		}
		
		keypadComb(0, len, new StringBuilder(),digit);
	}
	
	public static void keypadComb(int index, int len, StringBuilder sb, String digit) {
		if(index >= len) {
			System.out.println(sb.toString());
			return;
		}
		
		int d = digit.charAt(index) - '0';
		String value = L[d];
		
		for(int i=0; i<digit.length(); i++) {
			keypadComb(index+1, len, sb.append(value.charAt(i)), digit);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterCombination("23");

	}

}
