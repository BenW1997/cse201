import java.util.ArrayList;
import java.util.List;

public class GameState
{
	private Board board = new Board();
	private Player whoseTurn = Player.ONE;
	private int lastMoveFrom = -1;
	
	public GameState()
	{
		board.initialize();
		whoseTurn = Math.random() > 0.5 ? Player.ONE : Player.TWO;
	}
	
	public GameState(Player p)
	{
		board.initialize();
		whoseTurn = p;
	}
	
	public GameState(GameState game)
	{
		this.board = new Board(game.getBoard());
		this.whoseTurn = game.whoseTurn();
		this.lastMoveFrom = game.lastMoveFrom();
	}
	
	// returns all moves made in batches for separate processing
	public List<List<Move>> move(int index)
	{
		List<List<Move>> setOfMoveSets = new ArrayList<>();
		if(!isValidMove(index))
		{
			setOfMoveSets.add(new ArrayList<>()); // may be extraneous
			return setOfMoveSets;
		}
		
		setOfMoveSets.add(getStoneMoves(index));
		if(capturePossible(index))
		{
			setOfMoveSets.add(getCaptureMoves(index));
		}
		if(gameWon())
		{
			setOfMoveSets.add(getWinMoves());
		}
		
		setOfMoveSets.forEach(moveSet -> moveAll(moveSet));
		whoseTurn = whoseTurn.opposite();
		return setOfMoveSets;
	}
	
	public void moveAll(List<Move> moveSet)
	{
		for(Move m : moveSet)
		{
			lastMoveFrom = m.first();
			board.move(m);
		}
	}
	
	public List<Move> getStoneMoves(int index)
	{
		List<Move> moves = new ArrayList<>();
		int stones = board.stones(index);
		
		for(int i = Board.next(index); stones > 0; i = Board.next(i))
		{
			// skip opponent's mancala
			if(!Board.isMancala(i) || Board.player(i) == whoseTurn)
			{
				moves.add(new Move(index, i));
				stones--;
			}
		}
		
		return moves;
	}
	
	public List<Move> getCaptureMoves(int lastMoveDest)
	{
		List<Move> capMoves = new ArrayList<>();
		int ownMancala = (whoseTurn == Player.ONE) ? 6 : 13;
		int opp = Board.getOppositeIndex(lastMoveDest);
		int oppStones = board.stones(opp);
		
		capMoves.add(new Move(lastMoveDest, ownMancala));
		while(oppStones > 0)
		{
			capMoves.add(new Move(opp, ownMancala));
			oppStones--;
		}
		
		return capMoves;
	}
	
	public List<Move> getWinMoves()
	{
		if(!gameWon())
		{
			return new ArrayList<Move>();
		}
		
		List<Move> winMoves = new ArrayList<>();
		Player receivingPlayer = null;
		int receivingMancala = -1;
		
		// determine who has stones left
		for(int i = 0; i <= 13; i++)
		{
			if(Board.isMancala(i))
			{
				continue;
			}
			
			if(board.stones(i) > 0)
			{
				receivingPlayer = Board.player(i);
				receivingMancala = Board.mancalaOf(receivingPlayer);
				assert (receivingPlayer == whoseTurn.opposite());
				
				break;
			}
		}
		
		// move stones to mancala
		for(int i = 0; i <= 13; i++)
		{
			if(!Board.isMancala(i) && Board.player(i) == receivingPlayer)
			{
				for(int j = board.stones(i); j > 0; j--)
				{
					winMoves.add(new Move(i, receivingMancala));
				}
			}
		}
		
		return winMoves;
	}
	
	public boolean isValidMove(int index)
	{
		if(0 > index || index > 13)
		{
			return false;
		}
		if(Board.player(index) != whoseTurn)
		{
			return false;
		}
		if(board.stones(index) < 1)
		{
			return false;
		}
		if(index == 6 || index == 13)
		{
			return false;
		}
		
		return true;
	}
	
	public List<Integer> validMoves()
	{
		List<Integer> valid = new ArrayList<>();
		
		// only check ranges known to be owned by player
		int start = (whoseTurn == Player.ONE) ? 0 : 7;
		int finish = (whoseTurn == Player.ONE) ? 5 : 12;
		
		for(int i = start; i <= finish; i++)
		{
			if(isValidMove(i))
			{
				valid.add(i);
			}
		}
		
		return valid;
	}
	
	public boolean gameWon()
	{
		boolean empty1 = true;
		boolean empty2 = true;
		
		for(int i = 0; i <= 5; i++)
		{
			if(board.stones(i) != 0)
			{
				empty1 = false;
				break;
			}
		}
		
		for(int i = 7; i <= 12; i++)
		{
			if(board.stones(i) != 0)
			{
				empty2 = false;
				break;
			}
		}
		
		return empty1 || empty2;
	}
	
	public boolean capturePossible(int lastMoveDest)
	{
		int opp = Board.getOppositeIndex(lastMoveDest);
		
		// do not capture from mancalas
		if(lastMoveDest % 7 == 6)
		{
			return false;
		}
		// do not capture when not empty bin
		if(board.stones(lastMoveDest) != 1)
		{
			return false;
		}
		// no capturing from own bin
		if(Board.player(opp) == whoseTurn)
		{
			return false;
		}
		
		// only capture with stones in opposite bin
		return board.stones(opp) != 0;
	}
	
	public Player whoseTurn()
	{
		return whoseTurn;
	}
	
	// returns -1 if the board is fresh. otherwise, returns last index a move
	// was made from.
	public int lastMoveFrom()
	{
		return lastMoveFrom;
	}
	
	public Player winner()
	{
		int p1Score = board.getBins()[Board.mancalaOf(Player.ONE)];
		int p2Score = board.getBins()[Board.mancalaOf(Player.TWO)];
		
		return p1Score > p2Score ? Player.ONE : Player.TWO;
	}
	
	public Board getBoard()
	{
		return this.board;
	}
	
	public String toString()
	{
		return board.toString();
	}
}