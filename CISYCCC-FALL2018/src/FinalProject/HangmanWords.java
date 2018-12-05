package FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HangmanWords {

	String[] word = new String[4];

	HangmanWords() { // Words to be guessed
		word[0] = "pineapple";
		word[1] = "apple";
		word[2] = "kiwi";
		word[3] = "watermelon";
	}

	public String newWord() { // To pick a random word in the beginning of the new game
		Random rand = new Random();
		int n = rand.nextInt(4);
		return word[n];
	}
}