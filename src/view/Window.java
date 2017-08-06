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
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_4;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

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
		panel.setBounds(15, 251, 305, 352);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(176, 89, 92, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(176, 34, 92, 26);
		panel.add(textField_1);
		
		JLabel lblNoOfTrials = new JLabel("No. of Trials");
		lblNoOfTrials.setBounds(15, 37, 92, 20);
		panel.add(lblNoOfTrials);
		
		JLabel lblDesiredTotal = new JLabel("Desired Total");
		lblDesiredTotal.setBounds(15, 92, 117, 20);
		panel.add(lblDesiredTotal);
		
		JButton btnStart = new JButton("START");
		btnStart.setBounds(88, 295, 115, 29);
		panel.add(btnStart);
		
		textField_2 = new JTextField();
		textField_2.setBounds(176, 143, 92, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblIdealProbability = new JLabel("Ideal Probability");
		lblIdealProbability.setBounds(15, 146, 117, 20);
		panel.add(lblIdealProbability);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(176, 198, 92, 26);
		panel.add(textField_3);
		
		JLabel lblActualProbability = new JLabel("Actual Probability");
		lblActualProbability.setBounds(15, 201, 134, 20);
		panel.add(lblActualProbability);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(335, 0, 1070, 619);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_5.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblIdeal = new JLabel("ACTUAL");
		lblIdeal.setBounds(15, 16, 69, 20);
		panel_3.add(lblIdeal);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(175, 407, 111, 26);
		panel_3.add(textField_5);
		
		JLabel lblMean = new JLabel("Mean");
		lblMean.setBounds(49, 410, 69, 20);
		panel_3.add(lblMean);
		
		JLabel lblMedian = new JLabel("Median");
		lblMedian.setBounds(49, 518, 69, 20);
		panel_3.add(lblMedian);
		
		JLabel lblVariance = new JLabel("Variance");
		lblVariance.setBounds(49, 446, 69, 20);
		panel_3.add(lblVariance);
		
		JLabel lblSd = new JLabel("SD");
		lblSd.setBounds(49, 482, 69, 20);
		panel_3.add(lblSd);
		
		JLabel lblMode = new JLabel("Mode");
		lblMode.setBounds(49, 554, 69, 20);
		panel_3.add(lblMode);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(175, 443, 111, 26);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(175, 479, 111, 26);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(175, 515, 111, 26);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(175, 551, 111, 26);
		panel_3.add(textField_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 50, 505, 305);
		panel_3.add(panel_1);
		
		JPanel panel_4 = new JPanel();
		panel_5.add(panel_4);
		panel_4.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 445, 111, 26);
		panel_4.add(textField_4);
		
		JLabel lblIdeal_1 = new JLabel("IDEAL");
		lblIdeal_1.setBounds(15, 14, 102, 20);
		panel_4.add(lblIdeal_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(174, 409, 111, 26);
		panel_4.add(textField_10);
		
		JLabel label_1 = new JLabel("Mean");
		label_1.setBounds(48, 412, 69, 20);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("Variance");
		label_2.setBounds(48, 448, 69, 20);
		panel_4.add(label_2);
		
		JLabel label_3 = new JLabel("SD");
		label_3.setBounds(48, 484, 69, 20);
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel("Median");
		label_4.setBounds(48, 520, 69, 20);
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("Mode");
		label_5.setBounds(48, 556, 69, 20);
		panel_4.add(label_5);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(174, 553, 111, 26);
		panel_4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(174, 517, 111, 26);
		panel_4.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(174, 481, 111, 26);
		panel_4.add(textField_13);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 50, 505, 305);
		panel_4.add(panel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(15, 16, 305, 219);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		panel_6.add(textArea, "name_405083374200043");
	}
}
