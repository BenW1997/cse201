import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MachineInput implements PlayerInput
{
	// Moves possible for AI only for bins 7 - 12.
	// It owns 7 - 13, but 13 is a mancala.
	
	private final int[] ALL_MOVES_POSSIBLE =
	{ 7, 8, 9, 10, 11, 12 };
	private Map<SCORE_TYPE, Double> biasFromType;
	
	
	
	public MachineInput()
	{
		biasFromType = new HashMap<>();
		biasFromType.put(SCORE_TYPE.CAN_LAND_IN_MANCALA, 1.0);
	}
	
	public int getMove(Board boardState)
	{
		// find max weight and get corresponding move
		int maxIndex = 0;
		double max = 0.0;
		for(int i = 0; i < ALL_MOVES_POSSIBLE.length; ++i)
		{
			double weight = getWeight(ALL_MOVES_POSSIBLE[i], boardState);
			if(weight > max)
			{
				maxIndex = i;
				max = weight;
			}
		}
		
		return ALL_MOVES_POSSIBLE[maxIndex];
	}
	
	// TODO Finish method
	private double getWeight(int move, Board boardState)
	{
		
		return Math.random();
	}
	
	public static double canLandInMancala(Integer move, Board boardState)
	{
		return 0.0; // TODO
	}
	
	public static double captureMade(Integer move, Board boardState)
	{
		return 0.0; //TODO
	}
}
