package november7Chapter3UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class HelloUI {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblPhoneNumber;
	private JTextField textField_1;
	private JLabel lblEmailAddress;
	private JTextField textField_2;
	private JLabel lblAddress;
	private JTextArea textArea;
	private JButton btnClear;
	private JLabel lblSex;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JLabel lblOccupation;
	private JComboBox comboBox;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloUI window = new HelloUI();
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
	public HelloUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(234, 50, 204, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(96, 50, 140, 29);
		frame.getContentPane().add(lblNewLabel);
		
		lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(96, 90, 140, 23);
		frame.getContentPane().add(lblPhoneNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(234, 90, 204, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmailAddress.setBounds(96, 124, 140, 29);
		frame.getContentPane().add(lblEmailAddress);
		
		textField_2 = new JTextField();
		textField_2.setBounds(234, 124, 204, 23);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddress.setBounds(96, 164, 140, 29);
		frame.getContentPane().add(lblAddress);
		
		textArea = new JTextArea();
		textArea.setBounds(234, 164, 204, 95);
		frame.getContentPane().add(textArea);
		
		btnClear = new JButton("Clear");
		btnClear.setForeground(Color.RED);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
				textArea.setText(null);
				rdbtnMale.setSelected(false);
				rdbtnFemale.setSelected(false);
				comboBox.setSelectedItem("Select");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(480, 395, 100, 29);
		frame.getContentPane().add(btnClear);
		
		lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSex.setBounds(96, 280, 140, 29);
		frame.getContentPane().add(lblSex);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(234, 285, 109, 23);
		frame.getContentPane().add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(345, 285, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		lblOccupation = new JLabel("Occupation");
		lblOccupation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOccupation.setBounds(96, 320, 140, 29);
		frame.getContentPane().add(lblOccupation);
		
		comboBox = new JComboBox();
		comboBox.addItem("Select");
		comboBox.addItem("Education");
		comboBox.addItem("Health and Science");
		comboBox.addItem("Linguistics");
		comboBox.addItem("Business and Finance");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}	
		});
		comboBox.setBounds(234, 326, 140, 20);
		frame.getContentPane().add(comboBox);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty()||
						(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty())||
						(textArea.getText().isEmpty())||((rdbtnMale.isSelected())&&(rdbtnFemale.isSelected()))||
						(comboBox.getSelectedItem().equals("Select")))
					JOptionPane.showMessageDialog(null, "Data Missing");
				else
					JOptionPane.showMessageDialog(null, "Data Submitted");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(147, 400, 89, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
