
public class MonteCarloSearchTree
{
	// Exploration parameter - weight given to exploring less explored moves
	private final double EXPLORATION = Math.sqrt(2);
	
	private Node<MonteCarloStats<Integer>> root;
	private GameState gamePrototype;
	
	public MonteCarloSearchTree(GameState game)
	{
		this.gamePrototype = game;
		this.root = new Node<>(new MonteCarloStats<>(game.whoseTurn(), null)); //TODO
	}
	
	/**
	 * UCT (Upper Confidence Bound 1 applied to trees) formula <br />
	 * See: https://en.wikipedia.org/wiki/Monte_Carlo_tree_search
	 *
	 * @param w_i wins for current node after i-th move
	 * @param n_i simulations for node after i-th move
	 * @param c   exploration parameter - weight given to exploration of moves
	 *            with few simulations - optimized by experimentation
	 * @param t   total simulations are i-th move (or n_i for parent node)
	 * @return
	 */
	public final double uct(int w_i, int n_i, int t, double c)
	{
		return ((double) w_i) / ((double) n_i)
				+ c * Math.sqrt(Math.log(t) / n_i);
	}
	
	private class MonteCarloStats<T>
	{
		private int wins = 0;
		private int visits = 0;
		private final Player player;
		private final T move; // move which caused this node
		
		public MonteCarloStats(Player p, T move)
		{
			this.player = p;
			this.move = move;
		}
		
		public void addWin()
		{
			wins++;
			visits++;
		}
		
		public void addLoss()
		{
			visits++;
		}
		
		public int wins()
		{
			return wins;
		}
		
		public int visits()
		{
			return visits;
		}
		
		public Player player()
		{
			return player;
		}
		
		public T move()
		{
			return move;
		}
	}
}
