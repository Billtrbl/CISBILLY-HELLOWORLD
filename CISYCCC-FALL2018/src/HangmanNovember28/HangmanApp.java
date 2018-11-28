package HangmanNovember28;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class HangmanApp {
	private HangmanMain hm;

	private JFrame frame;
	private JTextField userInput;
	private JLabel livesLabel;
	private JLabel secretWordLabel;
	private JLabel lettersGuessed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangmanApp window = new HangmanApp();
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
	public HangmanApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		hm = new HangmanMain();
		JLabel secretWordLabel = new JLabel(hm.getSecretWord()); // Display the word to be guessed in "*" form
		secretWordLabel.setFont(new Font("Sylfaen", Font.PLAIN, 43));
		secretWordLabel.setBounds(42, 50, 600, 100);
		frame.getContentPane().add(secretWordLabel);

		livesLabel = new JLabel("Lives: " + hm.getLife()); // Display the amount of lives available
		livesLabel.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		livesLabel.setBounds(85, 160, 150, 30);
		frame.getContentPane().add(livesLabel);

		userInput = new JTextField();
		userInput.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (userInput.getText().length() >= 1) // limit textfield to 1 characters
					e.consume();
			}
		});
		userInput.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		userInput.setBounds(315, 240, 60, 60);
		frame.getContentPane().add(userInput);
		userInput.setColumns(10);

		JLabel insertLetter = new JLabel("Insert Letter Here");
		insertLetter.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		insertLetter.setBounds(165, 240, 140, 60);
		frame.getContentPane().add(insertLetter);

		lettersGuessed = new JLabel("Letters Guessed: ");
		lettersGuessed.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lettersGuessed.setBounds(75, 325, 500, 50);
		frame.getContentPane().add(lettersGuessed);

		JButton enterButton = new JButton("ENTER");
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hm.getLife() > 0 && !hm.isGameWon()) { // Play the game until lives = 0 and game is not won
					hm.guess(userInput.getText().toUpperCase().charAt(0)); // To transform all lower case letters to
																			// upper case letters
					livesLabel.setText("Lives: " + hm.getLife()); // Update the amount of lives available if user enter
																	// the wrong letter
					secretWordLabel.setText(hm.getWordToBeGuessed()); // Update the word to be guessed if user enter the
																		// right letter
					lettersGuessed.setText("Letters Guessed: " + hm.getLettersGuessed()); // Display the letters that
																							// have been used
					userInput.setText(""); // Reset the JText to " " after every guess
					if (hm.getLife() == 0) {
						secretWordLabel.setText("Game Over!"); // If lives = 0 before user guess the word, is game over
					}
					if (hm.isGameWon()) {
						secretWordLabel.setText("Congratulations You Won!"); // If user wins, "Congratulations.."
																				// message will appear
					}
				}
			}
		});
		enterButton.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		enterButton.setBounds(385, 257, 100, 30);
		frame.getContentPane().add(enterButton);

		JButton newGameButton = new JButton("New Game");
		newGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hm = new HangmanMain();
				hm.NewGame();
				livesLabel.setText("Lives: " + hm.getLife());
				secretWordLabel.setText(hm.getWordToBeGuessed());
				lettersGuessed.setText("Letters Guessed: ");

			}
		});
		newGameButton.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		newGameButton.setBounds(574, 375, 100, 25);
		frame.getContentPane().add(newGameButton);
	}

}
