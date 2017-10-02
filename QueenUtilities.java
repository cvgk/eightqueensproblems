package queenutils;



public class QueenUtilities {
    
	public  boolean[][] reset(boolean[][] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j] = false;
			}
		}
		return array;
	}
	public int numberOfEffectedSquares(boolean[][] array)
	{
		int count = 0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				if(array[i][j]==true)
					count++;
			}
		}
		return count;
	}
	public String converter(int i,int j)
    {
  	  if(i==0&&j==0)
  		  return "a8";
  	  if(i==1&&j==0)
  		  return "a7";
  	  if(i==2&&j==0)
  		  return "a6";
  	  if(i==3&&j==0)
  		  return "a5";
  	  if(i==4&&j==0)
  		  return "a4";
  	  if(i==5&&j==0)
  		  return "a3";
  	  if(i==6&&j==0)
  		  return "a2";
  	  if(i==7&&j==0)
  		  return "a1";
  	  if(i==0&&j==1)
  		  return "b8";
  	  if(i==1&&j==1)
  		  return "b7";
  	  if(i==2&&j==1)
  		  return "b6";
  	  if(i==3&&j==1)
  		  return "b5";
  	  if(i==4&&j==1)
  		  return "b4";
  	  if(i==5&&j==1)
  		  return "b3";
  	  if(i==6&&j==1)
  		  return "b2";
  	  if(i==7&&j==1)
  		  return "b1";
  	  if(i==0&&j==2)
  		  return "c8";
  	  if(i==1&&j==2)
  		  return "c7";
  	  if(i==2&&j==2)
  		  return "c6";
  	  if(i==3&&j==2)
  		  return "c5";
  	  if(i==4&&j==2)
  		  return "c4";
  	  if(i==5&&j==2)
  		  return "c3";
  	  if(i==6&&j==2)
  		  return "c2";
  	  if(i==7&&j==2)
  		  return "c1";
  	  if(i==0&&j==3)
  		  return "d8";
  	  if(i==1&&j==3)
  		  return "d7";
  	  if(i==2&&j==3)
  		  return "d6";
  	  if(i==3&&j==3)
  		  return "d5";
  	  if(i==4&&j==3)
  		  return "d4";
  	  if(i==5&&j==3)
  		  return "d3";
  	  if(i==6&&j==3)
  		  return "d2";
  	  if(i==7&&j==3)
  		  return "d1";
  	  if(i==0&&j==4)
  		  return "e8";
  	  if(i==1&&j==4)
  		  return "e7";
  	  if(i==2&&j==4)
  		  return "e6";
  	  if(i==3&&j==4)
  		  return "e5";
  	  if(i==4&&j==4)
  		  return "e4";
  	  if(i==5&&j==4)
  		  return "e3";
  	  if(i==6&&j==4)
  		  return "e2";
  	  if(i==7&&j==4)
  		  return "e1";
  	  if(i==0&&j==5)
  		  return "f8";
  	  if(i==1&&j==5)
  		  return "f7";
  	  if(i==2&&j==5)
  		  return "f6";
  	  if(i==3&&j==5)
  		  return "f5";
  	  if(i==4&&j==5)
  		  return "f4";
  	  if(i==5&&j==5)
  		  return "f3";
  	  if(i==6&&j==5)
  		  return "f2";
  	  if(i==7&&j==5)
  		  return "f1";
  	  if(i==0&&j==6)
  		  return "g8";
  	  if(i==1&&j==6)
  		  return "g7";
  	  if(i==2&&j==6)
  		  return "g6";
  	  if(i==3&&j==6)
  		  return "g5";
  	  if(i==4&&j==6)
  		  return "g4";
  	  if(i==5&&j==6)
  		  return "g3";
  	  if(i==6&&j==6)
  		  return "g2";
  	  if(i==7&&j==6)
  		  return "g1";
  	  if(i==0&&j==7)
  		  return "h8";
  	  if(i==1&&j==7)
  		  return "h7";
  	  if(i==2&&j==7)
  		  return "h6";
  	  if(i==3&&j==7)
  		  return "h5";
  	  if(i==4&&j==7)
  		  return "h4";
  	  if(i==5&&j==7)
  		  return "h3";
  	  if(i==6&&j==7)
  		  return "h2";
  	  if(i==7&&j==7)
  		  return "h1";
  	  else
  		  return "";
    }
}
