package guiIntro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LabGUIIntro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGUIIntro frame = new LabGUIIntro();
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
	public LabGUIIntro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel newLblTitle = new JLabel("My First GUI");
		newLblTitle.setBackground(Color.BLUE);
		newLblTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		newLblTitle.setForeground(Color.GREEN);
		newLblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(newLblTitle, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("West");
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		JPanel newTextPanel = new JPanel();
		contentPane.add(newTextPanel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		newTextPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		newTextPanel.add(textField);
		textField.setColumns(16);
		
		JLabel lblNewLabel_1 = new JLabel("Hi");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 77));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.RED);
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
	}

}
