package GUI;

import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
public class user extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public user() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 160);
		
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel lblMemberNo = new JLabel("Member No.");
		lblMemberNo.setBounds(10, 10, 119, 31);
		frame.getContentPane().add(lblMemberNo);
		
		textField = new JTextField();
		textField.setBounds(178, 15, 96, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				
				String mem=textField.getText();
				seeker seeker=new seeker("./access/"+mem+".txt");
				File file=new File("./access/"+mem+".txt");
				try {
					file.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(false);
				}
		});
		btnLogin.setBounds(93, 99, 87, 23);
		frame.getContentPane().add(btnLogin);
		
	}
}
