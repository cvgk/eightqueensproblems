package implementation;

import java.util.Stack;

import queenexceptions.QueenException;

public interface DepthFirstSearch extends Search {
	public abstract void push(Stack<Queen> stack,Queen queen) throws QueenException;
	public abstract void pop(Stack<Queen> stack);
}
