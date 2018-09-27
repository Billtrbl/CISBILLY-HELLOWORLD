package edu.sbillysusanto.java.week4;

public class Hangman 
{
	// Think of a fruit
	// Sets the number amount of letters
	// Prompt user to guess a letter
	// Get input from user
	// If right, the letter will appear
	// Else, strike one, two, three and so on
	// Apply guess to game
	// Congratulations, you won! or Game Over
	
	private String answer;
	private StringBuffer partiallyFilled;
	private StringBuffer lettersTried;

	public Hangman(String word)
{
		answer = word;
		int x = word.length();
		StringBuffer partiallyFilled = new StringBuffer(10);
		for(int i = 0; i<word.length(); i++);
			partiallyFilled.append("*");
		StringBuffer lettersTried = new StringBuffer(10);
		lettersTried.append("");
		
}
	String getWord()
	{
		return answer;
	}
	
	String getGuessed()
	{
		return partiallyFilled.toString();
	}
	
	String getTried()
	{
		return lettersTried.toString();
	}
	
	int tryLetter(char letter)
	{
		for(int i = 0; i<answer.length(); i++)
		{
			if(answer.charAt(i)==letter)
			{
				partiallyFilled.setCharAt(i, letter);
				lettersTried.append(letter);
				return 1;
			}
		}
	}
}
