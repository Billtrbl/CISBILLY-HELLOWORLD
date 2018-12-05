package Project3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JComboBox;

public class UserModelingUI {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZipcode;
	private JPasswordField enterPassword;
	private JTextField txtShipStreet;
	private JTextField txtShipCity;
	private JTextField txtShipState;
	private JTextField txtShipZipcode;
	private JTextField txtPenQty;
	private JTextField txtPencilQty;
	private JTextField txtRulerQty;
	private JLabel lblActualCost;
	private User user;
	private String password;
	private String userInfo;
	private ArrayList<Order> orderList = new ArrayList<Order>(); // Array of orders when submitted

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModelingUI window = new UserModelingUI();
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
	public UserModelingUI() {
		initialize();
	}

	public void saveUser() {

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JOptionPane.showMessageDialog(null, "Please Enter Your Information");

		frame = new JFrame("YCCC Online Store");
		frame.setBounds(100, 100, 945, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFullName.setBounds(35, 40, 150, 30);
		frame.getContentPane().add(lblFullName);

		JLabel lblEmail = new JLabel("Email Address");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(35, 81, 150, 30);
		frame.getContentPane().add(lblEmail);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(35, 122, 150, 30);
		frame.getContentPane().add(lblPassword);

		JLabel lblStreet = new JLabel("Billing Street");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStreet.setBounds(35, 170, 150, 30);
		frame.getContentPane().add(lblStreet);

		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCity.setBounds(35, 211, 150, 30);
		frame.getContentPane().add(lblCity);

		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblState.setBounds(35, 252, 150, 30);
		frame.getContentPane().add(lblState);

		JLabel lblZipcode = new JLabel("Zipcode");
		lblZipcode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblZipcode.setBounds(35, 293, 150, 30);
		frame.getContentPane().add(lblZipcode);

		txtName = new JTextField();
		txtName.setBounds(220, 42, 200, 30);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(220, 83, 200, 30);
		frame.getContentPane().add(txtEmail);

		enterPassword = new JPasswordField();
		enterPassword.setBounds(220, 129, 200, 30);
		frame.getContentPane().add(enterPassword);

		txtStreet = new JTextField();
		txtStreet.setColumns(10);
		txtStreet.setBounds(220, 172, 200, 30);
		frame.getContentPane().add(txtStreet);

		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(220, 213, 200, 30);
		frame.getContentPane().add(txtCity);

		txtState = new JTextField();
		txtState.setColumns(10);
		txtState.setBounds(220, 254, 200, 30);
		frame.getContentPane().add(txtState);

		txtZipcode = new JTextField();
		txtZipcode.setColumns(10);
		txtZipcode.setBounds(220, 295, 100, 30);
		frame.getContentPane().add(txtZipcode);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = new User(); // create a new user object
				user.setFullName(txtName.getText());
				user.setEmail(txtEmail.getText());
				password = new String(enterPassword.getPassword());
				user.setPassword(password);
				Address billingAddress = new Address(); // create a new billing address object
				billingAddress.setStreet(txtStreet.getText());
				billingAddress.setCity(txtCity.getText());
				billingAddress.setState(txtState.getText());
				billingAddress.setZipcode(txtZipcode.getText());
				user.setAddress(billingAddress);
				Order order = new Order();
				Address shipAddress = new Address(); // create a new shipping address object
				shipAddress.setStreet(txtShipStreet.getText());
				shipAddress.setCity(txtShipCity.getText());
				shipAddress.setState(txtShipState.getText());
				shipAddress.setZipcode(txtZipcode.getText());
				order.setAddress(shipAddress);
				if (txtPencilQty.getText().equals("")) { // empty string

				} else {
					order.setPencilQty(Integer.parseInt(txtPencilQty.getText())); // setting a string into int
				}
				if (txtPenQty.getText().equals("")) {

				} else {
					order.setPenQty(Integer.parseInt(txtPenQty.getText()));
				}
				if (txtRulerQty.getText().equals("")) {

				} else {
					order.setRulerQty(Integer.parseInt(txtRulerQty.getText()));
				}

				order.setUserID(user);
				orderList.add(order); // will add a new order every time the user click submit
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubmit.setBounds(85, 377, 100, 30);
		frame.getContentPane().add(btnSubmit);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // to clear all the info
				txtName.setText("");
				txtEmail.setText("");
				enterPassword.setText("");
				txtStreet.setText("");
				txtCity.setText("");
				txtState.setText("");
				txtZipcode.setText("");
				txtPenQty.setText("");
				txtPencilQty.setText("");
				txtRulerQty.setText("");
				txtShipStreet.setText("");
				txtShipCity.setText("");
				txtShipState.setText("");
				txtShipZipcode.setText("");
				
			}
		});
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(320, 377, 100, 30);
		frame.getContentPane().add(btnClear);

		JLabel lblNewLabel = new JLabel("Pen Quantity ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(475, 40, 120, 30);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblPencil = new JLabel("Pencil Quantity");
		lblPencil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPencil.setBounds(475, 81, 120, 30);
		frame.getContentPane().add(lblPencil);

		JLabel lblBook = new JLabel("Ruler Quantity");
		lblBook.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBook.setBounds(475, 122, 120, 30);
		frame.getContentPane().add(lblBook);

		JButton btnPrintOrders = new JButton("Print Orders");
		btnPrintOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedWriter writer = null;
				try {
					Order order = new Order(); // new order object
					writer = new BufferedWriter(new FileWriter("YCCC Online Order.txt")); // create a .txt for all the orders
					for (int i = 0; i < orderList.size(); i++) { // for loops to take out 
						order = orderList.get(i); // to take out order from an array list
						User user = order.getUserID(); // to take user out of order object
						Address shipAddress = order.getAddress(); // to take address out of order object
						writer.write("Full Name: " + user.getFullName());
						writer.newLine();
						writer.write("Email Address: " + user.getEmail());
						writer.newLine();
						writer.write("Billing Street: " + user.getAddress().getStreet()); // cascading
						writer.newLine();
						writer.write("Billing City: " + user.getAddress().getCity());
						writer.newLine();
						writer.write("Billing State: " + user.getAddress().getState());
						writer.newLine();
						writer.write("Billing Zipcode: " + user.getAddress().getZipcode());
						writer.newLine();
						writer.write("Shipping Street: " + shipAddress.getStreet());
						writer.newLine();
						writer.write("Shipping City: " + shipAddress.getCity());
						writer.newLine();
						writer.write("Shipping State: " + shipAddress.getState());
						writer.newLine();
						writer.write("Shipping Zipcode: " + shipAddress.getZipcode());
						writer.newLine();
						writer.write("Pen Quantity: " + order.getPenQty());
						writer.newLine();
						writer.write("Pencil Quantity: " + order.getPencilQty());
						writer.newLine();
						writer.write("Ruler Quantity: " + order.getRulerQty());
						writer.newLine();
						writer.write("Total Cost: " + order.getCost());
						writer.newLine();
						writer.write("------------------------------------------------------------------");
						writer.newLine();
						
					}
					if (writer != null)
						writer.close();
				} catch (IOException exception) {
					// TODO Auto-generated catch block
					exception.printStackTrace();
				}
			}

		});
		btnPrintOrders.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrintOrders.setBounds(465, 435, 160, 30);
		frame.getContentPane().add(btnPrintOrders);

		JLabel lblShipStreet = new JLabel("Shipping Street");
		lblShipStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShipStreet.setBounds(475, 170, 150, 30);
		frame.getContentPane().add(lblShipStreet);

		txtShipStreet = new JTextField();
		txtShipStreet.setColumns(10);
		txtShipStreet.setBounds(660, 172, 200, 30);
		frame.getContentPane().add(txtShipStreet);

		txtShipCity = new JTextField();
		txtShipCity.setColumns(10);
		txtShipCity.setBounds(660, 213, 200, 30);
		frame.getContentPane().add(txtShipCity);

		txtShipState = new JTextField();
		txtShipState.setColumns(10);
		txtShipState.setBounds(660, 254, 200, 30);
		frame.getContentPane().add(txtShipState);

		JLabel lblShipCity = new JLabel("City");
		lblShipCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShipCity.setBounds(475, 211, 150, 30);
		frame.getContentPane().add(lblShipCity);

		JLabel lblShipState = new JLabel("State");
		lblShipState.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShipState.setBounds(475, 252, 150, 30);
		frame.getContentPane().add(lblShipState);

		JLabel lblShipZipcode = new JLabel("Zipcode");
		lblShipZipcode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShipZipcode.setBounds(475, 293, 150, 30);
		frame.getContentPane().add(lblShipZipcode);

		txtShipZipcode = new JTextField();
		txtShipZipcode.setColumns(10);
		txtShipZipcode.setBounds(660, 295, 100, 30);
		frame.getContentPane().add(txtShipZipcode);

		JButton btnNewButton = new JButton("Calculate Cost");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Order totalCost = new Order(); // create a new order object

				if (txtPencilQty.getText().equals("")) { // empty string

				} else {
					totalCost.setPencilQty(Integer.parseInt(txtPencilQty.getText())); // transform string to int
				}
				if (txtPenQty.getText().equals("")) { 

				} else {
					totalCost.setPenQty(Integer.parseInt(txtPenQty.getText())); // transform string to int
				}
				if (txtRulerQty.getText().equals("")) {

				} else {
					totalCost.setRulerQty(Integer.parseInt(txtRulerQty.getText())); // transform string to int
				}

				lblActualCost.setText(Integer.toString(totalCost.getCost())); // transform int to string
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(670, 377, 160, 30);
		frame.getContentPane().add(btnNewButton);

		JLabel lblCost = new JLabel("Total Cost ($)");
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCost.setBounds(475, 334, 160, 30);
		frame.getContentPane().add(lblCost);

		lblActualCost = new JLabel("");
		lblActualCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblActualCost.setBounds(660, 336, 160, 30);
		frame.getContentPane().add(lblActualCost);

		txtPenQty = new JTextField();
		txtPenQty.setColumns(10);
		txtPenQty.setBounds(660, 47, 50, 30);
		frame.getContentPane().add(txtPenQty);

		txtPencilQty = new JTextField();
		txtPencilQty.setColumns(10);
		txtPencilQty.setBounds(660, 88, 50, 30);
		frame.getContentPane().add(txtPencilQty);

		txtRulerQty = new JTextField();
		txtRulerQty.setColumns(10);
		txtRulerQty.setBounds(660, 129, 50, 30);
		frame.getContentPane().add(txtRulerQty);

		JLabel lblPenCost = new JLabel("$2 Per");
		lblPenCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPenCost.setBounds(720, 47, 80, 30);
		frame.getContentPane().add(lblPenCost);

		JLabel lblPencilCost = new JLabel("$1 Per");
		lblPencilCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPencilCost.setBounds(720, 88, 80, 30);
		frame.getContentPane().add(lblPencilCost);

		JLabel lblRulerCost = new JLabel("$4 Per");
		lblRulerCost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRulerCost.setBounds(720, 129, 80, 30);
		frame.getContentPane().add(lblRulerCost);

	}
}
