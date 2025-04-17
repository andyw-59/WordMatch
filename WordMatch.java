public class WordMatch {  

private String secret;  
public WordMatch(String word) {  
    secret = word;
}  

public int scoreGuess(String guess) { 
    int len = guess.length();
    int count = 0;
    for (int i = 0; i <= secret.length() - len; i++) {
        if (secret.substring(i, i + len).equals(guess)) count++;
    }
    count = count * len * len;
    return count;
}  
 
public String findBetterGuess(String guess1, String guess2) { 
    
    int guessA = scoreGuess(guess1);
    int guessB = scoreGuess(guess2);
    if (guessA < guessB) return guess2;
    if (guessB < guessA) return guess1;
    if (guessA == guessB) {
        if (guess1.compareTo(guess2) == -1) return guess2;
        if (guess1.compareTo(guess2) == 1) return guess1;
        else {
            return guess1;
        }
    }
    return guess1;
 }  
}  
