package QueuePackage;
import java.util.*;

public class GenerateBinaryNumbers {
	public static void generatePrintBinary(int n) {
		Queue<String> q = new LinkedList<>();
		q.add("1");
		
		while(n-- > 0) {
			String str = q.peek();
			q.remove();
			System.out.println(str);
			
			String str2 = str;
			
			q.add(str + "0");
			
			q.add(str2 + "1");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		generatePrintBinary(n);
	}

}
