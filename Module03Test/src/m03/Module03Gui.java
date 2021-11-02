package m03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

/**
 * Window that presents information on climate change
 * 
 * @author Lou LeBohec
 *
 */
public class Module03Gui extends JFrame {

	private JPanel contentPane;
	private JPanel centerPanel;
	private JLabel infoImage;
	private JLabel infoLabel;
	private JButton nextButton;
	private int state=-1;
	private String[] information = new String[] {
			"Sea level rise - fastest rates in at least 3000 years",
			"Arctic sea ice area - Lowest level in at least 1000 years",
			"Glaciers retreat - Unprecedented in at least 2000 years"
	};
	private String[] images = new String[] {
			"/Resources/SeaLevel.png",
			"/Resources/ArcticSeaIce.png",
			"/Resources/Glaciers.png"
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module03Gui frame = new Module03Gui();
					frame.setVisible(true);
					frame.setSize(new Dimension(550,380));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Module03Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//center panel
		centerPanel = new JPanel();
		
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(1, 0, 15, 0));
		centerPanel.setBackground(new Color(119,133,141));
		centerPanel.setBorder(new EmptyBorder(15,15,15,15));
		
		//Build components
		JLabel spinningEarth = spinningEarth();
		infoImage = infoImage();
		nextButton = nextButtonBuild();
		infoLabel = infoLabel();
	}
	
	/**
	 * Creates a label containing a gif of the earth spinning
	 * @return the label
	 */
	private JLabel spinningEarth() {
		JLabel spinningEarth = new JLabel("");
		spinningEarth.setHorizontalAlignment(SwingConstants.CENTER);
		spinningEarth.setBackground(new Color(19,33,41));
		spinningEarth.setOpaque(true);
		spinningEarth.setSize(new Dimension(200,200));
		spinningEarth.setIcon(new ImageIcon(Module03Gui.class.getResource("/Resources/earth.gif")));
		centerPanel.add(spinningEarth);
		
		return spinningEarth;
	}
	
	/**
	 * Creates a label showing an image tied to the information presented
	 * @return the label
	 */
	private JLabel infoImage() {
		JLabel infoImage = new JLabel("");
		infoImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		infoImage.setSize(new Dimension(200,200));
		infoImage.setIcon(new ImageIcon(Module03Gui.class.getResource("/Resources/CO2.png")));
		centerPanel.add(infoImage);
		
		return infoImage;
	}
	
	/**
	 * Creates a label displaying information about climate change
	 * @return the label
	 */
	private JLabel infoLabel() {
		JLabel infoLabel = new JLabel("CO2 concentration - Highest in at least 2 million years");
		infoLabel.setFont(new Font("Arial", Font.BOLD, 18));
		infoLabel.setBackground(new Color(61,75,83));
		infoLabel.setForeground(new Color(240, 248, 255));
		infoLabel.setBorder(new EmptyBorder(10,0,10,0));
		infoLabel.setOpaque(true);
		
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(infoLabel, BorderLayout.SOUTH);
		
		return infoLabel;
	}
	
	/**
	 * Creates a button that iterates through the information to be presented
	 * @return the button
	 */
	private JButton nextButtonBuild() {
		JButton nextButtonBuild = new JButton("Next");
		nextButtonBuild.setFont(new Font("Arial", Font.BOLD, 18));
		nextButtonBuild.setBackground(new Color(61,75,83));
		nextButtonBuild.setForeground(new Color(140,148,175));
		nextButtonBuild.setOpaque(true);
		nextButtonBuild.setBorder(new EmptyBorder(7,0,7,0));
		nextButtonBuild.setBorderPainted(false);
		nextButtonBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				state++;
				if(state<3) {
					infoImage.setIcon(new ImageIcon(Module03Gui.class.getResource(images[state])));
					infoLabel.setText(information[state]);
				}
				if(state>=2) {
					nextButtonBuild.setText("Done");
				}
			}
		});
		contentPane.add(nextButtonBuild, BorderLayout.NORTH);
		
		return nextButton;
		
	}

}
