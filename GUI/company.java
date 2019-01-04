package GUI;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class company {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public company() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 420);
		frame.getContentPane().setLayout(null);
		
		
		JLabel label = new JLabel("應徵人序號:");
		label.setBounds(10, 8, 68, 30);
		frame.getContentPane().add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 56, 564, 302);
		frame.getContentPane().add(textPane);
		
		JComboBox comboBox = new JComboBox();
		File file=new File("./access");
		File[] f1=file.listFiles();
		for(int i=0;i<file.listFiles().length;i++) {
			comboBox.addItem(f1[i].getName());
		}
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String a,all="";
				FileReader f1=new FileReader("./access/"+ comboBox.getSelectedItem());
				BufferedReader reader=new BufferedReader(f1);
				while((a=reader.readLine())!=null) {
						all=all+a;
					}
				textPane.setText(all);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		comboBox.setBounds(81, 0, 176, 46);
		frame.getContentPane().add(comboBox);
		
		
		
		frame.setVisible(true);
	}
}
