import java.util.ArrayList;
import java.util.List;

public class GameState
{
	Board board = new Board();
	Player whoseTurn = Player.ONE;
	
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
	
	public void move(List<Pair> moveSet)
	{
		for(Pair m : moveSet)
		{
			board.move(m);
		}
	}
	
	public List<Pair> getStoneMoves(int index)
	{
		List<Pair> moves = new ArrayList<>();
		int stones = board.stones(index);
		
		for(int i = Board.next(index); stones > 0; i = Board.next(i))
		{
			// skip opponent's mancala
			if(!Board.isMancala(i) || Board.player(i) == whoseTurn)
			{
				moves.add(new Pair(index, i));
				stones--;
			}
		}
		
		return moves;
	}
	
	public List<Pair> getCaptureMoves(int lastMoveDest)
	{
		List<Pair> capMoves = new ArrayList<>();
		int ownMancala = (whoseTurn == Player.ONE) ? 6 : 13;
		int opp = Board.getOppositeIndex(lastMoveDest);
		int oppStones = board.stones(opp);
		
		capMoves.add(new Pair(lastMoveDest, ownMancala));
		while(oppStones > 0)
		{
			capMoves.add(new Pair(opp, ownMancala));
			oppStones--;
		}
		
		return capMoves;
	}
	
	public List<Pair> getWinMoves()
	{
		if(!gameWon())
		{
			return new ArrayList<Pair>();
		}
		
		List<Pair> winMoves = new ArrayList<>();
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
					winMoves.add(new Pair(i, receivingMancala));
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
			if(board.stones(i) > 0)
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
	
	public Board getBoard()
	{
		return this.board;
	}
	
	public String toString()
	{
		return board.toString();
	}
}