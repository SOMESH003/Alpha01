package String;

public class ConvertFirstLetterToUpperCase {
	public static String toUpperCase(String str) {
		StringBuilder sb = new StringBuilder("");
		
		sb.append(Character.toUpperCase(str.charAt(0)));
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == ' ' && i<str.length()-1) {
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi, i am shraddha";
		System.out.println(toUpperCase(str));
	}

}
