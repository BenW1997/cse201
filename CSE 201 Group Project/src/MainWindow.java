import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class MainWindow
{
	
	private JFrame frame;
	private JDialog statDialog;
	private GameState game;
	
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					@SuppressWarnings("unused")
					MainWindow window = new MainWindow(new GameState());
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public MainWindow(GameState game)
	{
		this.game = game;
		//frameInitialize();
		initialize();
	}
	
	
	/**
	 * Initialize the frame.
	 */
	public void frameInitialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize()
	{
		frameInitialize();
		
		JComponent jplMain = JCompFactories.jcompMain();
		frame.setSize(jplMain.getPreferredSize());
		frame.getContentPane().add(jplMain);
		frame.pack();
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize2()
	{
		frameInitialize();
		
		JComponent jplMancala = JCompFactories.jcompMancala();
		frame.setSize(jplMancala.getPreferredSize());
		frame.getContentPane().add(jplMancala);
		frame.pack();
	}
	
	
	public void statDialogInitialize()
	{
		statDialog = new JDialog();
		//statDialog.setBounds(200, 200, 640, 460);
		statDialog.setMinimumSize(new Dimension(500, 400));
		statDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		statDialog.setAlwaysOnTop(true);
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize3()
	{
		//frameInitialze();
		
		JComponent jplStat = JCompFactories.jcompStat();
		statDialogInitialize();
		
		statDialog.setBounds(jplStat.getBounds());
		statDialog.getContentPane().add(jplStat);
		statDialog.setVisible(true);
		statDialog.pack();
	}
}
