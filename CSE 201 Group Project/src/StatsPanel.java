import javax.swing.JPanel;

public class StatsPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8241652495599333317L;
	private JPanel panel;
	
	/**
	 * Create the application.
	 */
	public StatsPanel()
	{
		initialize_sp();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize_sp()
	{
		panel = new JPanel();
		panel.setSize(1024, 600);
		
		
	}
	
}
