package October10;

public class Game {
	
	private String hint;
	private String word;
	private String guesses = "";
	
	// No arg Constructor
	
	public Game(String hint, String word)
	{
		this.hint = hint;
		this.word = word;
	}
	
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getGuesses() {
		return guesses;
	}
	public void setGuesses(String guesses) {
		this.guesses += guesses;
	}
	public boolean isSolved()
	{
		// Do smart things to determine if solved
		
		return generateMask().equals(word);
	}
	
	public String generateMask()
	{
		String mask = "";
		
		// Loop over word
		
		for(int i = 0; i < word.length(); i ++)
		{
			
		// Look at each char in word
			
		String currentChar = String.valueOf(word.charAt(i));
		
		// Determine if user guessed that character
		
		if(guesses.contains(currentChar))
		{
			// If they did, append the character
			
			mask += currentChar;
		}
	
		// If they did not, append a *
		else
		{ mask += "*";
		
		}
	}
		
		return mask;

	}
}
