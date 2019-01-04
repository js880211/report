package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.*;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class seeker extends JFrame{
	private JFrame frame;
	private String a;
	public seeker(String a){
		this.a=a;
		initialize();
	}
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
	
		getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("個人資料:");
		label.setBounds(10, 0, 59, 29);
		frame.getContentPane().add(label);
		
		JTextArea txt = new JTextArea();
		txt.setBounds(77, 2, 357, 242);
		frame.getContentPane().add(txt);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file=new File(a);
		try {
			FileWriter writer=new FileWriter(file);
			writer.write(txt.getText());
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			}
		});
		btnNewButton.setBounds(0, 229, 69, 23);
		frame.getContentPane().add(btnNewButton);
		
			frame.setVisible(true);
	}
}
