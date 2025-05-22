package Functions;

public class hollowRhombus {
	public static void hollowRhombus(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hollowRhombus(5);
	}

}
