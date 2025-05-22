package BackTracking;

public class RateInAMaze_LexicographicallyMethod1 {
	public static void solve(int i, int j, int maze[][], int n, String move, int visitor[][]) {
		if (i == n - 1 && j == n - 1) {
			System.out.println(move);
			return;
		}

		// downward
		if (i + 1 < n && visitor[i + 1][j] == 0 && maze[i + 1][j] == 1) {
			visitor[i][j] = 1;
			solve(i + 1, j, maze, n, move + 'D', visitor);
			visitor[i][j] = 0;
		}

		// left
		if (j - 1 >= 0 && visitor[i][j - 1] == 0 && maze[i][j - 1] == 1) {
			visitor[i][j] = 1;
			solve(i, j - 1,maze, n, move + 'L', visitor);
			visitor[i][j] = 0;
		}

		// right
		if (j + 1 < n && visitor[i][j + 1] == 0 && maze[i][j + 1] == 1) {
			visitor[i][j] = 1;
			solve(i, j + 1, maze, n, move + 'R', visitor);
			visitor[i][j] = 0;
		}

		// upward
		if (i - 1 >= 0 && visitor[i - 1][j] == 0 && maze[i - 1][j] == 1) {
			visitor[i][j] = 1;
			solve(i - 1, j, maze, n, move + 'U', visitor);
			visitor[i][j] = 0;
		}
	}

	public static void findPath(int[][] maze, int n) {
		int visitor[][] = new int[n][n];
		
		if (maze[0][0] == 1) {
			solve(0, 0, maze, n, "", visitor);
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
	    int[][] maze = {{1,0,0,0},
	    			    {1,1,0,1},
	    			    {1,1,0,0},
	    			    {0,1,1,1}};

	    findPath(maze, n);	    
	  }
}


