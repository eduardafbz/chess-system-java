package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8); //dimensão do tabuleiro de xadrez
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() { //Retorna uma peça de xadrez
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) { //Percorre a matriz de peças do tabuleiro e converte para peças de xadrez
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat; //retorna a matriz de peças da partida de xadrez
	}
	
	//Operação de colocar peças passando a posição nas coordenadas do xadrez
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//Responsável por iniciar a partida de xadrez
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.WHITE));
	}
}
