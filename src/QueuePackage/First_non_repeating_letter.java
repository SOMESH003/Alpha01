package QueuePackage;
import java.util.*;

public class First_non_repeating_letter {
	public static void firstNonRepeatingLetter(String str) {
		int[] freq = new int[26];
		Queue<Character> q = new LinkedList<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			q.add(ch);
			freq[ch-'a']++;
			
			while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
				q.remove();
			}
			if(q.isEmpty()) {
				System.out.print(-1 + " ");
			}else {
				System.out.print(q.peek()+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabccxb";
		firstNonRepeatingLetter(str);
	}

}
