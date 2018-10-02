package Hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanProject {

	private static Scanner s;


	public static void guess(String word, int life)
	{
		char[] filler = new char[word.length()];
		int i = 0;
		while(i<word.length())
		{
			filler[i] = '*';
			if(word.charAt(i) == ' ')
			{
				filler[i]=' ';
			}
			i++;
		}
		
		System.out.println(filler);
		System.out.println("      		Life remaining = " + life );
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Character> l=new ArrayList<Character>();
		
		
		while(life>0)
		{
			char x=s.next().charAt(0);		// character input by user
			
			if(l.contains(x))
			{
				System.out.println("You've used that letter");
				continue;						// while loops continues
			}
			
			l.add(x);
			
			if(word.contains(x+""))
			{
				for(int y = 0; y < word.length();y++)	// this loop will check all the indexes for the 
				{
					if(word.charAt(y)==x)		// the character and will replace '*' by
					{
						filler[y]=x;			// the character
					}
				}
			}
			else 
			{ 
				life--; 						// life will decrease if the character entered isn't right
			}
			
			if(word.equals(String.valueOf(filler)))
			{
				System.out.println(filler);
				System.out.println("Congratulations, you won!!!!");
				break;
			}
			
			System.out.println(filler);
			System.out.println("      Life remaining = " + life );
			
		}
		
		if(life == 0)
		{
			System.out.println("Game Over! (x_x) ");
		}
	}
	
	
	public static void main(String[] args)
	{
		String word = "Pineapple";				// word to be guessed
		int life = 7;							// the number of chances
		guess(word,life);
	}

}
