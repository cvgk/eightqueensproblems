package test;

import queenexceptions.QueenException;
import implementation.ChessBoard;
import implementation.Queen;

public class QueenLocationConstructionTest {

	public static void main(String[] args) {
		ChessBoard board = new ChessBoard();
		try {
			board.insertQueenToChessBoard(new Queen("a8"));
			board.insertQueenToChessBoard(new Queen("b2"));
			board.insertQueenToChessBoard(new Queen("c4"));
			board.insertQueenToChessBoard(new Queen("d1"));
		} catch (QueenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<board.effected.length;i++)
		{
			for(int j=0;j<board.effected[i].length;j++)
			{
				System.out.print(board.effected[i][j]+" ");
			}
			System.out.println();
		}

	}

}
