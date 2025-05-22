package String;
import java.util.*;

public class ShortestPathToDestination {
	public static float shortestPath(String path) {
		int x1 = 0, x2 = 0;
		int y1 = 0, y2 = 0;
		for(int i=0; i<path.length(); i++) {
			if(path.charAt(i) == 'E') {
				x2++;
			}
			else if(path.charAt(i) == 'W') {
				x2--;
			}
			else if(path.charAt(i) == 'N') {
				y2++;
			}
			else {
				y2--;
			}
		}
		int x = x2-x1;
		int y = y2-y1;
		float dis  = (float)Math.sqrt(x*x + y*y);
		return dis;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "WNEENESENNN";
		System.out.println(shortestPath(path));
	}

}
