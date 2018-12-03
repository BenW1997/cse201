import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainPanel extends JPanel
{
	
	String b0;
	String b1;
	String b2;
	String b3;
	String b4;
	String b5;
	String m6;
	String l7;
	String l8;
	String l9;
	String l10;
	String l11;
	String l12;
	String m13;
	
	private JPanel panel_mp;
	
	/**
	 * Create the application.
	 */
	public void updates(int[] bins)
	{
		b0 = Integer.toString(bins[0]);
		b1 = Integer.toString(bins[1]);
		b2 = Integer.toString(bins[2]);
		b3 = Integer.toString(bins[3]);
		b4 = Integer.toString(bins[4]);
		b5 = Integer.toString(bins[5]);
		m6 = Integer.toString(bins[6]);
		l7 = Integer.toString(bins[7]);
		l8 = Integer.toString(bins[8]);
		l9 = Integer.toString(bins[9]);
		l10 = Integer.toString(bins[10]);
		l11 = Integer.toString(bins[11]);
		l12 = Integer.toString(bins[12]);
		m13 = Integer.toString(bins[13]);
		System.out.println(m13);
		// initialize2();
	}
	
	public MainPanel()
	{
		initialize_mp();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize_mp()
	{
		panel_mp = new JPanel();
		panel_mp.setSize(1040, 639);
		panel_mp.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_top_margin = Box.createRigidArea(new Dimension(100, 100));
		panel_mp.add(rigidArea_top_margin, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		panel_mp.add(verticalBox);
		
		Box horizontalBox_label = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_label);
		
		JLabel lblMancala = new JLabel("Mancala");
		horizontalBox_label.add(lblMancala);
		lblMancala.setHorizontalAlignment(SwingConstants.CENTER);
		lblMancala.setFont(new Font("Ubuntu Light", Font.BOLD, 99));
		
		Component verticalStrut = Box.createVerticalStrut(32);
		verticalBox.add(verticalStrut);
		
		Box verticalBox_buttons = Box.createVerticalBox();
		verticalBox.add(verticalBox_buttons);
		
		Box horizontalBox_play_button = Box.createHorizontalBox();
		verticalBox_buttons.add(horizontalBox_play_button);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setPreferredSize(new Dimension(250, 100));
		btnPlay.setFont(new Font("Open Sans", Font.BOLD, 40));
		btnPlay.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				/*
				 * panel.setVisible(false); initialize2();
				 * panel.setVisible(true);
				 */
			}
		});
		
		horizontalBox_play_button.add(btnPlay);
		btnPlay.setVerticalAlignment(SwingConstants.TOP);
		
		Box horizontalBox_stats_button = Box.createHorizontalBox();
		verticalBox_buttons.add(horizontalBox_stats_button);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setPreferredSize(new Dimension(250, 100));
		btnStatistics.setFont(new Font("Open Sans", Font.BOLD, 40));
		btnStatistics.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				/*
				 * panel.setVisible(false); initialize3();
				 * panel.setVisible(true);
				 */
			}
		});
		
		horizontalBox_stats_button.add(btnStatistics);
		
		Box horizontalBox_exit_button = Box.createHorizontalBox();
		verticalBox_buttons.add(horizontalBox_exit_button);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setPreferredSize(new Dimension(250, 100));
		btnExit.setFont(new Font("Open Sans", Font.BOLD, 40));
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				panel_mp.setVisible(false);
			}
		});
		
		horizontalBox_exit_button.add(btnExit);
		
		Component rigidArea_bottom_margin = Box.createRigidArea(new Dimension(100, 100));
		panel_mp.add(rigidArea_bottom_margin, BorderLayout.SOUTH);
	}
}
