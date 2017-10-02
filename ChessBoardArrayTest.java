package test;
import implementation.ChessBoard;
public class ChessBoardArrayTest {
     
	public static void main(String[] args)
	{
		int count =0;
		ChessBoard board = new ChessBoard();
		for(int[] array:board.locations)
		{
			for(int a:array)
			{
				if(a<10) {
				System.out.print(a+"  ");
				}else{
			    System.out.print(a+" ");	
				}
				count++;
				if(count%8==0)
				{
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
