package implementation;

import queenexceptions.QueenException;

public class ChessBoard {
    public  int[][] locations = new int[8][8];
    //In MULTIDIMENSIONAL ARRAY IT WILL FIND WHERE IT IS
    public boolean[][] visited = new boolean[8][8];
    public boolean[][] effected = new boolean[8][8];
    private int xRowsAlphabets;
    private int yColumnsNumbers;
    public ChessBoard()
    {
    	int count =1;
    	for(int i=0;i<locations.length;i++)
    	{
    		for(int j=0;j<locations[i].length;j++)
    		{
    			locations[i][j] = count++;
    		}
    	}
    }
    public int findQueensExactPlaceInChessBoardArray(String location)
    {
    	if(location.equals("a8")||location.equals("A8"))
    	{
    		 xRowsAlphabets=0;
    		 yColumnsNumbers=0;
    		 return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("a7")||location.equals("A7"))
    	{
    		xRowsAlphabets=0;
    		yColumnsNumbers=1;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("a6")||location.equals("A6"))
    	{
    		xRowsAlphabets=0;
    		yColumnsNumbers=2;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("a5")||location.equals("A5"))
    	{
    		xRowsAlphabets=0;
    		yColumnsNumbers=3;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("a4")||location.equals("A4"))
    	{
    		xRowsAlphabets=0;
    		yColumnsNumbers=4;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("a3")||location.equals("A3"))
    	{
    		xRowsAlphabets=0;
    		yColumnsNumbers=5;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("a2")||location.equals("A2"))
    	{
    		xRowsAlphabets=0;
    		yColumnsNumbers=6;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("a1")||location.equals("A1"))
    	{
    		xRowsAlphabets=0;
    		yColumnsNumbers=7;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("b8")||location.equals("B8"))
    	{
    		xRowsAlphabets=1;
    		yColumnsNumbers=0;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("b7")||location.equals("B7"))
    	{
    		xRowsAlphabets=1;
    		yColumnsNumbers=1;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("b6")||location.equals("B6"))
    	{
    		xRowsAlphabets=1;
    		yColumnsNumbers=2;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("b5")||location.equals("B5"))
    	{
    		xRowsAlphabets=1;
    		yColumnsNumbers=3;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("b4")||location.equals("B4"))
    	{
    		xRowsAlphabets=1;
    		yColumnsNumbers=4;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("b3")||location.equals("B3"))
    	{
    		xRowsAlphabets=1;
    		yColumnsNumbers=5;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("b2")||location.equals("B2"))
    	{
    		xRowsAlphabets=1;
    		yColumnsNumbers=6;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("b1")||location.equals("B1"))
    	{
    		xRowsAlphabets=1;
    		yColumnsNumbers=7;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("c8")||location.equals("C8"))
    	{
    		xRowsAlphabets=2;
    		yColumnsNumbers=0;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("c7")||location.equals("C7"))
    	{
    		xRowsAlphabets=2;
    		yColumnsNumbers=1;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("c6")||location.equals("C6"))
    	{
    		xRowsAlphabets=2;
    		yColumnsNumbers=2;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("c5")||location.equals("C5"))
    	{
    		xRowsAlphabets=2;
    		yColumnsNumbers=3;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("c4")||location.equals("C4"))
    	{
    		xRowsAlphabets=2;
    		yColumnsNumbers=4;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("c3")||location.equals("C3"))
    	{
    		xRowsAlphabets=2;
    		yColumnsNumbers=5;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("c2")||location.equals("C2"))
    	{
    		xRowsAlphabets=2;
    		yColumnsNumbers=6;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("c1")||location.equals("C1"))
    	{
    		xRowsAlphabets=2;
    		yColumnsNumbers=7;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("d8")||location.equals("D8"))
    	{
    		xRowsAlphabets=3;
    		yColumnsNumbers=0;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("d7")||location.equals("D7"))
    	{
    		xRowsAlphabets=3;
    		yColumnsNumbers=1;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("d6")||location.equals("D6"))
    	{
    		xRowsAlphabets=3;
    		yColumnsNumbers=2;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("d5")||location.equals("D5"))
    	{
    		xRowsAlphabets=3;
    		yColumnsNumbers=3;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("d4")||location.equals("D4"))
    	{
    		xRowsAlphabets=3;
    		yColumnsNumbers=4;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("d3")||location.equals("D3"))
    	{
    		xRowsAlphabets=3;
    		yColumnsNumbers=5;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("d2")||location.equals("D2"))
    	{
    		xRowsAlphabets=3;
    		yColumnsNumbers=6;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("d1")||location.equals("D1"))
    	{
    		xRowsAlphabets=3;
    		yColumnsNumbers=7;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("e8")||location.equals("E8"))
    	{
    		xRowsAlphabets=4;
    		yColumnsNumbers=0;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("e7")||location.equals("E7"))
    	{
    		xRowsAlphabets=4;
    		yColumnsNumbers=1;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("e6")||location.equals("E6"))
    	{
    		xRowsAlphabets=4;
    		yColumnsNumbers=2;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("e5")||location.equals("E5"))
    	{
    		xRowsAlphabets=4;
    		yColumnsNumbers=3;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("e4")||location.equals("E4"))
    	{
    		xRowsAlphabets=4;
    		yColumnsNumbers=4;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("e3")||location.equals("E3"))
    	{
    		xRowsAlphabets=4;
    		yColumnsNumbers=5;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("e2")||location.equals("E2"))
    	{
    		xRowsAlphabets=4;
    		yColumnsNumbers=6;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("e1")||location.equals("E1"))
    	{
    		xRowsAlphabets=4;
    		yColumnsNumbers=7;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("f8")||location.equals("F8"))
    	{
    		xRowsAlphabets=5;
    		yColumnsNumbers=0;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("f7")||location.equals("F7"))
    	{
    		xRowsAlphabets=5;
    		yColumnsNumbers=1;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("f6")||location.equals("F6"))
    	{
    		xRowsAlphabets=5;
    		yColumnsNumbers=2;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("f5")||location.equals("F5"))
    	{
    		xRowsAlphabets=5;
    		yColumnsNumbers=3;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("f4")||location.equals("F4"))
    	{
    		xRowsAlphabets=5;
    		yColumnsNumbers=4;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("f3")||location.equals("F3"))
    	{
    		xRowsAlphabets=5;
    		yColumnsNumbers=5;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("f2")||location.equals("F2"))
    	{
    		xRowsAlphabets=5;
    		yColumnsNumbers=6;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("f1")||location.equals("F1"))
    	{
    		xRowsAlphabets=5;
    		yColumnsNumbers=7;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("g8")||location.equals("G8"))
    	{
    		xRowsAlphabets=6;
    		yColumnsNumbers=0;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("g7")||location.equals("G7"))
    	{
    		xRowsAlphabets=6;
    		yColumnsNumbers=1;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("g6")||location.equals("G6"))
    	{
    		xRowsAlphabets=6;
    		yColumnsNumbers=2;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("g5")||location.equals("G5"))
    	{
    		xRowsAlphabets=6;
    		yColumnsNumbers=3;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("g4")||location.equals("G4"))
    	{
    		xRowsAlphabets=6;
    		yColumnsNumbers=4;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("g3")||location.equals("G3"))
    	{
    		xRowsAlphabets=6;
    		yColumnsNumbers=5;
    		return locations[xRowsAlphabets][yColumnsNumbers];
    	}
    	else if(location.equals("g2")||location.equals("G2"))
    	{
    		xRowsAlphabets=6;
    		yColumnsNumbers=6;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("g1")||location.equals("G1"))
    	{
    		xRowsAlphabets=6;
    		yColumnsNumbers=7;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("h8")||location.equals("H8"))
    	{
    		xRowsAlphabets=7;
    		yColumnsNumbers=0;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("h7")||location.equals("H7"))
    	{
    		xRowsAlphabets=7;
    		yColumnsNumbers=1;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("h6")||location.equals("H6"))
    	{
    		xRowsAlphabets=7;
    		yColumnsNumbers=2;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("h5")||location.equals("H5"))
    	{
    		xRowsAlphabets=7;
    		yColumnsNumbers=3;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("h4")||location.equals("H4"))
    	{
    		xRowsAlphabets=7;
    		yColumnsNumbers=4;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("h3")||location.equals("H3"))
    	{
    		xRowsAlphabets=7;
    		yColumnsNumbers=5;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("h2")||location.equals("H2"))
    	{
    		xRowsAlphabets=7;
    		yColumnsNumbers=6;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else if(location.equals("h1")||location.equals("H1"))
    	{
    		xRowsAlphabets=7;
    		yColumnsNumbers=7;
    		return locations[yColumnsNumbers][xRowsAlphabets];
    	}
    	else
    		return 5555;
    	
    }
    public int getyColumnsNumbers() {
		return yColumnsNumbers;
	}
	public int getxRowsAlphabets() {
		return xRowsAlphabets;
	}
	public void insertQueenToChessBoard(Queen queen) throws QueenException
    {
    	String location = queen.getLocation();
    	findQueensExactPlaceInChessBoardArray(location);
    	if(visited[yColumnsNumbers][xRowsAlphabets]==true||
    			effected[yColumnsNumbers][xRowsAlphabets]==true){
    		
				throw new QueenException("This square is not available.");
			
    	}else{
    	
    	visited[yColumnsNumbers][xRowsAlphabets] = true;
    	effectedSquaresByVisitedReference(xRowsAlphabets,yColumnsNumbers);
    	}
    }
	public void effectedSquaresByVisitedReference(int x,int y)
	{
		if(x==0&&y==0)
		{
			effected[0][1] = true;   effected[1][0] = true;
			effected[0][2] = true;   effected[2][0] = true;
			effected[0][3] = true;   effected[3][0] = true;
			effected[0][4] = true;   effected[4][0] = true;
			effected[0][5] = true;   effected[5][0] = true;
			effected[0][6] = true;   effected[6][0] = true;
			effected[0][7] = true;   effected[7][0] = true;
		    effected[1][1] = true;
		    effected[2][2] = true;
		    effected[3][3] = true;
		    effected[4][4] = true;
		    effected[5][5] = true;
		    effected[6][6] = true;
			effected[7][7] = true;
			
		}
		 if(x==0&&y==1)
		{
			effected[0][0] = true; effected[1][1] = true;
			effected[2][0] = true; effected[1][2] = true;
			effected[3][0] = true; effected[1][3] = true;
			effected[4][0] = true; effected[1][4] = true;
			effected[5][0] = true; effected[1][5] = true;
			effected[6][0] = true; effected[1][6] = true;
			effected[7][0] = true; effected[1][7] = true;
			effected[0][1] = true; effected[2][1] = true;
			effected[3][2] = true; effected[4][3] = true;
			effected[5][4] = true; effected[6][5] = true;
			effected[7][6] = true;
		}
		 if(x==0&&y==2)
		 {
			 effected[0][0]=true;  effected[2][1]=true;
			 effected[1][0]= true; effected[2][2]=true;
			 effected[3][0]=true;  effected[2][3]=true;
			 effected[4][0]=true;  effected[2][4]=true;
			 effected[5][0]=true;  effected[2][5]=true;
			 effected[6][0]=true;  effected[2][6]=true;
			 effected[7][0]=true;  effected[2][7]=true;
			 effected[1][1]=true;  effected[0][2]=true;
			 effected[3][1]=true;  effected[4][2]=true;
			 effected[5][3]=true;  effected[7][5]=true;
			 effected[6][4]=true;  
		 }
		 if(x==0&&y==3)
		 {
			 effected[0][0]=true;    effected[3][1]=true;
			 effected[1][0]=true;    effected[3][2]=true;
			 effected[2][0]=true;    effected[3][3]=true;
			 effected[4][0]=true;    effected[3][4]=true;
			 effected[5][0]=true;    effected[3][5]=true;
			 effected[6][0]=true;    effected[3][6]=true;
			 effected[7][0]=true;    effected[3][7]=true;
			 effected[2][1]=true;    effected[1][2]=true;
			 effected[0][3]=true;    effected[4][1]=true;
			 effected[5][2]=true;    effected[6][3]=true;
			 effected[7][4]=true;
		 }
		 if(x==0&&y==4)
		 {
			 effected[0][0]=true;    effected[4][1]=true;
			 effected[1][0]=true;    effected[4][2]=true;
			 effected[2][0]=true;    effected[4][3]=true;
			 effected[3][0]=true;    effected[4][4]=true;
			 effected[5][0]=true;    effected[4][5]=true;
			 effected[6][0]=true;    effected[4][6]=true;
			 effected[7][0]=true;    effected[4][7]=true;
			 effected[5][1]=true;    effected[6][2]=true;
			 effected[7][3]=true;    effected[3][1]=true;
			 effected[2][2]=true;    effected[1][3]=true;
			 effected[0][4]=true;
		 }
		 if(x==0&&y==5)
		 {
			 effected[0][0]=true;    effected[5][1]=true;
			 effected[1][0]=true;    effected[5][2]=true;
			 effected[2][0]=true;    effected[5][3]=true;
			 effected[3][0]=true;    effected[5][4]=true;
			 effected[4][0]=true;    effected[5][5]=true;
			 effected[6][0]=true;    effected[5][6]=true;
			 effected[7][0]=true;    effected[5][7]=true;
			 effected[6][1]=true;    effected[7][2]=true;
			 effected[4][1]=true;    effected[3][2]=true;
			 effected[2][3]=true;    effected[1][4]=true;
			 effected[0][5]=true;
		 }
		 if(x==0&&y==6)
		 {
			 effected[0][0]=true;   effected[6][1]=true;
			 effected[1][0]=true;   effected[6][2]=true;
			 effected[2][0]=true;   effected[6][3]=true;
			 effected[3][0]=true;   effected[6][4]=true;
			 effected[4][0]=true;   effected[6][5]=true;
			 effected[5][0]=true;   effected[6][6]=true;
			 effected[7][0]=true;   effected[6][7]=true;
			 effected[7][1]=true;   effected[5][1]=true;
			 effected[4][2]=true;   effected[3][3]=true;
			 effected[2][4]=true;   effected[1][5]=true;
			 effected[0][6]=true;
		 }
		 if(x==0&&y==7)
		 {
			 effected[0][0]=true;   effected[7][1]=true;
			 effected[1][0]=true;   effected[7][2]=true;
			 effected[2][0]=true;   effected[7][3]=true;
			 effected[3][0]=true;   effected[7][4]=true;
			 effected[4][0]=true;   effected[7][5]=true;
			 effected[5][0]=true;   effected[7][6]=true;
			 effected[6][0]=true;   effected[7][7]=true;
			 effected[6][1]=true;   effected[5][2]=true;
			 effected[4][3]=true;   effected[3][4]=true;
			 effected[2][5]=true;   effected[1][6]=true;
			 effected[0][7]=true;
		 }
		 if(x==1&&y==0)
		 {
			 effected[0][0] = true;  effected[1][1]=true;
			 effected[0][2] = true;  effected[2][1]=true;
			 effected[0][3] = true;  effected[3][1]=true;
			 effected[0][4] = true;  effected[4][1]=true;
			 effected[0][5] = true;  effected[5][1]=true;
			 effected[0][6] = true;  effected[6][1]=true;
			 effected[0][7] = true;  effected[7][1]=true;
			 effected[1][0] = true;  effected[1][2]=true;
			 effected[2][3] = true;  effected[3][4]=true;
			 effected[4][5] = true;  effected[5][6]=true;
			 effected[6][7]=true;
		 }
		 if(x==1&&y==1)
		 {
			 effected[0][0]=true;    effected[2][1]=true;
			 effected[1][0]=true;    effected[3][1]=true;
			 effected[2][0]=true;    effected[4][1]=true;
			 effected[0][1]=true;    effected[5][1]=true;
			 effected[0][2]=true;    effected[6][1]=true;
			 effected[1][2]=true;    effected[7][1]=true;
			 effected[1][3]=true;    effected[2][2]=true;
			 effected[1][4]=true;    effected[3][3]=true;
			 effected[1][5]=true;    effected[4][4]=true;
			 effected[1][6]=true;    effected[5][5]=true;
			 effected[1][7]=true;    effected[6][6]=true;
			 effected[7][7]=true;
		 }
		 if(x==1&&y==2)
		 {
			 effected[1][0]=true;    effected[1][2]=true;
			 effected[2][0]=true;    effected[0][3]=true;
			 effected[3][0]=true;    effected[2][2]=true;
			 effected[0][1]=true;    effected[2][3]=true;
			 effected[1][1]=true;    effected[2][4]=true;
			 effected[3][1]=true;    effected[2][5]=true;
			 effected[4][1]=true;    effected[2][6]=true;
			 effected[5][1]=true;    effected[2][7]=true;
			 effected[6][1]=true;    effected[3][2]=true;
			 effected[7][1]=true;    effected[4][3]=true;
			 effected[5][4]=true;    effected[6][5]=true;
			 effected[7][6]=true;
		 }
		 if(x==1&&y==3)
		 {
			 effected[2][0]=true;    effected[2][2]=true;
			 effected[3][0]=true;    effected[1][3]=true;
			 effected[4][0]=true;    effected[0][4]=true;
		     effected[0][1]=true;
			 effected[1][1]=true;    effected[3][2]=true;
			 effected[2][1]=true;    effected[3][3]=true;
			 effected[4][1]=true;    effected[3][4]=true;
			 effected[5][1]=true;    effected[3][5]=true;
			 effected[6][1]=true;    effected[3][6]=true;
			 effected[7][1]=true;    effected[3][7]=true;
			 effected[4][2]=true;    effected[5][3]=true;
			 effected[6][4]=true;    effected[7][5]=true;
		 }
		 if(x==1&&y==4)
		 {
			 effected[3][0]=true;    effected[3][2]=true;
			 effected[4][0]=true;    effected[4][2]=true;
			 effected[5][0]=true;    effected[5][2]=true;
			 effected[0][1]=true;    effected[2][3]=true;
			 effected[1][1]=true;    effected[1][4]=true;
			 effected[2][1]=true;    effected[0][5]=true;
			 effected[3][1]=true;    effected[6][3]=true;
			 effected[5][1]=true;    effected[7][4]=true;
			 effected[6][1]=true;    effected[4][3]=true;
			 effected[7][1]=true;    effected[4][4]=true;
			 effected[4][5]=true;    effected[4][6]=true;
			 effected[4][7]=true;
		 }
		 if(x==1&&y==5)
		 {
			 effected[4][0]=true;    effected[4][2]=true;
			 effected[5][0]=true;    effected[5][2]=true;
			 effected[6][0]=true;    effected[6][2]=true;
			 effected[0][1]=true;    effected[7][3]=true;
			 effected[1][1]=true;    effected[3][3]=true;
			 effected[2][1]=true;    effected[2][4]=true;
			 effected[3][1]=true;    effected[1][5]=true;
			 effected[4][1]=true;    effected[0][6]=true;
			 effected[6][1]=true;    effected[5][3]=true;
			 effected[7][1]=true;    effected[5][4]=true;
			 effected[5][5]=true;    effected[5][6]=true;
			 effected[5][7]=true;
		 }
		 if(x==1&&y==6)
		 {
			 effected[5][0]=true;    effected[5][2]=true;
			 effected[6][0]=true;    effected[6][2]=true;
			 effected[7][0]=true;    effected[7][2]=true;
			 effected[0][1]=true;    effected[4][3]=true;
			 effected[1][1]=true;    effected[3][4]=true;
			 effected[2][1]=true;    effected[2][5]=true;
			 effected[3][1]=true;    effected[1][6]=true;
			 effected[4][1]=true;    effected[0][7]=true;
			 effected[5][1]=true;    effected[6][3]=true;
			 effected[7][1]=true;    effected[6][4]=true;
			 effected[6][5]=true;    effected[6][6]=true;
			 effected[6][7]=true;
		 }
		 if(x==1&&y==7)
		 {
			 effected[6][0]=true;    effected[7][2]=true;
			 effected[7][0]=true;    effected[7][3]=true;
			 effected[0][1]=true;    effected[7][4]=true;
			 effected[1][1]=true;    effected[7][5]=true;
			 effected[2][1]=true;    effected[7][6]=true;
			 effected[3][1]=true;    effected[7][7]=true;
			 effected[4][1]=true;    effected[6][2]=true;
			 effected[5][1]=true;    effected[5][3]=true;
			 effected[6][1]=true;    effected[4][4]=true;
			 effected[3][5]=true;    effected[2][6]=true;
			 effected[1][7]=true;
			 
		 }
		 if(x==2&&y==0)
		 {
			 effected[0][0]=true;    effected[1][2]=true;
			 effected[0][1]=true;    effected[2][2]=true;
			 effected[0][3]=true;    effected[3][2]=true;
			 effected[0][4]=true;    effected[4][2]=true;
			 effected[0][5]=true;    effected[5][2]=true;
			 effected[0][6]=true;    effected[6][2]=true;
			 effected[0][7]=true;    effected[7][2]=true;
			 effected[1][1]=true;    effected[1][3]=true;
			 effected[2][0]=true;    effected[2][4]=true;
			 effected[3][5]=true;    effected[4][6]=true;
			 effected[5][7]=true;
		 }
		 if(x==2&&y==1)
		 {
			 effected[0][1]=true;    effected[2][2]=true;
			 effected[0][2]=true;    effected[3][2]=true;
			 effected[0][3]=true;    effected[4][2]=true;
			 effected[1][0]=true;    effected[5][2]=true;
			 effected[1][1]=true;    effected[6][2]=true;
			 effected[1][3]=true;    effected[7][2]=true;
			 effected[1][4]=true;    effected[2][1]=true;
			 effected[1][5]=true;    effected[3][0]=true;
			 effected[1][6]=true;    effected[2][3]=true;
			 effected[1][7]=true;    effected[3][4]=true;
			 effected[4][5]=true;    effected[5][6]=true;
			 effected[6][7]=true;
		 }
		 if(x==2&&y==2)
		 {
			 effected[0][0]=true;    effected[3][2]=true;
			 effected[0][2]=true;    effected[4][2]=true;
			 effected[0][4]=true;    effected[5][2]=true;
			 effected[1][1]=true;    effected[6][2]=true;
			 effected[1][2]=true;    effected[7][2]=true;
			 effected[1][3]=true;    effected[3][1]=true;
			 effected[2][0]=true;    effected[4][0]=true;
			 effected[2][1]=true;    effected[3][3]=true;
			 effected[2][3]=true;    effected[4][4]=true;
			 effected[2][4]=true;    effected[5][5]=true;
			 effected[2][5]=true;    effected[6][6]=true;
			 effected[2][6]=true;    effected[7][7]=true;
			 effected[2][7]=true;
		 }
		 if(x==2&&y==3)
		 {
			 effected[1][0]=true;    effected[3][0]=true;
			 effected[2][1]=true;    effected[3][1]=true;
			 effected[0][2]=true;    effected[3][3]=true;
			 effected[1][2]=true;    effected[3][4]=true;
			 effected[2][2]=true;    effected[3][5]=true;
			 effected[2][3]=true;    effected[3][6]=true;
			 effected[1][4]=true;    effected[3][7]=true;
			 effected[0][5]=true;    effected[4][1]=true;
			 effected[5][0]=true;    effected[4][2]=true;
			 effected[5][2]=true;    effected[6][2]=true;
			 effected[7][2]=true;    effected[4][3]=true;
			 effected[5][4]=true;    effected[6][5]=true;
			 effected[7][6]=true;
		 }
		 if(x==2&&y==4)
		 {
			 effected[2][0]=true;    effected[0][2]=true;
			 effected[3][1]=true;    effected[1][2]=true;
			 effected[6][0]=true;    effected[2][2]=true;
			 effected[5][1]=true;    effected[3][2]=true;
			 effected[4][0]=true;    effected[5][2]=true;
			 effected[4][1]=true;    effected[6][2]=true;
			 effected[4][3]=true;    effected[7][2]=true;
			 effected[4][4]=true;    effected[3][3]=true;
			 effected[4][5]=true;    effected[2][4]=true;
			 effected[4][6]=true;    effected[1][5]=true;
			 effected[4][7]=true;    effected[0][6]=true;
			 effected[5][3]=true;    effected[6][4]=true;
			 effected[7][5]=true;
		 }
		 if(x==2&&y==5)
		 {
			 effected[3][0]=true;     effected[0][2]=true;
			 effected[4][1]=true;     effected[1][2]=true;
			 effected[7][0]=true;     effected[2][2]=true;
			 effected[6][1]=true;     effected[3][2]=true;
			 effected[5][0]=true;     effected[4][2]=true;
			 effected[5][1]=true;     
			 effected[5][3]=true;     effected[6][2]=true;
			 effected[5][4]=true;     effected[7][2]=true;
			 effected[5][5]=true;     effected[4][3]=true;
			 effected[5][6]=true;     effected[3][4]=true;
			 effected[5][7]=true;     effected[2][5]=true;
			 effected[1][6]=true;     effected[0][7]=true;
			 effected[6][3]=true;     effected[7][4]=true;
		 }
		 if(x==2&&y==6)
		 {
			 effected[4][0]=true;     effected[0][2]=true;
			 effected[5][1]=true;     effected[1][2]=true;
			 effected[7][1]=true;     effected[2][2]=true;
			 effected[6][0]=true;     effected[3][2]=true;
			 effected[6][1]=true;     effected[4][2]=true;
			 effected[6][3]=true;     effected[5][2]=true;
			 effected[6][4]=true;     effected[7][2]=true;
			 effected[6][5]=true;     effected[7][3]=true;
			 effected[6][6]=true;     effected[5][3]=true;
			 effected[6][7]=true;     effected[4][4]=true;
			 effected[3][5]=true;     effected[2][6]=true;
			 effected[1][7]=true;
		 }
		 if(x==2&&y==7)
		 {
			 effected[5][0]=true;     effected[0][2]=true;
			 effected[6][1]=true;     effected[1][2]=true;
			 effected[7][0]=true;     effected[2][2]=true;
			 effected[7][1]=true;     effected[3][2]=true;
			 effected[7][3]=true;     effected[4][2]=true;
			 effected[7][4]=true;     effected[5][2]=true;
			 effected[7][5]=true;     effected[6][2]=true;
			 effected[7][6]=true;     effected[6][3]=true;
			 effected[7][7]=true;     effected[5][4]=true;
			 effected[4][5]=true;     effected[3][6]=true;
			 effected[2][7]=true;
		 }
		 if(x==3&&y==0)
		 {
			 effected[0][0] =true;    effected[1][3] =true;
			 effected[0][1] =true;    effected[2][3] =true;
			 effected[0][2] =true;    effected[3][3] =true;
			 effected[0][4] =true;    effected[4][3] =true;
			 effected[0][5] =true;    effected[5][3] =true;
			 effected[0][6] =true;    effected[6][3] =true;
			 effected[0][7] =true;    effected[7][3] =true;
			 effected[1][2] =true;    effected[2][1] =true;
			 effected[3][0] =true;    effected[1][4] =true;
			 effected[2][5] =true;    effected[3][6] =true;
			 effected[4][7] =true;
		 }
		 if(x==3&&y==1)
		 {
			 effected[0][2] =true;     effected[2][2] =true;
			 effected[0][3] =true;     effected[3][1] =true;
			 effected[0][4] =true;     effected[4][0] =true;
			 effected[1][0] =true;     effected[2][3] =true;
			 effected[1][1] =true;     effected[3][3] =true;
			 effected[1][2] =true;     effected[4][3] =true;
			 effected[1][4] =true;     effected[5][3] =true;
			 effected[1][5] =true;     effected[6][3] =true;
			 effected[1][6] =true;     effected[7][3] =true;
			 effected[1][7] =true;     effected[2][4] =true;
			 effected[3][5] =true;     effected[4][6] =true;
			 effected[5][7] =true;
		 }
		 if(x==3&&y==2)
		 {
			 effected[0][1] =true;     effected[3][3] =true;
			 effected[0][3] =true;     effected[4][3] =true;
			 effected[0][5] =true;     effected[5][3] =true;
			 effected[1][2] =true;     effected[6][3] =true;
			 effected[1][3] =true;     effected[7][3] =true;
			 effected[1][4] =true;     effected[3][2] =true;
			 effected[2][0] =true;     effected[4][1] =true;
			 effected[2][1] =true;     effected[5][0] =true;
			 effected[2][2] =true;     effected[3][4] =true;
			 effected[2][4] =true;     effected[4][5] =true;
			 effected[2][5] =true;     effected[5][6] =true;
			 effected[2][6] =true;     effected[6][7] =true;
			 effected[2][7] =true;
		 }
		 if(x==3&&y==3)
		 {
			 effected[0][0] =true;     effected[3][0] =true;
			 effected[1][1] =true;     effected[3][1] =true;
			 effected[2][2] =true;     effected[3][2] =true;
			 effected[2][4] =true;     effected[3][4] =true;
			 effected[1][5] =true;     effected[3][5] =true;
			 effected[0][6] =true;     effected[3][6] =true;
			 effected[0][3] =true;     effected[3][7] =true;
			 effected[1][3] =true;     effected[4][2] =true;
			 effected[2][3] =true;     effected[5][1] =true;
			 effected[4][3] =true;     effected[6][0] =true;
			 effected[5][3] =true;     effected[4][4] =true;
			 effected[6][3] =true;     effected[5][5] =true;
			 effected[7][3] =true;     effected[6][6] =true;
			 effected[7][7] =true;
		 }
		 if(x==3&&y==4)
		 {
			 effected[1][0] =true;     effected[4][0] =true;
			 effected[2][1] =true;     effected[4][1] =true;
			 effected[3][2] =true;     effected[4][2] =true;
			 effected[3][4] =true;     effected[4][4] =true;
			 effected[2][5] =true;     effected[4][5] =true;
			 effected[1][6] =true;     effected[4][6] =true;
			 effected[0][7] =true;     effected[4][7] =true;
			 effected[0][3] =true;     effected[5][2] =true;
			 effected[1][3] =true;     effected[6][1] =true;
			 effected[2][3] =true;     effected[7][0] =true;
			 effected[3][3] =true;     effected[5][4] =true;
			 effected[5][3] =true;     effected[6][5] =true;
			 effected[6][3] =true;     effected[7][6] =true;
			 effected[7][3] =true;
		 }
		 if(x==3&&y==5)
		 {
			 effected[2][0] =true;     effected[5][0] =true;
			 effected[3][1] =true;     effected[5][1] =true;
			 effected[4][2] =true;     effected[5][2] =true;
			 effected[4][4] =true;     effected[5][4] =true;
			 effected[3][5] =true;     effected[5][5] =true;
			 effected[2][6] =true;     effected[5][6] =true;
			 effected[1][7] =true;     effected[5][7] =true;
			 effected[0][3] =true;     effected[6][2] =true;
			 effected[1][3] =true;     effected[7][1] =true;
			 effected[2][3] =true;     effected[6][4] =true;
			 effected[3][3] =true;     effected[7][5] =true;
			 effected[4][3] =true;
			 effected[6][3] =true;
			 effected[7][3] =true;
		 }
		 if(x==3&&y==6)
		 {
			 effected[3][0] =true;    effected[0][3] =true;
			 effected[4][1] =true;    effected[1][3] =true;
			 effected[5][2] =true;    effected[2][3] =true;
			 effected[5][4] =true;    effected[3][3] =true;
			 effected[4][5] =true;    effected[4][3] =true;
			 effected[3][6] =true;    effected[5][3] =true;
			 effected[2][7] =true;    effected[6][0] =true;
			 effected[7][2] =true;    effected[6][1] =true;
			 effected[7][3] =true;    effected[6][2] =true;
			 effected[7][4] =true;    effected[6][4] =true;
			 effected[6][5] =true;    effected[6][6] =true;
			 effected[6][7] =true;
		 }
		 if(x==3&&y==7)
		 {
			 effected[4][0] =true;    effected[7][0] =true;
			 effected[5][1] =true;    effected[7][1] =true;
			 effected[6][2] =true;    effected[7][2] =true;
			 effected[6][4] =true;    effected[7][4] =true;
			 effected[5][5] =true;    effected[7][5] =true;
			 effected[4][6] =true;    effected[7][6] =true;
			 effected[3][7] =true;    effected[7][7] =true;
			 effected[0][3] =true;    effected[1][3] =true;
			 effected[2][3] =true;    effected[3][3] =true;
			 effected[4][3] =true;    effected[5][3] =true;
			 effected[6][3] =true;
		 }
		 if(x==4&&y==0)
		 {
			 effected[0][0] = true;   effected[1][4] = true;
			 effected[0][1] = true;   effected[2][4] = true;
			 effected[0][2] = true;   effected[3][4] = true;
			 effected[0][3] = true;   effected[4][4] = true;
			 effected[0][5] = true;   effected[5][4] = true;
			 effected[0][6] = true;   effected[6][4] = true;
			 effected[0][7] = true;   effected[7][4] = true;
			 effected[1][3] = true;   effected[2][2] = true;
			 effected[3][1] = true;   effected[4][0] = true;
			 effected[1][5] = true;   effected[2][6] = true;
			 effected[3][7] = true;
		 }
		 if(x==4&&y==1)
		 {
			 effected[0][3] = true;   effected[0][4] = true;
			 effected[0][5] = true;   effected[2][4] = true;
			 effected[1][0] = true;   effected[3][4] = true;
			 effected[1][1] = true;   effected[4][4] = true;
			 effected[1][2] = true;   effected[5][4] = true;
			 effected[1][3] = true;   effected[6][4] = true;
			 effected[1][5] = true;   effected[7][4] = true;
			 effected[1][6] = true;   effected[2][3] = true;
			 effected[1][7] = true;   effected[3][2] = true;
			 effected[4][1] = true;   effected[5][0] = true;
			 effected[2][5] = true;   effected[3][6] = true;
			 effected[4][7] = true;
		 }
		 if(x==4&&y==2)
		 {
			 effected[0][2] = true;   effected[3][3] = true;
			 effected[0][4] = true;   effected[4][2] = true;
			 effected[0][6] = true;   effected[5][1] = true;
			 effected[1][3] = true;   effected[6][0] = true;
			 effected[1][4] = true;   effected[3][5] = true;
			 effected[1][5] = true;   effected[4][6] = true;
			 effected[3][4] = true;   effected[5][7] = true;
			 effected[4][4] = true;   effected[2][0] = true;
			 effected[5][4] = true;   effected[2][1] = true;
			 effected[6][4] = true;   effected[2][2] = true;
			 effected[7][4] = true;   effected[2][3] = true;
			 effected[2][5] = true;   effected[2][6] = true;
			 effected[2][7] = true;
		 }
		 if(x==4&&y==3)
		 {
			 effected[2][3] = true;   effected[4][5] = true;
			 effected[1][2] = true;   effected[5][6] = true;
			 effected[0][1] = true;   effected[6][7] = true;
			 effected[2][5] = true;   effected[0][4] = true;
			 effected[1][6] = true;   effected[1][4] = true;
			 effected[0][7] = true;   effected[2][4] = true;
			 effected[4][3] = true;   effected[3][0] = true;
			 effected[5][2] = true;   effected[3][1] = true;
			 effected[6][1] = true;   effected[3][2] = true;
			 effected[7][0] = true;   effected[3][3] = true;
			 effected[3][5] = true;   effected[3][6] = true;
			 effected[3][7] = true;   effected[4][4] = true;
			 effected[5][4] = true;   effected[6][4] = true;
			 effected[7][4] = true;
		 }
		 if(x==4&&y==4)
		 {
			 effected[0][0] = true;   effected[4][0] = true; 
			 effected[1][1] = true;   effected[4][1] = true;
			 effected[2][2] = true;   effected[4][2] = true;
			 effected[3][3] = true;   effected[4][3] = true;
			 effected[5][5] = true;   effected[4][5] = true;
			 effected[6][6] = true;   effected[4][6] = true;
			 effected[7][7] = true;   effected[4][7] = true;
			 effected[3][5] = true;   effected[0][4] = true;
			 effected[2][6] = true;   effected[1][4] = true;
			 effected[1][7] = true;   effected[2][4] = true;
			 effected[5][3] = true;   effected[3][4] = true;
			 effected[6][2] = true;   effected[5][4] = true;
			 effected[7][1] = true;   effected[6][4] = true;
			 effected[7][4] = true;
		 }
		 if(x==4&&y==5)
		 {
			 effected[1][0] = true;    effected[0][4] = true;
			 effected[2][1] = true;    effected[1][4] = true;
			 effected[3][2] = true;    effected[2][4] = true;
			 effected[4][3] = true;    effected[3][4] = true;
			 effected[6][3] = true;    effected[4][4] = true;
			 effected[7][2] = true;    effected[6][4] = true;
			 effected[6][5] = true;    effected[7][4] = true;
			 effected[7][6] = true;    effected[5][0] = true;
			 effected[4][5] = true;    effected[5][1] = true;
			 effected[3][6] = true;    effected[5][2] = true;
			 effected[2][7] = true;    effected[5][3] = true;
			 effected[5][5] = true;    effected[5][6] = true;
			 effected[5][7] = true;
		 }
		 if(x==4&&y==6)
		 {
			 effected[5][3] = true;    effected[6][0] = true;
			 effected[4][2] = true;    effected[6][1] = true;
			 effected[3][1] = true;    effected[6][2] = true;
			 effected[2][0] = true;    effected[6][3] = true;
			 effected[5][5] = true;    effected[6][5] = true;
			 effected[4][6] = true;    effected[6][6] = true;
			 effected[3][7] = true;    effected[6][7] = true;
			 effected[7][3] = true;    effected[0][4] = true;
			 effected[7][4] = true;    effected[1][4] = true;
			 effected[7][5] = true;    effected[2][4] = true;
			 effected[3][4] = true;    effected[4][4] = true;
			 effected[5][4] = true;
		 }
		 if(x==4&&y==7)
		 {
			 effected[6][3] = true;    effected[0][4] = true;
			 effected[5][2] = true;    effected[1][4] = true;
			 effected[4][1] = true;    effected[2][4] = true;
			 effected[3][0] = true;    effected[3][4] = true;
			 effected[6][5] = true;    effected[4][4] = true;
			 effected[5][6] = true;    effected[5][4] = true;
			 effected[4][7] = true;    effected[6][4] = true;
			 effected[7][0] = true;    effected[7][1] = true;
			 effected[7][2] = true;    effected[7][3] = true;
			 effected[7][5] = true;    effected[7][6] = true;
			 effected[7][7] = true;
		 }
		 if(x==5&&y==0)
		 {
			 effected[0][0] = true;    effected[1][5] = true;
			 effected[0][1] = true;    effected[2][5] = true;
			 effected[0][2] = true;    effected[3][5] = true;
			 effected[0][3] = true;    effected[4][5] = true;
			 effected[0][4] = true;    effected[5][5] = true;
			 effected[0][6] = true;    effected[6][5] = true;
			 effected[0][7] = true;    effected[7][5] = true;
			 effected[1][4] = true;    effected[2][3] = true;
			 effected[3][2] = true;    effected[4][1] = true;
			 effected[5][0] = true;    effected[1][6] = true;
			 effected[2][7] = true;
		 }
		 if(x==5&&y==1)
		 {
			 effected[0][4] = true;     effected[2][6] = true;
			 effected[0][5] = true;     effected[3][7] = true;
			 effected[0][6] = true;     effected[2][4] = true;
			 effected[1][0] = true;     effected[3][3] = true;
			 effected[1][1] = true;     effected[4][2] = true;
			 effected[1][2] = true;     effected[5][1] = true;
			 effected[1][3] = true;     effected[6][0] = true;
			 effected[1][4] = true;     effected[2][5] = true;
			 effected[1][6] = true;     effected[3][5] = true;
			 effected[1][7] = true;     effected[4][5] = true;
			 effected[5][5] = true;     effected[6][5] = true;
			 effected[7][5] = true;
		 }
		 if(x==5&&y==2)
		 {
			 effected[0][3] = true;     effected[3][5] = true;
			 effected[0][5] = true;     effected[4][5] = true;
			 effected[0][7] = true;     effected[5][5] = true;
			 effected[1][4] = true;     effected[6][5] = true;
			 effected[1][5] = true;     effected[7][5] = true;
			 effected[1][6] = true;     effected[3][6] = true;
			 effected[2][0] = true;     effected[4][7] = true;
			 effected[2][1] = true;     effected[3][4] = true;
			 effected[2][2] = true;     effected[4][3] = true;
			 effected[2][3] = true;     effected[5][2] = true;
			 effected[2][4] = true;     effected[6][1] = true;
			 effected[2][6] = true;     effected[7][0] = true;
			 effected[2][7] = true;
		 }
		 if(x==5&&y==3)
		 {
			 effected[0][2] = true;     effected[0][5] = true;
			 effected[1][3] = true;     effected[1][5] = true;
			 effected[2][4] = true;     effected[2][5] = true;
			 effected[2][6] = true;     effected[4][5] = true;
			 effected[1][7] = true;     effected[5][5] = true;
			 effected[4][6] = true;     effected[6][5] = true;
			 effected[5][7] = true;     effected[7][5] = true;
			 effected[4][4] = true;     effected[3][0] = true;
			 effected[3][1] = true;     effected[3][3] = true;
			 effected[5][3] = true;     effected[3][4] = true;
			 effected[6][2] = true;     effected[3][6] = true;
			 effected[7][1] = true;     effected[3][7] = true;
			 effected[3][2] = true;
		 }
		 if(x==5&&y==4)
		 {
			 effected[0][1] = true;     effected[0][5] = true;
			 effected[1][2] = true;     effected[1][5] = true;
			 effected[2][3] = true;     effected[2][5] = true;
			 effected[3][4] = true;     effected[3][5] = true;
			 effected[3][6] = true;     effected[5][5] = true;
			 effected[2][7] = true;     effected[6][5] = true;
			 effected[5][6] = true;     effected[7][5] = true;
			 effected[6][7] = true;     effected[4][0] = true;
			 effected[5][4] = true;     effected[4][1] = true;
			 effected[6][3] = true;     effected[4][2] = true;
			 effected[7][2] = true;     effected[4][3] = true;
			 effected[4][4] = true;     effected[4][6] = true;
			 effected[4][7] = true;
		 }
		 if(x==5&&y==5)
		 {
			 effected[0][0] = true;     effected[0][5] = true;
			 effected[1][1] = true;     effected[1][5] = true;
			 effected[2][2] = true;     effected[2][5] = true;
			 effected[3][3] = true;     effected[3][5] = true;
			 effected[4][4] = true;     effected[4][5] = true;
			 effected[4][6] = true;     effected[6][5] = true;
			 effected[3][7] = true;     effected[7][5] = true;
			 effected[6][6] = true;     effected[5][0] = true;
			 effected[7][7] = true;     effected[5][1] = true;
			 effected[6][4] = true;     effected[5][2] = true;
			 effected[7][3] = true;     effected[5][3] = true;
			 effected[5][4] = true;     effected[5][6] = true;
			 effected[5][7] = true;
		 }
		 if(x==5&&y==6)
		 {
			 effected[1][0] = true;     effected[6][0] = true;
			 effected[2][1] = true;     effected[6][1] = true;
			 effected[3][2] = true;     effected[6][2] = true;
			 effected[4][3] = true;     effected[6][3] = true;
			 effected[5][4] = true;     effected[6][4] = true;
			 effected[5][6] = true;     effected[6][6] = true;
			 effected[4][7] = true;     effected[6][7] = true;
			 effected[7][4] = true;     effected[0][5] = true;
			 effected[7][5] = true;     effected[1][5] = true;
			 effected[7][6] = true;     effected[2][5] = true;
			 effected[3][5] = true;     effected[4][5] = true;
			 effected[5][5] = true;
		 }
		 if(x==5&&y==7)
		 {
			 effected[2][0] = true;     effected[0][5] = true;
			 effected[3][1] = true;     effected[1][5] = true;
			 effected[4][2] = true;     effected[2][5] = true;
			 effected[5][3] = true;     effected[3][5] = true;
			 effected[6][4] = true;     effected[4][5] = true;
			 effected[6][6] = true;     effected[5][5] = true;
			 effected[5][7] = true;     effected[6][5] = true;
			 effected[7][0] = true;     effected[7][1] = true;
			 effected[7][2] = true;     effected[7][3] = true;
			 effected[7][4] = true;     effected[7][6] = true;
			 effected[7][7] = true;
		 }
		 if(x==6&&y==0)
		 {
			 effected[0][0] = true;     effected[1][6] = true;
			 effected[0][1] = true;     effected[2][6] = true;
			 effected[0][2] = true;     effected[3][6] = true;
			 effected[0][3] = true;     effected[4][6] = true;
			 effected[0][4] = true;     effected[5][6] = true;
			 effected[0][5] = true;     effected[6][6] = true;
			 effected[0][7] = true;     effected[7][6] = true;
			 effected[1][7] = true;     effected[1][5] = true;
			 effected[2][4] = true;     effected[3][3] = true;
			 effected[4][2] = true;     effected[5][1] = true;
			 effected[6][0] = true;
		 }
		 if(x==6&&y==1)
		 {
			 effected[0][5] = true;     effected[2][5] = true;
			 effected[0][6] = true;     effected[3][4] = true;
			 effected[0][7] = true;     effected[4][3] = true;
			 effected[1][0] = true;     effected[5][2] = true;
			 effected[1][1] = true;     effected[6][1] = true;
			 effected[1][2] = true;     effected[7][0] = true;
			 effected[1][3] = true;     effected[2][6] = true;
			 effected[1][4] = true;     effected[3][6] = true;
			 effected[1][5] = true;     effected[4][6] = true;
			 effected[1][7] = true;     effected[5][6] = true;
			 effected[2][7] = true;     effected[6][6] = true;
			 effected[7][6] = true;
		 }
		 if(x==6&&y==2)
		 {
			 effected[0][4] = true;     effected[3][5] = true;
			 effected[0][6] = true;     effected[4][4] = true;
			 effected[1][5] = true;     effected[5][3] = true;
			 effected[1][6] = true;     effected[6][2] = true;
			 effected[1][7] = true;     effected[7][1] = true;
			 effected[2][0] = true;     effected[3][7] = true;
			 effected[2][1] = true;     effected[3][6] = true;
			 effected[2][2] = true;     effected[4][6] = true;
			 effected[2][3] = true;     effected[5][6] = true;
			 effected[2][4] = true;     effected[6][6] = true;
			 effected[2][5] = true;     effected[7][6] = true;
			 effected[2][7] = true;
		 }
		 if(x==6&&y==3)
		 {
			 effected[0][3] = true;     effected[0][6] = true;
			 effected[1][4] = true;     effected[1][6] = true;
			 effected[2][5] = true;     effected[2][6] = true;
			 effected[2][7] = true;     effected[4][6] = true;
			 effected[4][7] = true;     effected[5][6] = true;
			 effected[4][5] = true;     effected[6][6] = true;
			 effected[5][4] = true;     effected[7][6] = true;
			 effected[6][3] = true;     effected[3][0] = true;
			 effected[7][2] = true;     effected[3][1] = true;
			 effected[3][2] = true;     effected[3][3] = true;
			 effected[3][4] = true;     effected[3][5] = true;
			 effected[3][7] = true;
		 }
		 if(x==6&&y==4)
		 {
			 effected[0][2] = true;     effected[0][6] = true;
			 effected[1][3] = true;     effected[1][6] = true;
			 effected[2][4] = true;     effected[2][6] = true;
			 effected[3][5] = true;     effected[3][6] = true;
			 effected[3][7] = true;     effected[5][6] = true;
			 effected[5][5] = true;     effected[6][6] = true;
			 effected[6][4] = true;     effected[7][6] = true;
			 effected[7][3] = true;     effected[4][0] = true;   
			 effected[5][7] = true;     effected[4][1] = true;
			 effected[4][2] = true;     effected[4][3] = true;
			 effected[4][4] = true;     effected[4][5] = true;
			 effected[4][7] = true;
		 }
		 if(x==6&&y==5)
		 {
			 effected[0][1] = true;     effected[0][6] = true;
			 effected[1][2] = true;     effected[1][6] = true;
			 effected[2][3] = true;     effected[2][6] = true;
			 effected[3][4] = true;     effected[3][6] = true;
			 effected[4][5] = true;     effected[4][6] = true;
			 effected[6][5] = true;     effected[6][6] = true;
			 effected[7][4] = true;     effected[7][6] = true;
		     effected[5][0] = true;
			 effected[6][7] = true;     effected[5][1] = true;
		     effected[5][2] = true;
			 effected[4][7] = true;     effected[5][3] = true;
			 effected[5][4] = true;     effected[5][5] = true;
			 effected[5][7] = true;
		 }
		 if(x==6&&y==6)
		 {
			 effected[0][0] = true;     effected[0][6] = true;
			 effected[1][1] = true;     effected[1][6] = true;
			 effected[2][2] = true;     effected[2][6] = true;
			 effected[3][3] = true;     effected[3][6] = true;
			 effected[4][4] = true;     effected[4][6] = true;
			 effected[5][5] = true;     effected[5][6] = true;
			 effected[7][7] = true;     effected[6][0] = true;
			 effected[7][5] = true;     effected[6][1] = true;
			 effected[7][6] = true;     effected[6][2] = true;
			 effected[6][7] = true;     effected[6][3] = true;
			 effected[5][7] = true;     effected[6][4] = true;
			 effected[6][5] = true;
		 }
		 if(x==6&&y==7)
		 {
			 effected[1][0] = true;     effected[0][6] = true;
			 effected[2][1] = true;     effected[1][6] = true;
			 effected[3][2] = true;     effected[2][6] = true;
			 effected[4][3] = true;     effected[3][6] = true;
			 effected[5][4] = true;     effected[4][6] = true;
			 effected[6][5] = true;     effected[5][6] = true;
			 effected[6][7] = true;     effected[6][6] = true;
			 effected[7][7] = true;     effected[7][0] = true;
			 effected[7][1] = true;     effected[7][2] = true;
			 effected[7][3] = true;     effected[7][4] = true;
			 effected[7][5] = true;
		 }
		 if(x==7&&y==0)
		 {
			 effected[0][0] = true;     effected[1][7] = true;
			 effected[0][1] = true;     effected[2][7] = true;
			 effected[0][2] = true;     effected[3][7] = true;
			 effected[0][3] = true;     effected[4][7] = true;
			 effected[0][4] = true;     effected[5][7] = true;
			 effected[0][5] = true;     effected[6][7] = true;
			 effected[0][6] = true;     effected[7][7] = true;
			 effected[1][6] = true;     effected[2][5] = true;
			 effected[3][4] = true;     effected[4][3] = true;
			 effected[5][2] = true;     effected[6][1] = true;
			 effected[7][0] = true;
		 }
		 if(x==7&&y==1)
		 {
			 effected[0][6] = true;     effected[2][7] = true;
			 effected[0][7] = true;     effected[3][7] = true;
			 effected[1][0] = true;     effected[4][7] = true;
			 effected[1][1] = true;     effected[5][7] = true;
			 effected[1][2] = true;     effected[6][7] = true;
			 effected[1][3] = true;     effected[7][7] = true;
			 effected[1][4] = true;     effected[2][6] = true;
			 effected[1][5] = true;     effected[3][5] = true;
			 effected[1][6] = true;     effected[4][4] = true;
			 effected[5][3] = true;     effected[6][2] = true;
			 effected[7][1] = true;
		 }
		 if(x==7&&y==2)
		 {
			 effected[0][5] = true;     effected[3][6] = true;
			 effected[0][7] = true;     effected[4][5] = true;
			 effected[1][6] = true;     effected[5][4] = true;
			 effected[1][7] = true;     effected[6][3] = true;
			 effected[2][0] = true;     effected[7][2] = true;
			 effected[2][1] = true;     effected[3][7] = true;  
			 effected[2][2] = true;     effected[4][7] = true;
			 effected[2][3] = true;     effected[5][7] = true;
			 effected[2][4] = true;     effected[6][7] = true;
			 effected[2][5] = true;     effected[7][7] = true;
			 effected[2][6] = true;
		 }
		 if(x==7&&y==3)
		 {
			 effected[0][4] = true;     effected[3][0] = true;
			 effected[1][5] = true;     effected[3][1] = true;
			 effected[2][6] = true;     effected[3][2] = true;
			 effected[4][6] = true;     effected[3][3] = true;
			 effected[5][5] = true;     effected[3][4] = true;
			 effected[6][4] = true;     effected[3][5] = true;
			 effected[7][3] = true;     effected[3][6] = true;
			 effected[0][7] = true;     effected[1][7] = true;
			 effected[2][7] = true;     effected[4][7] = true;
			 effected[5][7] = true;     effected[6][7] = true;
			 effected[7][7] = true;
		 }
		 if(x==7&&y==4)
		 {
			 effected[0][3] = true;     effected[4][0] = true;
			 effected[1][4] = true;     effected[4][1] = true;
			 effected[2][5] = true;     effected[4][2] = true;
			 effected[3][6] = true;     effected[4][3] = true;
			 effected[5][6] = true;     effected[4][4] = true;
			 effected[6][5] = true;     effected[4][5] = true;
			 effected[7][4] = true;     effected[4][6] = true;
			 effected[0][7] = true;     effected[1][7] = true;
			 effected[2][7] = true;     effected[3][7] = true;
			 effected[5][7] = true;     effected[6][7] = true;
			 effected[7][7] = true;
		 }
		 if(x==7&&y==5)
		 {
			 effected[0][2] = true;     effected[5][0] = true;
			 effected[1][3] = true;     effected[5][1] = true;
			 effected[2][4] = true;     effected[5][2] = true;
			 effected[3][5] = true;     effected[5][3] = true;
			 effected[4][6] = true;     effected[5][4] = true;
			 effected[6][6] = true;     effected[5][5] = true;
			 effected[7][5] = true;     effected[5][6] = true;
			 effected[0][7] = true;     effected[1][7] = true;
			 effected[2][7] = true;     effected[3][7] = true;
			 effected[4][7] = true;     effected[6][7] = true;
			 effected[7][7] = true;
		 }
		 if(x==7&&y==6)
		 {
			 effected[0][1] = true;     effected[6][0] = true;
			 effected[1][2] = true;     effected[6][1] = true;
			 effected[2][3] = true;     effected[6][2] = true;
			 effected[3][4] = true;     effected[6][3] = true;
			 effected[4][5] = true;     effected[6][4] = true;
			 effected[5][6] = true;     effected[6][5] = true;
			 effected[6][6] = true;     effected[7][7] = true;
			 effected[7][6] = true;     effected[0][7] = true;
			 effected[1][7] = true;     effected[2][7] = true;
			 effected[3][7] = true;     effected[4][7] = true;
			 effected[5][7] = true;
		 }
		 if(x==7&&y==7)
		 {
			 effected[0][0] = true;     effected[7][0] = true;
			 effected[1][1] = true;     effected[7][1] = true;
			 effected[2][2] = true;     effected[7][2] = true;
			 effected[3][3] = true;     effected[7][3] = true;
			 effected[4][4] = true;     effected[7][4] = true;
			 effected[5][5] = true;     effected[7][5] = true;
			 effected[6][6] = true;     effected[7][6] = true;
			 effected[0][7] = true;     effected[1][7] = true;
			 effected[2][7] = true;     effected[3][7] = true;
			 effected[4][7] = true;     effected[5][7] = true;
			 effected[6][7] = true;
		 }
	}
}
