package OOPs;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queen q = new Queen();
		q.moves();

	}

}

interface ChessPlayer{
	void moves();
}

class Queen implements ChessPlayer{
	public void moves() {
		System.out.println("Up, Down, Left, Right, Diagonal - (in all 4 directions)");
	}
}

class Rook implements ChessPlayer{
	public void moves() {
		System.out.println("Up, Down, Left, Right");
	}
}

class King implements ChessPlayer{
	public void moves() {
		System.out.println("Up, Down, Left, Right, Diagonal - (by 1 Step");
	}
}
