package Functions;
import java.util.*;

public class HollowRectanglePattern {
	public static void hollowRectangle(int totalRow, int totalCol) {
		for(int i=1; i<=totalRow; i++) {
			for(int j=1; j<=totalCol;j++) {
				if(i==1 || i==totalRow || j==1 || j==totalCol) {
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter number of Columns : ");
		int colums = sc.nextInt();
		hollowRectangle(rows, colums);
	}

}
