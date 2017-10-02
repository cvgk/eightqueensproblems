package test;

import implementation.ChessBoard;
import implementation.Queen;
import queenutils.QueenUtilities;

public class HeuristicTest {

	public static void main(String[] args) throws Exception
	{
		QueenUtilities utility = new QueenUtilities();
		ChessBoard board = new ChessBoard();
		Queen queen1 = new Queen("a8");
		Queen queen2 = new Queen("b3");
		Queen queen3 = new Queen("c1");
		Queen queen4 = new Queen("d7");
		//Queen queen5 = new Queen("e6");
		board.insertQueenToChessBoard(queen1);
		board.insertQueenToChessBoard(queen2);
		board.insertQueenToChessBoard(queen3);
		board.insertQueenToChessBoard(queen4);
		//board.insertQueenToChessBoard(queen5);
        System.out.println(utility.numberOfEffectedSquares(board.effected));
        utility.reset(board.effected);
        utility.reset(board.visited);
        System.out.println(utility.numberOfEffectedSquares(board.effected));
	}

}
