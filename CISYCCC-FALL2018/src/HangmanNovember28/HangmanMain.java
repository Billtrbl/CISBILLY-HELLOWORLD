package HangmanNovember28;

import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Chapter6.HMUser;

public class HangmanMain {

	private static Scanner s;
	public HangmanWords hw;
	public String secretWord;
	char[] filler;
	ArrayList<Character> lettersGuessed;

	int life;

	public int getLife() {
		return life;
	}

	public void NewGame() { // Method to start a new game
		hw = new HangmanWords();
		secretWord = hw.newWord().toUpperCase(); // To transform all lowercase letters to uppercase
		life = 10; // amount of lives/tries/guesses
		filler = new char[secretWord.length()];
		int i = 0;
		while (i < secretWord.length()) {
			filler[i] = '*'; // To transform letters into "*"
			if (secretWord.charAt(i) == ' ') {
				filler[i] = ' ';
			}
			i++;
		}

		lettersGuessed = new ArrayList<Character>(); // Array of the letters guessed

	}

	public String getSecretWord() {
		return secretWord;
	}

	public void guess(char letter) { // Main method for the game

		if (lettersGuessed.contains(letter)) {
		} else {

			lettersGuessed.add(letter);

			if (secretWord.contains(letter + "")) {
				for (int y = 0; y < secretWord.length(); y++) // this loop will check all the indexes for the
				{
					if (secretWord.charAt(y) == letter) // the character and will replace '*' by
					{
						filler[y] = letter; // the character
					}
				}
			}

			else {
				life--; // life will decrease if the character entered isn't right
			}
		}
	}

	public String getLettersGuessed() {
		return String.valueOf(lettersGuessed); // Transformed an array into String
	}

	public boolean isGameWon() { // Game is won if
		if (secretWord.equals(String.valueOf(filler))) { // The secret has been guessed
			return true;
		} else {
			return false;
		}
	}

	public String getWordToBeGuessed() {
		String wordToBeGuessed = new String(filler); // Transform an array into String
		return wordToBeGuessed;
	}

}
