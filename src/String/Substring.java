package String;

public class Substring {
	public static String getSubstring(String str, int si, int ei) {
		String substr = "";
		for(int i=si; i<ei; i++) {
			substr += str.charAt(i);
		}
		return substr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloWorld";
		//System.out.println(getSubstring(str,0,7));
		System.out.println(str.substring(0, 7));
	}

}
