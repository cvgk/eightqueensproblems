
package ocp;
import java.util.*;

public class Chessboard {
    private static  int[][] chessboard = new int[8][8];
  
    public static void main(String[] args) throws QueenException
    {
      
      Scanner scanner = new Scanner(System.in);
      int count = 0;
      boolean situation = true;
      while(situation)
      {
          List<String> list = new ArrayList<>();
          
          for(int i=0;i<8;i++)
         {
             if(chessboard[i][count]==0)
             {
               String location = convert(i,count);
               list.add(location);  
             }
             
         }
         
          if(list.isEmpty())
          {
                 count = 0;
                 chessboard = new int[8][8];
                 continue; 
                  
          }
          System.out.print("choose a location: "+list);
          String preference = scanner.nextLine();
          Queen queen = new Queen(preference);
          insertQueen(queen);
          count++;
          if(count ==8)
          {
              System.out.println("you find solution.");
              situation = false;
          }
              
      }
      
    }
    private static String convert(int x,int y)
    {
        if(x==0&&y==0)
            return "a8";
        else if(x==1&&y==0)
            return "a7";
        else if(x==2&&y==0)
            return "a6";
        else if(x==3&&y==0)
            return "a5";
        else if(x==4&&y==0)
            return "a4";
        else if(x==5&&y==0)
            return "a3";
        else if(x==6&&y==0)
            return "a2";
        else if(x==7&&y==0)
            return "a1";
        else if(x==0&&y==1)
            return "b8";
        else if(x==1&&y==1)
            return "b7";
        else if(x==2&&y==1)
            return "b6";
        else if(x==3&&y==1)
            return "b5";
        else if(x==4&&y==1)
            return "b4";
        else if(x==5&&y==1)
            return "b3";
        else if(x==6&&y==1)
            return "b2";
        else if(x==7&&y==1)
            return "b1";
        else if(x==0&&y==2)
            return "c8";
        else if(x==1&&y==2)
            return "c7";
        else if(x==2&&y==2)
            return "c6";
        else if(x==3&&y==2)
            return "c5";
        else if(x==4&&y==2)
            return "c4";
        else if(x==5&&y==2)
            return "c3";
        else if(x==6&&y==2)
            return "c2";
        else if(x==7&&y==2)
            return "c1";
        else if(x==0&&y==3)
            return "d8";
        else if(x==1&&y==3)
            return "d7";
        else if(x==2&&y==3)
            return "d6";
        else if(x==3&&y==3)
            return "d5";
        else if(x==4&&y==3)
            return "d4";
        else if(x==5&&y==3)
            return "d3";
        else if(x==6&&y==3)
            return "d2";
        else if(x==7&&y==3)
            return "d1";
        else if(x==0&&y==4)
            return "e8";
        else if(x==1&&y==4)
            return "e7";
        else if(x==2&&y==4)
            return "e6";
        else if(x==3&&y==4)
            return "e5";
        else if(x==4&&y==4)
            return "e4";
        else if(x==5&&y==4)
            return "e3";
        else if(x==6&&y==4)
            return "e2";
        else if(x==7&&y==4)
            return "e1";
        else if(x==0&&y==5)
            return "f8";
        else if(x==1&&y==5)
            return "f7";
        else if(x==2&&y==5)
            return "f6";
        else if(x==3&&y==5)
            return "f5";
        else if(x==4&&y==5)
            return "f4";
        else if(x==5&&y==5)
            return "f3";
        else if(x==6&&y==5)
            return "f2";
        else if(x==7&&y==5)
            return "f1";
        else if(x==0&&y==6)
            return "g8";
        else if(x==1&&y==6)
            return "g7";
        else if(x==2&&y==6)
            return "g6";
        else if(x==3&&y==6)
            return "g5";
        else if(x==4&&y==6)
            return "g4";
        else if(x==5&&y==6)
            return "g3";
        else if(x==6&&y==6)
            return "g2";
        else if(x==7&&y==6)
            return "g1";
        else if(x==0&&y==7)
            return "h8";
        else if(x==1&&y==7)
            return "h7";
        else if(x==2&&y==7)
            return "h6";
        else if(x==3&&y==7)
            return "h5";
        else if(x==4&&y==7)
            return "h4";
        else if(x==5&&y==7)
            return "h3";
        else if(x==6&&y==7)
            return "h2";
        else if(x==7&&y==7)
            return "h1";
        return "";
    }
    public static void insertQueen(Queen queen)
    {
        int x = queen.getX();
        int y = queen.getY();
        chessboard[x][y] = 2;
        for(int i=x,j=y;i>=0&&j>=0;i--,j--)
        {
            if(chessboard[i][j]==0)
            chessboard[i][j] = 1;
        }
        for(int i=x,j=y;i<8&&j<8;i++,j++)
        {
            if(chessboard[i][j]==0)
            chessboard[i][j] = 1;
        }
        for(int i=x,j=y;i<8&&j>=0;i++,j--)
        {
            if(chessboard[i][j]==0)
            chessboard[i][j] = 1;
        }
        for(int i=x,j=y;i>=0&&j<8;i--,j++)
        {
            if(chessboard[i][j]==0)
            chessboard[i][j] = 1;
        }
        for(int i=0;i<8;i++)
        {
            if(chessboard[i][y]==0)
              chessboard[i][y]=1;     
        }
        for(int i=0;i<8;i++)
        {
            if(chessboard[x][i]==0)
              chessboard[x][i]=1;     
        }
    }
}
class Queen {
    private int x;
    private int y;
    public Queen(String location) throws QueenException
    {
        if(location.length()!=2)
            throw new QueenException("location length must be two!");
        location = location.toLowerCase();
        switch(location)
        {
            case "a8": x= 0;y = 0; break;
            case "a7": x= 1;y = 0; break;
            case "a6": x= 2;y = 0; break;
            case "a5": x= 3;y = 0; break;
            case "a4": x= 4;y = 0; break;
            case "a3": x= 5;y = 0; break;
            case "a2": x= 6;y = 0; break;
            case "a1": x= 7;y = 0; break;
            case "b8": x= 0;y = 1; break;
            case "b7": x= 1;y = 1; break;
            case "b6": x= 2;y = 1; break;
            case "b5": x= 3;y = 1; break;
            case "b4": x= 4;y = 1; break;
            case "b3": x= 5;y = 1; break;
            case "b2": x= 6;y = 1; break;
            case "b1": x= 7;y = 1; break;
            case "c8": x= 0;y = 2; break;
            case "c7": x= 1;y = 2; break;
            case "c6": x= 2;y = 2; break;
            case "c5": x= 3;y = 2; break;
            case "c4": x= 4;y = 2; break;
            case "c3": x= 5;y = 2; break;
            case "c2": x= 6;y = 2; break;
            case "c1": x= 7;y = 2; break;
            case "d8": x= 0;y = 3; break;
            case "d7": x= 1;y = 3; break;
            case "d6": x= 2;y = 3; break;
            case "d5": x= 3;y = 3; break;
            case "d4": x= 4;y = 3; break;
            case "d3": x= 5;y = 3; break;
            case "d2": x= 6;y = 3; break;
            case "d1": x= 7;y = 3; break;
            case "e8": x= 0;y = 4; break;
            case "e7": x= 1;y = 4; break;
            case "e6": x= 2;y = 4; break;
            case "e5": x= 3;y = 4; break;
            case "e4": x= 4;y = 4; break;
            case "e3": x= 5;y = 4; break;
            case "e2": x= 6;y = 4; break;
            case "e1": x= 7;y = 4; break;
            case "f8": x= 0;y = 5; break;
            case "f7": x= 1;y = 5; break;
            case "f6": x= 2;y = 5; break;
            case "f5": x= 3;y = 5; break;
            case "f4": x= 4;y = 5; break;
            case "f3": x= 5;y = 5; break;
            case "f2": x= 6;y = 5; break;
            case "f1": x= 7;y = 5; break;
            case "g8": x= 0;y = 6; break;
            case "g7": x= 1;y = 6; break;
            case "g6": x= 2;y = 6; break;
            case "g5": x= 3;y = 6; break;
            case "g4": x= 4;y = 6; break;
            case "g3": x= 5;y = 6; break;
            case "g2": x= 6;y = 6; break;
            case "g1": x= 7;y = 6; break;
            case "h8": x= 0;y = 7; break;
            case "h7": x= 1;y = 7; break;
            case "h6": x= 2;y = 7; break;
            case "h5": x= 3;y = 7; break;
            case "h4": x= 4;y = 7; break;
            case "h3": x= 5;y = 7; break;
            case "h2": x= 6;y = 7; break;
            case "h1": x= 7;y = 7; break;
            default: throw new QueenException("xxxx");
        }
    }
    
    public Queen(int x,int y) throws QueenException
    {
        if(x<1||x>8||y<1||y>8)
        {
            throw new QueenException("check the number you write");
        }
        this.x = x-1;
        this.y = y-1;
    }
    public void setX(int x){ this.x = x; }
    public int getX() { return x; }
    public void setY(int y){ this.y = y;  }
    public int getY() { return y; }
    
}
class QueenException extends Exception {
    public QueenException(String message)
    {
        super(message);
    }
}