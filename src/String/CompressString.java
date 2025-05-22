package String;

public class CompressString {
	public static String compress(String str) {
		String strNew = "";
		
		for(int i=0; i<str.length();i++) {
			Integer count = 1;
			while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
				count++;
				i++;
			}
			strNew += str.charAt(i);
			if(count>1) {
				strNew += count.toString();
			}
		}
		return strNew;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbbccdddd";
		System.out.println(compress(str));
		
	}

}
