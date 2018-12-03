import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GamePanel extends JPanel
{
	private static final long serialVersionUID = -8814877415496950493L;
	
	/**
	 * Create the application.
	 */
	public GamePanel()
	{
		setOpaque(false);
		setMaximumSize(new Dimension(1024, 600));
		setBounds(new Rectangle(0, 0, 1024, 600));
		initialize_gp();
	}
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		{
			JPanel gp = new GamePanel();
			JPanel bg = GamePanel.backgroundPanel("./assets/MANCALA-game_bg_combined.jpg");
			gp.setVisible(true);
			JFrame f = new JFrame();
			f.setLocation(300, 300);
			f.add(gp);
			f.add(bg);
			f.pack();
			f.setVisible(true);
		});
	}
	
	public static JPanel backgroundPanel(String path)
	{
		JPanel jpl_bg = new JPanel();
		
		BufferedImage background;
		try
		{
			background = ImageIO.read(new File(path));
			JLabel picLabel = new JLabel(new ImageIcon(background));
			jpl_bg.add(picLabel);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return jpl_bg;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize_gp()
	{
		setBackground(Color.WHITE);
		
		setSize(1024, 600);
		setPreferedSize(1024, 600);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		Box horizontalBox = Box.createHorizontalBox();
		add(horizontalBox);
		
		Component verticalStrut_19 = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut_19);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut);
		
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
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		verticalBox.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		panel.add(horizontalBox_3);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_1);
		
		JButton btnNewButton_1 = new JButton("Surrender");
		btnNewButton_1.setMinimumSize(new Dimension(200, 48));
		btnNewButton_1.setMaximumSize(new Dimension(200, 48));
		btnNewButton_1.setPreferredSize(new Dimension(200, 48));
		horizontalBox_3.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Open Sans", Font.BOLD, 30));
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		panel.add(horizontalBox_4);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_3);
		
		JLabel lblNewLabel = new JLabel("Turn");
		horizontalBox_4.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_2);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		panel.add(horizontalBox_5);
		
		JButton btnEnd = new JButton("End");
		btnEnd.setMinimumSize(new Dimension(200, 48));
		btnEnd.setMaximumSize(new Dimension(200, 48));
		btnEnd.setPreferredSize(new Dimension(200, 48));
		horizontalBox_5.add(btnEnd);
		btnEnd.setFont(new Font("Open Sans", Font.BOLD, 30));
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_5.add(horizontalGlue_5);
		btnEnd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO
			}
		});
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		verticalBox.add(horizontalStrut_6);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JButton btnbin1 = new JButton("4");
		btnbin1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbin1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
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
		btnbin3.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin3.setFont(new Font("Tahoma", Font.BOLD, 20));
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
		btnbin4.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin4.setFont(new Font("Tahoma", Font.BOLD, 20));
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
		btnbin5.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin5.setFont(new Font("Tahoma", Font.BOLD, 20));
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
		btnbin6.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnbin6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbin6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
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
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut_2);
		
		Component verticalStrut_18 = Box.createVerticalStrut(20);
		horizontalBox.add(verticalStrut_18);
		
	}
	
	private void setPreferedSize(int i, int j)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
}
