package String;

public class CountLowercaseVowels {
	public static int countLowercaseVowels(String str) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello everyone, I am somesh sunar";
		System.out.println("Total Lowercase Vowels in String : " + countLowercaseVowels(str));
	}

}
