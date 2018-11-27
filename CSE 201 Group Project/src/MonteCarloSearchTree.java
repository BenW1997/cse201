import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class MonteCarloSearchTree
{
	// Exploration parameter - weight given to exploring less explored moves
	// Best value found through experimentation
	private final double EXPLORATION = Math.sqrt(2);
	
	private Node<Stats> root;
	private GameState gamePrototype;
	private Player thisPlayer;
	private Random random = new Random();
	
	public MonteCarloSearchTree(GameState game)
	{
		this.gamePrototype = game;
		this.root = new Node<>(new Stats(gamePrototype));
		this.thisPlayer = this.gamePrototype.whoseTurn();
	}
	
	public Node<Stats> bestChild(Node<Stats> parent)
	{
		if(parent.isRoot())
		{
			return parent;
		}
		
		
		Node<Stats> best = null;
		
		for(Node<Stats> n : parent.getChildren())
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
	
	public Node<Stats> select(Node<Stats> from)
	{
		// TODO double check logic
		Node<Stats> max = null;
		double maxSelectionFunction = -1.0;
		while(from.getChildren().size() > 0)
		{
			for(Node<Stats> child : from.getChildren())
			{
				
				if(max == null)
				{
					max = child;
				}
				
				Stats statNode = child.getData();
				double selectionFunction = uct(statNode.wins(),
						statNode.visits(), root.getData().visits(),
						EXPLORATION);
				
				if(selectionFunction > maxSelectionFunction)
				{
					max = child;
				}
			}
			
			from = max;
			max = null;
			maxSelectionFunction = -1;
		}
		
		return select(max);
	}
	
	// returns new stat node based on random play
	public Stats simulate(Node<Stats> leaf)
	{
		List<Integer> moveList;
		GameState fromLeaf;
		Stats statsFrom = leaf.getData();
		
		// move up tree to get reversed move list
		Stack<Integer> moveStack = new Stack<>();
		Node<Stats> current = leaf;
		while(!current.isRoot())
		{
			moveStack.push(current.getData().move());
			current = leaf.getParent();
		}
		
		// pop off stack to get chronological order
		moveList = new ArrayList<>(moveStack.size());
		while(!moveStack.isEmpty())
		{
			moveList.add(moveStack.pop());
		}
		
		// simulate up to where leaf left off
		fromLeaf = new GameState(gamePrototype);
		for(Integer m : moveList)
		{
			fromLeaf.move(m);
		}
		
		// simulate random play until win condition is reached
		while(!fromLeaf.gameWon())
		{
			fromLeaf.move(randomFromList(fromLeaf.validMoves()));
		}
		
		if(fromLeaf.winner() == thisPlayer)
		{
			statsFrom.addWin();
		}
		else
		{
			statsFrom.addLoss();
		}
		
		return statsFrom;
	}
	
	private <E> E randomFromList(List<E> list)
	{
		E randomElement;
		
		int randIndex = random.nextInt(list.size());
		randomElement = list.get(randIndex);
		
		return randomElement;
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
	
	public Node<Stats> getRoot()
	{
		return this.root;
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
