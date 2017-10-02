package test;

import queenexceptions.QueenException;
import implementation.ChessBoard;
import implementation.Queen;

public class TestCurrently {

	public static void main(String[] args) {
		try {
			Queen queen1 = new Queen("A8");
			Queen queen2 = new Queen("b2");
			Queen queen3 = new Queen("c4");
			Queen queen4 = new Queen("d1");
			ChessBoard board = new ChessBoard();
			board.insertQueenToChessBoard(queen1);
			board.insertQueenToChessBoard(queen2);
			board.insertQueenToChessBoard(queen3);
			board.insertQueenToChessBoard(queen4);
			for(boolean[] array:board.effected)
			{
				for(boolean b:array)
				{
					if(b==true)
					System.out.print(b+"  ");
					else
						System.out.print(b+" ");	
				}
				System.out.println();
			}
		}catch(QueenException e) {
			e.printStackTrace();
		}
		
    }

}
