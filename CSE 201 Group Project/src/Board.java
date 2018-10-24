import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Board
{
	/*
	 * Bin 6 and bin 13 are mancalas. Bins 0 through 6 belong to player one.
	 * Bins 7 through 13 belong to player two.
	 */
	public final static int SIZE = 14;
	
	private int[] bins;
	
	public Board()
	{
		initialize();
	}
	
	public void initialize()
	{
		bins = new int[SIZE];
		
		for(int i = 0; i < SIZE; i++)
		{
			bins[i] = isMancala(i) ? 0 : 4;
		}
	}
	
	public void move(int source, int destination)
	{
		bins[source]--;
		bins[destination]++;
	}

	public int stones(int index)
	{
		return bins[index];
	}
	
	public void setStones(int index, int count)
	{
		bins[index] = count;
	}
	
	public static void checkBounds(int index) throws IndexOutOfBoundsException
	{
		if(0 > index || index >= SIZE)
		{
			throw new IndexOutOfBoundsException();
		}
	}

	public static int getOppositeIndex(int index)
	{
		checkBounds(index);
		
		// The equation breaks for indices 0 and 7, so we make exceptions.
		if(index == 0)
		{
			return SIZE / 2;
		}
		else if(index == SIZE / 2)
		{
			return 0;
		}
		
		return SIZE - index; // TODO check logic
	}

	public static boolean isMancala(int index)
	{
		return index % (SIZE / 2) == SIZE / 2 - 1; // only indices 6, 13
	}

	public static int next(int index)
	{
		return (index + 1) % SIZE;
	}

	public static Player player(int index)
	{
		return (index < SIZE / 2) ? Player.ONE : Player.TWO;
	}

	public String toString()
	{
		String s = "";
		
		/*
		 * for(Bin b : bins) { s += b.Player + ","; s += b.getStones() +
		 * ","; s += b.isMancala() ? "O" : "_"; s += "; "; } s += "\n";
		 */
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		
		ps.println("The board now is");
		ps.println("    ");
		for(int i = 13; i > 7; i--)
		{
			ps.print("    ");
			ps.printf("%02d", bins[(i - 1) % 14]);
		}
		ps.println("    ");
		ps.println(bins[13]
				+ "                                     "
				+ bins[6]);
		for(int i = 1; i < 7; i++)
		{
			ps.print("    ");
			ps.printf("%02d", bins[(i - 1) % 14]);
		}
		ps.println("    ");
		
		s += os.toString() + "\n";
		
		return s;
	}
	
}