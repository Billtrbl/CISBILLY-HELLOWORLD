package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class HangmanApp {
	private HangmanMain hm;

	private JFrame frame;
	private JTextField txtGuessLetter;
	private JLabel lblLives;
	private JLabel secretWordLabel;
	private JLabel lblLettersGuessed;
	private JLabel imgLabel;
	Image hMan0;
	Image hMan1;
	Image hMan2;
	Image hMan3;
	Image hMan4;
	Image hMan5;
	Image hMan6;
	Image hMan7;
	Image hMan8;
	Image hMan9;

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
		JOptionPane.showMessageDialog(null, "Welcome to Hangman!");
		JOptionPane.showMessageDialog(null, "Please Start A New Game");
		
		hMan0 = new ImageIcon(this.getClass().getResource("/Hangman 0.png")).getImage();
		hMan1 = new ImageIcon(this.getClass().getResource("/Hangman 1.png")).getImage();
		hMan2 = new ImageIcon(this.getClass().getResource("/Hangman 2.png")).getImage();
		hMan3 = new ImageIcon(this.getClass().getResource("/Hangman 3.png")).getImage();
		hMan4 = new ImageIcon(this.getClass().getResource("/Hangman 4.png")).getImage();
		hMan5 = new ImageIcon(this.getClass().getResource("/Hangman 5.png")).getImage();
		hMan6 = new ImageIcon(this.getClass().getResource("/Hangman 6.png")).getImage();
		hMan7 = new ImageIcon(this.getClass().getResource("/Hangman 7.png")).getImage();
		hMan8 = new ImageIcon(this.getClass().getResource("/Hangman 8.png")).getImage();
		hMan9 = new ImageIcon(this.getClass().getResource("/Hangman 9.png")).getImage();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		hm = new HangmanMain();
		JLabel lblSecretWord = new JLabel(hm.getSecretWord()); // Display the word to be guessed in "*" form
		lblSecretWord.setFont(new Font("Sylfaen", Font.PLAIN, 43));
		lblSecretWord.setBounds(42, 50, 400, 100);
		frame.getContentPane().add(lblSecretWord);

		lblLives = new JLabel("Lives: " + hm.getLife()); // Display the amount of lives available
		lblLives.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblLives.setBounds(85, 160, 150, 30);
		frame.getContentPane().add(lblLives);

		txtGuessLetter = new JTextField();
		txtGuessLetter.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (txtGuessLetter.getText().length() >= 1) // limit textfield to 1 characters
					e.consume();
			}
		});
		txtGuessLetter.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		txtGuessLetter.setBounds(315, 240, 60, 60);
		frame.getContentPane().add(txtGuessLetter);
		txtGuessLetter.setColumns(10);

		JLabel lblLetterHere = new JLabel("Insert Letter Here");
		lblLetterHere.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblLetterHere.setBounds(165, 240, 140, 60);
		frame.getContentPane().add(lblLetterHere);

		lblLettersGuessed = new JLabel("Letters Guessed: ");
		lblLettersGuessed.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblLettersGuessed.setBounds(75, 325, 500, 50);
		frame.getContentPane().add(lblLettersGuessed);

		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (hm.getLife() > 0 && !hm.isGameWon()) { // Play the game until lives = 0 and game is not won
						
						if (txtGuessLetter.getText().equals("")) {
							
						}
						else {
							hm.guess(txtGuessLetter.getText().toUpperCase().charAt(0)); // To transform all lower case letters to
							// upper case letters
						}
					
					lblLives.setText("Lives: " + hm.getLife()); // Update the amount of lives available if user enter
																	// the wrong letter
					lblSecretWord.setText(hm.getWordToBeGuessed()); // Update the word to be guessed if user enter the
																		// right letter
					lblLettersGuessed.setText("Letters Guessed: " + hm.getLettersGuessed()); // Display the letters that
																							// have been used
					txtGuessLetter.setText(""); // Reset the JText to " " after every guess
					if (hm.getLife() == 0) {
						lblLettersGuessed.setText("Game Over!"); // If lives = 0 before user guess the word, is game over
					}
					if (hm.isGameWon()) {
						lblLettersGuessed.setText("Congratulations! You Won!");
					}
					if (hm.getLife() == 8) {
						imgLabel.setIcon(new ImageIcon(hMan0));
					}
					if (hm.getLife() == 7) {
						imgLabel.setIcon(new ImageIcon(hMan1));
					}
					if (hm.getLife() == 6) {
						imgLabel.setIcon(new ImageIcon(hMan2));
					}
					if (hm.getLife() == 5) {
						imgLabel.setIcon(new ImageIcon(hMan3));
					}
					if (hm.getLife() == 4) {
						imgLabel.setIcon(new ImageIcon(hMan4));
					}
					if (hm.getLife() == 3) {
						imgLabel.setIcon(new ImageIcon(hMan5));
					}
					if (hm.getLife() == 2) {
						imgLabel.setIcon(new ImageIcon(hMan6));
					}
					if (hm.getLife() == 1) {
						imgLabel.setIcon(new ImageIcon(hMan7));
					}
					if (hm.getLife() == 0) {
						imgLabel.setIcon(new ImageIcon(hMan8));
					}
					if (hm.isGameWon()) {
						imgLabel.setIcon(new ImageIcon(hMan9));
					}
				}
			}
		});
		btnEnter.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		btnEnter.setBounds(385, 257, 100, 30);
		frame.getContentPane().add(btnEnter);

		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hm = new HangmanMain();
				hm.NewGame();
				lblLives.setText("Lives: " + hm.getLife());
				lblSecretWord.setText(hm.getWordToBeGuessed());
				lblLettersGuessed.setText("Letters Guessed: ");
				imgLabel.setIcon(new ImageIcon(hMan0));

			}
		});
		btnNewGame.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnNewGame.setBounds(574, 375, 100, 25);
		frame.getContentPane().add(btnNewGame);
		
		imgLabel = new JLabel("");
		imgLabel.setBounds(455, 50, 200, 200);
		frame.getContentPane().add(imgLabel);
	}
}
