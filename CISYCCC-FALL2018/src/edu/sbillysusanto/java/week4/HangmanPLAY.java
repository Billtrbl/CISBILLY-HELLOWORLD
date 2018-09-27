package edu.sbillysusanto.java.week4;

import java.util.Scanner;

public class HangmanPLAY 
{
	private static String[] words = {"Strawberry, Watermelon, Orange, Cherry"};
	
	public static void main(String[] Args)
{
	Scanner input = new Scanner(System.in);
	String word = words[(int)(Math.random() * words.length)];
	Hangman game = new Hangman(word);
	int count = 0;
	int failedGuesses = 0;
	
	boolean done = false;
	while(!done)
	{
		System.out.println("Tried: " + game.getTried());
		System.out.println("Failed guesses: " + failedGuesses);
		System.out.println(game.getGuessed());
		System.out.println();
		
		System.out.println("Enter next letter (or Quit Game): ");
		String s = input.next();
		if ("quit game".equalsIgnoreCase(s))
			break;
		if (s.length() != 1)
		{
			System.out.println("Invalid input");
		}
		else 
		{
			int result = game.tryLetter(s.charAt(0));
			switch(result)
			{
			case 0:
				
				System.out.println("Already tried");
				break;
				
			case -1:
				System.out.println("NOPE!");
				failedGuesses++;
				break;
			
			case 1:
				System.out.println("NICE!");
				break;
			}
		}
		
		count++;
		
		if(game.getGuessed().indexOf('*') == -1)
		 { 
			System.out.println("You guessed" + word + "in" + count + "tries.");
			done = true;
		 }
      }
   }
}
