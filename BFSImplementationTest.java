package implementation;

import java.util.LinkedList;
import java.util.Queue;

import queenexceptions.QueenException;

public class BFSImplementationTest {

	public static void main(String[] args) {
        try {
        	BreadthFirstSearchImplementation imp = 
    				new BreadthFirstSearchImplementation();
    		Queue<Queen> queue = new LinkedList<Queen>();
			Queen queen1 = new Queen("A8");
			Queen queen2 = new Queen("B2");
			Queen queen3 = new Queen("C4");
			Queen queen4 = new Queen("D1");
			Queen queen5 = new Queen("E7");
			Queen queen6 = new Queen("F5");
			Queen queen7 = new Queen("G3");
			Queen queen8 = new Queen("H6");
			imp.add(queue, queen1);
			System.out.println("Queue "+queue);
			imp.remove(queue, queen1);
			imp.add(queue, queen2);
			System.out.println("Queue "+queue);
			imp.remove(queue, queen2);
			imp.add(queue, queen3);
			System.out.println("Queue "+queue);
			imp.remove(queue, queen3);
			imp.add(queue, queen4);
			System.out.println("Queue "+queue);
			imp.remove(queue, queen4);
			imp.add(queue, queen5);
			System.out.println("Queue "+queue);
			imp.remove(queue, queen5);
			imp.add(queue, queen6);
			System.out.println("Queue "+queue);
			imp.remove(queue, queen6);
			imp.add(queue, queen7);
			System.out.println("Queue "+queue);
			imp.remove(queue, queen7);
			imp.add(queue, queen8);
			System.out.println("Queue "+queue);
			imp.remove(queue, queen8);
			System.out.println("Eight Queens are inserted and removed correctly");
			
		} catch (QueenException e) {
			e.printStackTrace();
		}
	}

}
