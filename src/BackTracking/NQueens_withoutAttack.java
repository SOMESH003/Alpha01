package BackTracking;

public class NQueens_withoutAttack {
	
	public static void nQueens(char[][] board, int row) {
		if(row == board.length) {
			printArr(board);
			return;
		}
		
		for(int j=0; j<board.length; j++) {
			board[row][j] = 'Q';
			nQueens(board,row+1);
			board[row][j] = 'x';
		}
	}
	
	public static void printArr(char[][] board) {
		System.out.println("-----chess board-------");
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2; 
		char[][] board = new char[n][n];
		
		for(int i=0; i<board.length;i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j] = 'x';
			}
		}
		
		nQueens(board,0);
	}

}
