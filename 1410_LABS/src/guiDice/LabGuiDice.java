package guiDice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * Contains a dice roller
 * 
 * @author anarion
 *
 */
public class LabGuiDice extends JFrame {
	//String currentDie = "/guiDice/resources/die-"+(int)(Math.random()*6+1)+".png";
	int currentDie = (int)(Math.random()*6+1);
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiDice frame = new LabGuiDice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LabGuiDice() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		JLabel diceLabel = diceLabel();
		
	
		
		JButton rollButton = rollButton();
		rollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean done = false;
				while(!done) {
					int newDie = (int)(Math.random()*6+1);
					if(newDie!=currentDie) {
						currentDie = newDie;
						diceLabel.setIcon(new ImageIcon(LabGuiDice.class.getResource("/guiDice/resources/die-"+currentDie+".png")));
						done = true;
					}
				}
			}
		});
		
	}
	
	/**
	 * Builds the label to contain the dice
	 * @return the label
	 */
	private JLabel diceLabel() {
		JLabel diceLabel = new JLabel("");
		diceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		diceLabel.setIcon(new ImageIcon(LabGuiDice.class.getResource("/guiDice/resources/die-"+currentDie+".png")) );
		contentPane.add(diceLabel, BorderLayout.CENTER);
		
		return diceLabel;
	}
	
	/**
	 * Builds the button that rolls the dice
	 * @return the button
	 */
	private JButton rollButton() {
		JButton rollButton = new JButton("Roll 'Em");
		rollButton.setBackground(Color.BLACK);
		rollButton.setOpaque(true);
		rollButton.setBorderPainted(false);
		rollButton.setFont(new Font("Kokonor", Font.PLAIN, 15));
		rollButton.setForeground(Color.RED);
		contentPane.add(rollButton, BorderLayout.SOUTH);
		
		return rollButton;
	}

}
