package BackTracking;

public class Sudoku {
	public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
		//column
		for(int i=0; i<sudoku.length; i++) {
			if(sudoku[i][col] == digit) {
				return false;
			}
		}
		
		//row
		for(int i=0; i<sudoku.length; i++) {
			if(sudoku[row][i] == digit) {
				return false;
			}
		}
		
		//grid
		int sr = (row/3) * 3;
		int sc = (col/3) * 3;
		for(int i=0; i<sudoku.length; i++) {
			for(int j=0; j<sudoku.length; j++) {
				if(sudoku[sr][sc] == digit) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean sudokuSolver(int sudoku[][], int row, int col) {
		if(row == sudoku.length && col == 0) {
			return true;
		}
		
		int newRow = row, newCol = col+1;
		if(col+1 == sudoku.length) {
			newRow = row+1;
			newCol = 0;
		}
		
		if(sudoku[row][col] != 0) {
			return sudokuSolver(sudoku, newRow, newCol);
		}
		for(int digit=1; digit<=9; digit++) {
			if(isSafe(sudoku,row,col,digit)) {
				sudoku[row][col] = digit;
				if(sudokuSolver(sudoku, newRow, newCol)) {
					return true;
				}
				sudoku[row][col] = 0;
			}
		}
		return false;
	}
	
	public static void printSudoku(int[][] sudoku) {
		for(int i=0; i<sudoku.length; i++) {
			for(int j=0; j<sudoku.length; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sudoku = {{0,0,8,0,0,0,0,0,0},
				{4,9,0,1,5,7,0,0,2},
				{0,0,3,0,0,4,1,9,0},
				{1,8,5,0,6,0,0,2,0},
				{0,0,0,0,2,0,0,6,0},
				{9,6,0,4,0,5,3,0,0},
				{0,3,0,0,7,2,0,0,4},
				{0,4,9,0,3,0,0,5,7},
				{8,2,7,0,0,9,0,1,3}};
		
		if(sudokuSolver(sudoku, 0, 0)) {
			System.out.println("Solution exists");
			printSudoku(sudoku);
		}
		else {
			System.out.println("Solution does not exist");
		}
	}
}

