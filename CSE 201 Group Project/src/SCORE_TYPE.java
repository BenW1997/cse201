import java.util.function.BiFunction;

public enum SCORE_TYPE
{
	CAN_LAND_IN_MANCALA, DOES_CAPTURE,;
	
	private BiFunction<Integer, Board, Double> function;
	private int priority; // lower number is higher priority
	
	static
	{
		CAN_LAND_IN_MANCALA.function = (m, w) ->
		{
			return MachineInput.canLandInMancala(m, w);
		};
		CAN_LAND_IN_MANCALA.priority = 0;
		// DOES_CAPTURE.function = MachineInput::captureMade;
		DOES_CAPTURE.priority = 1;
	}
	
	public SCORE_TYPE[] typeArray()
	{
		SCORE_TYPE[] types = new SCORE_TYPE[2];
		types[0] = CAN_LAND_IN_MANCALA;
		types[1] = DOES_CAPTURE;
		return types;
	}
	
	public int priority()
	{
		return this.priority;
	}
	
	public BiFunction<Integer, Board, Double> function()
	{
		return this.function;
	}
};