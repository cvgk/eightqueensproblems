package test;

import queenexceptions.QueenException;
import implementation.Queen;






public class Test {

	public static void main(String[] args) {
		try {
			Queen queen1 = new Queen("a8");
			Queen queen2 = new Queen("b2");
			Queen queen3 = new Queen("c4");
			Queen queen4 = new Queen("d6");
			Queen queen5 = new Queen("a6");
			System.out.println(queen1);
			System.out.println(queen2);
			System.out.println(queen3);
			System.out.println(queen4);
			System.out.println(queen5);
		} catch (QueenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
