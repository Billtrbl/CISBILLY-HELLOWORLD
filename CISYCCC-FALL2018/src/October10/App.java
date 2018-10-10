package October10;

import java.util.Scanner;

public class App 
{
	Game g = new Game();
	
	// Control flow of game.
	public void playGame()
	{
		g.setHint("Meow");
		g.setWord("Cat");
		
		Scanner s = new Scanner(System.in);
		// Repeat while not solved.
		while(!g.isSolved())
		{
			// Prompt the user
			System.out.println("Guess a letter");
			System.out.println("Hint: " + g.getHint());
			// Display current mask
			System.out.println("Mask " + g.generateMask());
			// Collect user input	
			String userGuess = s.nextLine();
			g.setGuesses(userGuess);
		}
	
	}

	public static void main(String[] args) 
	{
		App app = new App();
		app.playGame();
	}

}
