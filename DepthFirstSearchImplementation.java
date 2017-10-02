package implementation;

import java.util.Stack;

import queenexceptions.QueenException;



public class DepthFirstSearchImplementation implements DepthFirstSearch {
    private ChessBoard board = new ChessBoard();
    @Override
    public void push(Stack<Queen> stack,Queen queen) throws QueenException
    {
    	if(Color.WHITE==queen.getColor()) {
    	queen.setColor(Color.GRAY);
    	stack.push(queen);
    	board.insertQueenToChessBoard(queen); }
    }
    @Override
    public void pop(Stack<Queen> stack)
    {
    	Queen q=stack.pop();
    	q.setColor(Color.BLACK);
    }
}
