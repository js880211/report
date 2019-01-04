package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel label = new JLabel("歡迎來到求職網");
		label.setFont(new Font("新細明體", Font.BOLD, 17));
		label.setBounds(120, 0, 143, 41);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("點我");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user user=new user();
			}
		});
		btnNewButton.setBounds(10, 209, 87, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("點我");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				company company=new company();
			}
		});
		btnNewButton_1.setBounds(287, 209, 87, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label_1 = new JLabel("求職者請進");
		label_1.setFont(new Font("新細明體", Font.BOLD, 16));
		label_1.setBounds(10, 194, 87, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("徵才者請進");
		label_2.setFont(new Font("新細明體", Font.BOLD, 16));
		label_2.setBounds(287, 194, 87, 15);
		frame.getContentPane().add(label_2);
	}
}
