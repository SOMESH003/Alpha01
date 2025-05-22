package Hashing;
import java.util.*;
public class Equal_Digit_Count_and_Digit_Value {
	public static boolean digitCount(String num) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<num.length(); i++){
			Integer ch = num.charAt(i)-'0';
			map.put(ch, map.getOrDefault(ch,0) + 1);
	    }

        
        for(int i=0; i<num.length(); i++){
            Integer n = num.charAt(i)-'0';
            if(map.getOrDefault(i,0) != n){
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1210";
		System.out.println(digitCount(num));
	}

}
