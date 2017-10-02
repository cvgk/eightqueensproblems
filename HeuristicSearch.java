package implementation;

import java.util.ArrayList;

import queenexceptions.QueenException;
import queenutils.QueenUtilities;


public class HeuristicSearch {
      private ChessBoard board = new ChessBoard();
      
      public void insertQueen(String location) throws QueenException
      {
    	  board.insertQueenToChessBoard(new Queen(location));
      }
      public ArrayList<String> showAvailableSquareinColumn(String column)
       throws QueenException
      {
    	  ArrayList<String> list = new ArrayList<String>();
    	  QueenUtilities utility = new QueenUtilities();
    	  int j=0;
    	  for(int i=0;i<board.effected.length;i++)
    	  {
    		  switch(column) {
    		  case "b":  j=1; break;
    		  case "c":  j=2; break;
    		  case "d":  j=3; break;
    		  case "e":  j=4; break;
    		  case "f":  j=5; break;
    		  case "g":  j=6; break;
    		  case "h":  j=7; break;
    		  }
    		  if(board.effected[i][j]==false)
    		  {
    			  String s = utility.converter(i, j);
    			  list.add(s);
    		  }
    	  }
    	  if(list.isEmpty())
    		  throw new QueenException
    		  ("This column must have some elements go start again");
    	  return list;
      }
      
      public void showAvailableSquares()
      {
    	  boolean array[][] = board.effected;
    	  for(int i=0;i<array.length;i++)
    	  {
    		  for(int j=0;j<array[i].length;j++)
    		  {
    			  if(array[i][j]==true)
    				  System.out.print(array[i][j]+"  ");
    			  else
    				  System.out.print(array[i][j]+" ");
    		  }
    		  System.out.println();
    	  }
      }
      
}
