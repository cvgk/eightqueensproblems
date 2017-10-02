package implementation;

import java.util.Scanner;

import queenexceptions.QueenException;



public class HSTest {

	public static void main(String[] args) {
		HeuristicSearch hs = new HeuristicSearch();
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter first location: ");
			String location1 =scanner.nextLine();
			hs.insertQueen(location1);
			System.out.println("Available squares "+hs.showAvailableSquareinColumn("b"));
			System.out.print("Enter second location: ");
			String location2 = scanner.nextLine();
			hs.insertQueen(location2);
			System.out.println("Available squares "+hs.showAvailableSquareinColumn("c"));
			System.out.print("Enter third location: ");
			String location3 =scanner.nextLine();
			hs.insertQueen(location3);
			System.out.println("Available squares "+hs.showAvailableSquareinColumn("d"));
			System.out.print("Enter fourth location: ");
			String location4 = scanner.nextLine();
			hs.insertQueen(location4);
			System.out.println("Available squares "+hs.showAvailableSquareinColumn("e"));
			System.out.print("Enter fifth location: ");
			String location5 =scanner.nextLine();
			hs.insertQueen(location5);
			System.out.println("Available squares "+hs.showAvailableSquareinColumn("f"));
			System.out.print("Enter sixth location: ");
			String location6 = scanner.nextLine();
			hs.insertQueen(location6);
			System.out.println("Available squares "+hs.showAvailableSquareinColumn("g"));
			System.out.print("Enter seventh location: ");
			String location7 =scanner.nextLine();
			hs.insertQueen(location7);
			System.out.println("Available squares "+hs.showAvailableSquareinColumn("h"));
			System.out.print("Enter eightth location: ");
			String location8 =scanner.nextLine();
			hs.insertQueen(location8);
			System.out.println("congrutulations solution found.");
		    scanner.close();
		} catch (QueenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
