import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_window{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_window window = new Main_window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public Main_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 1040, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblMancala = new JLabel("Mancala");
		lblMancala.setHorizontalAlignment(SwingConstants.CENTER);
		lblMancala.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		frame.getContentPane().add(lblMancala, BorderLayout.NORTH);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		frame.getContentPane().add(horizontalStrut, BorderLayout.WEST);
		
		Box horizontalBox = Box.createHorizontalBox();
		frame.getContentPane().add(horizontalBox, BorderLayout.EAST);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		frame.getContentPane().add(verticalStrut, BorderLayout.SOUTH);
		
		Box verticalBox = Box.createVerticalBox();
		frame.getContentPane().add(verticalBox, BorderLayout.CENTER);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_3);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				initialize2();
				frame.setVisible(true);
			}
		});
		
		horizontalBox_1.add(btnPlay);
		btnPlay.setVerticalAlignment(SwingConstants.TOP);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_2);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				initialize3();
				frame.setVisible(true);
			}
		});
		
		horizontalBox_2.add(btnStatistics);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_1);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		
		horizontalBox_3.add(btnExit);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_4);
	}

	
private void initialize2() {
		
		String four = "4";
		frame = new JFrame();
		frame.setBounds(300, 100, 1040, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(0, 0, 1034, 619);
		frame.getContentPane().add(horizontalBox);
		
		Component verticalStrut_19 = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut_19);
		
		JLabel lblbotbin = new JLabel("0");
		lblbotbin.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblbotbin.setHorizontalAlignment(SwingConstants.CENTER);
		lblbotbin.setFont(new Font("Tahoma", Font.PLAIN, 99));
		horizontalBox.add(lblbotbin);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox.add(verticalBox);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_8);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setAlignmentY(Component.CENTER_ALIGNMENT);
		verticalBox.add(horizontalBox_1);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_3);
		
		JLabel bin6 = new JLabel("4");
		bin6.setFont(new Font("Tahoma", Font.BOLD, 20));
		bin6.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin6.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin6);
		
		JLabel bin5 = new JLabel("4");
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_11);
		bin5 = new JLabel(four);
		bin5.setFont(new Font("Tahoma", Font.BOLD, 20));
		bin5.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin5.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin5);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_10);
		
		JLabel bin4 = new JLabel("4");
		bin4.setFont(new Font("Tahoma", Font.BOLD, 20));
		bin4.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin4.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin4);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_9);
		
		JLabel bin3 = new JLabel("4");
		bin3.setFont(new Font("Tahoma", Font.BOLD, 20));
		bin3.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin3.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin3);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_8);
		
		JLabel bin2 = new JLabel("4");
		bin2.setFont(new Font("Tahoma", Font.BOLD, 20));
		bin2.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin2.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin2);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_7);
		
		JLabel bin1 = new JLabel("4");
		bin1.setFont(new Font("Tahoma", Font.BOLD, 20));
		bin1.setAlignmentX(Component.CENTER_ALIGNMENT);
		bin1.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox_1.add(bin1);
		
		Component verticalStrut_12 = Box.createVerticalStrut(20);
		horizontalBox_1.add(verticalStrut_12);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_7);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		JButton btnNewButton_1 = new JButton("Surrender");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Component verticalStrut = Box.createVerticalStrut(20);
		horizontalBox_3.add(verticalStrut);
		horizontalBox_3.add(btnNewButton_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut);
		
		JLabel lblNewLabel = new JLabel("Turn");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		horizontalBox_3.add(lblNewLabel);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_1);
		
		JButton btnEnd = new JButton("End");
		btnEnd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				initialize();
				frame.setVisible(true);
			}
		});
		horizontalBox_3.add(btnEnd);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		horizontalBox_3.add(verticalStrut_2);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_6);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JButton btnbin1 = new JButton("4");
		btnbin1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_1);
		horizontalBox_2.add(btnbin1);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_4);
		
		JButton btnbin2 = new JButton("4");
		btnbin2.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbin2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		horizontalBox_2.add(btnbin2);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_5);
		
		JButton btnbin3 = new JButton("4");
		btnbin3.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbin3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		horizontalBox_2.add(btnbin3);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_6);
		
		JButton btnbin4 = new JButton("4");
		btnbin4.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbin4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		horizontalBox_2.add(btnbin4);
		
		Component verticalStrut_14 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_14);
		
		JButton btnbin5 = new JButton("4");
		btnbin5.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbin5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		horizontalBox_2.add(btnbin5);
		
		Component verticalStrut_15 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_15);
		
		JButton btnbin6 = new JButton("4");
		btnbin6.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbin6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		horizontalBox_2.add(btnbin6);
		
		Component verticalStrut_13 = Box.createVerticalStrut(20);
		horizontalBox_2.add(verticalStrut_13);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_5);
		
		JLabel lblplayerbin = new JLabel("0");
		lblplayerbin.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblplayerbin.setFont(new Font("Tahoma", Font.PLAIN, 99));
		lblplayerbin.setHorizontalAlignment(SwingConstants.CENTER);
		horizontalBox.add(lblplayerbin);
		
		Component verticalStrut_18 = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut_18);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon("C:\\Users\\beenn\\git\\cse201\\CSE 201 Group Project\\MANCALA-game_bg_combined.jpg"));
		Background.setBounds(0, 0, 1024, 600);
		frame.getContentPane().add(Background);
	}
	
	private void initialize3() {
		frame = new JFrame();
		frame.setBounds(300, 100, 1040, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Box verticalBox_2 = Box.createVerticalBox();
		frame.getContentPane().add(verticalBox_2, BorderLayout.CENTER);
		
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
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				initialize();
				frame.setVisible(true);
			}
		});
		verticalBox_2.add(btnReturn);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox_2.add(verticalStrut);
	}
}
