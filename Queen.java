package implementation;

import queenexceptions.QueenException;

public class Queen extends Node
{
    private String location;
    private boolean visited;
    private Color color;
	
	private static int count = 1;
	
    public Queen (String location) throws QueenException    {
    	if(location.length()==2)
    	{
    	if(location.startsWith("a")||location.startsWith("A")||
    			location.startsWith("b")||location.startsWith("B")||
    			location.startsWith("c")||location.startsWith("C")||
    			location.startsWith("d")||location.startsWith("D")||
    			location.startsWith("e")||location.startsWith("E")||
    			location.startsWith("f")||location.startsWith("F")||
    			location.startsWith("g")||location.startsWith("G")||
    			location.startsWith("h")||location.startsWith("H"))
    	{
    		if(location.endsWith("1")||location.endsWith("2")||
    				location.endsWith("3")||location.endsWith("4")||
    				location.endsWith("5")||location.endsWith("6")||
    				location.endsWith("7")||location.endsWith("8"))
    		{
    			this.location = location;
    			setVisited(false);
    			setColor(Color.WHITE);
    		}else{
    			throw new QueenException
    			("second character must be a number between 1-8");
    		}
    	}else {
    		throw new QueenException("that is not at the board");
    	}
    	}else {
    		throw new QueenException("location's length must be two  ");
    	}
    }

	public String getLocation() {
		return location;
	}
	public boolean isVisited() {
			return visited;
	}

	public void setVisited(boolean visited) {
			this.visited = visited;
	}
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		if(location.equals("A8"))
		{
			count = 1;
			return "Queen "+count++;
		}else if(location.startsWith("a"))
		{
			return "Queen 1";
		}
		else if(location.startsWith("b"))
		{
			return "Queen 2";
		}
		else if(location.startsWith("c"))
		{
			return "Queen 3";
		}
		else if(location.startsWith("d"))
		{
			return "Queen 4";
		}
		else if(location.startsWith("e"))
		{
			return "Queen 5";
		}
		else if(location.startsWith("f"))
		{
			return "Queen 6";
		}
		else if(location.startsWith("g"))
		{
			return "Queen 7";
		}
		else if(location.startsWith("h"))
		{
			return "Queen 8";
		}
		else{
			return "Queen "+count++;
		}
	}
}
