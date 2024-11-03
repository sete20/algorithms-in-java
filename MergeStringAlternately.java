import java.util.*;

public class MergeStringAlternately {
    public static void main(String[] args) {
        MergeStringAlternately MergeStringAlternately = new MergeStringAlternately();
        System.out.println(MergeStringAlternately.mergeAlternately("act", "pots"));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder word = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minLength; i++) 
            word.append(word1.charAt(i)).append(word2.charAt(i));

        // Append the remaining characters from the longer string
        if (word1.length() > word2.length()) 
            word.append(word1.substring(minLength));
        else if (word2.length() > word1.length()) 
            word.append(word2.substring(minLength));
            
        return word.toString();
    }
}
