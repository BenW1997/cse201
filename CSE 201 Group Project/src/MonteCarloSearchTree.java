public class MonteCarloSearchTree
{
	// Exploration parameter - weight given to exploring less explored moves
	// Best value found through experimentation
	private final double EXPLORATION = Math.sqrt(2);
	
	private Node<MonteCarloStats> root;
	private GameState gamePrototype;
	
	public MonteCarloSearchTree(GameState game)
	{
		this.gamePrototype = game;
		this.root = new Node<>(new MonteCarloStats(gamePrototype));
	}
	
	public Node<MonteCarloStats> bestChild(Node<MonteCarloStats> parent)
	{
		Node<MonteCarloStats> best = null;
		
		for(Node<MonteCarloStats> n : parent.getChildren())
		{
			if(best == null)
			{
				best = n;
				continue;
			}
			
			if(n.getData().compareTo(best.getData()) > 1)
			{
				best = n;
			}
		}
		
		return best;
	}
	
	public Node<MonteCarloStats> select(Node<MonteCarloStats> from)
	{
		if(from.getChildren().size() == 0)
		{
			return from;
		}
		
		Node<MonteCarloStats> max = null;
		for(Node<MonteCarloStats> child : from.getChildren())
		{
			if(max == null)
			{
				max = child;
				continue;
			}
			
			if(child.getData().compareTo(max.getData()) > 0)
			{
				max = child;
			}
		}
		
		return select(max);
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
		assert (w_i <= n_i);
		assert (n_i <= t);
		
		// avoid division by zero
		if(n_i == 0)
		{
			n_i = 1;
		}
		
		return ((double) w_i) / ((double) n_i)
				+ c * Math.sqrt(Math.log(t) / n_i);
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Root Game:").append(System.lineSeparator())
				.append(gamePrototype);
		sb.append("Tree:").append(System.lineSeparator()).append(root);
		
		return sb.toString();
	}
}
