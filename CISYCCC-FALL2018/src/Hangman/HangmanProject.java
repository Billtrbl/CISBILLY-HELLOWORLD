package Hangman;
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

public class HangmanProject {

	private static Scanner s;
	


	private void guess(BufferedWriter writer,String word, int life)
	{
		char[] filler = new char[word.length()];
		int i = 0;
		while(i < word.length())
		{
			filler[i] = '*';                   
			if(word.charAt(i) == ' ')
			{
				filler[i] = ' ';
			}
			i++;
		}
		
		System.out.println(filler);
		System.out.println("          the number of guesses you have left = " + life );
		
		Scanner s = new Scanner(System.in);                      // Scanner
		
		ArrayList<Character> l = new ArrayList<Character>();     // Array
			
			while(life > 0)
		{
			char x = s.next().charAt(0);		// character input by user
			
			if(l.contains(x))
			{
				System.out.println("You've used that letter");
				continue;						// while loops continues
			}
			
			l.add(x);
			
			if(word.contains(x + ""))
			{
				for(int y = 0; y < word.length(); y++)	// this loop will check all the indexes for the 
				{
					if(word.charAt(y) == x)		// the character and will replace '*' by
					{
						filler[y] = x;			// the character
					}
				}
			}
			
			else
			{ 
				life--;						// life will decrease if the character entered isn't right
			}
			
			if(word.equals(String.valueOf(filler)))
			{
				System.out.println(filler);
				System.out.println("Congratulations, you won!!!!");
				try {
					writer.write("Congratulations, you won!!!!");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
			System.out.println(filler);
			System.out.println("          the number of guesses you have left = " + life );
			
		}
		
		if(life == 0)                      
		{
			System.out.println("Game Over! (x_x) ");
			try {
				writer.write("Game Over! (x_x) ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
		

	
	
	public static void main(String[] args)
	{
		BufferedWriter writer = null;
		try
		{
		    writer = new BufferedWriter(new FileWriter("hangman result111.txt"));
		    
		    String[] word = new String[4];				// word to be guessed
		    List<String> words = new ArrayList<String>();
			File f = new File("Hangman Words.txt");
			System.out.println("Does the file exist?" + f.exists());
			
			if(f.exists())
			{
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(f));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String st;
				try {
					while((st = br.readLine()) != null)
					{
						words.add(st);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// testing array
			// word[0] = "orange"; 
			// word[1] = "apple";
			// word[2] = "pineapple";
			// word[3] = "mango";
			
			int life = 5;							// the number of chances
			HangmanProject hp = new HangmanProject();
			char replay;
			Scanner s = new Scanner(System.in);
			do { 
				Random rand = new Random();

				int  n = rand.nextInt(5); //3 is the maximum and the 0 is our minimum 
				
				hp.guess(writer,words.get(n),life); // 
			
			do { // check the user's input
				System.out.println("Type 0 to play again. Type 1 to quit.");
				writer.write("Type 0 to play again. Type 1 to quit.");
	            replay = s.next().charAt(0);
	            if (replay != '0' && replay != '1') 
	            {
	            	System.out.println("Input not recognized ");
	            	writer.write("Input not recognized.");
	                }
			}
				while (replay != '0' && replay != '1');
			} 	while (replay == '0'); // end of do-while loop

		}
		catch ( IOException e)
		{
		}
		finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}
	}

}
