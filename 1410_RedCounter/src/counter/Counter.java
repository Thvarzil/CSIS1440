package counter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author anarion
 *
 */
public class Counter extends JFrame {
	int counter = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter frame = new Counter();
					frame.setVisible(true);
					frame.setSize(500, 200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the frame
	 */
	public Counter() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel counterLabel = counterLabel();

		JButton counterButton = newCounterButton();
		counterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int newColor = 0;
				boolean done = false;
				Color[] colors = new Color[] { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA };

				while (!done) {
					newColor = (int) (Math.random() * 5);
					if (counterButton.getBackground() != colors[newColor]) {
						counterButton.setBackground(colors[newColor]);
						done = true;
					}
				}

				if (colors[newColor] == Color.RED) {
					counter++;
					counterLabel.setText(String.format("Red Counter: %02d", counter));

				}

			}

		});

		JLabel nameLabel = nameLabel();

	}

	/**
	 * Sets the details of the button
	 * @return the button
	 */
	private JButton newCounterButton() {
		JButton counterButton = new JButton("CLICK ME");
		counterButton.setOpaque(true);
		counterButton.setForeground(Color.WHITE);
		counterButton.setBackground(Color.BLUE);
		counterButton.setFont(new Font("American Typewriter", Font.PLAIN, 22));
		contentPane.add(counterButton, BorderLayout.CENTER);

		return counterButton;
	}

	/**
	 * Sets the details of the counter label
	 * @return the label
	 */
	private JLabel counterLabel() {
		JLabel counterLabel = new JLabel(String.format("Red Counter: %02d", counter));
		counterLabel.setOpaque(true);
		counterLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
		counterLabel.setBackground(Color.GRAY);
		contentPane.add(counterLabel, BorderLayout.WEST);
		counterLabel.setBorder(BorderFactory.createEmptyBorder(20, 5, 20, 5));

		return counterLabel;
	}

	/**
	 * Sets the details of the name label
	 * @return the label
	 */
	private JLabel nameLabel() {
		JLabel nameLabel = new JLabel("Lou's GUI");
		nameLabel.setOpaque(true);
		nameLabel.setBackground(Color.LIGHT_GRAY);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setFont(new Font("Futura", Font.PLAIN, 13));
		contentPane.add(nameLabel, BorderLayout.SOUTH);
		nameLabel.setBorder(BorderFactory.createEmptyBorder(20, 5, 20, 5));

		return nameLabel;
	}

}
