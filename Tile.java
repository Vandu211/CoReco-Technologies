package task.com;

public class Tile {

	public static void main(String[] args) {

		possibleBonus(3,7);
		possibleBonus(1,9);
		possibleBonus(5,3);
		
	}

	public static void possibleBonus(int mytile,int friendtile)
	{
		int mytilemin=mytile+1;//6
		int mytilemax=mytile+6;//11
		
		int friendtilemin=friendtile+1;//4
		int friendtilemax=friendtile+6;//9
		
		if(mytilemin<=friendtilemax && friendtilemin<=mytilemax && mytile!=friendtile)
		{    
		    System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
