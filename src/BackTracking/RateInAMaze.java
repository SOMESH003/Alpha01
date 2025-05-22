package BackTracking;

public class RateInAMaze {
	public static boolean isSafe(int[][] maze, int i, int j, int n) {
		if(i<n && j<n && maze[i][j] == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean findPath(int[][] maze, int i, int j, int n, int [][] sol) {
		if(i==n-1 && j==n-1) {
			sol[i][j]=1;
			return true;
		}
		
		if(isSafe(maze,i,j,n)) {
			sol[i][j] = 1;
			if(findPath(maze, i+1, j, n, sol)) {
				return true;
			}
			if(findPath(maze, i, j+1, n, sol)) {
				return true;
			}
			sol[i][i] = 0;
			return false;	
		}
		return false;
	}
	
	public static void printMaze(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 0, 0, 0 },
					   	 { 1, 1, 0, 1 },
					   	 { 0, 1, 0, 0 },
					   	 { 1, 1, 1, 1 } };
		int[][] sol = new int[maze.length][maze.length];
		printMaze(maze);
		
		if(findPath(maze, 0, 0, maze.length, sol)) {
			System.out.println("\npath is possible");
			printMaze(sol);
		}
		else {
			System.out.println("path not possible");
		}
		
	}

}
