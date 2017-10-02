package implementation;

import java.util.Stack;

import queenexceptions.QueenException;

public class DFSTest {

	public static void main(String[] args) {
		try {
			Stack<Queen> stack = new Stack<Queen>();
			DepthFirstSearchImplementation imp = 
					new DepthFirstSearchImplementation();
			imp.push(stack, new Queen("a8"));
			System.out.println("Stack: "+stack);
			imp.push(stack, new Queen("b2"));
			System.out.println("Stack: "+stack);
			imp.push(stack, new Queen("c4"));
			System.out.println("Stack: "+stack);
			imp.push(stack, new Queen("d1"));
			System.out.println("Stack: "+stack);
			imp.push(stack, new Queen("e7"));
			System.out.println("Stack: "+stack);
			imp.push(stack, new Queen("f5"));
			System.out.println("Stack: "+stack);
			imp.push(stack, new Queen("g3"));
			System.out.println("Stack: "+stack);
			imp.push(stack, new Queen("h6"));
			System.out.println("Stack: "+stack);
			imp.pop(stack);
			imp.pop(stack);
			imp.pop(stack);
			imp.pop(stack);
			imp.pop(stack);
			imp.pop(stack);
			imp.pop(stack);
			imp.pop(stack);
			System.out.println("Stack "+stack);
			System.out.println("Stack is empty");
			
		} catch (QueenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
