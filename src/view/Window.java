package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.CardLayout;

public class Window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1427, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 395, 305, 208);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(147, 89, 121, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 34, 121, 26);
		panel.add(textField_1);
		
		JLabel lblNoOfTrials = new JLabel("No. of Trials");
		lblNoOfTrials.setBounds(15, 37, 92, 20);
		panel.add(lblNoOfTrials);
		
		JLabel lblDesiredTotal = new JLabel("Desired Total");
		lblDesiredTotal.setBounds(15, 92, 117, 20);
		panel.add(lblDesiredTotal);
		
		JButton btnStart = new JButton("START");
		btnStart.setBounds(89, 148, 115, 29);
		panel.add(btnStart);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(335, 0, 1070, 619);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_5.add(panel_3);
		
		JPanel panel_1 = new JPanel();
		panel_5.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_5.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_5.add(panel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(15, 16, 305, 363);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		panel_6.add(textArea, "name_405083374200043");
	}
}
