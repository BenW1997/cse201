public class MancalaController
{
	GameState game;
	MainWindow view;
	
	public MancalaController(GameState game, MainWindow view)
	{
		this.game = game;
		this.view = view;
		this.view.initialize2();
	}
	
	public void move(int index)
	{
		
	}
}
