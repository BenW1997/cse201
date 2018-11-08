import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class Main_window
{
	
	private JFrame frame;
	private JDialog statDialog;
	
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
					Main_window window = new Main_window();
					window.frame.setLocationByPlatform(true);
					window.frame.setVisible(true);
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
	public Main_window()
	{
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jplStart = new JPanel(new BorderLayout());
		
		JLabel lblMancala = new JLabel("Mancala");
		lblMancala.setHorizontalAlignment(SwingConstants.CENTER);
		lblMancala.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		jplStart.add(lblMancala, BorderLayout.NORTH);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		jplStart.add(horizontalStrut, BorderLayout.WEST);
		
		Box horizontalBox = Box.createHorizontalBox();
		jplStart.add(horizontalBox, BorderLayout.EAST);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		jplStart.add(verticalStrut, BorderLayout.SOUTH);
		
		Box verticalBox = Box.createVerticalBox();
		jplStart.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlay.setPreferredSize(new Dimension(200, 60));
		btnPlay.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				frame.setVisible(false);
				initialize2();
				frame.setVisible(true);
			}
		});
		
		horizontalBox_1.add(btnPlay);
		btnPlay.setVerticalAlignment(SwingConstants.TOP);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_2);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStatistics.setPreferredSize(new Dimension(200, 60));
		btnStatistics.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				frame.setVisible(false);
				initialize3();
				//frame.setVisible(true);
			}
		});
		
		horizontalBox_2.add(btnStatistics);
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_3);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.setPreferredSize(new Dimension(200, 60));
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				frame.setVisible(false);
				System.exit(0);
			}
		});
		
		horizontalBox_3.add(btnExit);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		frame.getContentPane().add(jplStart);
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize2()
	{
		frame = new JFrame();
		JPanel jplMancala = new JPanel();
		jplMancala.setLayout(null);
		String four = "4";
		frame.setBounds(100, 100, 1040, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(0, 0, 1034, 619);
		jplMancala.add(horizontalBox);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut_2);
		
		JLabel lblbotbin = new JLabel("0");
		lblbotbin.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblbotbin.setHorizontalAlignment(SwingConstants.CENTER);
		lblbotbin.setFont(new Font("Tahoma", Font.PLAIN, 99));
		horizontalBox.add(lblbotbin);
		
		Component verticalStrut_17 = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut_17);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox.add(verticalBox);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_8);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setAlignmentY(Component.CENTER_ALIGNMENT);
		verticalBox.add(horizontalBox_1);
		
		JLabel bin6 = new JLabel("4");
		bin6.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin6.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin6);
		
		JLabel bin5 = new JLabel("4");
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_11);
		bin5 = new JLabel(four);
		bin5.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin5.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin5);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_10);
		
		JLabel bin4 = new JLabel("4");
		bin4.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin4.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin4);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_9);
		
		JLabel bin3 = new JLabel("4");
		bin3.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin3.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin3);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_8);
		
		JLabel bin2 = new JLabel("4");
		bin2.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin2.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin2);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_7);
		
		JLabel bin1 = new JLabel("4");
		bin1.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin1.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin1);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_7);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		JButton btnNewButton_1 = new JButton("Surrender");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		horizontalBox_3.add(btnNewButton_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut);
		
		JLabel lblNewLabel = new JLabel("Turn");
		horizontalBox_3.add(lblNewLabel);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_1);
		
		JButton btnEnd = new JButton("End");
		btnEnd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				frame.setVisible(false);
				initialize();
				frame.setVisible(true);
			}
		});
		horizontalBox_3.add(btnEnd);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_6);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JButton btnbin1 = new JButton("4");
		btnbin1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});
		btnbin1.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox_2.add(btnbin1);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_4);
		
		JButton btnbin2 = new JButton("4");
		btnbin2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		horizontalBox_2.add(btnbin2);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_5);
		
		JButton btnbin3 = new JButton("4");
		btnbin3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		horizontalBox_2.add(btnbin3);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_6);
		
		JButton btnbin4 = new JButton("4");
		btnbin4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		horizontalBox_2.add(btnbin4);
		
		Component verticalStrut_14 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_14);
		
		JButton btnbin5 = new JButton("4");
		btnbin5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		horizontalBox_2.add(btnbin5);
		
		Component verticalStrut_15 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_15);
		
		JButton btnbin6 = new JButton("4");
		btnbin6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		horizontalBox_2.add(btnbin6);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_5);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut_1);
		
		JLabel lblplayerbin = new JLabel("0");
		lblplayerbin.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblplayerbin.setFont(new Font("Tahoma", Font.PLAIN, 99));
		lblplayerbin.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox.add(lblplayerbin);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(
				"assets/MANCALA-game_bg_combined.jpg"));
		Background.setBounds(0, 0, 1024, 600);
		jplMancala.add(Background);
		frame.getContentPane().add(jplMancala);
	}
	
	private void initialize3()
	{
		//frame = new JFrame();
		//frame.setBounds(100, 100, 1280, 720);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jplStat = new JPanel(new BorderLayout());
		statDialog = new JDialog();
		statDialog.setBounds(200, 200, 640, 460);
		statDialog.setMinimumSize(new Dimension(500, 400));
		statDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		statDialog.setAlwaysOnTop(true);
		
		Box verticalBox_2 = Box.createVerticalBox();
		//frame.getContentPane().add(verticalBox_2, BorderLayout.CENTER);
		jplStat.add(verticalBox_2, BorderLayout.CENTER);
		
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setEnabled(false);
		horizontalBox.add(horizontalStrut_2);
		
		Box verticalBox = Box.createVerticalBox();
		horizontalBox.add(verticalBox);
		
		JLabel lblNewLabel = new JLabel("Wins:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		verticalBox.add(lblNewLabel);
		
		JLabel lblLosses = new JLabel("Losses: ");
		lblLosses.setFont(new Font("Tahoma", Font.BOLD, 40));
		verticalBox.add(lblLosses);
		
		JLabel lblGames = new JLabel("Games:");
		lblGames.setFont(new Font("Tahoma", Font.BOLD, 40));
		verticalBox.add(lblGames);
		
		JLabel lblPercentWin = new JLabel("Percent Win:");
		lblPercentWin.setFont(new Font("Tahoma", Font.BOLD, 40));
		verticalBox.add(lblPercentWin);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut_1);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		verticalBox_1.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		verticalBox_1.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		verticalBox_1.add(label_3);
		
		JLabel label_1 = new JLabel("0%");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		verticalBox_1.add(label_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_1);
		
		JButton btnReturn = new JButton("Return");
		horizontalBox_1.add(btnReturn);
		btnReturn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				statDialog.setVisible(false);
				initialize();
				//frame.setVisible(true);
			}
		});
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox_2.add(verticalStrut);
		
		statDialog.getContentPane().add(jplStat);
		statDialog.setVisible(true);
		statDialog.pack();
	}
}
