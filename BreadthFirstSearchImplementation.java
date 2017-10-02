package implementation;

import java.util.Queue;

import queenexceptions.QueenException;

public class BreadthFirstSearchImplementation implements BreadthFirstSearch
{
    private ChessBoard board = new ChessBoard();
	@Override
	public void add(Queue<Queen> queue, Queen queen) {
		queue.add(queen);
		queen.setVisited(true);
		try {
			board.insertQueenToChessBoard(queen);
		} catch (QueenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Queue<Queen> queue, Queen queen) {
		queue.remove(queen);
		
	}
      
}
