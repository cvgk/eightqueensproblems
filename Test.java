package deneme;

import java.util.*;

public class Test {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Chessboard board = new Chessboard();
        try {

               for(int i=0;i<8;i++) {
                   List<String> availableSquares = board.checkAvailableSquares(i);
                   if(availableSquares.isEmpty())
                   {
                       i = 0;
                       board.board = new int[8][8];
                       availableSquares = board.checkAvailableSquares(i);
                   }
                   System.out.println(availableSquares);
                   String location = scanner.nextLine();
                   boolean result = availableSquares.stream().filter(s->s.equalsIgnoreCase(location)).
                           findAny().isEmpty();

                   Queen queen = new Queen(location);
                   board.insertQueenIntoChessBoard(queen);
                   if(result){
                       throw new QueenException("this square is not available");
                   }
               }



        }catch(QueenException e)
        {
            System.err.println(e.getMessage());
        }
        for(int[] a:board.board)
        {

            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

}

class QueenException extends Exception
{
    public QueenException(String message)
    {
        super(message);
    }
}
class Queen
{
    private final String location;

    private static int count = 1;
    public Queen(String location) throws QueenException
    {
        location = location.toLowerCase();
        if(location.length()==2) {
            if(location.startsWith("a")||location.startsWith("b")||location.startsWith("c")||
                location.startsWith("d")||location.startsWith("e")||location.startsWith("f")||
                location.startsWith("g")||location.startsWith("h")){
                if(location.endsWith("1")||location.endsWith("2")||location.endsWith("3")||
                    location.endsWith("4")||location.endsWith("5")||location.endsWith("6")||
                     location.endsWith("7")||location.endsWith("8")){
                      this.location = location;

                }
                else{
                    throw new QueenException("location must end 1,2,3,4,5,6,7,8");
                }
            }else{
                throw new QueenException("location must start a,b,c,d,e,f,g,h");
            }
        }
        else{
            throw new QueenException("location must be 2");}
    }

    public String getLocation() {  return location; }

    public String toString()
    {

        if(location.startsWith("a"))
        {
            count = 1;
        }
        return "Queen " + count++;
    }
}
class Chessboard{
    int[][] board = new int[8][8];
    private int horizontal;
    private int vertical;
    public void insertQueenIntoChessBoard(Queen queen)
    {
        String location = queen.getLocation();
        switchBoard(location);
        board[vertical][horizontal] = 1;
        effectedSquares(vertical,horizontal);

    }
    public List<String> checkAvailableSquares(int horizontal)
    {
        List<String> availableSquares = new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            if(board[i][horizontal]==0)
            {
                String location = convert(i,horizontal);
                availableSquares.add(location);
            }
        }
        return availableSquares;
    }
    private String convert(int vertical,int horizontal)
    {
        if(vertical==0&&horizontal==0)
        {
            return "a8";
        }else if(vertical==1&&horizontal==0)
        {
            return "a7";
        }else if(vertical==2&&horizontal==0)
        {
            return "a6";
        }else if(vertical==3&&horizontal==0)
        {
            return "a5";
        }else if(vertical==4&&horizontal==0)
        {
            return "a4";
        }else if(vertical==5&&horizontal==0)
        {
            return "a3";
        }else if(vertical==6&&horizontal==0)
        {
            return "a2";
        }else if(vertical==7&&horizontal==0)
        {
            return "a1";
        }else if(vertical==0&&horizontal==1)
        {
            return "b8";
        }else if(vertical==1&&horizontal==1)
        {
            return "b7";
        }else if(vertical==2&&horizontal==1)
          {
            return "b6";
        }else if(vertical==3&&horizontal==1)
        {
            return "b5";
        }else if(vertical==4&&horizontal==1)
        {
             return "b4";
        }else if(vertical==5&&horizontal==1)
         {
             return "b3";
         }else if(vertical==6&&horizontal==1)
         {
             return "b2";
         }else if(vertical==7&&horizontal==1)
         {
            return "b1";
         }else if(vertical==0&&horizontal==2)
        {
            return "c8";
        }else if(vertical==1&&horizontal==2)
        {
            return "c7";
        }else if(vertical==2&&horizontal==2)
        {
            return "c6";
        }else if(vertical==3&&horizontal==2)
        {
            return "c5";
        }else if(vertical==4&&horizontal==2)
        {
            return "c4";
        }else if(vertical==5&&horizontal==2)
        {
            return "c3";
        }else if(vertical==6&&horizontal==2)
        {
            return "c2";
        }else if(vertical==7&&horizontal==2)
        {
            return "c1";
        }else if(vertical==0&&horizontal==3)
        {
            return "d8";
        }else if(vertical==1&&horizontal==3)
        {
            return "d7";
        }else if(vertical==2&&horizontal==3)
        {
            return "d6";
        }else if(vertical==3&&horizontal==3)
        {
            return "d5";
        }else if(vertical==4&&horizontal==3)
        {
            return "d4";
        }else if(vertical==5&&horizontal==3)
        {
            return "d3";
        }else if(vertical==6&&horizontal==3)
        {
            return "d2";
        }else if(vertical==7&&horizontal==3)
        {
            return "d1";
        }else if(vertical==0&&horizontal==4)
        {
            return "e8";
        }else if(vertical==1&&horizontal==4)
        {
            return "e7";
        }else if(vertical==2&&horizontal==4)
        {
            return "e6";
        }else if(vertical==3&&horizontal==4)
        {
            return "e5";
        }else if(vertical==4&&horizontal==4)
        {
            return "e4";
        }else if(vertical==5&&horizontal==4)
        {
            return "e3";
        }else if(vertical==6&&horizontal==4)
        {
            return "e2";
        }else if(vertical==7&&horizontal==4)
        {
            return "e1";
        }else if(vertical==0&&horizontal==5)
        {
            return "f8";
        }else if(vertical==1&&horizontal==5)
        {
            return "f7";
        }else if(vertical==2&&horizontal==5)
        {
            return "f6";
        }else if(vertical==3&&horizontal==5)
        {
            return "f5";
        }else if(vertical==4&&horizontal==5)
        {
            return "f4";
        }else if(vertical==5&&horizontal==5)
        {
            return "f3";
        }else if(vertical==6&&horizontal==5)
        {
            return "f2";
        }else if(vertical==7&&horizontal==5)
        {
            return "f1";
        }else if(vertical==0&&horizontal==6)
        {
            return "g8";
        }else if(vertical==1&&horizontal==6)
        {
            return "g7";
        }else if(vertical==2&&horizontal==6)
        {
            return "g6";
        }else if(vertical==3&&horizontal==6)
        {
            return "g5";
        }else if(vertical==4&&horizontal==6)
        {
            return "g4";
        }else if(vertical==5&&horizontal==6)
        {
            return "g3";
        }else if(vertical==6&&horizontal==6)
        {
            return "g2";
        }else if(vertical==7&&horizontal==6)
        {
            return "g1";
        }else if(vertical==0&&horizontal==7)
        {
            return "h8";
        }else if(vertical==1&&horizontal==7)
        {
            return "h7";
        }else if(vertical==2&&horizontal==7)
        {
            return "h6";
        }else if(vertical==3&&horizontal==7)
        {
            return "h5";
        }else if(vertical==4&&horizontal==7)
        {
            return "h4";
        }else if(vertical==5&&horizontal==7)
        {
            return "h3";
        }else if(vertical==6&&horizontal==7)
        {
            return "h2";
        }else if(vertical==7&&horizontal==7)
        {
            return "h1";
        }
        return "";
    }
    public void effectedSquares(int vertical,int horizontal)
    {
        for(int i=0;i<8;i++)
        {
            if(board[vertical][i]!=1)
            {
                board[vertical][i] = 2;
            }
        }
        for(int i=0;i<8;i++)
        {
            if(board[i][horizontal]!=1)
            {
                board[i][horizontal] = 2;
            }
        }
        for(int i=vertical,j=horizontal;i<8&&j<8;i++,j++)
        {
            if(board[i][j]!=1)
            {
                board[i][j] = 2;
            }
        }
        for(int i=vertical,j=horizontal;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]!=1)
            {
                board[i][j] = 2;
            }
        }
        for(int i=vertical,j=horizontal;i>=0&&j<8;i--,j++)
        {
            if(board[i][j]!=1)
            {
                board[i][j] = 2;
            }
        }
        for(int i=vertical,j=horizontal;i<8&&j>=0;i++,j--)
        {
            if(board[i][j]!=1)
            {
                board[i][j] = 2;
            }
        }
    }
    public void switchBoard(String location)
    {
        switch(location)
        {
            case "a8": vertical =0; horizontal=0; break;
            case "a7": vertical =1; horizontal=0; break;
            case "a6": vertical =2; horizontal=0; break;
            case "a5": vertical =3; horizontal=0; break;
            case "a4": vertical =4; horizontal=0; break;
            case "a3": vertical =5; horizontal=0; break;
            case "a2": vertical =6; horizontal=0; break;
            case "a1": vertical =7; horizontal=0; break;
            case "b8": vertical =0; horizontal=1; break;
            case "b7": vertical =1; horizontal=1; break;
            case "b6": vertical =2; horizontal=1; break;
            case "b5": vertical =3; horizontal=1; break;
            case "b4": vertical =4; horizontal=1; break;
            case "b3": vertical =5; horizontal=1; break;
            case "b2": vertical =6; horizontal=1; break;
            case "b1": vertical =7; horizontal=1; break;
            case "c8": vertical =0; horizontal=2; break;
            case "c7": vertical =1; horizontal=2; break;
            case "c6": vertical =2; horizontal=2; break;
            case "c5": vertical =3; horizontal=2; break;
            case "c4": vertical =4; horizontal=2; break;
            case "c3": vertical =5; horizontal=2; break;
            case "c2": vertical =6; horizontal=2; break;
            case "c1": vertical =7; horizontal=2; break;
            case "d8": vertical =0; horizontal=3; break;
            case "d7": vertical =1; horizontal=3; break;
            case "d6": vertical =2; horizontal=3; break;
            case "d5": vertical =3; horizontal=3; break;
            case "d4": vertical=4; horizontal=3; break;
            case "d3": vertical =5; horizontal=3; break;
            case "d2": vertical =6; horizontal=3; break;
            case "d1": vertical =7; horizontal=3; break;
            case "e8": vertical =0; horizontal=4; break;
            case "e7": vertical =1; horizontal=4; break;
            case "e6": vertical =2; horizontal=4; break;
            case "e5": vertical =3; horizontal=4; break;
            case "e4": vertical =4; horizontal=4; break;
            case "e3": vertical =5; horizontal=4; break;
            case "e2": vertical =6; horizontal=4; break;
            case "e1": vertical =7; horizontal=4; break;
            case "f8": vertical =0; horizontal=5; break;
            case "f7": vertical =1; horizontal=5; break;
            case "f6": vertical=2; horizontal=5; break;
            case "f5": vertical =3; horizontal=5; break;
            case "f4": vertical =4; horizontal=5; break;
            case "f3": vertical =5; horizontal=5; break;
            case "f2": vertical=6; horizontal=5; break;
            case "f1": vertical =7; horizontal=5; break;
            case "g8": vertical =0; horizontal=6; break;
            case "g7": vertical =1; horizontal=6; break;
            case "g6": vertical =2; horizontal=6; break;
            case "g5": vertical =3; horizontal=6; break;
            case "g4": vertical =4; horizontal=6; break;
            case "g3": vertical =5; horizontal=6; break;
            case "g2": vertical =6; horizontal=6; break;
            case "g1": vertical =7; horizontal=6; break;
            case "h8": vertical =0; horizontal=7; break;
            case "h7": vertical =1; horizontal=7; break;
            case "h6": vertical =2; horizontal=7; break;
            case "h5": vertical =3; horizontal=7; break;
            case "h4": vertical =4; horizontal=7; break;
            case "h3": vertical =5; horizontal=7; break;
            case "h2": vertical =6; horizontal=7; break;
            case "h1": vertical =7; horizontal=7; break;
            default: throw new IllegalArgumentException("...");
        }
    }
}