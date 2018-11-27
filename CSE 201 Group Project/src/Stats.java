
public class Stats implements Comparable<Stats>
	{
		private int wins = 0;
		private int visits = 0;
		private GameState game;
		private Integer move;
		
		public Stats(GameState game)
		{
			this.game = game;
		}
		
		public Stats(GameState game, Integer move)
		{
			this.game = game;
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
		
		public void setWins(int wins)
		{
			this.wins = wins;
		}
		
		public void setVisits(int visits)
		{
			this.visits = visits;
		}
		
		public void setMove(Integer move)
		{
			this.move = move;
		}
		
		public int wins()
		{
			return wins;
		}
		
		public int visits()
		{
			return visits;
		}
		
		public Integer move()
		{
			return move;
		}
		
		public GameState game()
		{
			return game;
		}
		
		public double ratio()
		{
			return (double) wins / (double) visits;
		}
		
		public String toString()
		{
			StringBuilder sb = new StringBuilder();
			
			sb.append("(Wins: ").append(wins);
			sb.append(", Visits: ").append(visits);
			sb.append(", Player: ").append(game.whoseTurn());
			sb.append(", Move: ").append(move);
			sb.append(")");
			
			return sb.toString();
		}
		
		public int compareTo(Stats arg0)
		{
			return Double.compare(this.visits(), arg0.visits());
		}
	}