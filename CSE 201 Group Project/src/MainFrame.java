import javax.swing.JFrame;
import java.awt.CardLayout;

public class MainFrame extends JFrame
{
	private static final long serialVersionUID = 6659612348166945287L;
	final static String MAINPANEL = "Card with Main Menu";
	final static String GAMEPANEL = "Card with Game Screen";
	
	public MainFrame()
	{
		setSize(1024,600);
		getContentPane().setLayout(new CardLayout(0, 0));
	}
	
}
