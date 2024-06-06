package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //A peça ainda não está no tabuleiro
	}
	
	protected Board getBoard() {
		return board;
	} //-> O tabuleiro não pode ser modificado, por isso a ausência do set
}
