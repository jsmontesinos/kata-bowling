package com.jsmontesinos.kata.bowling;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    private boolean isNumeric(String string) {
    	try {
    		Integer.valueOf(string);
		} catch (NumberFormatException nfe) {
			return false;
		}
    	
    	return true;
    }

	public int calculateScore(String string) {
		int score = 0;
		
		int maxLength = Math.min(string.length(), 20);
		for (int i = 0; i < maxLength; i++){
			String currentThrow = string.substring(i, i + 1);
			if (isNumeric(currentThrow))
				score += Integer.valueOf(currentThrow);
			else if(isSpare(currentThrow)) {
				String before = string.substring(i - 1, i);
				if (isNumeric(before)) {
					score += 10 - Integer.valueOf(before);
				} 
				else {
					score += 10;
				}
				String after = string.substring(i + 1, i + 2);
				if (isNumeric(after))
					score +=  Integer.valueOf(after);
			}
			else if (isStrike(currentThrow)) {
				score += (300/12);
			}
		}
		
		return score;
	}

	private boolean isStrike(String currentThrow) {
		return currentThrow.equals("X");
	}

	private boolean isSpare(String currentThrow) {
		return currentThrow.equals("/");
	}
}
